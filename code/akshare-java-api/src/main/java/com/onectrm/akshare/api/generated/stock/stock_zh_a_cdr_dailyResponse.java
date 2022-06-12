
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:02 CST 2022*/
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
* 接口: stock_zh_a_cdr_daily
* 目标地址: https://finance.sina.com.cn/realstock/company/sh689009/nc.shtml
* 描述: 上海证券交易所-科创板-CDR
* 限量: 单次返回指定 CDR 的日频率数据, 分钟历史行情数据可以通过 stock_zh_a_minute 获取
*/
public class stock_zh_a_cdr_dailyResponse extends AkShareRequestAndResponse {
    public stock_zh_a_cdr_dailyResponse(){
        setInterfaceName("stock_zh_a_cdr_daily");
    }

    public static stock_zh_a_cdr_dailyResponse of(


    Double p_low,

    Double p_open,

    LocalDate p_date,

    Double p_close,

    Double p_volume,

    Double p_high,


    Map.Entry<String, String>... others){
    stock_zh_a_cdr_dailyResponse t = new stock_zh_a_cdr_dailyResponse();


    t.p_low = p_low;

    t.p_open = p_open;

    t.p_date = p_date;

    t.p_close = p_close;

    t.p_volume = p_volume;

    t.p_high = p_high;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: low
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("low")
    
    
    private Double p_low;

    public Double getP_low() { return this.p_low;}
    public void setP_low(Double v) { this.p_low = v;}

    /**
    * name: open
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("open")
    
    
    private Double p_open;

    public Double getP_open() { return this.p_open;}
    public void setP_open(Double v) { this.p_open = v;}

    /**
    * name: date
    * type: object
    * desc: 交易日
    * required: 
    */
    @JsonProperty("date")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}

    /**
    * name: close
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("close")
    
    
    private Double p_close;

    public Double getP_close() { return this.p_close;}
    public void setP_close(Double v) { this.p_close = v;}

    /**
    * name: volume
    * type: float64
    * desc: 注意单位: 手
    * required: 
    */
    @JsonProperty("volume")
    
    
    private Double p_volume;

    public Double getP_volume() { return this.p_volume;}
    public void setP_volume(Double v) { this.p_volume = v;}

    /**
    * name: high
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("high")
    
    
    private Double p_high;

    public Double getP_high() { return this.p_high;}
    public void setP_high(Double v) { this.p_high = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}