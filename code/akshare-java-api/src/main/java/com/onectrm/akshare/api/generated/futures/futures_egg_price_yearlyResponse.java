
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
    * 接口: futures_egg_price_yearly
    * 目标地址: https://www.jidan7.com/trend/
    * 描述: 鸡蛋信息网-各年度产区鸡蛋价格走势
    * 限量: 全部历史数据
    */
    public class futures_egg_price_yearlyResponse extends AkShareRequestAndResponse {
    public futures_egg_price_yearlyResponse(){
    setInterfaceName("futures_egg_price_yearly");
    }

    public static futures_egg_price_yearlyResponse of(


    LocalDate p_ri4qi1,

    Double p_2015nian2,

    Double p_2016nian2,

    Double p_2017nian2,

    Double p_2018nian2,

    Double p_2019nian2,

    Double p_2020nian2,

    Double p_2021nian2,


    Map.Entry
    <String
    , String>... others){
    futures_egg_price_yearlyResponse t = new futures_egg_price_yearlyResponse();


    t.p_ri4qi1 = p_ri4qi1;

    t.p_2015nian2 = p_2015nian2;

    t.p_2016nian2 = p_2016nian2;

    t.p_2017nian2 = p_2017nian2;

    t.p_2018nian2 = p_2018nian2;

    t.p_2019nian2 = p_2019nian2;

    t.p_2020nian2 = p_2020nian2;

    t.p_2021nian2 = p_2021nian2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_ri4qi1;

    public LocalDate getP_ri4qi1() { return this.p_ri4qi1;}
    public void setP_ri4qi1(LocalDate v) { this.p_ri4qi1 = v;}

    /**
    * name: 2015年
    * type: float64
    * desc: 
    * required: 注意单位: 元/斤
    */
    @JsonProperty("2015年")
    
    
    private Double p_2015nian2;

    public Double getP_2015nian2() { return this.p_2015nian2;}
    public void setP_2015nian2(Double v) { this.p_2015nian2 = v;}

    /**
    * name: 2016年
    * type: float64
    * desc: 
    * required: 注意单位: 元/斤
    */
    @JsonProperty("2016年")
    
    
    private Double p_2016nian2;

    public Double getP_2016nian2() { return this.p_2016nian2;}
    public void setP_2016nian2(Double v) { this.p_2016nian2 = v;}

    /**
    * name: 2017年
    * type: float64
    * desc: 
    * required: 注意单位: 元/斤
    */
    @JsonProperty("2017年")
    
    
    private Double p_2017nian2;

    public Double getP_2017nian2() { return this.p_2017nian2;}
    public void setP_2017nian2(Double v) { this.p_2017nian2 = v;}

    /**
    * name: 2018年
    * type: float64
    * desc: 
    * required: 注意单位: 元/斤
    */
    @JsonProperty("2018年")
    
    
    private Double p_2018nian2;

    public Double getP_2018nian2() { return this.p_2018nian2;}
    public void setP_2018nian2(Double v) { this.p_2018nian2 = v;}

    /**
    * name: 2019年
    * type: float64
    * desc: 
    * required: 注意单位: 元/斤
    */
    @JsonProperty("2019年")
    
    
    private Double p_2019nian2;

    public Double getP_2019nian2() { return this.p_2019nian2;}
    public void setP_2019nian2(Double v) { this.p_2019nian2 = v;}

    /**
    * name: 2020年
    * type: float64
    * desc: 
    * required: 注意单位: 元/斤
    */
    @JsonProperty("2020年")
    
    
    private Double p_2020nian2;

    public Double getP_2020nian2() { return this.p_2020nian2;}
    public void setP_2020nian2(Double v) { this.p_2020nian2 = v;}

    /**
    * name: 2021年
    * type: float64
    * desc: 
    * required: 注意单位: 元/斤
    */
    @JsonProperty("2021年")
    
    
    private Double p_2021nian2;

    public Double getP_2021nian2() { return this.p_2021nian2;}
    public void setP_2021nian2(Double v) { this.p_2021nian2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
