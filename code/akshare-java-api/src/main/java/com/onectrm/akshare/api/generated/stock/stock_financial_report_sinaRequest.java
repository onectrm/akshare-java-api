
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
    * 接口: stock_financial_report_sina
    * 目标地址: https://vip.stock.finance.sina.com.cn/corp/go.php/vFD_BalanceSheet/stockid/600004/ctrl/part/displaytype/4.phtml
    * 描述: 新浪财经-财务报表-三大报表
    * 限量: 单次获取指定报表的所有年份数据
    */
    public class stock_financial_report_sinaRequest extends AkShareRequestAndResponse {
    public stock_financial_report_sinaRequest(){
    setInterfaceName("stock_financial_report_sina");
    }

    public static stock_financial_report_sinaRequest of(


    String p_stock,

    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_financial_report_sinaRequest t = new stock_financial_report_sinaRequest();


    t.p_stock = p_stock;

    t.p_symbol = p_symbol;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: stock
    * type: str
    * desc: stock=&quot;600004&quot;; 股票代码
    * required: 
    */
    @JsonProperty("stock")
    
    
    private String p_stock;

    public String getP_stock() { return this.p_stock;}
    public void setP_stock(String v) { this.p_stock = v;}

    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;现金流量表&quot;; choice of {&quot;资产负债表&quot;, &quot;利润表&quot;, &quot;现金流量表&quot;}
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
