
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.energy;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: energy
    * 接口: energy_oil_detail
    * 目标地址: http://data.eastmoney.com/cjsj/oil_default.html
    * 描述: 东方财富-数据中心-中国油价-地区油价
    * 限量: 返回指定调价日的全国各地区的油价的历史数据
    */
    public class energy_oil_detailResponse extends AkShareRequestAndResponse {
    public energy_oil_detailResponse(){
    setInterfaceName("energy_oil_detail");
    }

    public static energy_oil_detailResponse of(


    LocalDate p_ri4qi1,

    Double p_V0,

    Double p_V92,

    Double p_V95,

    Double p_V89,

    String p_di4qu1,

    Double p_ZDE0,

    Double p_ZDE92,

    Double p_ZDE95,

    Double p_ZDE89,

    Double p_QE0,

    Double p_QE92,

    Double p_QE95,

    Double p_QE89,


    Map.Entry
    <String
    , String>... others){
    energy_oil_detailResponse t = new energy_oil_detailResponse();


    t.p_ri4qi1 = p_ri4qi1;

    t.p_V0 = p_V0;

    t.p_V92 = p_V92;

    t.p_V95 = p_V95;

    t.p_V89 = p_V89;

    t.p_di4qu1 = p_di4qu1;

    t.p_ZDE0 = p_ZDE0;

    t.p_ZDE92 = p_ZDE92;

    t.p_ZDE95 = p_ZDE95;

    t.p_ZDE89 = p_ZDE89;

    t.p_QE0 = p_QE0;

    t.p_QE92 = p_QE92;

    t.p_QE95 = p_QE95;

    t.p_QE89 = p_QE89;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 日期
    * type: object
    * desc: 价格调整的日期
    * required: 
    */
    @JsonProperty("日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_ri4qi1;

    public LocalDate getP_ri4qi1() { return this.p_ri4qi1;}
    public void setP_ri4qi1(LocalDate v) { this.p_ri4qi1 = v;}

    /**
    * name: V_0
    * type: float64
    * desc: 0#柴油价格(单位:元/升)
    * required: 
    */
    @JsonProperty("V_0")
    
    
    private Double p_V0;

    public Double getP_V0() { return this.p_V0;}
    public void setP_V0(Double v) { this.p_V0 = v;}

    /**
    * name: V_92
    * type: float64
    * desc: 92#汽油价格(单位:元/升)
    * required: 
    */
    @JsonProperty("V_92")
    
    
    private Double p_V92;

    public Double getP_V92() { return this.p_V92;}
    public void setP_V92(Double v) { this.p_V92 = v;}

    /**
    * name: V_95
    * type: float64
    * desc: 95#汽油价格(单位:元/升)
    * required: 
    */
    @JsonProperty("V_95")
    
    
    private Double p_V95;

    public Double getP_V95() { return this.p_V95;}
    public void setP_V95(Double v) { this.p_V95 = v;}

    /**
    * name: V_89
    * type: float64
    * desc: 89#汽油价格(单位:元/升)
    * required: 
    */
    @JsonProperty("V_89")
    
    
    private Double p_V89;

    public Double getP_V89() { return this.p_V89;}
    public void setP_V89(Double v) { this.p_V89 = v;}

    /**
    * name: 地区
    * type: object
    * desc: 地区
    * required: 
    */
    @JsonProperty("地区")
    
    
    private String p_di4qu1;

    public String getP_di4qu1() { return this.p_di4qu1;}
    public void setP_di4qu1(String v) { this.p_di4qu1 = v;}

    /**
    * name: ZDE_0
    * type: float64
    * desc: 0#柴油涨幅(单位:元/升)
    * required: 
    */
    @JsonProperty("ZDE_0")
    
    
    private Double p_ZDE0;

    public Double getP_ZDE0() { return this.p_ZDE0;}
    public void setP_ZDE0(Double v) { this.p_ZDE0 = v;}

    /**
    * name: ZDE_92
    * type: float64
    * desc: 92#汽油涨幅(单位:元/升)
    * required: 
    */
    @JsonProperty("ZDE_92")
    
    
    private Double p_ZDE92;

    public Double getP_ZDE92() { return this.p_ZDE92;}
    public void setP_ZDE92(Double v) { this.p_ZDE92 = v;}

    /**
    * name: ZDE_95
    * type: float64
    * desc: 95#汽油涨幅(单位:元/升)
    * required: 
    */
    @JsonProperty("ZDE_95")
    
    
    private Double p_ZDE95;

    public Double getP_ZDE95() { return this.p_ZDE95;}
    public void setP_ZDE95(Double v) { this.p_ZDE95 = v;}

    /**
    * name: ZDE_89
    * type: float64
    * desc: 89#汽油涨幅(单位:元/升)
    * required: 
    */
    @JsonProperty("ZDE_89")
    
    
    private Double p_ZDE89;

    public Double getP_ZDE89() { return this.p_ZDE89;}
    public void setP_ZDE89(Double v) { this.p_ZDE89 = v;}

    /**
    * name: QE_0
    * type: float64
    * desc: 上一次调整时0#柴油价格(单位:元/升)
    * required: 
    */
    @JsonProperty("QE_0")
    
    
    private Double p_QE0;

    public Double getP_QE0() { return this.p_QE0;}
    public void setP_QE0(Double v) { this.p_QE0 = v;}

    /**
    * name: QE_92
    * type: float64
    * desc: 上一次调整时92#汽油价格(单位:元/升)
    * required: 
    */
    @JsonProperty("QE_92")
    
    
    private Double p_QE92;

    public Double getP_QE92() { return this.p_QE92;}
    public void setP_QE92(Double v) { this.p_QE92 = v;}

    /**
    * name: QE_95
    * type: float64
    * desc: 上一次调整时95#汽油价格(单位:元/升)
    * required: 
    */
    @JsonProperty("QE_95")
    
    
    private Double p_QE95;

    public Double getP_QE95() { return this.p_QE95;}
    public void setP_QE95(Double v) { this.p_QE95 = v;}

    /**
    * name: QE_89
    * type: float64
    * desc: 上一次调整时89#汽油价格(单位:元/升)
    * required: 
    */
    @JsonProperty("QE_89")
    
    
    private Double p_QE89;

    public Double getP_QE89() { return this.p_QE89;}
    public void setP_QE89(Double v) { this.p_QE89 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
