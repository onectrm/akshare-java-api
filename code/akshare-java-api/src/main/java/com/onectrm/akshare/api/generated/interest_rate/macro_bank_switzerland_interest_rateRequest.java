
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.interest_rate;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: interest_rate
    * 接口: macro_bank_switzerland_interest_rate
    * 目标地址: https://datacenter.jin10.com/reportType/dc_switzerland_interest_rate_decision
    * 描述: 瑞士央行利率决议报告, 数据区间从20080313-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_bank_switzerland_interest_rateRequest extends AkShareRequestAndResponse {
    public macro_bank_switzerland_interest_rateRequest(){
    setInterfaceName("macro_bank_switzerland_interest_rate");
    }

    public static macro_bank_switzerland_interest_rateRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_bank_switzerland_interest_rateRequest t = new macro_bank_switzerland_interest_rateRequest();



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
