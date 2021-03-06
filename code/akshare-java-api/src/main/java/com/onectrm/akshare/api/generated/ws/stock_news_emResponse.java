
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:51 CST 2022*/
    package com.onectrm.akshare.api.generated.ws;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: ws
    * 接口: stock_news_em
    * 目标地址: http://so.eastmoney.com/news/s
    * 描述: 东方财富指定个股的新闻资讯数据
    * 限量: 当日最近 20 条新闻资讯数据
    */
    public class stock_news_emResponse extends AkShareRequestAndResponse {
    public stock_news_emResponse(){
    setInterfaceName("stock_news_em");
    }

    public static stock_news_emResponse of(


    String p_code,

    String p_title,

    String p_content,

    LocalDateTime p_publictime,

    String p_url,


    Map.Entry
    <String
    , String>... others){
    stock_news_emResponse t = new stock_news_emResponse();


    t.p_code = p_code;

    t.p_title = p_title;

    t.p_content = p_content;

    t.p_publictime = p_publictime;

    t.p_url = p_url;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: code
    * type: object
    * desc: 
    * required: 股票代码
    */
    @JsonProperty("code")
    
    
    private String p_code;

    public String getP_code() { return this.p_code;}
    public void setP_code(String v) { this.p_code = v;}

    /**
    * name: title
    * type: object
    * desc: 
    * required: 新闻标题
    */
    @JsonProperty("title")
    
    
    private String p_title;

    public String getP_title() { return this.p_title;}
    public void setP_title(String v) { this.p_title = v;}

    /**
    * name: content
    * type: object
    * desc: 
    * required: 新闻内容
    */
    @JsonProperty("content")
    
    
    private String p_content;

    public String getP_content() { return this.p_content;}
    public void setP_content(String v) { this.p_content = v;}

    /**
    * name: public_time
    * type: object
    * desc: 
    * required: 新闻发布时间
    */
    @JsonProperty("public_time")
    
    @JsonDeserialize(using =
        JacksonDateTimeDeserializer.class)
    
    private LocalDateTime p_publictime;

    public LocalDateTime getP_publictime() { return this.p_publictime;}
    public void setP_publictime(LocalDateTime v) { this.p_publictime = v;}

    /**
    * name: url
    * type: object
    * desc: 
    * required: 新闻链接
    */
    @JsonProperty("url")
    
    
    private String p_url;

    public String getP_url() { return this.p_url;}
    public void setP_url(String v) { this.p_url = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
