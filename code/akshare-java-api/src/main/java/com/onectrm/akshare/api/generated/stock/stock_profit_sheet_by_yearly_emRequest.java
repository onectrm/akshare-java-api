
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
* 接口: stock_profit_sheet_by_yearly_em
* 目标地址: https://emweb.securities.eastmoney.com/PC_HSF10/NewFinanceAnalysis/Index?type=web&amp;code=sh600519#lrb-0
* 描述: 东方财富-股票-财务分析-利润表-按年度
* 限量: 单次获取指定 symbol 的利润表-按年度数据
*/
public class stock_profit_sheet_by_yearly_emRequest extends AkShareRequestAndResponse {
    public stock_profit_sheet_by_yearly_emRequest(){
        setInterfaceName("stock_profit_sheet_by_yearly_em");
    }

    public static stock_profit_sheet_by_yearly_emRequest of(


    String p_symbol,


    Map.Entry<String, String>... others){
    stock_profit_sheet_by_yearly_emRequest t = new stock_profit_sheet_by_yearly_emRequest();


    t.p_symbol = p_symbol;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;SH600519&quot;; 股票代码
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