
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:48 CST 2022*/
    package com.onectrm.akshare.api.generated.article;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: article
    * 接口: article_oman_rv
    * 目标地址: https://realized.oxford-man.ox.ac.uk/data/visualization
    * 描述: 获取 Oxford-Man 已实现波动率数据
    * 限量: 单次返回某个指数具体指标的所有历史数据
    */
    public class article_oman_rvResponse extends AkShareRequestAndResponse {
    public article_oman_rvResponse(){
    setInterfaceName("article_oman_rv");
    }

    public static article_oman_rvResponse of(


    LocalDate p_index,

    Double p_data,


    Map.Entry
    <String
    , String>... others){
    article_oman_rvResponse t = new article_oman_rvResponse();


    t.p_index = p_index;

    t.p_data = p_data;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: index
    * type: datetime.datetime
    * desc: 日期
    * required: Y
    */
    @JsonProperty("index")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_index;

    public LocalDate getP_index() { return this.p_index;}
    public void setP_index(LocalDate v) { this.p_index = v;}

    /**
    * name: data
    * type: float
    * desc: 数据
    * required: Y
    */
    @JsonProperty("data")
    
    
    private Double p_data;

    public Double getP_data() { return this.p_data;}
    public void setP_data(Double v) { this.p_data = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
