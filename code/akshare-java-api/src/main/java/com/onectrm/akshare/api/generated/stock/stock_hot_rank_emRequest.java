
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
    * 接口: stock_hot_rank_em
    * 目标地址: http://guba.eastmoney.com/rank/
    * 描述: 东方财富网站-股票热度
    * 限量: 单次返回所有股票当前交易日的人气排名数据
    */
    public class stock_hot_rank_emRequest extends AkShareRequestAndResponse {
    public stock_hot_rank_emRequest(){
    setInterfaceName("stock_hot_rank_em");
    }

    public static stock_hot_rank_emRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_hot_rank_emRequest t = new stock_hot_rank_emRequest();



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
