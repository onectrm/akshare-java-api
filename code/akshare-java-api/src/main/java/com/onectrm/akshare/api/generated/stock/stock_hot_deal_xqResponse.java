
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
    * 接口: stock_hot_deal_xq
    * 目标地址: https://xueqiu.com/hq
    * 描述: 雪球-沪深股市-热度排行榜-分享交易排行榜
    * 限量: 单次返回所有股票的热度数据
    */
    public class stock_hot_deal_xqResponse extends AkShareRequestAndResponse {
    public stock_hot_deal_xqResponse(){
    setInterfaceName("stock_hot_deal_xq");
    }

    public static stock_hot_deal_xqResponse of(


    String p_gu3piao4dai4ma3,

    String p_gu3piao4jian3cheng1,

    Double p_guan1zhu4,

    Double p_zui4xin1jia4,


    Map.Entry
    <String
    , String>... others){
    stock_hot_deal_xqResponse t = new stock_hot_deal_xqResponse();


    t.p_gu3piao4dai4ma3 = p_gu3piao4dai4ma3;

    t.p_gu3piao4jian3cheng1 = p_gu3piao4jian3cheng1;

    t.p_guan1zhu4 = p_guan1zhu4;

    t.p_zui4xin1jia4 = p_zui4xin1jia4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 股票代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股票代码")
    
    
    private String p_gu3piao4dai4ma3;

    public String getP_gu3piao4dai4ma3() { return this.p_gu3piao4dai4ma3;}
    public void setP_gu3piao4dai4ma3(String v) { this.p_gu3piao4dai4ma3 = v;}

    /**
    * name: 股票简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股票简称")
    
    
    private String p_gu3piao4jian3cheng1;

    public String getP_gu3piao4jian3cheng1() { return this.p_gu3piao4jian3cheng1;}
    public void setP_gu3piao4jian3cheng1(String v) { this.p_gu3piao4jian3cheng1 = v;}

    /**
    * name: 关注
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("关注")
    
    
    private Double p_guan1zhu4;

    public Double getP_guan1zhu4() { return this.p_guan1zhu4;}
    public void setP_guan1zhu4(Double v) { this.p_guan1zhu4 = v;}

    /**
    * name: 最新价
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("最新价")
    
    
    private Double p_zui4xin1jia4;

    public Double getP_zui4xin1jia4() { return this.p_zui4xin1jia4;}
    public void setP_zui4xin1jia4(Double v) { this.p_zui4xin1jia4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
