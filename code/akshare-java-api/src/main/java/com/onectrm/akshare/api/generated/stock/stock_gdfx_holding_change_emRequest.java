
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
    * 接口: stock_gdfx_holding_change_em
    * 目标地址: https://data.eastmoney.com/gdfx/HoldingAnalyse.html
    * 描述: 东方财富网-数据中心-股东分析-股东持股变动统计-十大股东
    * 限量: 单次返回指定 date 的所有数据
    */
    public class stock_gdfx_holding_change_emRequest extends AkShareRequestAndResponse {
    public stock_gdfx_holding_change_emRequest(){
    setInterfaceName("stock_gdfx_holding_change_em");
    }

    public static stock_gdfx_holding_change_emRequest of(


    LocalDate p_date,


    Map.Entry
    <String
    , String>... others){
    stock_gdfx_holding_change_emRequest t = new stock_gdfx_holding_change_emRequest();


    t.p_date = p_date;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: date
    * type: str
    * desc: date=&quot;20210930&quot;; 财报发布季度最后日
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
