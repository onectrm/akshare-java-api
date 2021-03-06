
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: futures
    * 接口: futures_zh_daily_sina
    * 目标地址: https://finance.sina.com.cn/futures/quotes/V2105.shtml
    * 描述: 新浪财经-期货-日频数据
    * 限量: 单次返回指定 symbol 的所有日频数据
    */
    public class futures_zh_daily_sinaResponse extends AkShareRequestAndResponse {
    public futures_zh_daily_sinaResponse(){
    setInterfaceName("futures_zh_daily_sina");
    }

    public static futures_zh_daily_sinaResponse of(


    LocalDate p_date,

    Double p_open,

    Double p_high,

    Double p_low,

    Double p_close,

    Integer p_volume,

    Integer p_hold,

    Double p_settle,


    Map.Entry
    <String
    , String>... others){
    futures_zh_daily_sinaResponse t = new futures_zh_daily_sinaResponse();


    t.p_date = p_date;

    t.p_open = p_open;

    t.p_high = p_high;

    t.p_low = p_low;

    t.p_close = p_close;

    t.p_volume = p_volume;

    t.p_hold = p_hold;

    t.p_settle = p_settle;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: date
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("date")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}

    /**
    * name: open
    * type: float64
    * desc: 开盘价
    * required: 
    */
    @JsonProperty("open")
    
    
    private Double p_open;

    public Double getP_open() { return this.p_open;}
    public void setP_open(Double v) { this.p_open = v;}

    /**
    * name: high
    * type: float64
    * desc: 最高价
    * required: 
    */
    @JsonProperty("high")
    
    
    private Double p_high;

    public Double getP_high() { return this.p_high;}
    public void setP_high(Double v) { this.p_high = v;}

    /**
    * name: low
    * type: float64
    * desc: 最低价
    * required: 
    */
    @JsonProperty("low")
    
    
    private Double p_low;

    public Double getP_low() { return this.p_low;}
    public void setP_low(Double v) { this.p_low = v;}

    /**
    * name: close
    * type: float64
    * desc: 收盘价
    * required: 
    */
    @JsonProperty("close")
    
    
    private Double p_close;

    public Double getP_close() { return this.p_close;}
    public void setP_close(Double v) { this.p_close = v;}

    /**
    * name: volume
    * type: int64
    * desc: 成交量
    * required: 
    */
    @JsonProperty("volume")
    
    
    private Integer p_volume;

    public Integer getP_volume() { return this.p_volume;}
    public void setP_volume(Integer v) { this.p_volume = v;}

    /**
    * name: hold
    * type: int64
    * desc: 持仓量
    * required: 
    */
    @JsonProperty("hold")
    
    
    private Integer p_hold;

    public Integer getP_hold() { return this.p_hold;}
    public void setP_hold(Integer v) { this.p_hold = v;}

    /**
    * name: settle
    * type: float64
    * desc: 结算价
    * required: 
    */
    @JsonProperty("settle")
    
    
    private Double p_settle;

    public Double getP_settle() { return this.p_settle;}
    public void setP_settle(Double v) { this.p_settle = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
