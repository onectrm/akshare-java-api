
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
    * 接口: stock_hot_rank_latest_em
    * 目标地址: http://guba.eastmoney.com/rank/stock?code=000665
    * 描述: 东方财富-个股人气榜-最新排名
    * 限量: 单次返回指定 symbol 的股票近期历史数据
    */
    public class stock_hot_rank_latest_emResponse extends AkShareRequestAndResponse {
    public stock_hot_rank_latest_emResponse(){
    setInterfaceName("stock_hot_rank_latest_em");
    }

    public static stock_hot_rank_latest_emResponse of(


    String p_item,

    String p_value,


    Map.Entry
    <String
    , String>... others){
    stock_hot_rank_latest_emResponse t = new stock_hot_rank_latest_emResponse();


    t.p_item = p_item;

    t.p_value = p_value;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: item
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("item")
    
    
    private String p_item;

    public String getP_item() { return this.p_item;}
    public void setP_item(String v) { this.p_item = v;}

    /**
    * name: value
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("value")
    
    
    private String p_value;

    public String getP_value() { return this.p_value;}
    public void setP_value(String v) { this.p_value = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
