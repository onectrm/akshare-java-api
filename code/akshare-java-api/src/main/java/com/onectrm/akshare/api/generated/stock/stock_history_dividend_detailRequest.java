
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:51 CST 2022*/
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
    * 接口: stock_history_dividend_detail
    * 目标地址: https://vip.stock.finance.sina.com.cn/corp/go.php/vISSUE_ShareBonus/stockid/300670.phtml
    * 描述: 新浪财经-发行与分配-分红配股
    * 限量: 单次获取指定股票的新浪财经-发行与分配-分红配股详情
    */
    public class stock_history_dividend_detailRequest extends AkShareRequestAndResponse {
    public stock_history_dividend_detailRequest(){
    setInterfaceName("stock_history_dividend_detail");
    }

    public static stock_history_dividend_detailRequest of(


    String p_symbol,

    String p_indicator,

    LocalDate p_date,


    Map.Entry
    <String
    , String>... others){
    stock_history_dividend_detailRequest t = new stock_history_dividend_detailRequest();


    t.p_symbol = p_symbol;

    t.p_indicator = p_indicator;

    t.p_date = p_date;


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
    * desc: symbol=&quot;600012&quot;; 股票代码
    * required: 
    */
    @JsonProperty("symbol")
    
    
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: indicator
    * type: str
    * desc: indicator=&quot;配股&quot;; choice of {&quot;分红&quot;, &quot;配股&quot;}
    * required: 
    */
    @JsonProperty("indicator")
    
    
    private String p_indicator;

    public String getP_indicator() { return this.p_indicator;}
    public void setP_indicator(String v) { this.p_indicator = v;}

    /**
    * name: date
    * type: str
    * desc: date=&quot;1994-12-24&quot;; 分红配股的具体日期, e.g., &quot;1994-12-24&quot;
    * required: 
    */
    @JsonProperty("date")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
