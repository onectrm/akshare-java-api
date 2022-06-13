
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:50 CST 2022*/
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: macro
    * 接口: macro_japan_cpi_yearly
    * 目标地址: http://data.eastmoney.com/cjsj/foreign_3_1.html
    * 描述: 东方财富-经济数据-日本-全国消费者物价指数年率
    * 限量: 单次返回所有历史数据
    */
    public class macro_japan_cpi_yearlyRequest extends AkShareRequestAndResponse {
    public macro_japan_cpi_yearlyRequest(){
    setInterfaceName("macro_japan_cpi_yearly");
    }

    public static macro_japan_cpi_yearlyRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_japan_cpi_yearlyRequest t = new macro_japan_cpi_yearlyRequest();


    t.p_wu2 = p_wu2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 无
    * type: 无
    * desc: 无
    * required: 
    */
    @JsonProperty("无")
    
    
    private String p_wu2;

    public String getP_wu2() { return this.p_wu2;}
    public void setP_wu2(String v) { this.p_wu2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
