
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
    * 接口: stock_zt_pool_em
    * 目标地址: http://quote.eastmoney.com/ztb/detail#type=ztgc
    * 描述: 东方财富网-行情中心-涨停板行情-涨停股池
    * 限量: 单次返回所有涨停股池数据
    */
    public class stock_zt_pool_emRequest extends AkShareRequestAndResponse {
    public stock_zt_pool_emRequest(){
    setInterfaceName("stock_zt_pool_em");
    }

    public static stock_zt_pool_emRequest of(


    LocalDate p_date,


    Map.Entry
    <String
    , String>... others){
    stock_zt_pool_emRequest t = new stock_zt_pool_emRequest();


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
    * desc: date=&#39;20210525&#39;
    * required: 
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
