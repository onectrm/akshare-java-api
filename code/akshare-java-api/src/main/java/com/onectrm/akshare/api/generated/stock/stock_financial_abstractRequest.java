
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
    * 接口: stock_financial_abstract
    * 目标地址: https://vip.stock.finance.sina.com.cn/corp/go.php/vFD_FinanceSummary/stockid/600004.phtml
    * 描述: 新浪财经-财务报表-财务摘要
    * 限量: 单次获取财务摘要所有历史数据
    */
    public class stock_financial_abstractRequest extends AkShareRequestAndResponse {
    public stock_financial_abstractRequest(){
    setInterfaceName("stock_financial_abstract");
    }

    public static stock_financial_abstractRequest of(


    String p_stock,


    Map.Entry
    <String
    , String>... others){
    stock_financial_abstractRequest t = new stock_financial_abstractRequest();


    t.p_stock = p_stock;


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


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
