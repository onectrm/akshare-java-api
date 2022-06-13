
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
    * 接口: stock_a_pb
    * 目标地址: https://www.legulegu.com/stockdata/market_pb
    * 描述: 乐咕乐股网站-A 股市净率
    * 限量: 单次获取指定 symbol 的所有数据
    */
    public class stock_a_pbRequest extends AkShareRequestAndResponse {
    public stock_a_pbRequest(){
    setInterfaceName("stock_a_pb");
    }

    public static stock_a_pbRequest of(


    String p_symbol,


    Map.Entry
    <String
    , String>... others){
    stock_a_pbRequest t = new stock_a_pbRequest();


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
    * desc: symbol=&quot;000016.XSHG&quot;; 参见 **stock_a_pb** 一览表
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
