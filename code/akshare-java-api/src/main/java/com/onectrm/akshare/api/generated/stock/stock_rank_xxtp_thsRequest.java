
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
* 接口: stock_rank_xxtp_ths
* 目标地址: http://data.10jqka.com.cn/rank/xxtp/
* 描述: 同花顺-数据中心-技术选股-向下突破
* 限量: 单次返回所有数据
*/
public class stock_rank_xxtp_thsRequest extends AkShareRequestAndResponse {
    public stock_rank_xxtp_thsRequest(){
        setInterfaceName("stock_rank_xxtp_ths");
    }

    public static stock_rank_xxtp_thsRequest of(


    String p_symbol,


    Map.Entry<String, String>... others){
    stock_rank_xxtp_thsRequest t = new stock_rank_xxtp_thsRequest();


    t.p_symbol = p_symbol;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;500日均线&quot;; choice of {&quot;5日均线&quot;, &quot;10日均线&quot;, &quot;20日均线&quot;, &quot;30日均线&quot;, &quot;60日均线&quot;, &quot;90日均线&quot;, &quot;250日均线&quot;, &quot;500日均线&quot;}
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
