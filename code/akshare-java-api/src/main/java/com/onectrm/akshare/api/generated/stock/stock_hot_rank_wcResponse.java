
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
    * 接口: stock_hot_rank_wc
    * 目标地址: http://www.iwencai.com/unifiedwap/home/index
    * 描述: 问财-热门股票排名数据
    * 限量: 单次返回所有股票的热门排名数据, 当前交易日的数据请在夜间访问
    */
    public class stock_hot_rank_wcResponse extends AkShareRequestAndResponse {
    public stock_hot_rank_wcResponse(){
    setInterfaceName("stock_hot_rank_wc");
    }

    public static stock_hot_rank_wcResponse of(


    String p_xu4hao4,

    String p_gu3piao4dai4ma3,

    String p_gu3piao4jian3cheng1,

    Double p_xian4jia4,

    Double p_zhang3die1fu2,

    Double p_ge4gu3re4du4,

    String p_ge4gu3re4du4pai2ming2,

    LocalDate p_pai2ming2ri4qi1,


    Map.Entry
    <String
    , String>... others){
    stock_hot_rank_wcResponse t = new stock_hot_rank_wcResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_gu3piao4dai4ma3 = p_gu3piao4dai4ma3;

    t.p_gu3piao4jian3cheng1 = p_gu3piao4jian3cheng1;

    t.p_xian4jia4 = p_xian4jia4;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_ge4gu3re4du4 = p_ge4gu3re4du4;

    t.p_ge4gu3re4du4pai2ming2 = p_ge4gu3re4du4pai2ming2;

    t.p_pai2ming2ri4qi1 = p_pai2ming2ri4qi1;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 序号
    * type: int32
    * desc: 
    * required: 
    */
    @JsonProperty("序号")
    
    
    private String p_xu4hao4;

    public String getP_xu4hao4() { return this.p_xu4hao4;}
    public void setP_xu4hao4(String v) { this.p_xu4hao4 = v;}

    /**
    * name: 股票代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股票代码")
    
    
    private String p_gu3piao4dai4ma3;

    public String getP_gu3piao4dai4ma3() { return this.p_gu3piao4dai4ma3;}
    public void setP_gu3piao4dai4ma3(String v) { this.p_gu3piao4dai4ma3 = v;}

    /**
    * name: 股票简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股票简称")
    
    
    private String p_gu3piao4jian3cheng1;

    public String getP_gu3piao4jian3cheng1() { return this.p_gu3piao4jian3cheng1;}
    public void setP_gu3piao4jian3cheng1(String v) { this.p_gu3piao4jian3cheng1 = v;}

    /**
    * name: 现价
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("现价")
    
    
    private Double p_xian4jia4;

    public Double getP_xian4jia4() { return this.p_xian4jia4;}
    public void setP_xian4jia4(Double v) { this.p_xian4jia4 = v;}

    /**
    * name: 涨跌幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("涨跌幅")
    
    
    private Double p_zhang3die1fu2;

    public Double getP_zhang3die1fu2() { return this.p_zhang3die1fu2;}
    public void setP_zhang3die1fu2(Double v) { this.p_zhang3die1fu2 = v;}

    /**
    * name: 个股热度
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("个股热度")
    
    
    private Double p_ge4gu3re4du4;

    public Double getP_ge4gu3re4du4() { return this.p_ge4gu3re4du4;}
    public void setP_ge4gu3re4du4(Double v) { this.p_ge4gu3re4du4 = v;}

    /**
    * name: 个股热度排名
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("个股热度排名")
    
    
    private String p_ge4gu3re4du4pai2ming2;

    public String getP_ge4gu3re4du4pai2ming2() { return this.p_ge4gu3re4du4pai2ming2;}
    public void setP_ge4gu3re4du4pai2ming2(String v) { this.p_ge4gu3re4du4pai2ming2 = v;}

    /**
    * name: 排名日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("排名日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_pai2ming2ri4qi1;

    public LocalDate getP_pai2ming2ri4qi1() { return this.p_pai2ming2ri4qi1;}
    public void setP_pai2ming2ri4qi1(LocalDate v) { this.p_pai2ming2ri4qi1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
