
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:50 CST 2022*/
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
    * 接口: stock_analyst_detail_em
    * 目标地址: http://data.eastmoney.com/invest/invest/list.html
    * 描述: 东方财富网-数据中心-研究报告-东方财富分析师指数-分析师详情
    * 限量: 单次获取指定 indicator 指定的数据
    */
    public class stock_analyst_detail_emResponse extends AkShareRequestAndResponse {
    public stock_analyst_detail_emResponse(){
    setInterfaceName("stock_analyst_detail_em");
    }

    public static stock_analyst_detail_emResponse of(


    Integer p_xu4hao4,

    String p_gu3piao4dai4ma3,

    String p_gu3piao4ming2cheng1,

    LocalDate p_diao4ru4ri4qi1,

    LocalDate p_zui4xin1ping2ji2ri4qi1,

    String p_dang1qian2ping2ji2ming2cheng1,

    Double p_cheng2jiao1jia4ge2qian2fu4quan2,

    Double p_zui4xin1jia4ge2,

    Double p_jie1duan4zhang3die1fu2,


    Map.Entry
    <String
    , String>... others){
    stock_analyst_detail_emResponse t = new stock_analyst_detail_emResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_gu3piao4dai4ma3 = p_gu3piao4dai4ma3;

    t.p_gu3piao4ming2cheng1 = p_gu3piao4ming2cheng1;

    t.p_diao4ru4ri4qi1 = p_diao4ru4ri4qi1;

    t.p_zui4xin1ping2ji2ri4qi1 = p_zui4xin1ping2ji2ri4qi1;

    t.p_dang1qian2ping2ji2ming2cheng1 = p_dang1qian2ping2ji2ming2cheng1;

    t.p_cheng2jiao1jia4ge2qian2fu4quan2 = p_cheng2jiao1jia4ge2qian2fu4quan2;

    t.p_zui4xin1jia4ge2 = p_zui4xin1jia4ge2;

    t.p_jie1duan4zhang3die1fu2 = p_jie1duan4zhang3die1fu2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 序号
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("序号")
    
    
    private Integer p_xu4hao4;

    public Integer getP_xu4hao4() { return this.p_xu4hao4;}
    public void setP_xu4hao4(Integer v) { this.p_xu4hao4 = v;}

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
    * name: 股票名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股票名称")
    
    
    private String p_gu3piao4ming2cheng1;

    public String getP_gu3piao4ming2cheng1() { return this.p_gu3piao4ming2cheng1;}
    public void setP_gu3piao4ming2cheng1(String v) { this.p_gu3piao4ming2cheng1 = v;}

    /**
    * name: 调入日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("调入日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_diao4ru4ri4qi1;

    public LocalDate getP_diao4ru4ri4qi1() { return this.p_diao4ru4ri4qi1;}
    public void setP_diao4ru4ri4qi1(LocalDate v) { this.p_diao4ru4ri4qi1 = v;}

    /**
    * name: 最新评级日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("最新评级日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_zui4xin1ping2ji2ri4qi1;

    public LocalDate getP_zui4xin1ping2ji2ri4qi1() { return this.p_zui4xin1ping2ji2ri4qi1;}
    public void setP_zui4xin1ping2ji2ri4qi1(LocalDate v) { this.p_zui4xin1ping2ji2ri4qi1 = v;}

    /**
    * name: 当前评级名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("当前评级名称")
    
    
    private String p_dang1qian2ping2ji2ming2cheng1;

    public String getP_dang1qian2ping2ji2ming2cheng1() { return this.p_dang1qian2ping2ji2ming2cheng1;}
    public void setP_dang1qian2ping2ji2ming2cheng1(String v) { this.p_dang1qian2ping2ji2ming2cheng1 = v;}

    /**
    * name: 成交价格(前复权)
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("成交价格(前复权)")
    
    
    private Double p_cheng2jiao1jia4ge2qian2fu4quan2;

    public Double getP_cheng2jiao1jia4ge2qian2fu4quan2() { return this.p_cheng2jiao1jia4ge2qian2fu4quan2;}
    public void setP_cheng2jiao1jia4ge2qian2fu4quan2(Double v) { this.p_cheng2jiao1jia4ge2qian2fu4quan2 = v;}

    /**
    * name: 最新价格
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("最新价格")
    
    
    private Double p_zui4xin1jia4ge2;

    public Double getP_zui4xin1jia4ge2() { return this.p_zui4xin1jia4ge2;}
    public void setP_zui4xin1jia4ge2(Double v) { this.p_zui4xin1jia4ge2 = v;}

    /**
    * name: 阶段涨跌幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("阶段涨跌幅")
    
    
    private Double p_jie1duan4zhang3die1fu2;

    public Double getP_jie1duan4zhang3die1fu2() { return this.p_jie1duan4zhang3die1fu2;}
    public void setP_jie1duan4zhang3die1fu2(Double v) { this.p_jie1duan4zhang3die1fu2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
