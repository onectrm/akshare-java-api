
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.index;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: index
    * 接口: index_ii_cx
    * 目标地址: https://s.ccxe.com.cn/indices/dei
    * 描述: 财新指数-产业指数
    * 限量: 该接口返回所有历史数据
    */
    public class index_ii_cxResponse extends AkShareRequestAndResponse {
    public index_ii_cxResponse(){
    setInterfaceName("index_ii_cx");
    }

    public static index_ii_cxResponse of(


    LocalDate p_ri4qi1,

    Double p_chan3ye4zhi3shu4,

    Double p_bian4hua4zhi2,


    Map.Entry
    <String
    , String>... others){
    index_ii_cxResponse t = new index_ii_cxResponse();


    t.p_ri4qi1 = p_ri4qi1;

    t.p_chan3ye4zhi3shu4 = p_chan3ye4zhi3shu4;

    t.p_bian4hua4zhi2 = p_bian4hua4zhi2;


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
    * desc: 
    * required: 
    */
    @JsonProperty("日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_ri4qi1;

    public LocalDate getP_ri4qi1() { return this.p_ri4qi1;}
    public void setP_ri4qi1(LocalDate v) { this.p_ri4qi1 = v;}

    /**
    * name: 产业指数
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("产业指数")
    
    
    private Double p_chan3ye4zhi3shu4;

    public Double getP_chan3ye4zhi3shu4() { return this.p_chan3ye4zhi3shu4;}
    public void setP_chan3ye4zhi3shu4(Double v) { this.p_chan3ye4zhi3shu4 = v;}

    /**
    * name: 变化值
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("变化值")
    
    
    private Double p_bian4hua4zhi2;

    public Double getP_bian4hua4zhi2() { return this.p_bian4hua4zhi2;}
    public void setP_bian4hua4zhi2(Double v) { this.p_bian4hua4zhi2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
