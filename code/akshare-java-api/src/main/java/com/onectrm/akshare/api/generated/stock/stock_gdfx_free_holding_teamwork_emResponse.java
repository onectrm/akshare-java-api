
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
    * 接口: stock_gdfx_free_holding_teamwork_em
    * 目标地址: https://data.eastmoney.com/gdfx/HoldingAnalyse.html
    * 描述: 东方财富网-数据中心-股东分析-股东协同-十大流通股东
    * 限量: 单次返回所有数据
    */
    public class stock_gdfx_free_holding_teamwork_emResponse extends AkShareRequestAndResponse {
    public stock_gdfx_free_holding_teamwork_emResponse(){
    setInterfaceName("stock_gdfx_free_holding_teamwork_em");
    }

    public static stock_gdfx_free_holding_teamwork_emResponse of(


    Integer p_xu4hao4,

    String p_gu3dong1ming2cheng1,

    String p_gu3dong1lei4xing2,

    String p_xie2tong2gu3dong1ming2cheng1,

    String p_xie2tong2gu3dong1lei4xing2,

    Integer p_xie2tong2ci4shu4,

    String p_ge4gu3xiang2qing2,


    Map.Entry
    <String
    , String>... others){
    stock_gdfx_free_holding_teamwork_emResponse t = new stock_gdfx_free_holding_teamwork_emResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_gu3dong1ming2cheng1 = p_gu3dong1ming2cheng1;

    t.p_gu3dong1lei4xing2 = p_gu3dong1lei4xing2;

    t.p_xie2tong2gu3dong1ming2cheng1 = p_xie2tong2gu3dong1ming2cheng1;

    t.p_xie2tong2gu3dong1lei4xing2 = p_xie2tong2gu3dong1lei4xing2;

    t.p_xie2tong2ci4shu4 = p_xie2tong2ci4shu4;

    t.p_ge4gu3xiang2qing2 = p_ge4gu3xiang2qing2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 序号
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("序号")
    
    
    private Integer p_xu4hao4;

    public Integer getP_xu4hao4() { return this.p_xu4hao4;}
    public void setP_xu4hao4(Integer v) { this.p_xu4hao4 = v;}

    /**
    * name: 股东名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股东名称")
    
    
    private String p_gu3dong1ming2cheng1;

    public String getP_gu3dong1ming2cheng1() { return this.p_gu3dong1ming2cheng1;}
    public void setP_gu3dong1ming2cheng1(String v) { this.p_gu3dong1ming2cheng1 = v;}

    /**
    * name: 股东类型
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股东类型")
    
    
    private String p_gu3dong1lei4xing2;

    public String getP_gu3dong1lei4xing2() { return this.p_gu3dong1lei4xing2;}
    public void setP_gu3dong1lei4xing2(String v) { this.p_gu3dong1lei4xing2 = v;}

    /**
    * name: 协同股东名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("协同股东名称")
    
    
    private String p_xie2tong2gu3dong1ming2cheng1;

    public String getP_xie2tong2gu3dong1ming2cheng1() { return this.p_xie2tong2gu3dong1ming2cheng1;}
    public void setP_xie2tong2gu3dong1ming2cheng1(String v) { this.p_xie2tong2gu3dong1ming2cheng1 = v;}

    /**
    * name: 协同股东类型
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("协同股东类型")
    
    
    private String p_xie2tong2gu3dong1lei4xing2;

    public String getP_xie2tong2gu3dong1lei4xing2() { return this.p_xie2tong2gu3dong1lei4xing2;}
    public void setP_xie2tong2gu3dong1lei4xing2(String v) { this.p_xie2tong2gu3dong1lei4xing2 = v;}

    /**
    * name: 协同次数
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("协同次数")
    
    
    private Integer p_xie2tong2ci4shu4;

    public Integer getP_xie2tong2ci4shu4() { return this.p_xie2tong2ci4shu4;}
    public void setP_xie2tong2ci4shu4(Integer v) { this.p_xie2tong2ci4shu4 = v;}

    /**
    * name: 个股详情
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("个股详情")
    
    
    private String p_ge4gu3xiang2qing2;

    public String getP_ge4gu3xiang2qing2() { return this.p_ge4gu3xiang2qing2;}
    public void setP_ge4gu3xiang2qing2(String v) { this.p_ge4gu3xiang2qing2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
