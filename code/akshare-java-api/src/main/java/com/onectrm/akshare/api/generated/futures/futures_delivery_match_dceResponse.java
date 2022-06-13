
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
    * 接口: futures_delivery_match_dce
    * 目标地址: http://www.dce.com.cn/dalianshangpin/xqsj/tjsj26/jgtj/jgsj/index.html
    * 描述: 提供大连商品交易所-交割配对
    * 限量: 单次返回指定品种的的交割配对数据
    */
    public class futures_delivery_match_dceResponse extends AkShareRequestAndResponse {
    public futures_delivery_match_dceResponse(){
    setInterfaceName("futures_delivery_match_dce");
    }

    public static futures_delivery_match_dceResponse of(


    String p_he2yue1hao4,

    LocalDate p_pei4dui4ri4qi1,

    String p_mai3hui4yuan2hao4,

    String p_pei4dui4shou3shu4,

    String p_mai4hui4yuan2hao4,

    String p_jiao1ge1jie2suan4jia4,


    Map.Entry
    <String
    , String>... others){
    futures_delivery_match_dceResponse t = new futures_delivery_match_dceResponse();


    t.p_he2yue1hao4 = p_he2yue1hao4;

    t.p_pei4dui4ri4qi1 = p_pei4dui4ri4qi1;

    t.p_mai3hui4yuan2hao4 = p_mai3hui4yuan2hao4;

    t.p_pei4dui4shou3shu4 = p_pei4dui4shou3shu4;

    t.p_mai4hui4yuan2hao4 = p_mai4hui4yuan2hao4;

    t.p_jiao1ge1jie2suan4jia4 = p_jiao1ge1jie2suan4jia4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 合约号
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("合约号")
    
    
    private String p_he2yue1hao4;

    public String getP_he2yue1hao4() { return this.p_he2yue1hao4;}
    public void setP_he2yue1hao4(String v) { this.p_he2yue1hao4 = v;}

    /**
    * name: 配对日期
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("配对日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_pei4dui4ri4qi1;

    public LocalDate getP_pei4dui4ri4qi1() { return this.p_pei4dui4ri4qi1;}
    public void setP_pei4dui4ri4qi1(LocalDate v) { this.p_pei4dui4ri4qi1 = v;}

    /**
    * name: 买会员号
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("买会员号")
    
    
    private String p_mai3hui4yuan2hao4;

    public String getP_mai3hui4yuan2hao4() { return this.p_mai3hui4yuan2hao4;}
    public void setP_mai3hui4yuan2hao4(String v) { this.p_mai3hui4yuan2hao4 = v;}

    /**
    * name: 配对手数
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("配对手数")
    
    
    private String p_pei4dui4shou3shu4;

    public String getP_pei4dui4shou3shu4() { return this.p_pei4dui4shou3shu4;}
    public void setP_pei4dui4shou3shu4(String v) { this.p_pei4dui4shou3shu4 = v;}

    /**
    * name: 卖会员号
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("卖会员号")
    
    
    private String p_mai4hui4yuan2hao4;

    public String getP_mai4hui4yuan2hao4() { return this.p_mai4hui4yuan2hao4;}
    public void setP_mai4hui4yuan2hao4(String v) { this.p_mai4hui4yuan2hao4 = v;}

    /**
    * name: 交割结算价
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("交割结算价")
    
    
    private String p_jiao1ge1jie2suan4jia4;

    public String getP_jiao1ge1jie2suan4jia4() { return this.p_jiao1ge1jie2suan4jia4;}
    public void setP_jiao1ge1jie2suan4jia4(String v) { this.p_jiao1ge1jie2suan4jia4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
