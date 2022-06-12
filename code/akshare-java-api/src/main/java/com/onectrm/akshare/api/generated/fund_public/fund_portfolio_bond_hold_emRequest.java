
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
* 接口: fund_portfolio_bond_hold_em
* 目标地址: http://fundf10.eastmoney.com/ccmx_000001.html
* 描述: 天天基金网-基金档案-投资组合-债券持仓
* 限量: 单次返回指定 symbol 和 date 的所有持仓数据
*/
public class fund_portfolio_bond_hold_emRequest extends AkShareRequestAndResponse {
    public fund_portfolio_bond_hold_emRequest(){
        setInterfaceName("fund_portfolio_bond_hold_em");
    }

    public static fund_portfolio_bond_hold_emRequest of(


    LocalDate p_date,

    String p_symbol,


    Map.Entry<String, String>... others){
    fund_portfolio_bond_hold_emRequest t = new fund_portfolio_bond_hold_emRequest();


    t.p_date = p_date;

    t.p_symbol = p_symbol;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: date
    * type: str
    * desc: date=&quot;2021&quot;; 指定年份
    * required: 
    */
    @JsonProperty("date")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}

    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;000001&quot;; 基金代码, 可以通过调用 **ak.fund_name_em()** 接口获取
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
