
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: fund_public
* 接口: fund_etf_hist_sina
* 目标地址: http://vip.stock.finance.sina.com.cn/fund_center/index.html#jjhqetf
* 描述: 新浪财经-基金行情的日频率行情数据
* 限量: 单次返回指定基金的所有数据
*/
public class fund_etf_hist_sinaResponse extends AkShareRequestAndResponse {
    public fund_etf_hist_sinaResponse(){
        setInterfaceName("fund_etf_hist_sina");
    }

    public static fund_etf_hist_sinaResponse of(


    Double p_low,

    Double p_open,

    LocalDate p_date,

    Double p_close,

    Integer p_volume,

    Double p_high,


    Map.Entry<String, String>... others){
    fund_etf_hist_sinaResponse t = new fund_etf_hist_sinaResponse();


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
    * desc: 注意单位: 手
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