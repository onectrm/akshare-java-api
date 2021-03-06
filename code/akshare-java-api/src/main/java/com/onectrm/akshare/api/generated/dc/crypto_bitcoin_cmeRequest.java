
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.dc;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: dc
    * 接口: crypto_bitcoin_cme
    * 目标地址: https://datacenter.jin10.com/reportType/dc_cme_btc_report
    * 描述: 获取芝加哥商业交易所-比特币成交量报告
    * 限量: 单次返回指定交易日的比特币成交量报告数据
    */
    public class crypto_bitcoin_cmeRequest extends AkShareRequestAndResponse {
    public crypto_bitcoin_cmeRequest(){
    setInterfaceName("crypto_bitcoin_cme");
    }

    public static crypto_bitcoin_cmeRequest of(


    LocalDate p_date,


    Map.Entry
    <String
    , String>... others){
    crypto_bitcoin_cmeRequest t = new crypto_bitcoin_cmeRequest();


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
    * desc: date=&quot;20210621&quot;
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
