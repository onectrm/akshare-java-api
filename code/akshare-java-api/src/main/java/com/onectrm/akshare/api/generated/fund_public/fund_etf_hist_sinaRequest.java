
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: fund_public
* 接口: fund_etf_hist_sina
* 目标地址: http://vip.stock.finance.sina.com.cn/fund_center/index.html#jjhqetf
* 描述: 新浪财经-基金行情的日频率行情数据
* 限量: 单次返回指定基金的所有数据
*/
public class fund_etf_hist_sinaRequest extends AkShareRequestAndResponse {
    public fund_etf_hist_sinaRequest(){
        setInterfaceName("fund_etf_hist_sina");
    }

    public static fund_etf_hist_sinaRequest of(


    String p_symbol,


    Map.Entry<String, String>... others){
    fund_etf_hist_sinaRequest t = new fund_etf_hist_sinaRequest();


    t.p_symbol = p_symbol;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;sz169103&quot;; 基金列表可以通过 **ak.fund_etf_category_sina(symbol=&quot;LOF基金&quot;)** 可选参数为: 封闭式基金, ETF基金, LOF基金 查询
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