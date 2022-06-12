
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
* 接口: stock_us_famous_spot_em
* 目标地址: http://quote.eastmoney.com/center/gridlist.html#us_wellknown
* 描述: 美股-知名美股的实时行情数据
* 限量: 单次返回指定 symbol 的行情数据
*/
public class stock_us_famous_spot_emRequest extends AkShareRequestAndResponse {
    public stock_us_famous_spot_emRequest(){
        setInterfaceName("stock_us_famous_spot_em");
    }

    public static stock_us_famous_spot_emRequest of(


    String p_symbol,


    Map.Entry<String, String>... others){
    stock_us_famous_spot_emRequest t = new stock_us_famous_spot_emRequest();


    t.p_symbol = p_symbol;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;科技类&quot;; choice of {&#39;科技类&#39;, &#39;金融类&#39;, &#39;医药食品类&#39;, &#39;媒体类&#39;, &#39;汽车能源类&#39;, &#39;制造零售类&#39;}
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