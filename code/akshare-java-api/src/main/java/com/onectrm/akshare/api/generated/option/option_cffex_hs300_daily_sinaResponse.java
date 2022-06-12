
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:02 CST 2022*/
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
* 接口: option_cffex_hs300_daily_sina
* 目标地址: https://stock.finance.sina.com.cn/futures/view/optionsCffexDP.php
* 描述: 中金所-沪深300指数-指定合约-日频行情
* 限量: 单次返回指定合约的日频行情
*/
public class option_cffex_hs300_daily_sinaResponse extends AkShareRequestAndResponse {
    public option_cffex_hs300_daily_sinaResponse(){
        setInterfaceName("option_cffex_hs300_daily_sina");
    }

    public static option_cffex_hs300_daily_sinaResponse of(


    Double p_low,

    Double p_open,

    LocalDate p_date,

    Double p_close,

    Integer p_volume,

    Double p_high,


    Map.Entry<String, String>... others){
    option_cffex_hs300_daily_sinaResponse t = new option_cffex_hs300_daily_sinaResponse();


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
    * desc: 
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
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("volume")
    
    
    private Integer p_volume;

    public Integer getP_volume() { return this.p_volume;}
    public void setP_volume(Integer v) { this.p_volume = v;}

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
