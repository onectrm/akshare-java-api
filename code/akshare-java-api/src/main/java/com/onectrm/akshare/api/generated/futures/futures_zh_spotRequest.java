
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
    * 接口: futures_zh_spot
    * 目标地址: https://finance.sina.com.cn/futuremarket/
    * 描述: 新浪财经-期货页面的实时行情数据
    * 限量: 单次返回当日可以订阅的所有期货品种数据
    */
    public class futures_zh_spotRequest extends AkShareRequestAndResponse {
    public futures_zh_spotRequest(){
    setInterfaceName("futures_zh_spot");
    }

    public static futures_zh_spotRequest of(


    String p_subscribelist,

    String p_market,

    String p_adjust,


    Map.Entry
    <String
    , String>... others){
    futures_zh_spotRequest t = new futures_zh_spotRequest();


    t.p_subscribelist = p_subscribelist;

    t.p_market = p_market;

    t.p_adjust = p_adjust;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: subscribe_list
    * type: str
    * desc: 需要订阅的合约代码; e.g., 按照示例获取
    * required: 
    */
    @JsonProperty("subscribe_list")
    
    
    private String p_subscribelist;

    public String getP_subscribelist() { return this.p_subscribelist;}
    public void setP_subscribelist(String v) { this.p_subscribelist = v;}

    /**
    * name: market
    * type: str
    * desc: market=&quot;CF&quot;; market=&quot;CF&quot;: 商品期货, market=&quot;FF&quot;: 金融期货
    * required: 
    */
    @JsonProperty("market")
    
    
    private String p_market;

    public String getP_market() { return this.p_market;}
    public void setP_market(String v) { this.p_market = v;}

    /**
    * name: adjust
    * type: str
    * desc: adjust=&#39;0&#39;; adjust=&#39;1&#39;: 返回合约、交易所和最小变动单位的实时数据, 返回数据会变慢
    * required: 
    */
    @JsonProperty("adjust")
    
    
    private String p_adjust;

    public String getP_adjust() { return this.p_adjust;}
    public void setP_adjust(String v) { this.p_adjust = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
