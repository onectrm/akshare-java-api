
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:50 CST 2022*/
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: macro
    * 接口: macro_cons_silver_change
    * 目标地址: https://datacenter.jin10.com/reportType/dc_eurozone_sentix_investor_confidence
    * 描述: 获取全球最大白银ETF--iShares Silver Trust持仓报告-增持-减持(吨), 数据区间从20060429-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_cons_silver_changeResponse extends AkShareRequestAndResponse {
    public macro_cons_silver_changeResponse(){
    setInterfaceName("macro_cons_silver_change");
    }

    public static macro_cons_silver_changeResponse of(


    LocalDate p_ri4qi1,

    Double p_zhi2,


    Map.Entry
    <String
    , String>... others){
    macro_cons_silver_changeResponse t = new macro_cons_silver_changeResponse();


    t.p_ri4qi1 = p_ri4qi1;

    t.p_zhi2 = p_zhi2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 日期
    * type: str
    * desc: 日期-索引
    * required: Y
    */
    @JsonProperty("日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_ri4qi1;

    public LocalDate getP_ri4qi1() { return this.p_ri4qi1;}
    public void setP_ri4qi1(LocalDate v) { this.p_ri4qi1 = v;}

    /**
    * name: 值
    * type: float
    * desc: 增持-减持(吨)
    * required: Y
    */
    @JsonProperty("值")
    
    
    private Double p_zhi2;

    public Double getP_zhi2() { return this.p_zhi2;}
    public void setP_zhi2(Double v) { this.p_zhi2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
