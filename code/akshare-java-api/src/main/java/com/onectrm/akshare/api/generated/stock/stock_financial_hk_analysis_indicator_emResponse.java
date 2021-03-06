
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
    * 接口: stock_financial_hk_analysis_indicator_em
    * 目标地址: https://emweb.securities.eastmoney.com/PC_HKF10/NewFinancialAnalysis/index?type=web&amp;code=00700
    * 描述: 东方财富-港股-财务分析-主要指标
    * 限量: 单次获取财务指标所有历史数据
    */
    public class stock_financial_hk_analysis_indicator_emResponse extends AkShareRequestAndResponse {
    public stock_financial_hk_analysis_indicator_emResponse(){
    setInterfaceName("stock_financial_hk_analysis_indicator_em");
    }

    public static stock_financial_hk_analysis_indicator_emResponse of(


    String p_zhou1qi1,

    String p_ji1ben3mei3gu3shou1yi4yuan2,

    String p_xi1shi4mei3gu3shou1yi4yuan2,

    String p_TTMmei3gu3shou1yi4yuan2,

    String p_,


    Map.Entry
    <String
    , String>... others){
    stock_financial_hk_analysis_indicator_emResponse t = new stock_financial_hk_analysis_indicator_emResponse();


    t.p_zhou1qi1 = p_zhou1qi1;

    t.p_ji1ben3mei3gu3shou1yi4yuan2 = p_ji1ben3mei3gu3shou1yi4yuan2;

    t.p_xi1shi4mei3gu3shou1yi4yuan2 = p_xi1shi4mei3gu3shou1yi4yuan2;

    t.p_TTMmei3gu3shou1yi4yuan2 = p_TTMmei3gu3shou1yi4yuan2;

    t.p_ = p_;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 周期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("周期")
    
    
    private String p_zhou1qi1;

    public String getP_zhou1qi1() { return this.p_zhou1qi1;}
    public void setP_zhou1qi1(String v) { this.p_zhou1qi1 = v;}

    /**
    * name: 基本每股收益(元)
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("基本每股收益(元)")
    
    
    private String p_ji1ben3mei3gu3shou1yi4yuan2;

    public String getP_ji1ben3mei3gu3shou1yi4yuan2() { return this.p_ji1ben3mei3gu3shou1yi4yuan2;}
    public void setP_ji1ben3mei3gu3shou1yi4yuan2(String v) { this.p_ji1ben3mei3gu3shou1yi4yuan2 = v;}

    /**
    * name: 稀释每股收益(元)
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("稀释每股收益(元)")
    
    
    private String p_xi1shi4mei3gu3shou1yi4yuan2;

    public String getP_xi1shi4mei3gu3shou1yi4yuan2() { return this.p_xi1shi4mei3gu3shou1yi4yuan2;}
    public void setP_xi1shi4mei3gu3shou1yi4yuan2(String v) { this.p_xi1shi4mei3gu3shou1yi4yuan2 = v;}

    /**
    * name: TTM每股收益(元)
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("TTM每股收益(元)")
    
    
    private String p_TTMmei3gu3shou1yi4yuan2;

    public String getP_TTMmei3gu3shou1yi4yuan2() { return this.p_TTMmei3gu3shou1yi4yuan2;}
    public void setP_TTMmei3gu3shou1yi4yuan2(String v) { this.p_TTMmei3gu3shou1yi4yuan2 = v;}

    /**
    * name: ...
    * type: object
    * desc: 多项财务指标
    * required: 
    */
    @JsonProperty("...")
    
    
    private String p_;

    public String getP_() { return this.p_;}
    public void setP_(String v) { this.p_ = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
