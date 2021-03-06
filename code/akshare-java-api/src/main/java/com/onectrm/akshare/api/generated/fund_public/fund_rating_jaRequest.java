
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: fund_public
    * 接口: fund_rating_ja
    * 目标地址: http://fund.eastmoney.com/data/fundrating_4.html
    * 描述: 获取天天基金网-基金评级-济安金信评级
    * 限量: 单次返回指定交易日的所有基金评级数据
    */
    public class fund_rating_jaRequest extends AkShareRequestAndResponse {
    public fund_rating_jaRequest(){
    setInterfaceName("fund_rating_ja");
    }

    public static fund_rating_jaRequest of(


    LocalDate p_date,


    Map.Entry
    <String
    , String>... others){
    fund_rating_jaRequest t = new fund_rating_jaRequest();


    t.p_date = p_date;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: date
    * type: str
    * desc: date=&#39;20200930&#39;
    * required: Y
    */
    @JsonProperty("date")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
