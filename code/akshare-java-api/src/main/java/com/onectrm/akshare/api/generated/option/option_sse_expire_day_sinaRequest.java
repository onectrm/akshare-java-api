
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
    * 接口: option_sse_expire_day_sina
    * 目标地址: https://stock.finance.sina.com.cn/futures/view/optionsCffexDP.php
    * 描述: 获取指定到期月份指定品种的剩余到期时间
    * 限量: 单次返回指定品种的品种的剩余到期时间
    */
    public class option_sse_expire_day_sinaRequest extends AkShareRequestAndResponse {
    public option_sse_expire_day_sinaRequest(){
    setInterfaceName("option_sse_expire_day_sina");
    }

    public static option_sse_expire_day_sinaRequest of(


    LocalDate p_tradedate,

    String p_symbol,

    String p_exchange,


    Map.Entry
    <String
    , String>... others){
    option_sse_expire_day_sinaRequest t = new option_sse_expire_day_sinaRequest();


    t.p_tradedate = p_tradedate;

    t.p_symbol = p_symbol;

    t.p_exchange = p_exchange;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: trade_date
    * type: str
    * desc: trade_date=&quot;202002&quot;;
    * required: 
    */
    @JsonProperty("trade_date")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_tradedate;

    public LocalDate getP_tradedate() { return this.p_tradedate;}
    public void setP_tradedate(LocalDate v) { this.p_tradedate = v;}

    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;50ETF&quot;; &quot;50ETF&quot; or &quot;300ETF&quot;
    * required: 
    */
    @JsonProperty("symbol")
    
    
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: exchange
    * type: str
    * desc: exchange=&quot;null&quot;
    * required: 
    */
    @JsonProperty("exchange")
    
    
    private String p_exchange;

    public String getP_exchange() { return this.p_exchange;}
    public void setP_exchange(String v) { this.p_exchange = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
