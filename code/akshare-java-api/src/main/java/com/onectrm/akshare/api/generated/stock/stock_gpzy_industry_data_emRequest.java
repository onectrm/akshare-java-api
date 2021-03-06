
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
    * 接口: stock_gpzy_industry_data_em
    * 目标地址: http://data.eastmoney.com/gpzy/industryData.aspx
    * 描述: 东方财富网-数据中心-特色数据-股权质押-上市公司质押比例-行业数据
    * 限量: 单次返回所有历史数据
    */
    public class stock_gpzy_industry_data_emRequest extends AkShareRequestAndResponse {
    public stock_gpzy_industry_data_emRequest(){
    setInterfaceName("stock_gpzy_industry_data_em");
    }

    public static stock_gpzy_industry_data_emRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_gpzy_industry_data_emRequest t = new stock_gpzy_industry_data_emRequest();



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
