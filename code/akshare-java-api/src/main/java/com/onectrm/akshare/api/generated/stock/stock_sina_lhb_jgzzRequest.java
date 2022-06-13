
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
    * 接口: stock_sina_lhb_jgzz
    * 目标地址: http://vip.stock.finance.sina.com.cn/q/go.php/vLHBData/kind/jgzz/index.phtml
    * 描述: 获取新浪财经-龙虎榜-机构席位追踪
    * 限量: 单次返回指定 recent_day 的所有历史数据
    */
    public class stock_sina_lhb_jgzzRequest extends AkShareRequestAndResponse {
    public stock_sina_lhb_jgzzRequest(){
    setInterfaceName("stock_sina_lhb_jgzz");
    }

    public static stock_sina_lhb_jgzzRequest of(


    String p_recentday,


    Map.Entry
    <String
    , String>... others){
    stock_sina_lhb_jgzzRequest t = new stock_sina_lhb_jgzzRequest();


    t.p_recentday = p_recentday;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: recent_day
    * type: str
    * desc: recent_day=&quot;5&quot;; choice of {&quot;5&quot;: 最近 5 天; &quot;10&quot;: 最近 10 天; &quot;30&quot;: 最近 30 天; &quot;60&quot;: 最近 60 天;}
    * required: Y
    */
    @JsonProperty("recent_day")
    
    
    private String p_recentday;

    public String getP_recentday() { return this.p_recentday;}
    public void setP_recentday(String v) { this.p_recentday = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
