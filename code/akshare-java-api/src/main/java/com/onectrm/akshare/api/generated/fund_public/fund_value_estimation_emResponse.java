
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: fund_public
    * 接口: fund_value_estimation_em
    * 目标地址: http://fund.eastmoney.com/fundguzhi.html
    * 描述: 东方财富网-数据中心-净值估算
    * 限量: 单次返回当前交易日指定 symbol 的所有数据
    */
    public class fund_value_estimation_emResponse extends AkShareRequestAndResponse {
    public fund_value_estimation_emResponse(){
    setInterfaceName("fund_value_estimation_em");
    }

    public static fund_value_estimation_emResponse of(


    String p_xu4hao4,

    String p_ji1jin1dai4ma3,

    String p_ji1jin1ming2cheng1,

    Double p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zhi2,

    String p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zeng1zhang3lu4,

    Double p_jiao1yi4ri4gong1bu4shu4ju4dan1wei4jing4zhi2,

    String p_jiao1yi4ri4gong1bu4shu4ju4ri4zeng1zhang3lu4,

    String p_gu1suan4pian1cha1,

    String p_jiao1yi4ri4dan1wei4jing4zhi2,


    Map.Entry
    <String
    , String>... others){
    fund_value_estimation_emResponse t = new fund_value_estimation_emResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_ji1jin1dai4ma3 = p_ji1jin1dai4ma3;

    t.p_ji1jin1ming2cheng1 = p_ji1jin1ming2cheng1;

    t.p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zhi2 = p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zhi2;

    t.p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zeng1zhang3lu4 = p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zeng1zhang3lu4;

    t.p_jiao1yi4ri4gong1bu4shu4ju4dan1wei4jing4zhi2 = p_jiao1yi4ri4gong1bu4shu4ju4dan1wei4jing4zhi2;

    t.p_jiao1yi4ri4gong1bu4shu4ju4ri4zeng1zhang3lu4 = p_jiao1yi4ri4gong1bu4shu4ju4ri4zeng1zhang3lu4;

    t.p_gu1suan4pian1cha1 = p_gu1suan4pian1cha1;

    t.p_jiao1yi4ri4dan1wei4jing4zhi2 = p_jiao1yi4ri4dan1wei4jing4zhi2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 序号
    * type: str
    * desc: 
    * required: 
    */
    @JsonProperty("序号")
    
    
    private String p_xu4hao4;

    public String getP_xu4hao4() { return this.p_xu4hao4;}
    public void setP_xu4hao4(String v) { this.p_xu4hao4 = v;}

    /**
    * name: 基金代码
    * type: str
    * desc: 
    * required: 
    */
    @JsonProperty("基金代码")
    
    
    private String p_ji1jin1dai4ma3;

    public String getP_ji1jin1dai4ma3() { return this.p_ji1jin1dai4ma3;}
    public void setP_ji1jin1dai4ma3(String v) { this.p_ji1jin1dai4ma3 = v;}

    /**
    * name: 基金名称
    * type: str
    * desc: 
    * required: 
    */
    @JsonProperty("基金名称")
    
    
    private String p_ji1jin1ming2cheng1;

    public String getP_ji1jin1ming2cheng1() { return this.p_ji1jin1ming2cheng1;}
    public void setP_ji1jin1ming2cheng1(String v) { this.p_ji1jin1ming2cheng1 = v;}

    /**
    * name: 交易日-估算数据-估算值
    * type: float
    * desc: 
    * required: 
    */
    @JsonProperty("交易日-估算数据-估算值")
    
    
    private Double p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zhi2;

    public Double getP_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zhi2() { return this.p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zhi2;}
    public void setP_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zhi2(Double v) { this.p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zhi2 = v;}

    /**
    * name: 交易日-估算数据-估算增长率
    * type: str
    * desc: 
    * required: 
    */
    @JsonProperty("交易日-估算数据-估算增长率")
    
    
    private String p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zeng1zhang3lu4;

    public String getP_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zeng1zhang3lu4() { return this.p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zeng1zhang3lu4;}
    public void setP_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zeng1zhang3lu4(String v) { this.p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zeng1zhang3lu4 = v;}

    /**
    * name: 交易日-公布数据-单位净值
    * type: float
    * desc: 
    * required: 
    */
    @JsonProperty("交易日-公布数据-单位净值")
    
    
    private Double p_jiao1yi4ri4gong1bu4shu4ju4dan1wei4jing4zhi2;

    public Double getP_jiao1yi4ri4gong1bu4shu4ju4dan1wei4jing4zhi2() { return this.p_jiao1yi4ri4gong1bu4shu4ju4dan1wei4jing4zhi2;}
    public void setP_jiao1yi4ri4gong1bu4shu4ju4dan1wei4jing4zhi2(Double v) { this.p_jiao1yi4ri4gong1bu4shu4ju4dan1wei4jing4zhi2 = v;}

    /**
    * name: 交易日-公布数据-日增长率
    * type: str
    * desc: 
    * required: 
    */
    @JsonProperty("交易日-公布数据-日增长率")
    
    
    private String p_jiao1yi4ri4gong1bu4shu4ju4ri4zeng1zhang3lu4;

    public String getP_jiao1yi4ri4gong1bu4shu4ju4ri4zeng1zhang3lu4() { return this.p_jiao1yi4ri4gong1bu4shu4ju4ri4zeng1zhang3lu4;}
    public void setP_jiao1yi4ri4gong1bu4shu4ju4ri4zeng1zhang3lu4(String v) { this.p_jiao1yi4ri4gong1bu4shu4ju4ri4zeng1zhang3lu4 = v;}

    /**
    * name: 估算偏差
    * type: str
    * desc: 
    * required: 
    */
    @JsonProperty("估算偏差")
    
    
    private String p_gu1suan4pian1cha1;

    public String getP_gu1suan4pian1cha1() { return this.p_gu1suan4pian1cha1;}
    public void setP_gu1suan4pian1cha1(String v) { this.p_gu1suan4pian1cha1 = v;}

    /**
    * name: 交易日-单位净值
    * type: str
    * desc: 
    * required: 
    */
    @JsonProperty("交易日-单位净值")
    
    
    private String p_jiao1yi4ri4dan1wei4jing4zhi2;

    public String getP_jiao1yi4ri4dan1wei4jing4zhi2() { return this.p_jiao1yi4ri4dan1wei4jing4zhi2;}
    public void setP_jiao1yi4ri4dan1wei4jing4zhi2(String v) { this.p_jiao1yi4ri4dan1wei4jing4zhi2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
