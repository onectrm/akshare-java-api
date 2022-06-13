
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
    * 接口: stock_hot_tgb
    * 目标地址: https://www.taoguba.com.cn/stock/moreHotStock
    * 描述: 淘股吧-热门股票
    * 限量: 单次返回排名前 20 股票
    */
    public class stock_hot_tgbResponse extends AkShareRequestAndResponse {
    public stock_hot_tgbResponse(){
    setInterfaceName("stock_hot_tgb");
    }

    public static stock_hot_tgbResponse of(


    String p_ge4gu3dai4ma3,

    String p_ge4gu3ming2cheng1,


    Map.Entry
    <String
    , String>... others){
    stock_hot_tgbResponse t = new stock_hot_tgbResponse();


    t.p_ge4gu3dai4ma3 = p_ge4gu3dai4ma3;

    t.p_ge4gu3ming2cheng1 = p_ge4gu3ming2cheng1;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 个股代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("个股代码")
    
    
    private String p_ge4gu3dai4ma3;

    public String getP_ge4gu3dai4ma3() { return this.p_ge4gu3dai4ma3;}
    public void setP_ge4gu3dai4ma3(String v) { this.p_ge4gu3dai4ma3 = v;}

    /**
    * name: 个股名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("个股名称")
    
    
    private String p_ge4gu3ming2cheng1;

    public String getP_ge4gu3ming2cheng1() { return this.p_ge4gu3ming2cheng1;}
    public void setP_ge4gu3ming2cheng1(String v) { this.p_ge4gu3ming2cheng1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
