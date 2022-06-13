
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
    * 接口: news_trade_notify_suspend_baidu
    * 目标地址: https://gushitong.baidu.com/calendar
    * 描述: 百度股市通-交易提醒-停复牌
    * 限量: 单次获取指定 date 的停复牌数据, 提供港股的停复牌数据
    */
    public class news_trade_notify_suspend_baiduRequest extends AkShareRequestAndResponse {
    public news_trade_notify_suspend_baiduRequest(){
    setInterfaceName("news_trade_notify_suspend_baidu");
    }

    public static news_trade_notify_suspend_baiduRequest of(


    LocalDate p_date,


    Map.Entry
    <String
    , String>... others){
    news_trade_notify_suspend_baiduRequest t = new news_trade_notify_suspend_baiduRequest();


    t.p_date = p_date;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: date
    * type: str
    * desc: date=&quot;20220513&quot;
    * required: 
    */
    @JsonProperty("date")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
