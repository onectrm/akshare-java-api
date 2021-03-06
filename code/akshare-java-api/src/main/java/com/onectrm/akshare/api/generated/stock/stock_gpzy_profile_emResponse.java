
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
    * 接口: stock_gpzy_profile_em
    * 目标地址: http://data.eastmoney.com/gpzy/marketProfile.aspx
    * 描述: 东方财富网-数据中心-特色数据-股权质押-股权质押市场概况
    * 限量: 单次所有历史数据, 由于数据量比较大需要等待一定时间
    */
    public class stock_gpzy_profile_emResponse extends AkShareRequestAndResponse {
    public stock_gpzy_profile_emResponse(){
    setInterfaceName("stock_gpzy_profile_em");
    }

    public static stock_gpzy_profile_emResponse of(


    LocalDate p_jiao1yi4ri4qi1,

    Double p_Agu3zhi4ya1zong3bi3li4,

    Double p_zhi4ya1gong1si1shu4liang4,

    Double p_zhi4ya1bi3shu4,

    Double p_zhi4ya1zong3gu3shu4,

    Double p_zhi4ya1zong3shi4zhi2,

    Double p_hu4shen1300zhi3shu4,

    Double p_zhang3die1fu2,


    Map.Entry
    <String
    , String>... others){
    stock_gpzy_profile_emResponse t = new stock_gpzy_profile_emResponse();


    t.p_jiao1yi4ri4qi1 = p_jiao1yi4ri4qi1;

    t.p_Agu3zhi4ya1zong3bi3li4 = p_Agu3zhi4ya1zong3bi3li4;

    t.p_zhi4ya1gong1si1shu4liang4 = p_zhi4ya1gong1si1shu4liang4;

    t.p_zhi4ya1bi3shu4 = p_zhi4ya1bi3shu4;

    t.p_zhi4ya1zong3gu3shu4 = p_zhi4ya1zong3gu3shu4;

    t.p_zhi4ya1zong3shi4zhi2 = p_zhi4ya1zong3shi4zhi2;

    t.p_hu4shen1300zhi3shu4 = p_hu4shen1300zhi3shu4;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 交易日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("交易日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_jiao1yi4ri4qi1;

    public LocalDate getP_jiao1yi4ri4qi1() { return this.p_jiao1yi4ri4qi1;}
    public void setP_jiao1yi4ri4qi1(LocalDate v) { this.p_jiao1yi4ri4qi1 = v;}

    /**
    * name: A股质押总比例
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("A股质押总比例")
    
    
    private Double p_Agu3zhi4ya1zong3bi3li4;

    public Double getP_Agu3zhi4ya1zong3bi3li4() { return this.p_Agu3zhi4ya1zong3bi3li4;}
    public void setP_Agu3zhi4ya1zong3bi3li4(Double v) { this.p_Agu3zhi4ya1zong3bi3li4 = v;}

    /**
    * name: 质押公司数量
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("质押公司数量")
    
    
    private Double p_zhi4ya1gong1si1shu4liang4;

    public Double getP_zhi4ya1gong1si1shu4liang4() { return this.p_zhi4ya1gong1si1shu4liang4;}
    public void setP_zhi4ya1gong1si1shu4liang4(Double v) { this.p_zhi4ya1gong1si1shu4liang4 = v;}

    /**
    * name: 质押笔数
    * type: float64
    * desc: 注意单位: 笔
    * required: 
    */
    @JsonProperty("质押笔数")
    
    
    private Double p_zhi4ya1bi3shu4;

    public Double getP_zhi4ya1bi3shu4() { return this.p_zhi4ya1bi3shu4;}
    public void setP_zhi4ya1bi3shu4(Double v) { this.p_zhi4ya1bi3shu4 = v;}

    /**
    * name: 质押总股数
    * type: float64
    * desc: 注意单位: 股
    * required: 
    */
    @JsonProperty("质押总股数")
    
    
    private Double p_zhi4ya1zong3gu3shu4;

    public Double getP_zhi4ya1zong3gu3shu4() { return this.p_zhi4ya1zong3gu3shu4;}
    public void setP_zhi4ya1zong3gu3shu4(Double v) { this.p_zhi4ya1zong3gu3shu4 = v;}

    /**
    * name: 质押总市值
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("质押总市值")
    
    
    private Double p_zhi4ya1zong3shi4zhi2;

    public Double getP_zhi4ya1zong3shi4zhi2() { return this.p_zhi4ya1zong3shi4zhi2;}
    public void setP_zhi4ya1zong3shi4zhi2(Double v) { this.p_zhi4ya1zong3shi4zhi2 = v;}

    /**
    * name: 沪深300指数
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("沪深300指数")
    
    
    private Double p_hu4shen1300zhi3shu4;

    public Double getP_hu4shen1300zhi3shu4() { return this.p_hu4shen1300zhi3shu4;}
    public void setP_hu4shen1300zhi3shu4(Double v) { this.p_hu4shen1300zhi3shu4 = v;}

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
