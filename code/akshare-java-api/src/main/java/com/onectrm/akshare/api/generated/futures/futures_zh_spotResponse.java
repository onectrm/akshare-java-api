
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
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
* 接口: futures_zh_spot
* 目标地址: https://finance.sina.com.cn/futuremarket/
* 描述: 新浪财经-期货页面的实时行情数据
* 限量: 单次返回当日可以订阅的所有期货品种数据
*/
public class futures_zh_spotResponse extends AkShareRequestAndResponse {
    public futures_zh_spotResponse(){
        setInterfaceName("futures_zh_spot");
    }

    public static futures_zh_spotResponse of(


    Double p_askprice,

    Integer p_buyvol,

    Double p_hold,

    String p_symbol,

    Double p_low,

    LocalDateTime p_time,

    Double p_open,

    Double p_bidprice,

    Integer p_volume,

    Double p_lastclose,

    Integer p_sellvol,

    Double p_high,

    Double p_currentprice,

    Double p_lastsettleprice,

    Double p_avgprice,


    Map.Entry<String, String>... others){
    futures_zh_spotResponse t = new futures_zh_spotResponse();


    t.p_askprice = p_askprice;

    t.p_buyvol = p_buyvol;

    t.p_hold = p_hold;

    t.p_symbol = p_symbol;

    t.p_low = p_low;

    t.p_time = p_time;

    t.p_open = p_open;

    t.p_bidprice = p_bidprice;

    t.p_volume = p_volume;

    t.p_lastclose = p_lastclose;

    t.p_sellvol = p_sellvol;

    t.p_high = p_high;

    t.p_currentprice = p_currentprice;

    t.p_lastsettleprice = p_lastsettleprice;

    t.p_avgprice = p_avgprice;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: ask_price
    * type: float64
    * desc: 卖价
    * required: 
    */
    @JsonProperty("ask_price")
    
    
    private Double p_askprice;

    public Double getP_askprice() { return this.p_askprice;}
    public void setP_askprice(Double v) { this.p_askprice = v;}

    /**
    * name: buy_vol
    * type: int64
    * desc: 买量
    * required: 
    */
    @JsonProperty("buy_vol")
    
    
    private Integer p_buyvol;

    public Integer getP_buyvol() { return this.p_buyvol;}
    public void setP_buyvol(Integer v) { this.p_buyvol = v;}

    /**
    * name: hold
    * type: float64
    * desc: 持仓量
    * required: 
    */
    @JsonProperty("hold")
    
    
    private Double p_hold;

    public Double getP_hold() { return this.p_hold;}
    public void setP_hold(Double v) { this.p_hold = v;}

    /**
    * name: symbol
    * type: object
    * desc: 品种
    * required: 
    */
    @JsonProperty("symbol")
    
    
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: low
    * type: float64
    * desc: 低
    * required: 
    */
    @JsonProperty("low")
    
    
    private Double p_low;

    public Double getP_low() { return this.p_low;}
    public void setP_low(Double v) { this.p_low = v;}

    /**
    * name: time
    * type: object
    * desc: 时间, e.g., 144050表示下午14点40分50秒
    * required: 
    */
    @JsonProperty("time")
    
    @JsonDeserialize(using = JacksonDateTimeDeserializer.class) 
    private LocalDateTime p_time;

    public LocalDateTime getP_time() { return this.p_time;}
    public void setP_time(LocalDateTime v) { this.p_time = v;}

    /**
    * name: open
    * type: float64
    * desc: 开盘
    * required: 
    */
    @JsonProperty("open")
    
    
    private Double p_open;

    public Double getP_open() { return this.p_open;}
    public void setP_open(Double v) { this.p_open = v;}

    /**
    * name: bid_price
    * type: float64
    * desc: 买
    * required: 
    */
    @JsonProperty("bid_price")
    
    
    private Double p_bidprice;

    public Double getP_bidprice() { return this.p_bidprice;}
    public void setP_bidprice(Double v) { this.p_bidprice = v;}

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
    * name: last_close
    * type: float64
    * desc: 上一个交易日的收盘价
    * required: 
    */
    @JsonProperty("last_close")
    
    
    private Double p_lastclose;

    public Double getP_lastclose() { return this.p_lastclose;}
    public void setP_lastclose(Double v) { this.p_lastclose = v;}

    /**
    * name: sell_vol
    * type: int64
    * desc: 卖量
    * required: 
    */
    @JsonProperty("sell_vol")
    
    
    private Integer p_sellvol;

    public Integer getP_sellvol() { return this.p_sellvol;}
    public void setP_sellvol(Integer v) { this.p_sellvol = v;}

    /**
    * name: high
    * type: float64
    * desc: 高
    * required: 
    */
    @JsonProperty("high")
    
    
    private Double p_high;

    public Double getP_high() { return this.p_high;}
    public void setP_high(Double v) { this.p_high = v;}

    /**
    * name: current_price
    * type: float64
    * desc: 当前价格(买价)
    * required: 
    */
    @JsonProperty("current_price")
    
    
    private Double p_currentprice;

    public Double getP_currentprice() { return this.p_currentprice;}
    public void setP_currentprice(Double v) { this.p_currentprice = v;}

    /**
    * name: last_settle_price
    * type: float64
    * desc: 上一个交易日的结算价
    * required: 
    */
    @JsonProperty("last_settle_price")
    
    
    private Double p_lastsettleprice;

    public Double getP_lastsettleprice() { return this.p_lastsettleprice;}
    public void setP_lastsettleprice(Double v) { this.p_lastsettleprice = v;}

    /**
    * name: avg_price
    * type: float64
    * desc: 均价
    * required: 
    */
    @JsonProperty("avg_price")
    
    
    private Double p_avgprice;

    public Double getP_avgprice() { return this.p_avgprice;}
    public void setP_avgprice(Double v) { this.p_avgprice = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
