
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:50 CST 2022*/
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: others
    * 接口: index_bloomberg_billionaires_hist
    * 目标地址: https://stats.areppim.com/stats/links_billionairexlists.htm
    * 描述: 按照年份查询彭博亿万富豪指数; 该接口需要使用代理访问
    * 限量: 单次返回当年所有数据彭博亿万富豪排名数据
    */
    public class index_bloomberg_billionaires_histResponse extends AkShareRequestAndResponse {
    public index_bloomberg_billionaires_histResponse(){
    setInterfaceName("index_bloomberg_billionaires_hist");
    }

    public static index_bloomberg_billionaires_histResponse of(


    String p_rank,

    String p_name,

    String p_totalnetworth,

    String p_lastchange,

    String p_YTDchange,

    String p_country,

    String p_industry,

    String p_age,


    Map.Entry
    <String
    , String>... others){
    index_bloomberg_billionaires_histResponse t = new index_bloomberg_billionaires_histResponse();


    t.p_rank = p_rank;

    t.p_name = p_name;

    t.p_totalnetworth = p_totalnetworth;

    t.p_lastchange = p_lastchange;

    t.p_YTDchange = p_YTDchange;

    t.p_country = p_country;

    t.p_industry = p_industry;

    t.p_age = p_age;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: rank
    * type: str
    * desc: Rank
    * required: 
    */
    @JsonProperty("rank")
    
    
    private String p_rank;

    public String getP_rank() { return this.p_rank;}
    public void setP_rank(String v) { this.p_rank = v;}

    /**
    * name: name
    * type: str
    * desc: Name
    * required: 
    */
    @JsonProperty("name")
    
    
    private String p_name;

    public String getP_name() { return this.p_name;}
    public void setP_name(String v) { this.p_name = v;}

    /**
    * name: total_net_worth
    * type: str
    * desc: Total net worth
    * required: 
    */
    @JsonProperty("total_net_worth")
    
    
    private String p_totalnetworth;

    public String getP_totalnetworth() { return this.p_totalnetworth;}
    public void setP_totalnetworth(String v) { this.p_totalnetworth = v;}

    /**
    * name: last_change
    * type: str
    * desc: $ Last change
    * required: 
    */
    @JsonProperty("last_change")
    
    
    private String p_lastchange;

    public String getP_lastchange() { return this.p_lastchange;}
    public void setP_lastchange(String v) { this.p_lastchange = v;}

    /**
    * name: YTD_change
    * type: str
    * desc: $ YTD change
    * required: 
    */
    @JsonProperty("YTD_change")
    
    
    private String p_YTDchange;

    public String getP_YTDchange() { return this.p_YTDchange;}
    public void setP_YTDchange(String v) { this.p_YTDchange = v;}

    /**
    * name: country
    * type: str
    * desc: Country
    * required: 
    */
    @JsonProperty("country")
    
    
    private String p_country;

    public String getP_country() { return this.p_country;}
    public void setP_country(String v) { this.p_country = v;}

    /**
    * name: industry
    * type: str
    * desc: Industry
    * required: 
    */
    @JsonProperty("industry")
    
    
    private String p_industry;

    public String getP_industry() { return this.p_industry;}
    public void setP_industry(String v) { this.p_industry = v;}

    /**
    * name: age
    * type: str
    * desc: Age
    * required: 
    */
    @JsonProperty("age")
    
    
    private String p_age;

    public String getP_age() { return this.p_age;}
    public void setP_age(String v) { this.p_age = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
