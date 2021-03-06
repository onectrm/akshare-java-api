
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: fund_public
    * 接口: fund_aum_hist_em
    * 目标地址: http://fund.eastmoney.com/Company/lsgm.html
    * 描述: 天天基金网-基金数据-基金公司历年管理规模排行列表
    * 限量: 单次返回所有基金公司历年管理规模排行列表数据
    */
    public class fund_aum_hist_emResponse extends AkShareRequestAndResponse {
    public fund_aum_hist_emResponse(){
    setInterfaceName("fund_aum_hist_em");
    }

    public static fund_aum_hist_emResponse of(


    Integer p_xu4hao4,

    String p_ji1jin1gong1si1,

    Double p_zong3gui1mo2,

    Double p_gu3piao4xing2,

    Double p_hun4he2xing2,

    Double p_zhai4quan4xing2,

    Double p_zhi3shu4xing2,

    Double p_QDII,

    Double p_huo4bi4xing2,


    Map.Entry
    <String
    , String>... others){
    fund_aum_hist_emResponse t = new fund_aum_hist_emResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_ji1jin1gong1si1 = p_ji1jin1gong1si1;

    t.p_zong3gui1mo2 = p_zong3gui1mo2;

    t.p_gu3piao4xing2 = p_gu3piao4xing2;

    t.p_hun4he2xing2 = p_hun4he2xing2;

    t.p_zhai4quan4xing2 = p_zhai4quan4xing2;

    t.p_zhi3shu4xing2 = p_zhi3shu4xing2;

    t.p_QDII = p_QDII;

    t.p_huo4bi4xing2 = p_huo4bi4xing2;


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
    * name: 基金公司
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("基金公司")
    
    
    private String p_ji1jin1gong1si1;

    public String getP_ji1jin1gong1si1() { return this.p_ji1jin1gong1si1;}
    public void setP_ji1jin1gong1si1(String v) { this.p_ji1jin1gong1si1 = v;}

    /**
    * name: 总规模
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("总规模")
    
    
    private Double p_zong3gui1mo2;

    public Double getP_zong3gui1mo2() { return this.p_zong3gui1mo2;}
    public void setP_zong3gui1mo2(Double v) { this.p_zong3gui1mo2 = v;}

    /**
    * name: 股票型
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("股票型")
    
    
    private Double p_gu3piao4xing2;

    public Double getP_gu3piao4xing2() { return this.p_gu3piao4xing2;}
    public void setP_gu3piao4xing2(Double v) { this.p_gu3piao4xing2 = v;}

    /**
    * name: 混合型
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("混合型")
    
    
    private Double p_hun4he2xing2;

    public Double getP_hun4he2xing2() { return this.p_hun4he2xing2;}
    public void setP_hun4he2xing2(Double v) { this.p_hun4he2xing2 = v;}

    /**
    * name: 债券型
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("债券型")
    
    
    private Double p_zhai4quan4xing2;

    public Double getP_zhai4quan4xing2() { return this.p_zhai4quan4xing2;}
    public void setP_zhai4quan4xing2(Double v) { this.p_zhai4quan4xing2 = v;}

    /**
    * name: 指数型
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("指数型")
    
    
    private Double p_zhi3shu4xing2;

    public Double getP_zhi3shu4xing2() { return this.p_zhi3shu4xing2;}
    public void setP_zhi3shu4xing2(Double v) { this.p_zhi3shu4xing2 = v;}

    /**
    * name: QDII
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("QDII")
    
    
    private Double p_QDII;

    public Double getP_QDII() { return this.p_QDII;}
    public void setP_QDII(Double v) { this.p_QDII = v;}

    /**
    * name: 货币型
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("货币型")
    
    
    private Double p_huo4bi4xing2;

    public Double getP_huo4bi4xing2() { return this.p_huo4bi4xing2;}
    public void setP_huo4bi4xing2(Double v) { this.p_huo4bi4xing2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
