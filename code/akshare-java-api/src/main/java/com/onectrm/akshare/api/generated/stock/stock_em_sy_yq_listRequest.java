
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
    * 接口: stock_em_sy_yq_list
    * 目标地址: http://data.eastmoney.com/sy/yqlist.html
    * 描述: 获取东方财富网-数据中心-特色数据-商誉-商誉减值预期明细
    * 限量: 单次所有历史数据, 由于数据量比较大需要等待一定时间
    */
    public class stock_em_sy_yq_listRequest extends AkShareRequestAndResponse {
    public stock_em_sy_yq_listRequest(){
    setInterfaceName("stock_em_sy_yq_list");
    }

    public static stock_em_sy_yq_listRequest of(


    String p_symbol,

    LocalDate p_tradedate,


    Map.Entry
    <String
    , String>... others){
    stock_em_sy_yq_listRequest t = new stock_em_sy_yq_listRequest();


    t.p_symbol = p_symbol;

    t.p_tradedate = p_tradedate;


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
    * desc: symbol=&quot;沪市主板&quot;; 参见网页选项
    * required: Y
    */
    @JsonProperty("symbol")
    
    
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: trade_date
    * type: str
    * desc: trade_date=&quot;2019-09-30&quot;; 参见网页选项
    * required: Y
    */
    @JsonProperty("trade_date")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_tradedate;

    public LocalDate getP_tradedate() { return this.p_tradedate;}
    public void setP_tradedate(LocalDate v) { this.p_tradedate = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
