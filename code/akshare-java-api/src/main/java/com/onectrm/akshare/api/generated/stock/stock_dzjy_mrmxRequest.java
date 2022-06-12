
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
* 接口: stock_dzjy_mrmx
* 目标地址: http://data.eastmoney.com/dzjy/dzjy_mrmxa.aspx
* 描述: 东方财富网-数据中心-大宗交易-每日明细
* 限量: 单次返回所有历史数据
*/
public class stock_dzjy_mrmxRequest extends AkShareRequestAndResponse {
    public stock_dzjy_mrmxRequest(){
        setInterfaceName("stock_dzjy_mrmx");
    }

    public static stock_dzjy_mrmxRequest of(


    LocalDate p_enddate,

    String p_symbol,

    LocalDate p_startdate,


    Map.Entry<String, String>... others){
    stock_dzjy_mrmxRequest t = new stock_dzjy_mrmxRequest();


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
    * type: sr
    * desc: end_date=&#39;20201204&#39;; 结束日期
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
    * desc: symbol=&#39;债券&#39;; choice of {&#39;A股&#39;, &#39;B股&#39;, &#39;基金&#39;, &#39;债券&#39;}
    * required: 
    */
    @JsonProperty("symbol")
    
    
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&#39;20201123&#39;; 开始日期
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
