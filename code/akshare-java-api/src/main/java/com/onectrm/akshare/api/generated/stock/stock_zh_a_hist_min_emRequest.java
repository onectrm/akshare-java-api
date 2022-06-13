
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
    * 接口: stock_zh_a_hist_min_em
    * 目标地址: http://quote.eastmoney.com/concept/sh603777.html?from=classic
    * 描述: 东方财富网-行情首页-沪深京 A 股-每日分时行情; 该接口只能获取近期的分时数据，注意时间周期的设置
    * 限量: 单次返回指定股票、频率、复权调整和时间区间的分时数据, 其中 1 分钟数据只返回近 5 个交易日数据且不复权
    */
    public class stock_zh_a_hist_min_emRequest extends AkShareRequestAndResponse {
    public stock_zh_a_hist_min_emRequest(){
    setInterfaceName("stock_zh_a_hist_min_em");
    }

    public static stock_zh_a_hist_min_emRequest of(


    String p_symbol,

    LocalDateTime p_startdate,

    LocalDateTime p_enddate,

    String p_period,

    String p_adjust,


    Map.Entry
    <String
    , String>... others){
    stock_zh_a_hist_min_emRequest t = new stock_zh_a_hist_min_emRequest();


    t.p_symbol = p_symbol;

    t.p_startdate = p_startdate;

    t.p_enddate = p_enddate;

    t.p_period = p_period;

    t.p_adjust = p_adjust;


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
    * desc: symbol=&#39;sh000300&#39;; 股票代码
    * required: 
    */
    @JsonProperty("symbol")
    
    
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;1979-09-01 09:32:00&quot;; 日期时间; 默认返回所有数据
    * required: 
    */
    @JsonProperty("start_date")
    
    @JsonDeserialize(using =
        JacksonDateTimeDeserializer.class)
    
    private LocalDateTime p_startdate;

    public LocalDateTime getP_startdate() { return this.p_startdate;}
    public void setP_startdate(LocalDateTime v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;2222-01-01 09:32:00&quot;; 日期时间; 默认返回所有数据
    * required: 
    */
    @JsonProperty("end_date")
    
    @JsonDeserialize(using =
        JacksonDateTimeDeserializer.class)
    
    private LocalDateTime p_enddate;

    public LocalDateTime getP_enddate() { return this.p_enddate;}
    public void setP_enddate(LocalDateTime v) { this.p_enddate = v;}

    /**
    * name: period
    * type: str
    * desc: period=&#39;5&#39;; choice of {&#39;1&#39;, &#39;5&#39;, &#39;15&#39;, &#39;30&#39;, &#39;60&#39;}; 其中 1 分钟数据返回近 5 个交易日数据且不复权
    * required: 
    */
    @JsonProperty("period")
    
    
    private String p_period;

    public String getP_period() { return this.p_period;}
    public void setP_period(String v) { this.p_period = v;}

    /**
    * name: adjust
    * type: str
    * desc: adjust=&#39;&#39;; choice of {&#39;&#39;, &#39;qfq&#39;, &#39;hfq&#39;}; &#39;&#39;: 不复权, &#39;qfq&#39;: 前复权, &#39;hfq&#39;: 后复权, 其中 1 分钟数据返回近 5 个交易日数据且不复权
    * required: 
    */
    @JsonProperty("adjust")
    
    
    private String p_adjust;

    public String getP_adjust() { return this.p_adjust;}
    public void setP_adjust(String v) { this.p_adjust = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
