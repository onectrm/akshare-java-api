
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
    * 接口: futures_egg_price_area
    * 目标地址: https://www.jidan7.com/trend/
    * 描述: 鸡蛋信息网-各主产区鸡蛋均价
    * 限量: 全部历史数据
    */
    public class futures_egg_price_areaResponse extends AkShareRequestAndResponse {
    public futures_egg_price_areaResponse(){
    setInterfaceName("futures_egg_price_area");
    }

    public static futures_egg_price_areaResponse of(


    LocalDate p_date,

    Double p_shan1dong1jun1jia4,

    Double p_he2nan2jun1jia4,

    Double p_he2bei3jun1jia4,

    Double p_liao2ning2jun1jia4,

    Double p_jiang1su1jun1jia4,

    Double p_hu2bei3jun1jia4,


    Map.Entry
    <String
    , String>... others){
    futures_egg_price_areaResponse t = new futures_egg_price_areaResponse();


    t.p_date = p_date;

    t.p_shan1dong1jun1jia4 = p_shan1dong1jun1jia4;

    t.p_he2nan2jun1jia4 = p_he2nan2jun1jia4;

    t.p_he2bei3jun1jia4 = p_he2bei3jun1jia4;

    t.p_liao2ning2jun1jia4 = p_liao2ning2jun1jia4;

    t.p_jiang1su1jun1jia4 = p_jiang1su1jun1jia4;

    t.p_hu2bei3jun1jia4 = p_hu2bei3jun1jia4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: date
    * type: object
    * desc: 
    * required: 注意其中的日期并非严格对齐
    */
    @JsonProperty("date")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}

    /**
    * name: 山东均价
    * type: float64
    * desc: 
    * required: 注意单位: 元/斤
    */
    @JsonProperty("山东均价")
    
    
    private Double p_shan1dong1jun1jia4;

    public Double getP_shan1dong1jun1jia4() { return this.p_shan1dong1jun1jia4;}
    public void setP_shan1dong1jun1jia4(Double v) { this.p_shan1dong1jun1jia4 = v;}

    /**
    * name: 河南均价
    * type: float64
    * desc: 
    * required: 注意单位: 元/斤
    */
    @JsonProperty("河南均价")
    
    
    private Double p_he2nan2jun1jia4;

    public Double getP_he2nan2jun1jia4() { return this.p_he2nan2jun1jia4;}
    public void setP_he2nan2jun1jia4(Double v) { this.p_he2nan2jun1jia4 = v;}

    /**
    * name: 河北均价
    * type: float64
    * desc: 
    * required: 注意单位: 元/斤
    */
    @JsonProperty("河北均价")
    
    
    private Double p_he2bei3jun1jia4;

    public Double getP_he2bei3jun1jia4() { return this.p_he2bei3jun1jia4;}
    public void setP_he2bei3jun1jia4(Double v) { this.p_he2bei3jun1jia4 = v;}

    /**
    * name: 辽宁均价
    * type: float64
    * desc: 
    * required: 注意单位: 元/斤
    */
    @JsonProperty("辽宁均价")
    
    
    private Double p_liao2ning2jun1jia4;

    public Double getP_liao2ning2jun1jia4() { return this.p_liao2ning2jun1jia4;}
    public void setP_liao2ning2jun1jia4(Double v) { this.p_liao2ning2jun1jia4 = v;}

    /**
    * name: 江苏均价
    * type: float64
    * desc: 
    * required: 注意单位: 元/斤
    */
    @JsonProperty("江苏均价")
    
    
    private Double p_jiang1su1jun1jia4;

    public Double getP_jiang1su1jun1jia4() { return this.p_jiang1su1jun1jia4;}
    public void setP_jiang1su1jun1jia4(Double v) { this.p_jiang1su1jun1jia4 = v;}

    /**
    * name: 湖北均价
    * type: float64
    * desc: 
    * required: 注意单位: 元/斤
    */
    @JsonProperty("湖北均价")
    
    
    private Double p_hu2bei3jun1jia4;

    public Double getP_hu2bei3jun1jia4() { return this.p_hu2bei3jun1jia4;}
    public void setP_hu2bei3jun1jia4(Double v) { this.p_hu2bei3jun1jia4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
