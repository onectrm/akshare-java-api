
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
* 接口: stock_a_high_low_statistics
* 目标地址: https://www.legulegu.com/stockdata/high-low-statistics
* 描述: 不同市场的创新高和新低的股票数量
* 限量: 单次获取指定 market 的所有历史数据
*/
public class stock_a_high_low_statisticsResponse extends AkShareRequestAndResponse {
    public stock_a_high_low_statisticsResponse(){
        setInterfaceName("stock_a_high_low_statistics");
    }

    public static stock_a_high_low_statisticsResponse of(


    Double p_low60,

    LocalDate p_date,

    Double p_close,

    Double p_high60,

    Double p_low120,

    Double p_high20,

    Double p_high120,

    Double p_low20,


    Map.Entry<String, String>... others){
    stock_a_high_low_statisticsResponse t = new stock_a_high_low_statisticsResponse();


    t.p_low60 = p_low60;

    t.p_date = p_date;

    t.p_close = p_close;

    t.p_high60 = p_high60;

    t.p_low120 = p_low120;

    t.p_high20 = p_high20;

    t.p_high120 = p_high120;

    t.p_low20 = p_low20;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: low60
    * type: float64
    * desc: 60日新低
    * required: 
    */
    @JsonProperty("low60")
    
    
    private Double p_low60;

    public Double getP_low60() { return this.p_low60;}
    public void setP_low60(Double v) { this.p_low60 = v;}

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
    * desc: 收盘价
    * required: 
    */
    @JsonProperty("close")
    
    
    private Double p_close;

    public Double getP_close() { return this.p_close;}
    public void setP_close(Double v) { this.p_close = v;}

    /**
    * name: high60
    * type: float64
    * desc: 60日新高
    * required: 
    */
    @JsonProperty("high60")
    
    
    private Double p_high60;

    public Double getP_high60() { return this.p_high60;}
    public void setP_high60(Double v) { this.p_high60 = v;}

    /**
    * name: low120
    * type: float64
    * desc: 60日新低
    * required: 
    */
    @JsonProperty("low120")
    
    
    private Double p_low120;

    public Double getP_low120() { return this.p_low120;}
    public void setP_low120(Double v) { this.p_low120 = v;}

    /**
    * name: high20
    * type: float64
    * desc: 20日新高
    * required: 
    */
    @JsonProperty("high20")
    
    
    private Double p_high20;

    public Double getP_high20() { return this.p_high20;}
    public void setP_high20(Double v) { this.p_high20 = v;}

    /**
    * name: high120
    * type: float64
    * desc: 120日新高
    * required: 
    */
    @JsonProperty("high120")
    
    
    private Double p_high120;

    public Double getP_high120() { return this.p_high120;}
    public void setP_high120(Double v) { this.p_high120 = v;}

    /**
    * name: low20
    * type: float64
    * desc: 20日新低
    * required: 
    */
    @JsonProperty("low20")
    
    
    private Double p_low20;

    public Double getP_low20() { return this.p_low20;}
    public void setP_low20(Double v) { this.p_low20 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}