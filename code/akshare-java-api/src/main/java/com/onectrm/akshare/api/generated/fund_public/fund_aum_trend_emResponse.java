
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: fund_public
    * 接口: fund_aum_trend_em
    * 目标地址: http://fund.eastmoney.com/Company/default.html
    * 描述: 天天基金网-基金数据-市场全部基金规模走势
    * 限量: 单次返回所有市场全部基金规模走势数据
    */
    public class fund_aum_trend_emResponse extends AkShareRequestAndResponse {
    public fund_aum_trend_emResponse(){
    setInterfaceName("fund_aum_trend_em");
    }

    public static fund_aum_trend_emResponse of(


    LocalDate p_date,

    Double p_value,


    Map.Entry
    <String
    , String>... others){
    fund_aum_trend_emResponse t = new fund_aum_trend_emResponse();


    t.p_date = p_date;

    t.p_value = p_value;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: date
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("date")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}

    /**
    * name: value
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("value")
    
    
    private Double p_value;

    public Double getP_value() { return this.p_value;}
    public void setP_value(Double v) { this.p_value = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
