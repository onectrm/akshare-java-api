
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:51 CST 2022*/
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
    * 接口: stock_em_pg
    * 目标地址: http://data.eastmoney.com/xg/pg/
    * 描述: 东方财富网-数据中心-新股数据-配股
    * 限量: 单次返回所有历史数据
    */
    public class stock_em_pgRequest extends AkShareRequestAndResponse {
    public stock_em_pgRequest(){
    setInterfaceName("stock_em_pg");
    }

    public static stock_em_pgRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_em_pgRequest t = new stock_em_pgRequest();



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
