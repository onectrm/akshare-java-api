
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
    * 接口: macro_australia_unemployment_rate
    * 目标地址: http://data.eastmoney.com/cjsj/foreign_5_2.html
    * 描述: 东方财富-经济数据-澳大利亚-失业率
    * 限量: 单次返回所有历史数据
    */
    public class macro_australia_unemployment_rateRequest extends AkShareRequestAndResponse {
    public macro_australia_unemployment_rateRequest(){
    setInterfaceName("macro_australia_unemployment_rate");
    }

    public static macro_australia_unemployment_rateRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_australia_unemployment_rateRequest t = new macro_australia_unemployment_rateRequest();



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
