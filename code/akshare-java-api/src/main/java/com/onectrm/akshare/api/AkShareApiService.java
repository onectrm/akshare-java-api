package com.onectrm.akshare.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class AkShareApiService {

    private final AkShareApiProperties properties;
    private final ObjectMapper objectMapper;

    public AkShareApiService(AkShareApiProperties properties) {
        this.properties = properties;

        objectMapper = new ObjectMapper()
                .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .disable(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS)
                .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .setSerializationInclusion(JsonInclude.Include.NON_EMPTY)
                .registerModule(new JavaTimeModule())
                .registerModule(new ParameterNamesModule());
    }

    private URI buildUrl(String path, Map.Entry<String, Object>... parameters) {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        for (var p : parameters) {
            params.add(p.getKey(), Objects.toString(p.getValue(), StringUtils.EMPTY));
        }
        URI uri = UriComponentsBuilder.fromUriString(properties.getBaseUrl()).path(path).queryParams(params).build().toUri();
        return uri;
    }

    private <T> T requestByGet(String path, JavaType type, Map.Entry<String, Object>... parameters) {
        try {
            URI uri = buildUrl(path, parameters);

            HttpClient client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_1_1).build();


            HttpRequest request = HttpRequest.newBuilder().GET().uri(uri).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String body = response.body();
            T result = objectMapper.readValue(body, type);
            return result;
        } catch (JsonProcessingException e) {
            throw new AkShareApiException(e);
        } catch (IOException e) {
            throw new AkShareApiException(e);
        } catch (InterruptedException e) {
            throw new AkShareApiException(e);
        }
    }

    public <RESPONSE_TYPE extends AkShareRequestAndResponse, REQUEST_TYPE extends AkShareRequestAndResponse> List<RESPONSE_TYPE> getList(REQUEST_TYPE request, Class<RESPONSE_TYPE> responseClass) {
        var javaType = TypeFactory.defaultInstance().constructCollectionType(List.class, responseClass);

        return get(request, javaType);
    }

    public <RESPONSE_TYPE extends AkShareRequestAndResponse, REQUEST_TYPE extends AkShareRequestAndResponse> RESPONSE_TYPE get(REQUEST_TYPE request, Class<RESPONSE_TYPE> responseClass) {
        var javaType = TypeFactory.defaultInstance().constructType(responseClass);

        return get(request, javaType);
    }

    private <RESPONSE_TYPE, REQUEST_TYPE extends AkShareRequestAndResponse> RESPONSE_TYPE get(REQUEST_TYPE request, JavaType javaType) {
        Map<String, Object> map = objectMapper.convertValue(request, Map.class);

        var result = (RESPONSE_TYPE) requestByGet(
                request.getInterfaceName(),
                javaType,
                map.entrySet().toArray(new Map.Entry[0]));

        return result;
    }
}

