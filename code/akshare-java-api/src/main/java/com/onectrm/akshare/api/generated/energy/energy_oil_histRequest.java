
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.energy;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: energy
    * 接口: energy_oil_hist
    * 目标地址: http://data.eastmoney.com/cjsj/oil_default.html
    * 描述: 东方财富-数据中心-中国油价-汽柴油历史调价信息
    * 限量: 单次返回中国油价的所有历史数据
    */
    public class energy_oil_histRequest extends AkShareRequestAndResponse {
    public energy_oil_histRequest(){
    setInterfaceName("energy_oil_hist");
    }

    public static energy_oil_histRequest of(



    Map.Entry
    <String
    , String>... others){
    energy_oil_histRequest t = new energy_oil_histRequest();



    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }




    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
