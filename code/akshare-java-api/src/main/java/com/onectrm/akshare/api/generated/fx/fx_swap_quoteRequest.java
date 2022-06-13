
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.fx;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: fx
    * 接口: fx_swap_quote
    * 目标地址: http://www.chinamoney.com.cn/chinese/mkdatapfx/
    * 描述: 获取人民币外汇远掉报价
    * 限量: 单次返回实时行情数据
    */
    public class fx_swap_quoteRequest extends AkShareRequestAndResponse {
    public fx_swap_quoteRequest(){
    setInterfaceName("fx_swap_quote");
    }

    public static fx_swap_quoteRequest of(


    String p_wu2,


    Map.Entry
    <String
    , String>... others){
    fx_swap_quoteRequest t = new fx_swap_quoteRequest();


    t.p_wu2 = p_wu2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 无
    * type: 无
    * desc: 无
    * required: 无
    */
    @JsonProperty("无")
    
    
    private String p_wu2;

    public String getP_wu2() { return this.p_wu2;}
    public void setP_wu2(String v) { this.p_wu2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
