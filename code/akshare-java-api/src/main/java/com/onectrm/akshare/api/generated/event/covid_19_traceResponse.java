
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.event;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: event
    * 接口: covid_19_trace
    * 目标地址: https://news.qq.com/hdh5/hebeicomeon.htm#/?ADTAG=yqi
    * 描述: 腾讯新闻-疫情-病患轨迹的数据
    * 限量: 单次返回所有省份的数据
    */
    public class covid_19_traceResponse extends AkShareRequestAndResponse {
    public covid_19_traceResponse(){
    setInterfaceName("covid_19_trace");
    }

    public static covid_19_traceResponse of(


    String p_di4zhi3,

    String p_cheng2shi4,

    String p_qu1,

    String p_sheng3fen4,

    String p_biao1ti2,

    LocalDateTime p_geng4xin1shi2jian1,

    String p_feng1xian3deng3ji2,

    LocalDateTime p_tong3ji4shi2jian1,


    Map.Entry
    <String
    , String>... others){
    covid_19_traceResponse t = new covid_19_traceResponse();


    t.p_di4zhi3 = p_di4zhi3;

    t.p_cheng2shi4 = p_cheng2shi4;

    t.p_qu1 = p_qu1;

    t.p_sheng3fen4 = p_sheng3fen4;

    t.p_biao1ti2 = p_biao1ti2;

    t.p_geng4xin1shi2jian1 = p_geng4xin1shi2jian1;

    t.p_feng1xian3deng3ji2 = p_feng1xian3deng3ji2;

    t.p_tong3ji4shi2jian1 = p_tong3ji4shi2jian1;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 地址
    * type: str
    * desc: 
    * required: 
    */
    @JsonProperty("地址")
    
    
    private String p_di4zhi3;

    public String getP_di4zhi3() { return this.p_di4zhi3;}
    public void setP_di4zhi3(String v) { this.p_di4zhi3 = v;}

    /**
    * name: 城市
    * type: str
    * desc: 
    * required: 
    */
    @JsonProperty("城市")
    
    
    private String p_cheng2shi4;

    public String getP_cheng2shi4() { return this.p_cheng2shi4;}
    public void setP_cheng2shi4(String v) { this.p_cheng2shi4 = v;}

    /**
    * name: 区
    * type: str
    * desc: 
    * required: 
    */
    @JsonProperty("区")
    
    
    private String p_qu1;

    public String getP_qu1() { return this.p_qu1;}
    public void setP_qu1(String v) { this.p_qu1 = v;}

    /**
    * name: 省份
    * type: str
    * desc: 
    * required: 
    */
    @JsonProperty("省份")
    
    
    private String p_sheng3fen4;

    public String getP_sheng3fen4() { return this.p_sheng3fen4;}
    public void setP_sheng3fen4(String v) { this.p_sheng3fen4 = v;}

    /**
    * name: 标题
    * type: str
    * desc: 
    * required: 
    */
    @JsonProperty("标题")
    
    
    private String p_biao1ti2;

    public String getP_biao1ti2() { return this.p_biao1ti2;}
    public void setP_biao1ti2(String v) { this.p_biao1ti2 = v;}

    /**
    * name: 更新时间
    * type: str
    * desc: 
    * required: 
    */
    @JsonProperty("更新时间")
    
    @JsonDeserialize(using =
        JacksonDateTimeDeserializer.class)
    
    private LocalDateTime p_geng4xin1shi2jian1;

    public LocalDateTime getP_geng4xin1shi2jian1() { return this.p_geng4xin1shi2jian1;}
    public void setP_geng4xin1shi2jian1(LocalDateTime v) { this.p_geng4xin1shi2jian1 = v;}

    /**
    * name: 风险等级
    * type: str
    * desc: 
    * required: 
    */
    @JsonProperty("风险等级")
    
    
    private String p_feng1xian3deng3ji2;

    public String getP_feng1xian3deng3ji2() { return this.p_feng1xian3deng3ji2;}
    public void setP_feng1xian3deng3ji2(String v) { this.p_feng1xian3deng3ji2 = v;}

    /**
    * name: 统计时间
    * type: str
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
