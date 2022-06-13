
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
    * 接口: futures_delivery_match_czce
    * 目标地址: http://www.czce.com.cn/cn/jysj/jgpd/H770308index_1.htm
    * 描述: 郑州商品交易所-交割配对
    * 限量: 单次返回指定品种的的交割配对数据
    */
    public class futures_delivery_match_czceResponse extends AkShareRequestAndResponse {
    public futures_delivery_match_czceResponse(){
    setInterfaceName("futures_delivery_match_czce");
    }

    public static futures_delivery_match_czceResponse of(


    String p_mai4fang1hui4yuan2,

    String p_mai4fang1hui4yuan2hui4yuan2jian3cheng1,

    String p_mai3fang1hui4yuan2,

    String p_mai3fang1hui4yuan2hui4yuan2jian3cheng1,

    Double p_jiao1ge1liang4,

    LocalDate p_pei4dui4ri4qi1,

    String p_he2yue1dai4ma3,


    Map.Entry
    <String
    , String>... others){
    futures_delivery_match_czceResponse t = new futures_delivery_match_czceResponse();


    t.p_mai4fang1hui4yuan2 = p_mai4fang1hui4yuan2;

    t.p_mai4fang1hui4yuan2hui4yuan2jian3cheng1 = p_mai4fang1hui4yuan2hui4yuan2jian3cheng1;

    t.p_mai3fang1hui4yuan2 = p_mai3fang1hui4yuan2;

    t.p_mai3fang1hui4yuan2hui4yuan2jian3cheng1 = p_mai3fang1hui4yuan2hui4yuan2jian3cheng1;

    t.p_jiao1ge1liang4 = p_jiao1ge1liang4;

    t.p_pei4dui4ri4qi1 = p_pei4dui4ri4qi1;

    t.p_he2yue1dai4ma3 = p_he2yue1dai4ma3;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 卖方会员
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("卖方会员")
    
    
    private String p_mai4fang1hui4yuan2;

    public String getP_mai4fang1hui4yuan2() { return this.p_mai4fang1hui4yuan2;}
    public void setP_mai4fang1hui4yuan2(String v) { this.p_mai4fang1hui4yuan2 = v;}

    /**
    * name: 卖方会员-会员简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("卖方会员-会员简称")
    
    
    private String p_mai4fang1hui4yuan2hui4yuan2jian3cheng1;

    public String getP_mai4fang1hui4yuan2hui4yuan2jian3cheng1() { return this.p_mai4fang1hui4yuan2hui4yuan2jian3cheng1;}
    public void setP_mai4fang1hui4yuan2hui4yuan2jian3cheng1(String v) { this.p_mai4fang1hui4yuan2hui4yuan2jian3cheng1 = v;}

    /**
    * name: 买方会员
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("买方会员")
    
    
    private String p_mai3fang1hui4yuan2;

    public String getP_mai3fang1hui4yuan2() { return this.p_mai3fang1hui4yuan2;}
    public void setP_mai3fang1hui4yuan2(String v) { this.p_mai3fang1hui4yuan2 = v;}

    /**
    * name: 买方会员-会员简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("买方会员-会员简称")
    
    
    private String p_mai3fang1hui4yuan2hui4yuan2jian3cheng1;

    public String getP_mai3fang1hui4yuan2hui4yuan2jian3cheng1() { return this.p_mai3fang1hui4yuan2hui4yuan2jian3cheng1;}
    public void setP_mai3fang1hui4yuan2hui4yuan2jian3cheng1(String v) { this.p_mai3fang1hui4yuan2hui4yuan2jian3cheng1 = v;}

    /**
    * name: 交割量
    * type: float64
    * desc: 注意单位: 手(单边计算)
    * required: 
    */
    @JsonProperty("交割量")
    
    
    private Double p_jiao1ge1liang4;

    public Double getP_jiao1ge1liang4() { return this.p_jiao1ge1liang4;}
    public void setP_jiao1ge1liang4(Double v) { this.p_jiao1ge1liang4 = v;}

    /**
    * name: 配对日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("配对日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_pei4dui4ri4qi1;

    public LocalDate getP_pei4dui4ri4qi1() { return this.p_pei4dui4ri4qi1;}
    public void setP_pei4dui4ri4qi1(LocalDate v) { this.p_pei4dui4ri4qi1 = v;}

    /**
    * name: 合约代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("合约代码")
    
    
    private String p_he2yue1dai4ma3;

    public String getP_he2yue1dai4ma3() { return this.p_he2yue1dai4ma3;}
    public void setP_he2yue1dai4ma3(String v) { this.p_he2yue1dai4ma3 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
