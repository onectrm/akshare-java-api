
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:50 CST 2022*/
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: others
    * 接口: news_cctv
    * 目标地址: https://tv.cctv.com/lm/xwlb/?spm=C52056131267.P4y8I53JvSWE.0.0
    * 描述: 新闻联播文字稿, 数据区间从 20160330-至今
    * 限量: 单次返回指定日期新闻联播文字稿数据
    */
    public class news_cctvResponse extends AkShareRequestAndResponse {
    public news_cctvResponse(){
    setInterfaceName("news_cctv");
    }

    public static news_cctvResponse of(


    LocalDate p_date,

    String p_title,

    String p_content,


    Map.Entry
    <String
    , String>... others){
    news_cctvResponse t = new news_cctvResponse();


    t.p_date = p_date;

    t.p_title = p_title;

    t.p_content = p_content;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: date
    * type: object
    * desc: 新闻日期
    * required: 
    */
    @JsonProperty("date")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}

    /**
    * name: title
    * type: object
    * desc: 新闻标题
    * required: 
    */
    @JsonProperty("title")
    
    
    private String p_title;

    public String getP_title() { return this.p_title;}
    public void setP_title(String v) { this.p_title = v;}

    /**
    * name: content
    * type: object
    * desc: 新闻内容
    * required: 
    */
    @JsonProperty("content")
    
    
    private String p_content;

    public String getP_content() { return this.p_content;}
    public void setP_content(String v) { this.p_content = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
