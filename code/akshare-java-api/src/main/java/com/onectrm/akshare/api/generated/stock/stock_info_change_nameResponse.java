
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:51 CST 2022*/
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: stock
    * 接口: stock_info_change_name
    * 目标地址: http://vip.stock.finance.sina.com.cn/corp/go.php/vCI_CorpInfo/stockid/300378.phtml
    * 描述: 新浪财经-股票曾用名
    * 限量: 单次指定 symbol 的所有历史曾用名称
    */
    public class stock_info_change_nameResponse extends AkShareRequestAndResponse {
    public stock_info_change_nameResponse(){
    setInterfaceName("stock_info_change_name");
    }

    public static stock_info_change_nameResponse of(


    Integer p_index,

    String p_name,


    Map.Entry
    <String
    , String>... others){
    stock_info_change_nameResponse t = new stock_info_change_nameResponse();


    t.p_index = p_index;

    t.p_name = p_name;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: index
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("index")
    
    
    private Integer p_index;

    public Integer getP_index() { return this.p_index;}
    public void setP_index(Integer v) { this.p_index = v;}

    /**
    * name: name
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("name")
    
    
    private String p_name;

    public String getP_name() { return this.p_name;}
    public void setP_name(String v) { this.p_name = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
