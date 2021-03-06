
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: futures
    * 接口: futures_correlation_nh
    * 目标地址: http://www.nanhua.net/nhzc/correltable.html
    * 描述: 南华期货-统计监控-相关系数走势
    * 限量: 单次返回指定 date 和 period 的所有历史数据
    */
    public class futures_correlation_nhResponse extends AkShareRequestAndResponse {
    public futures_correlation_nhResponse(){
    setInterfaceName("futures_correlation_nh");
    }

    public static futures_correlation_nhResponse of(


    String p_pin3zhong3dai4ma31,

    String p_pin3zhong3ming2cheng11,

    String p_pin3zhong3dai4ma32,

    String p_pin3zhong3ming2cheng12,

    Double p_xiang1guan1xi4shu4,


    Map.Entry
    <String
    , String>... others){
    futures_correlation_nhResponse t = new futures_correlation_nhResponse();


    t.p_pin3zhong3dai4ma31 = p_pin3zhong3dai4ma31;

    t.p_pin3zhong3ming2cheng11 = p_pin3zhong3ming2cheng11;

    t.p_pin3zhong3dai4ma32 = p_pin3zhong3dai4ma32;

    t.p_pin3zhong3ming2cheng12 = p_pin3zhong3ming2cheng12;

    t.p_xiang1guan1xi4shu4 = p_xiang1guan1xi4shu4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 品种代码1
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("品种代码1")
    
    
    private String p_pin3zhong3dai4ma31;

    public String getP_pin3zhong3dai4ma31() { return this.p_pin3zhong3dai4ma31;}
    public void setP_pin3zhong3dai4ma31(String v) { this.p_pin3zhong3dai4ma31 = v;}

    /**
    * name: 品种名称1
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("品种名称1")
    
    
    private String p_pin3zhong3ming2cheng11;

    public String getP_pin3zhong3ming2cheng11() { return this.p_pin3zhong3ming2cheng11;}
    public void setP_pin3zhong3ming2cheng11(String v) { this.p_pin3zhong3ming2cheng11 = v;}

    /**
    * name: 品种代码2
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("品种代码2")
    
    
    private String p_pin3zhong3dai4ma32;

    public String getP_pin3zhong3dai4ma32() { return this.p_pin3zhong3dai4ma32;}
    public void setP_pin3zhong3dai4ma32(String v) { this.p_pin3zhong3dai4ma32 = v;}

    /**
    * name: 品种名称2
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("品种名称2")
    
    
    private String p_pin3zhong3ming2cheng12;

    public String getP_pin3zhong3ming2cheng12() { return this.p_pin3zhong3ming2cheng12;}
    public void setP_pin3zhong3ming2cheng12(String v) { this.p_pin3zhong3ming2cheng12 = v;}

    /**
    * name: 相关系数
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("相关系数")
    
    
    private Double p_xiang1guan1xi4shu4;

    public Double getP_xiang1guan1xi4shu4() { return this.p_xiang1guan1xi4shu4;}
    public void setP_xiang1guan1xi4shu4(Double v) { this.p_xiang1guan1xi4shu4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
