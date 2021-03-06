
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
    * 接口: macro_germany_ifo
    * 目标地址: http://data.eastmoney.com/cjsj/foreign_1_0.html
    * 描述: 获取IFO商业景气指数
    * 限量: 单次返回所有历史数据
    */
    public class macro_germany_ifoResponse extends AkShareRequestAndResponse {
    public macro_germany_ifoResponse(){
    setInterfaceName("macro_germany_ifo");
    }

    public static macro_germany_ifoResponse of(


    LocalDateTime p_shi2jian1,

    Double p_qian2zhi2,

    Double p_xian4zhi2,

    LocalDate p_fa1bu4ri4qi1,


    Map.Entry
    <String
    , String>... others){
    macro_germany_ifoResponse t = new macro_germany_ifoResponse();


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
    * desc: 
    * required: 
    */
    @JsonProperty("前值")
    
    
    private Double p_qian2zhi2;

    public Double getP_qian2zhi2() { return this.p_qian2zhi2;}
    public void setP_qian2zhi2(Double v) { this.p_qian2zhi2 = v;}

    /**
    * name: 现值
    * type: float64
    * desc: 
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
