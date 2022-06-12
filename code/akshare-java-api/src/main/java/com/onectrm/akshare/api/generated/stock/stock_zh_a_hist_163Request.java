
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
* 接口: stock_zh_a_hist_163
* 目标地址: http://quotes.money.163.com/trade/lsjysj_601318.html?year=2022&amp;season=2
* 描述: 网易财经-行情首页-沪深 A 股-每日行情; 该接口主要用户获取流通市值、总市值等指标
* 限量: 单次返回指定沪深 A 股（不包含北交所）上市公司指定日期间的历史行情日频率数据, 该接口只返回未复权数据
*/
public class stock_zh_a_hist_163Request extends AkShareRequestAndResponse {
    public stock_zh_a_hist_163Request(){
        setInterfaceName("stock_zh_a_hist_163");
    }

    public static stock_zh_a_hist_163Request of(


    LocalDate p_enddate,

    String p_symbol,

    LocalDate p_startdate,


    Map.Entry<String, String>... others){
    stock_zh_a_hist_163Request t = new stock_zh_a_hist_163Request();


    t.p_enddate = p_enddate;

    t.p_symbol = p_symbol;

    t.p_startdate = p_startdate;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: end_date
    * type: str
    * desc: end_date=&#39;20201116&#39;; 结束查询的日期
    * required: 
    */
    @JsonProperty("end_date")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_enddate;

    public LocalDate getP_enddate() { return this.p_enddate;}
    public void setP_enddate(LocalDate v) { this.p_enddate = v;}

    /**
    * name: symbol
    * type: str
    * desc: symbol=&#39;sh601318&#39;; 股票代码可以在 **ak.stock_zh_a_spot()** 中获取; 其中 sh689009 没有数据
    * required: 
    */
    @JsonProperty("symbol")
    
    
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&#39;20201103&#39;; 开始查询的日期
    * required: 
    */
    @JsonProperty("start_date")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_startdate;

    public LocalDate getP_startdate() { return this.p_startdate;}
    public void setP_startdate(LocalDate v) { this.p_startdate = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
