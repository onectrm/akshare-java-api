
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
* 接口: stock_hsgt_hold_stock_em
* 目标地址: http://data.eastmoney.com/hsgtcg/list.html
* 描述: 东方财富网-数据中心-沪深港通持股-个股排行
* 限量: 单次获取指定 market 和 indicator 的所有数据
*/
public class stock_hsgt_hold_stock_emRequest extends AkShareRequestAndResponse {
    public stock_hsgt_hold_stock_emRequest(){
        setInterfaceName("stock_hsgt_hold_stock_em");
    }

    public static stock_hsgt_hold_stock_emRequest of(


    String p_market,

    String p_indicator,


    Map.Entry<String, String>... others){
    stock_hsgt_hold_stock_emRequest t = new stock_hsgt_hold_stock_emRequest();


    t.p_market = p_market;

    t.p_indicator = p_indicator;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: market
    * type: str
    * desc: market=&quot;沪股通&quot;; choice of {&quot;北向&quot;, &quot;沪股通&quot;, &quot;深股通&quot;}
    * required: 
    */
    @JsonProperty("market")
    
    
    private String p_market;

    public String getP_market() { return this.p_market;}
    public void setP_market(String v) { this.p_market = v;}

    /**
    * name: indicator
    * type: str
    * desc: indicator=&quot;沪股通&quot;; choice of {&quot;今日排行&quot;, &quot;3日排行&quot;, &quot;5日排行&quot;, &quot;10日排行&quot;, &quot;月排行&quot;, &quot;季排行&quot;, &quot;年排行&quot;}
    * required: 
    */
    @JsonProperty("indicator")
    
    
    private String p_indicator;

    public String getP_indicator() { return this.p_indicator;}
    public void setP_indicator(String v) { this.p_indicator = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}