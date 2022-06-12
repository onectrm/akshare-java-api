package com.onectrm.akshare.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(AkShareApiService.class)
@EnableConfigurationProperties(AkShareApiProperties.class)
public class AkShareApiAutoConfiguration {
    @Autowired
    private AkShareApiProperties properties;

    @Bean
    @ConditionalOnMissingBean
    public AkShareApiService akShareApiService() {
        return new AkShareApiService(properties);
    }
}
