
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
* 接口: option_dce_daily
* 目标地址: http://www.dce.com.cn/dalianshangpin/xqsj/tjsj26/rtj/rxq/index.html
* 描述: 大连商品交易所-商品期权数据
* 限量: 单次返回指定 symbol 和 trade_date 的期权行情数据
*/
public class option_dce_dailyRequest extends AkShareRequestAndResponse {
    public option_dce_dailyRequest(){
        setInterfaceName("option_dce_daily");
    }

    public static option_dce_dailyRequest of(


    LocalDate p_tradedate,

    String p_symbol,


    Map.Entry<String, String>... others){
    option_dce_dailyRequest t = new option_dce_dailyRequest();


    t.p_tradedate = p_tradedate;

    t.p_symbol = p_symbol;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: trade_date
    * type: str
    * desc: trade_date=&quot;20191017&quot;
    * required: 
    */
    @JsonProperty("trade_date")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_tradedate;

    public LocalDate getP_tradedate() { return this.p_tradedate;}
    public void setP_tradedate(LocalDate v) { this.p_tradedate = v;}

    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;玉米期权&quot;
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