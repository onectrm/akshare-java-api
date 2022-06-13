
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
    * 接口: cost_living
    * 目标地址: https://expatistan.com/cost-of-living/index
    * 描述: 世界各大城市生活成本数据
    * 限量: 返回当前时点所有数据
    */
    public class cost_livingResponse extends AkShareRequestAndResponse {
    public cost_livingResponse(){
    setInterfaceName("cost_living");
    }

    public static cost_livingResponse of(


    String p_rank,

    String p_city,

    String p_index,


    Map.Entry
    <String
    , String>... others){
    cost_livingResponse t = new cost_livingResponse();


    t.p_rank = p_rank;

    t.p_city = p_city;

    t.p_index = p_index;


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
    * desc: 排名
    * required: 
    */
    @JsonProperty("rank")
    
    
    private String p_rank;

    public String getP_rank() { return this.p_rank;}
    public void setP_rank(String v) { this.p_rank = v;}

    /**
    * name: city
    * type: str
    * desc: 城市名称
    * required: 
    */
    @JsonProperty("city")
    
    
    private String p_city;

    public String getP_city() { return this.p_city;}
    public void setP_city(String v) { this.p_city = v;}

    /**
    * name: index
    * type: str
    * desc: 价格指数
    * required: 
    */
    @JsonProperty("index")
    
    
    private String p_index;

    public String getP_index() { return this.p_index;}
    public void setP_index(String v) { this.p_index = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
