
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
    * 接口: stock_lhb_hyyyb_em
    * 目标地址: https://data.eastmoney.com/stock/jgmmtj.html
    * 描述: 东方财富网-数据中心-龙虎榜单-每日活跃营业部
    * 限量: 单次返回所有历史数据
    */
    public class stock_lhb_hyyyb_emRequest extends AkShareRequestAndResponse {
    public stock_lhb_hyyyb_emRequest(){
    setInterfaceName("stock_lhb_hyyyb_em");
    }

    public static stock_lhb_hyyyb_emRequest of(


    LocalDate p_startdate,

    LocalDate p_enddate,


    Map.Entry
    <String
    , String>... others){
    stock_lhb_hyyyb_emRequest t = new stock_lhb_hyyyb_emRequest();


    t.p_startdate = p_startdate;

    t.p_enddate = p_enddate;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;20220311&quot;
    * required: 
    */
    @JsonProperty("start_date")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_startdate;

    public LocalDate getP_startdate() { return this.p_startdate;}
    public void setP_startdate(LocalDate v) { this.p_startdate = v;}

    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20220315&quot;
    * required: 
    */
    @JsonProperty("end_date")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_enddate;

    public LocalDate getP_enddate() { return this.p_enddate;}
    public void setP_enddate(LocalDate v) { this.p_enddate = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
