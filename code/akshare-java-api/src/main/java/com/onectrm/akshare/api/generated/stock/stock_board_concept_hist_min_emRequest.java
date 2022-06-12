
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
* 接口: stock_board_concept_hist_min_em
* 目标地址: http://quote.eastmoney.com/bk/90.BK0715.html(示例)
* 描述: 东方财富-沪深板块-概念板块-分时历史行情数据
* 限量: 单次返回指定 symbol 和 period 的历史数据
*/
public class stock_board_concept_hist_min_emRequest extends AkShareRequestAndResponse {
    public stock_board_concept_hist_min_emRequest(){
        setInterfaceName("stock_board_concept_hist_min_em");
    }

    public static stock_board_concept_hist_min_emRequest of(


    String p_period,

    String p_symbol,


    Map.Entry<String, String>... others){
    stock_board_concept_hist_min_emRequest t = new stock_board_concept_hist_min_emRequest();


    t.p_period = p_period;

    t.p_symbol = p_symbol;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: period
    * type: str
    * desc: period=&quot;5&quot;; choice of {&quot;1&quot;, &quot;5&quot;, &quot;15&quot;, &quot;30&quot;, &quot;60&quot;}
    * required: 
    */
    @JsonProperty("period")
    
    
    private String p_period;

    public String getP_period() { return this.p_period;}
    public void setP_period(String v) { this.p_period = v;}

    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;长寿药&quot;; 可以通过调用 **ak.stock_board_concept_name_em()** 查看东方财富-概念板块的所有概念代码
    * required: 
    */
    @JsonProperty("symbol")
    
    
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
