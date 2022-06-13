
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
    * 接口: stock_comment_detail_scrd_desire_daily_em
    * 目标地址: https://data.eastmoney.com/stockcomment/stock/600000.html
    * 描述: 东方财富网-数据中心-特色数据-千股千评-市场热度-日度市场参与意愿
    * 限量: 单次获取所有数据
    */
    public class stock_comment_detail_scrd_desire_daily_emRequest extends AkShareRequestAndResponse {
    public stock_comment_detail_scrd_desire_daily_emRequest(){
    setInterfaceName("stock_comment_detail_scrd_desire_daily_em");
    }

    public static stock_comment_detail_scrd_desire_daily_emRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_comment_detail_scrd_desire_daily_emRequest t = new stock_comment_detail_scrd_desire_daily_emRequest();


    t.p_symbol = p_symbol;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;600000&quot;
    * required: 
    */
    @JsonProperty("symbol")
    
    
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
