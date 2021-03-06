
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
    * 接口: stock_fund_flow_big_deal
    * 目标地址: http://data.10jqka.com.cn/funds/ddzz/###
    * 描述: 同花顺-数据中心-资金流向-大单追踪
    * 限量: 单次获取当前时点的所有大单追踪数据
    */
    public class stock_fund_flow_big_dealRequest extends AkShareRequestAndResponse {
    public stock_fund_flow_big_dealRequest(){
    setInterfaceName("stock_fund_flow_big_deal");
    }

    public static stock_fund_flow_big_dealRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_fund_flow_big_dealRequest t = new stock_fund_flow_big_dealRequest();



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
