
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
    * 接口: futures_to_spot_czce
    * 目标地址: http://www.czce.com.cn/cn/jysj/qzxtj/H770311index_1.htm
    * 描述: 郑州商品交易所-期转现统计数据
    * 限量: 单次返回指定交易日的期转现统计数据
    */
    public class futures_to_spot_czceResponse extends AkShareRequestAndResponse {
    public futures_to_spot_czceResponse(){
    setInterfaceName("futures_to_spot_czce");
    }

    public static futures_to_spot_czceResponse of(


    String p_he2yue1dai4ma3,

    Integer p_he2yue1shu4liang4,


    Map.Entry
    <String
    , String>... others){
    futures_to_spot_czceResponse t = new futures_to_spot_czceResponse();


    t.p_he2yue1dai4ma3 = p_he2yue1dai4ma3;

    t.p_he2yue1shu4liang4 = p_he2yue1shu4liang4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



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

    /**
    * name: 合约数量
    * type: int64
    * desc: 注意: 单边计算
    * required: 
    */
    @JsonProperty("合约数量")
    
    
    private Integer p_he2yue1shu4liang4;

    public Integer getP_he2yue1shu4liang4() { return this.p_he2yue1shu4liang4;}
    public void setP_he2yue1shu4liang4(Integer v) { this.p_he2yue1shu4liang4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
