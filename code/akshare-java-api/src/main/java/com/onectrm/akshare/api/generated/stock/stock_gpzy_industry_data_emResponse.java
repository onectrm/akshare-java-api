
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
    * 接口: stock_gpzy_industry_data_em
    * 目标地址: http://data.eastmoney.com/gpzy/industryData.aspx
    * 描述: 东方财富网-数据中心-特色数据-股权质押-上市公司质押比例-行业数据
    * 限量: 单次返回所有历史数据
    */
    public class stock_gpzy_industry_data_emResponse extends AkShareRequestAndResponse {
    public stock_gpzy_industry_data_emResponse(){
    setInterfaceName("stock_gpzy_industry_data_em");
    }

    public static stock_gpzy_industry_data_emResponse of(


    String p_xing2ye4,

    Double p_ping2jun1zhi4ya1bi3li4,

    Double p_gong1si1jia1shu4,

    Double p_zhi4ya1zong3bi3shu4,

    Double p_zhi4ya1zong3gu3ben3,

    Double p_zui4xin1zhi4ya1shi4zhi2,

    LocalDateTime p_tong3ji4shi2jian1,


    Map.Entry
    <String
    , String>... others){
    stock_gpzy_industry_data_emResponse t = new stock_gpzy_industry_data_emResponse();


    t.p_xing2ye4 = p_xing2ye4;

    t.p_ping2jun1zhi4ya1bi3li4 = p_ping2jun1zhi4ya1bi3li4;

    t.p_gong1si1jia1shu4 = p_gong1si1jia1shu4;

    t.p_zhi4ya1zong3bi3shu4 = p_zhi4ya1zong3bi3shu4;

    t.p_zhi4ya1zong3gu3ben3 = p_zhi4ya1zong3gu3ben3;

    t.p_zui4xin1zhi4ya1shi4zhi2 = p_zui4xin1zhi4ya1shi4zhi2;

    t.p_tong3ji4shi2jian1 = p_tong3ji4shi2jian1;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 行业
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("行业")
    
    
    private String p_xing2ye4;

    public String getP_xing2ye4() { return this.p_xing2ye4;}
    public void setP_xing2ye4(String v) { this.p_xing2ye4 = v;}

    /**
    * name: 平均质押比例
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("平均质押比例")
    
    
    private Double p_ping2jun1zhi4ya1bi3li4;

    public Double getP_ping2jun1zhi4ya1bi3li4() { return this.p_ping2jun1zhi4ya1bi3li4;}
    public void setP_ping2jun1zhi4ya1bi3li4(Double v) { this.p_ping2jun1zhi4ya1bi3li4 = v;}

    /**
    * name: 公司家数
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("公司家数")
    
    
    private Double p_gong1si1jia1shu4;

    public Double getP_gong1si1jia1shu4() { return this.p_gong1si1jia1shu4;}
    public void setP_gong1si1jia1shu4(Double v) { this.p_gong1si1jia1shu4 = v;}

    /**
    * name: 质押总笔数
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("质押总笔数")
    
    
    private Double p_zhi4ya1zong3bi3shu4;

    public Double getP_zhi4ya1zong3bi3shu4() { return this.p_zhi4ya1zong3bi3shu4;}
    public void setP_zhi4ya1zong3bi3shu4(Double v) { this.p_zhi4ya1zong3bi3shu4 = v;}

    /**
    * name: 质押总股本
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("质押总股本")
    
    
    private Double p_zhi4ya1zong3gu3ben3;

    public Double getP_zhi4ya1zong3gu3ben3() { return this.p_zhi4ya1zong3gu3ben3;}
    public void setP_zhi4ya1zong3gu3ben3(Double v) { this.p_zhi4ya1zong3gu3ben3 = v;}

    /**
    * name: 最新质押市值
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("最新质押市值")
    
    
    private Double p_zui4xin1zhi4ya1shi4zhi2;

    public Double getP_zui4xin1zhi4ya1shi4zhi2() { return this.p_zui4xin1zhi4ya1shi4zhi2;}
    public void setP_zui4xin1zhi4ya1shi4zhi2(Double v) { this.p_zui4xin1zhi4ya1shi4zhi2 = v;}

    /**
    * name: 统计时间
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("统计时间")
    
    @JsonDeserialize(using =
        JacksonDateTimeDeserializer.class)
    
    private LocalDateTime p_tong3ji4shi2jian1;

    public LocalDateTime getP_tong3ji4shi2jian1() { return this.p_tong3ji4shi2jian1;}
    public void setP_tong3ji4shi2jian1(LocalDateTime v) { this.p_tong3ji4shi2jian1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
