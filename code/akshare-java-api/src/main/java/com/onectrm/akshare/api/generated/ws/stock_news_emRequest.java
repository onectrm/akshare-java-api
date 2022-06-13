
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:51 CST 2022*/
    package com.onectrm.akshare.api.generated.ws;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: ws
    * 接口: stock_news_em
    * 目标地址: http://so.eastmoney.com/news/s
    * 描述: 东方财富指定个股的新闻资讯数据
    * 限量: 当日最近 20 条新闻资讯数据
    */
    public class stock_news_emRequest extends AkShareRequestAndResponse {
    public stock_news_emRequest(){
    setInterfaceName("stock_news_em");
    }

    public static stock_news_emRequest of(


    String p_stock,


    Map.Entry
    <String
    , String>... others){
    stock_news_emRequest t = new stock_news_emRequest();


    t.p_stock = p_stock;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: stock
    * type: str
    * desc: stock=&quot;300059&quot;; 股票代码
    * required: 
    */
    @JsonProperty("stock")
    
    
    private String p_stock;

    public String getP_stock() { return this.p_stock;}
    public void setP_stock(String v) { this.p_stock = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
