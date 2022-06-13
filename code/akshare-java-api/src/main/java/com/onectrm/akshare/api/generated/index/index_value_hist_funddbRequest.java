
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.index;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: index
    * 接口: index_value_hist_funddb
    * 目标地址: https://funddb.cn/site/index
    * 描述: funddb-指数估值-估值信息
    * 限量: 该接口返回指定指数和指定指标的估值数据
    */
    public class index_value_hist_funddbRequest extends AkShareRequestAndResponse {
    public index_value_hist_funddbRequest(){
    setInterfaceName("index_value_hist_funddb");
    }

    public static index_value_hist_funddbRequest of(


    String p_symbol,

    String p_indicator,


    Map.Entry
    <String
    , String>... others){
    index_value_hist_funddbRequest t = new index_value_hist_funddbRequest();


    t.p_symbol = p_symbol;

    t.p_indicator = p_indicator;


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
    * desc: symbol=&quot;大盘成长&quot;; 指数名称, 通过调用 ak.index_value_name_funddb() 来获取
    * required: 
    */
    @JsonProperty("symbol")
    
    
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: indicator
    * type: str
    * desc: indicator=&quot;股息率&quot;; choice of {&#39;市盈率&#39;, &#39;市净率&#39;, &#39;股息率&#39;}
    * required: 
    */
    @JsonProperty("indicator")
    
    
    private String p_indicator;

    public String getP_indicator() { return this.p_indicator;}
    public void setP_indicator(String v) { this.p_indicator = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
