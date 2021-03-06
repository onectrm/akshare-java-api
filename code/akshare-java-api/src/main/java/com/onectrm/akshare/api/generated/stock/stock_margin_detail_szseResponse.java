
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
    * 接口: stock_margin_detail_szse
    * 目标地址: http://www.szse.cn/disclosure/margin/margin/index.html
    * 描述: 深证证券交易所-融资融券数据-融资融券交易明细数据
    * 限量: 单次返回指定 date 的所有历史数据
    */
    public class stock_margin_detail_szseResponse extends AkShareRequestAndResponse {
    public stock_margin_detail_szseResponse(){
    setInterfaceName("stock_margin_detail_szse");
    }

    public static stock_margin_detail_szseResponse of(


    String p_zheng4quan4dai4ma3,

    String p_zheng4quan4jian3cheng1,

    Integer p_rong2zi1mai3ru4e2,

    Integer p_rong2zi1yu2e2,

    Integer p_rong2quan4mai4chu1liang4,

    Integer p_rong2quan4yu2liang4,

    Integer p_rong2quan4yu2e2,

    Integer p_rong2zi1rong2quan4yu2e2,


    Map.Entry
    <String
    , String>... others){
    stock_margin_detail_szseResponse t = new stock_margin_detail_szseResponse();


    t.p_zheng4quan4dai4ma3 = p_zheng4quan4dai4ma3;

    t.p_zheng4quan4jian3cheng1 = p_zheng4quan4jian3cheng1;

    t.p_rong2zi1mai3ru4e2 = p_rong2zi1mai3ru4e2;

    t.p_rong2zi1yu2e2 = p_rong2zi1yu2e2;

    t.p_rong2quan4mai4chu1liang4 = p_rong2quan4mai4chu1liang4;

    t.p_rong2quan4yu2liang4 = p_rong2quan4yu2liang4;

    t.p_rong2quan4yu2e2 = p_rong2quan4yu2e2;

    t.p_rong2zi1rong2quan4yu2e2 = p_rong2zi1rong2quan4yu2e2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 证券代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("证券代码")
    
    
    private String p_zheng4quan4dai4ma3;

    public String getP_zheng4quan4dai4ma3() { return this.p_zheng4quan4dai4ma3;}
    public void setP_zheng4quan4dai4ma3(String v) { this.p_zheng4quan4dai4ma3 = v;}

    /**
    * name: 证券简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("证券简称")
    
    
    private String p_zheng4quan4jian3cheng1;

    public String getP_zheng4quan4jian3cheng1() { return this.p_zheng4quan4jian3cheng1;}
    public void setP_zheng4quan4jian3cheng1(String v) { this.p_zheng4quan4jian3cheng1 = v;}

    /**
    * name: 融资买入额
    * type: int64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("融资买入额")
    
    
    private Integer p_rong2zi1mai3ru4e2;

    public Integer getP_rong2zi1mai3ru4e2() { return this.p_rong2zi1mai3ru4e2;}
    public void setP_rong2zi1mai3ru4e2(Integer v) { this.p_rong2zi1mai3ru4e2 = v;}

    /**
    * name: 融资余额
    * type: int64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("融资余额")
    
    
    private Integer p_rong2zi1yu2e2;

    public Integer getP_rong2zi1yu2e2() { return this.p_rong2zi1yu2e2;}
    public void setP_rong2zi1yu2e2(Integer v) { this.p_rong2zi1yu2e2 = v;}

    /**
    * name: 融券卖出量
    * type: int64
    * desc: 注意单位: 股/份
    * required: 
    */
    @JsonProperty("融券卖出量")
    
    
    private Integer p_rong2quan4mai4chu1liang4;

    public Integer getP_rong2quan4mai4chu1liang4() { return this.p_rong2quan4mai4chu1liang4;}
    public void setP_rong2quan4mai4chu1liang4(Integer v) { this.p_rong2quan4mai4chu1liang4 = v;}

    /**
    * name: 融券余量
    * type: int64
    * desc: 注意单位: 股/份
    * required: 
    */
    @JsonProperty("融券余量")
    
    
    private Integer p_rong2quan4yu2liang4;

    public Integer getP_rong2quan4yu2liang4() { return this.p_rong2quan4yu2liang4;}
    public void setP_rong2quan4yu2liang4(Integer v) { this.p_rong2quan4yu2liang4 = v;}

    /**
    * name: 融券余额
    * type: int64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("融券余额")
    
    
    private Integer p_rong2quan4yu2e2;

    public Integer getP_rong2quan4yu2e2() { return this.p_rong2quan4yu2e2;}
    public void setP_rong2quan4yu2e2(Integer v) { this.p_rong2quan4yu2e2 = v;}

    /**
    * name: 融资融券余额
    * type: int64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("融资融券余额")
    
    
    private Integer p_rong2zi1rong2quan4yu2e2;

    public Integer getP_rong2zi1rong2quan4yu2e2() { return this.p_rong2zi1rong2quan4yu2e2;}
    public void setP_rong2zi1rong2quan4yu2e2(Integer v) { this.p_rong2zi1rong2quan4yu2e2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
