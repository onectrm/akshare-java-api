
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
    * 接口: stock_hk_daily
    * 目标地址: http://stock.finance.sina.com.cn/hkstock/quotes/01336.html(个例)
    * 描述: 港股-历史行情数据, 可以选择返回复权后数据,更新频率为日频
    * 限量: 单次返回指定上市公司的历史行情数据(包括前后复权因子), 提供新浪财经拥有的该股票的所有数据(并不等于该股票从上市至今的数据)
    */
    public class stock_hk_dailyResponse extends AkShareRequestAndResponse {
    public stock_hk_dailyResponse(){
    setInterfaceName("stock_hk_daily");
    }

    public static stock_hk_dailyResponse of(


    LocalDate p_date,

    Double p_open,

    Double p_high,

    Double p_low,

    Double p_close,

    Double p_volume,


    Map.Entry
    <String
    , String>... others){
    stock_hk_dailyResponse t = new stock_hk_dailyResponse();


    t.p_date = p_date;

    t.p_open = p_open;

    t.p_high = p_high;

    t.p_low = p_low;

    t.p_close = p_close;

    t.p_volume = p_volume;


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
    * desc: 日期
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
    * type: float64
    * desc: 成交量
    * required: 
    */
    @JsonProperty("volume")
    
    
    private Double p_volume;

    public Double getP_volume() { return this.p_volume;}
    public void setP_volume(Double v) { this.p_volume = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
