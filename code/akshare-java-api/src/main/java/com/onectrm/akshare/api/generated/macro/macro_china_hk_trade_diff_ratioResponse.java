
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
    * 接口: macro_china_hk_trade_diff_ratio
    * 目标地址: https://data.eastmoney.com/cjsj/foreign_8_7.html
    * 描述: 东方财富-经济数据一览-中国香港-香港商品贸易差额年率
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_hk_trade_diff_ratioResponse extends AkShareRequestAndResponse {
    public macro_china_hk_trade_diff_ratioResponse(){
    setInterfaceName("macro_china_hk_trade_diff_ratio");
    }

    public static macro_china_hk_trade_diff_ratioResponse of(


    LocalDateTime p_shi2jian1,

    Double p_qian2zhi2,

    Double p_xian4zhi2,

    LocalDate p_fa1bu4ri4qi1,


    Map.Entry
    <String
    , String>... others){
    macro_china_hk_trade_diff_ratioResponse t = new macro_china_hk_trade_diff_ratioResponse();


    t.p_shi2jian1 = p_shi2jian1;

    t.p_qian2zhi2 = p_qian2zhi2;

    t.p_xian4zhi2 = p_xian4zhi2;

    t.p_fa1bu4ri4qi1 = p_fa1bu4ri4qi1;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 时间
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("时间")
    
    @JsonDeserialize(using =
        JacksonDateTimeDeserializer.class)
    
    private LocalDateTime p_shi2jian1;

    public LocalDateTime getP_shi2jian1() { return this.p_shi2jian1;}
    public void setP_shi2jian1(LocalDateTime v) { this.p_shi2jian1 = v;}

    /**
    * name: 前值
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("前值")
    
    
    private Double p_qian2zhi2;

    public Double getP_qian2zhi2() { return this.p_qian2zhi2;}
    public void setP_qian2zhi2(Double v) { this.p_qian2zhi2 = v;}

    /**
    * name: 现值
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("现值")
    
    
    private Double p_xian4zhi2;

    public Double getP_xian4zhi2() { return this.p_xian4zhi2;}
    public void setP_xian4zhi2(Double v) { this.p_xian4zhi2 = v;}

    /**
    * name: 发布日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("发布日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_fa1bu4ri4qi1;

    public LocalDate getP_fa1bu4ri4qi1() { return this.p_fa1bu4ri4qi1;}
    public void setP_fa1bu4ri4qi1(LocalDate v) { this.p_fa1bu4ri4qi1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
