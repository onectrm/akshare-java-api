
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
    * 接口: stock_hot_rank_em
    * 目标地址: http://guba.eastmoney.com/rank/
    * 描述: 东方财富网站-股票热度
    * 限量: 单次返回所有股票当前交易日的人气排名数据
    */
    public class stock_hot_rank_emResponse extends AkShareRequestAndResponse {
    public stock_hot_rank_emResponse(){
    setInterfaceName("stock_hot_rank_em");
    }

    public static stock_hot_rank_emResponse of(


    Integer p_dang1qian2pai2ming2,

    String p_dai4ma3,

    String p_gu3piao4ming2cheng1,

    Double p_zui4xin1jia4,

    Double p_zhang3die1fu2,


    Map.Entry
    <String
    , String>... others){
    stock_hot_rank_emResponse t = new stock_hot_rank_emResponse();


    t.p_dang1qian2pai2ming2 = p_dang1qian2pai2ming2;

    t.p_dai4ma3 = p_dai4ma3;

    t.p_gu3piao4ming2cheng1 = p_gu3piao4ming2cheng1;

    t.p_zui4xin1jia4 = p_zui4xin1jia4;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 当前排名
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("当前排名")
    
    
    private Integer p_dang1qian2pai2ming2;

    public Integer getP_dang1qian2pai2ming2() { return this.p_dang1qian2pai2ming2;}
    public void setP_dang1qian2pai2ming2(Integer v) { this.p_dang1qian2pai2ming2 = v;}

    /**
    * name: 代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("代码")
    
    
    private String p_dai4ma3;

    public String getP_dai4ma3() { return this.p_dai4ma3;}
    public void setP_dai4ma3(String v) { this.p_dai4ma3 = v;}

    /**
    * name: 股票名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股票名称")
    
    
    private String p_gu3piao4ming2cheng1;

    public String getP_gu3piao4ming2cheng1() { return this.p_gu3piao4ming2cheng1;}
    public void setP_gu3piao4ming2cheng1(String v) { this.p_gu3piao4ming2cheng1 = v;}

    /**
    * name: 最新价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("最新价")
    
    
    private Double p_zui4xin1jia4;

    public Double getP_zui4xin1jia4() { return this.p_zui4xin1jia4;}
    public void setP_zui4xin1jia4(Double v) { this.p_zui4xin1jia4 = v;}

    /**
    * name: 涨跌幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("涨跌幅")
    
    
    private Double p_zhang3die1fu2;

    public Double getP_zhang3die1fu2() { return this.p_zhang3die1fu2;}
    public void setP_zhang3die1fu2(Double v) { this.p_zhang3die1fu2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
