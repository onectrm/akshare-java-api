
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
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
    * 接口: macro_cnbs
    * 目标地址: http://114.115.232.154:8080/
    * 描述: 中国国家金融与发展实验室-中国宏观杠杆率数据
    * 限量: 单次返回所有历史数据
    */
    public class macro_cnbsRequest extends AkShareRequestAndResponse {
    public macro_cnbsRequest(){
    setInterfaceName("macro_cnbs");
    }

    public static macro_cnbsRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_cnbsRequest t = new macro_cnbsRequest();



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
