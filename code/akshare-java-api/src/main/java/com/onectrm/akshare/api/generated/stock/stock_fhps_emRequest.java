
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:50 CST 2022*/
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: stock
    * 接口: stock_fhps_em
    * 目标地址: http://data.eastmoney.com/yjfp/
    * 描述: 东方财富-数据中心-年报季报-分红配送
    * 限量: 单次获取指定日期的分红配送数据
    */
    public class stock_fhps_emRequest extends AkShareRequestAndResponse {
    public stock_fhps_emRequest(){
    setInterfaceName("stock_fhps_em");
    }

    public static stock_fhps_emRequest of(


    LocalDate p_date,


    Map.Entry
    <String
    , String>... others){
    stock_fhps_emRequest t = new stock_fhps_emRequest();


    t.p_date = p_date;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: date
    * type: str
    * desc: date=&quot;20201231&quot;; choice of {&quot;XXXX0630&quot;, &quot;XXXX1231&quot;}; 从 19901231 开始
    * required: 
    */
    @JsonProperty("date")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
