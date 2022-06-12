
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
* 接口: stock_fund_flow_industry
* 目标地址: http://data.10jqka.com.cn/funds/hyzjl/#refCountId=data_55f13c2c_254
* 描述: 同花顺-数据中心-资金流向-行业资金流
* 限量: 单次获取指定 symbol 的行业资金流数据
*/
public class stock_fund_flow_industryRequest extends AkShareRequestAndResponse {
    public stock_fund_flow_industryRequest(){
        setInterfaceName("stock_fund_flow_industry");
    }

    public static stock_fund_flow_industryRequest of(


    String p_symbol,


    Map.Entry<String, String>... others){
    stock_fund_flow_industryRequest t = new stock_fund_flow_industryRequest();


    t.p_symbol = p_symbol;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;即时&quot;; choice of {“即时”, &quot;3日排行&quot;, &quot;5日排行&quot;, &quot;10日排行&quot;, &quot;20日排行&quot;}
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
