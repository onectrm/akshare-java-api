
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
    * 接口: futures_contract_detail
    * 目标地址: https://finance.sina.com.cn/futures/quotes/V2101.shtml
    * 描述: 新浪财经-期货-期货合约详情数据
    * 限量: 单次返回指定 symbol 的合约详情数据
    */
    public class futures_contract_detailResponse extends AkShareRequestAndResponse {
    public futures_contract_detailResponse(){
    setInterfaceName("futures_contract_detail");
    }

    public static futures_contract_detailResponse of(


    String p_item,

    String p_value,


    Map.Entry
    <String
    , String>... others){
    futures_contract_detailResponse t = new futures_contract_detailResponse();


    t.p_item = p_item;

    t.p_value = p_value;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: item
    * type: object
    * desc: 合约具体的项目
    * required: 
    */
    @JsonProperty("item")
    
    
    private String p_item;

    public String getP_item() { return this.p_item;}
    public void setP_item(String v) { this.p_item = v;}

    /**
    * name: value
    * type: object
    * desc: 合约具体的项目值
    * required: 
    */
    @JsonProperty("value")
    
    
    private String p_value;

    public String getP_value() { return this.p_value;}
    public void setP_value(String v) { this.p_value = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
