
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.event;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: event
    * 接口: covid_19_csse_daily
    * 目标地址: https://github.com/CSSEGISandData/COVID-19
    * 描述: 获取 **COVID-19** 每个自然日的全球统计数据, 如本地无法读取数据，请参考 **[答疑专栏]** 问题 12 修改本地 host 后获取
    * 限量: 单次返回指定 **date** 的所有历史数据
    */
    public class covid_19_csse_dailyResponse extends AkShareRequestAndResponse {
    public covid_19_csse_dailyResponse(){
    setInterfaceName("covid_19_csse_daily");
    }

    public static covid_19_csse_dailyResponse of(


    String p_ProvinceState,

    String p_CountryRegion,

    Double p_LastUpdate,

    Double p_Confirmed,

    Double p_Deaths,

    Double p_Recovered,


    Map.Entry
    <String
    , String>... others){
    covid_19_csse_dailyResponse t = new covid_19_csse_dailyResponse();


    t.p_ProvinceState = p_ProvinceState;

    t.p_CountryRegion = p_CountryRegion;

    t.p_LastUpdate = p_LastUpdate;

    t.p_Confirmed = p_Confirmed;

    t.p_Deaths = p_Deaths;

    t.p_Recovered = p_Recovered;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: Province/State
    * type: str
    * desc: Province/State: China - province name; US/Canada/Australia/ - city name, state/province name; Others - name of the event (e.g., &quot;Diamond Princess&quot; cruise ship); other countries - blank.
    * required: Y
    */
    @JsonProperty("Province/State")
    
    
    private String p_ProvinceState;

    public String getP_ProvinceState() { return this.p_ProvinceState;}
    public void setP_ProvinceState(String v) { this.p_ProvinceState = v;}

    /**
    * name: Country/Region
    * type: str
    * desc: country/region name conforming to WHO (will be updated).
    * required: Y
    */
    @JsonProperty("Country/Region")
    
    
    private String p_CountryRegion;

    public String getP_CountryRegion() { return this.p_CountryRegion;}
    public void setP_CountryRegion(String v) { this.p_CountryRegion = v;}

    /**
    * name: Last Update
    * type: float
    * desc: MM/DD/YYYY HH:mm (24 hour format, in UTC).
    * required: Y
    */
    @JsonProperty("Last Update")
    
    
    private Double p_LastUpdate;

    public Double getP_LastUpdate() { return this.p_LastUpdate;}
    public void setP_LastUpdate(Double v) { this.p_LastUpdate = v;}

    /**
    * name: Confirmed
    * type: float
    * desc: the number of confirmed cases. For Hubei Province: from Feb 13 (GMT +8), we report both clinically diagnosed and lab-confirmed cases. For lab-confirmed cases only (Before Feb 17), please refer to who_covid_19_situation_reports. For Italy, diagnosis standard might be changed since Feb 27 to &quot;slow the growth of new case numbers.&quot;
    * required: Y
    */
    @JsonProperty("Confirmed")
    
    
    private Double p_Confirmed;

    public Double getP_Confirmed() { return this.p_Confirmed;}
    public void setP_Confirmed(Double v) { this.p_Confirmed = v;}

    /**
    * name: Deaths
    * type: float
    * desc: the number of deaths.
    * required: Y
    */
    @JsonProperty("Deaths")
    
    
    private Double p_Deaths;

    public Double getP_Deaths() { return this.p_Deaths;}
    public void setP_Deaths(Double v) { this.p_Deaths = v;}

    /**
    * name: Recovered
    * type: float
    * desc: the number of recovered cases.
    * required: Y
    */
    @JsonProperty("Recovered")
    
    
    private Double p_Recovered;

    public Double getP_Recovered() { return this.p_Recovered;}
    public void setP_Recovered(Double v) { this.p_Recovered = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
