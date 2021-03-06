
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
    * 接口: stock_info_sh_delist
    * 目标地址: http://www.sse.com.cn/assortment/stock/list/delisting/
    * 描述: 上海证券交易所暂停/终止上市股票
    * 限量: 单次获取上海证券交易所暂停/终止上市股票
    */
    public class stock_info_sh_delistResponse extends AkShareRequestAndResponse {
    public stock_info_sh_delistResponse(){
    setInterfaceName("stock_info_sh_delist");
    }

    public static stock_info_sh_delistResponse of(


    String p_gong1si1dai4ma3,

    String p_gong1si1jian3cheng1,

    LocalDate p_shang4shi4ri4qi1,

    LocalDate p_zan4ting2shang4shi4ri4qi1,


    Map.Entry
    <String
    , String>... others){
    stock_info_sh_delistResponse t = new stock_info_sh_delistResponse();


    t.p_gong1si1dai4ma3 = p_gong1si1dai4ma3;

    t.p_gong1si1jian3cheng1 = p_gong1si1jian3cheng1;

    t.p_shang4shi4ri4qi1 = p_shang4shi4ri4qi1;

    t.p_zan4ting2shang4shi4ri4qi1 = p_zan4ting2shang4shi4ri4qi1;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 公司代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("公司代码")
    
    
    private String p_gong1si1dai4ma3;

    public String getP_gong1si1dai4ma3() { return this.p_gong1si1dai4ma3;}
    public void setP_gong1si1dai4ma3(String v) { this.p_gong1si1dai4ma3 = v;}

    /**
    * name: 公司简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("公司简称")
    
    
    private String p_gong1si1jian3cheng1;

    public String getP_gong1si1jian3cheng1() { return this.p_gong1si1jian3cheng1;}
    public void setP_gong1si1jian3cheng1(String v) { this.p_gong1si1jian3cheng1 = v;}

    /**
    * name: 上市日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("上市日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_shang4shi4ri4qi1;

    public LocalDate getP_shang4shi4ri4qi1() { return this.p_shang4shi4ri4qi1;}
    public void setP_shang4shi4ri4qi1(LocalDate v) { this.p_shang4shi4ri4qi1 = v;}

    /**
    * name: 暂停上市日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("暂停上市日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_zan4ting2shang4shi4ri4qi1;

    public LocalDate getP_zan4ting2shang4shi4ri4qi1() { return this.p_zan4ting2shang4shi4ri4qi1;}
    public void setP_zan4ting2shang4shi4ri4qi1(LocalDate v) { this.p_zan4ting2shang4shi4ri4qi1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
