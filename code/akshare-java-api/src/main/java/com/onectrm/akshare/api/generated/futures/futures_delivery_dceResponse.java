
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
    * 接口: futures_delivery_dce
    * 目标地址: http://www.dce.com.cn/dalianshangpin/xqsj/tjsj26/jgtj/jgsj/index.html
    * 描述: 提供大连商品交易所-交割统计
    * 限量: 单次返回指定交易月份的交割统计数据
    */
    public class futures_delivery_dceResponse extends AkShareRequestAndResponse {
    public futures_delivery_dceResponse(){
    setInterfaceName("futures_delivery_dce");
    }

    public static futures_delivery_dceResponse of(


    String p_pin3zhong3,

    String p_he2yue1,

    LocalDate p_jiao1ge1ri4qi1,

    String p_jiao1ge1liang4,

    String p_jiao1ge1jin1e2,


    Map.Entry
    <String
    , String>... others){
    futures_delivery_dceResponse t = new futures_delivery_dceResponse();


    t.p_pin3zhong3 = p_pin3zhong3;

    t.p_he2yue1 = p_he2yue1;

    t.p_jiao1ge1ri4qi1 = p_jiao1ge1ri4qi1;

    t.p_jiao1ge1liang4 = p_jiao1ge1liang4;

    t.p_jiao1ge1jin1e2 = p_jiao1ge1jin1e2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 品种
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("品种")
    
    
    private String p_pin3zhong3;

    public String getP_pin3zhong3() { return this.p_pin3zhong3;}
    public void setP_pin3zhong3(String v) { this.p_pin3zhong3 = v;}

    /**
    * name: 合约
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("合约")
    
    
    private String p_he2yue1;

    public String getP_he2yue1() { return this.p_he2yue1;}
    public void setP_he2yue1(String v) { this.p_he2yue1 = v;}

    /**
    * name: 交割日期
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("交割日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_jiao1ge1ri4qi1;

    public LocalDate getP_jiao1ge1ri4qi1() { return this.p_jiao1ge1ri4qi1;}
    public void setP_jiao1ge1ri4qi1(LocalDate v) { this.p_jiao1ge1ri4qi1 = v;}

    /**
    * name: 交割量
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("交割量")
    
    
    private String p_jiao1ge1liang4;

    public String getP_jiao1ge1liang4() { return this.p_jiao1ge1liang4;}
    public void setP_jiao1ge1liang4(String v) { this.p_jiao1ge1liang4 = v;}

    /**
    * name: 交割金额
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("交割金额")
    
    
    private String p_jiao1ge1jin1e2;

    public String getP_jiao1ge1jin1e2() { return this.p_jiao1ge1jin1e2;}
    public void setP_jiao1ge1jin1e2(String v) { this.p_jiao1ge1jin1e2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
