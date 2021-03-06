
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
    * 接口: energy_oil_hist
    * 目标地址: http://data.eastmoney.com/cjsj/oil_default.html
    * 描述: 东方财富-数据中心-中国油价-汽柴油历史调价信息
    * 限量: 单次返回中国油价的所有历史数据
    */
    public class energy_oil_histResponse extends AkShareRequestAndResponse {
    public energy_oil_histResponse(){
    setInterfaceName("energy_oil_hist");
    }

    public static energy_oil_histResponse of(


    LocalDate p_diao4zheng3ri4qi1,

    Integer p_qi4you2jia4ge2,

    Integer p_chai2you2jia4ge2,

    Double p_qi4you2zhang3fu2,

    Double p_chai2you2zhang3fu2,


    Map.Entry
    <String
    , String>... others){
    energy_oil_histResponse t = new energy_oil_histResponse();


    t.p_diao4zheng3ri4qi1 = p_diao4zheng3ri4qi1;

    t.p_qi4you2jia4ge2 = p_qi4you2jia4ge2;

    t.p_chai2you2jia4ge2 = p_chai2you2jia4ge2;

    t.p_qi4you2zhang3fu2 = p_qi4you2zhang3fu2;

    t.p_chai2you2zhang3fu2 = p_chai2you2zhang3fu2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 调整日期
    * type: object
    * desc: 价格调整的日期
    * required: 
    */
    @JsonProperty("调整日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_diao4zheng3ri4qi1;

    public LocalDate getP_diao4zheng3ri4qi1() { return this.p_diao4zheng3ri4qi1;}
    public void setP_diao4zheng3ri4qi1(LocalDate v) { this.p_diao4zheng3ri4qi1 = v;}

    /**
    * name: 汽油价格
    * type: int64
    * desc: 注意单位: 元/吨
    * required: 
    */
    @JsonProperty("汽油价格")
    
    
    private Integer p_qi4you2jia4ge2;

    public Integer getP_qi4you2jia4ge2() { return this.p_qi4you2jia4ge2;}
    public void setP_qi4you2jia4ge2(Integer v) { this.p_qi4you2jia4ge2 = v;}

    /**
    * name: 柴油价格
    * type: int64
    * desc: 注意单位: 元/吨
    * required: 
    */
    @JsonProperty("柴油价格")
    
    
    private Integer p_chai2you2jia4ge2;

    public Integer getP_chai2you2jia4ge2() { return this.p_chai2you2jia4ge2;}
    public void setP_chai2you2jia4ge2(Integer v) { this.p_chai2you2jia4ge2 = v;}

    /**
    * name: 汽油涨幅
    * type: float64
    * desc: 注意单位: 元/吨
    * required: 
    */
    @JsonProperty("汽油涨幅")
    
    
    private Double p_qi4you2zhang3fu2;

    public Double getP_qi4you2zhang3fu2() { return this.p_qi4you2zhang3fu2;}
    public void setP_qi4you2zhang3fu2(Double v) { this.p_qi4you2zhang3fu2 = v;}

    /**
    * name: 柴油涨幅
    * type: float64
    * desc: 注意单位: 元/吨
    * required: 
    */
    @JsonProperty("柴油涨幅")
    
    
    private Double p_chai2you2zhang3fu2;

    public Double getP_chai2you2zhang3fu2() { return this.p_chai2you2zhang3fu2;}
    public void setP_chai2you2zhang3fu2(Double v) { this.p_chai2you2zhang3fu2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
