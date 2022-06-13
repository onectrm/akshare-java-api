
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:50 CST 2022*/
    package com.onectrm.akshare.api.generated.option;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: option
    * 接口: option_current_em
    * 目标地址: http://quote.eastmoney.com/center/qqsc.html
    * 描述: 东方财富网-行情中心-期权市场
    * 限量: 单次返回全部合约的实时行情
    */
    public class option_current_emRequest extends AkShareRequestAndResponse {
    public option_current_emRequest(){
    setInterfaceName("option_current_em");
    }

    public static option_current_emRequest of(



    Map.Entry
    <String
    , String>... others){
    option_current_emRequest t = new option_current_emRequest();



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
