
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:50 CST 2022*/
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
    * 接口: stock_cash_flow_sheet_by_quarterly_em
    * 目标地址: https://emweb.securities.eastmoney.com/PC_HSF10/NewFinanceAnalysis/Index?type=web&amp;code=sh600519#lrb-0
    * 描述: 东方财富-股票-财务分析-现金流量表-按单季度
    * 限量: 单次获取指定 symbol 的现金流量表-按单季度数据
    */
    public class stock_cash_flow_sheet_by_quarterly_emRequest extends AkShareRequestAndResponse {
    public stock_cash_flow_sheet_by_quarterly_emRequest(){
    setInterfaceName("stock_cash_flow_sheet_by_quarterly_em");
    }

    public static stock_cash_flow_sheet_by_quarterly_emRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_cash_flow_sheet_by_quarterly_emRequest t = new stock_cash_flow_sheet_by_quarterly_emRequest();


    t.p_symbol = p_symbol;


    for (Map.Entry
    <String
    , String> o : others) {
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
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
