
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
    * 接口: futures_board_index_nh
    * 目标地址: http://www.nanhua.net/nhzc/platechange.html
    * 描述: 南华期货-市场涨跌-板块指数涨跌
    * 限量: 单次返回指定 start_date 和 end_date 的所有历史数据
    */
    public class futures_board_index_nhRequest extends AkShareRequestAndResponse {
    public futures_board_index_nhRequest(){
    setInterfaceName("futures_board_index_nh");
    }

    public static futures_board_index_nhRequest of(


    LocalDate p_startdate,

    LocalDate p_enddate,


    Map.Entry
    <String
    , String>... others){
    futures_board_index_nhRequest t = new futures_board_index_nhRequest();


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
    * desc: start_date=&quot;20220104&quot;;
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
    * desc: end_date=&quot;20220413&quot;;
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
