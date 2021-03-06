
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
    * 接口: stock_hk_eniu_indicator
    * 目标地址: https://eniu.com/gu/hk01093/roe
    * 描述: 亿牛网-港股个股指标: 市盈率, 市净率, 股息率, ROE, 市值
    * 限量: 单次获取指定 symbol 和 indicator 的所有历史数据
    */
    public class stock_hk_eniu_indicatorResponse extends AkShareRequestAndResponse {
    public stock_hk_eniu_indicatorResponse(){
    setInterfaceName("stock_hk_eniu_indicator");
    }

    public static stock_hk_eniu_indicatorResponse of(


    String p_gen1ju4indicatorer2yi4,


    Map.Entry
    <String
    , String>... others){
    stock_hk_eniu_indicatorResponse t = new stock_hk_eniu_indicatorResponse();


    t.p_gen1ju4indicatorer2yi4 = p_gen1ju4indicatorer2yi4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 
    * type: 
    * desc: 根据 indicator 而异
    * required: 
    */
    @JsonProperty("")
    
    
    private String p_gen1ju4indicatorer2yi4;

    public String getP_gen1ju4indicatorer2yi4() { return this.p_gen1ju4indicatorer2yi4;}
    public void setP_gen1ju4indicatorer2yi4(String v) { this.p_gen1ju4indicatorer2yi4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
