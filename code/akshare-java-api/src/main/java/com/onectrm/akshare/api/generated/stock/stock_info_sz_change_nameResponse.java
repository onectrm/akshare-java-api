
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
    * 接口: stock_info_sz_change_name
    * 目标地址: http://www.szse.cn/market/companys/changename/index.html
    * 描述: 获取深证证券交易所-更名公司(暂无上海交易所的数据)
    * 限量: 单次获取深证证券交易所-更名公司所有历史数据
    */
    public class stock_info_sz_change_nameResponse extends AkShareRequestAndResponse {
    public stock_info_sz_change_nameResponse(){
    setInterfaceName("stock_info_sz_change_name");
    }

    public static stock_info_sz_change_nameResponse of(


    LocalDate p_bian4geng4ri4qi1,

    String p_zheng4quan4dai4ma3,

    String p_zheng4quan4jian3cheng1,

    String p_bian4geng4qian2quan2cheng1,

    String p_bian4geng4hou4quan2cheng1,


    Map.Entry
    <String
    , String>... others){
    stock_info_sz_change_nameResponse t = new stock_info_sz_change_nameResponse();


    t.p_bian4geng4ri4qi1 = p_bian4geng4ri4qi1;

    t.p_zheng4quan4dai4ma3 = p_zheng4quan4dai4ma3;

    t.p_zheng4quan4jian3cheng1 = p_zheng4quan4jian3cheng1;

    t.p_bian4geng4qian2quan2cheng1 = p_bian4geng4qian2quan2cheng1;

    t.p_bian4geng4hou4quan2cheng1 = p_bian4geng4hou4quan2cheng1;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 变更日期
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("变更日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_bian4geng4ri4qi1;

    public LocalDate getP_bian4geng4ri4qi1() { return this.p_bian4geng4ri4qi1;}
    public void setP_bian4geng4ri4qi1(LocalDate v) { this.p_bian4geng4ri4qi1 = v;}

    /**
    * name: 证券代码
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("证券代码")
    
    
    private String p_zheng4quan4dai4ma3;

    public String getP_zheng4quan4dai4ma3() { return this.p_zheng4quan4dai4ma3;}
    public void setP_zheng4quan4dai4ma3(String v) { this.p_zheng4quan4dai4ma3 = v;}

    /**
    * name: 证券简称
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("证券简称")
    
    
    private String p_zheng4quan4jian3cheng1;

    public String getP_zheng4quan4jian3cheng1() { return this.p_zheng4quan4jian3cheng1;}
    public void setP_zheng4quan4jian3cheng1(String v) { this.p_zheng4quan4jian3cheng1 = v;}

    /**
    * name: 变更前全称
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("变更前全称")
    
    
    private String p_bian4geng4qian2quan2cheng1;

    public String getP_bian4geng4qian2quan2cheng1() { return this.p_bian4geng4qian2quan2cheng1;}
    public void setP_bian4geng4qian2quan2cheng1(String v) { this.p_bian4geng4qian2quan2cheng1 = v;}

    /**
    * name: 变更后全称
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("变更后全称")
    
    
    private String p_bian4geng4hou4quan2cheng1;

    public String getP_bian4geng4hou4quan2cheng1() { return this.p_bian4geng4hou4quan2cheng1;}
    public void setP_bian4geng4hou4quan2cheng1(String v) { this.p_bian4geng4hou4quan2cheng1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
