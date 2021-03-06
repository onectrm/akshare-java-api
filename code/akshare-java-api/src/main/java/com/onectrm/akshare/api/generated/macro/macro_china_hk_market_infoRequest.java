
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
    * 接口: macro_china_hk_market_info
    * 目标地址: https://datacenter.jin10.com/reportType/dc_hk_market_info
    * 描述: 香港同业拆借报告, 数据区间从 20170320-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_hk_market_infoRequest extends AkShareRequestAndResponse {
    public macro_china_hk_market_infoRequest(){
    setInterfaceName("macro_china_hk_market_info");
    }

    public static macro_china_hk_market_infoRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    macro_china_hk_market_infoRequest t = new macro_china_hk_market_infoRequest();


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
