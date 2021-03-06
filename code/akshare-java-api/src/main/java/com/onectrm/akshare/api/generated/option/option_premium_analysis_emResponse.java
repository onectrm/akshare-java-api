
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:50 CST 2022*/
    package com.onectrm.akshare.api.generated.option;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: option
    * 接口: option_premium_analysis_em
    * 目标地址: https://data.eastmoney.com/other/premium.html
    * 描述: 东方财富网-数据中心-特色数据-期权折溢价
    * 限量: 单次返回所有数据
    */
    public class option_premium_analysis_emResponse extends AkShareRequestAndResponse {
    public option_premium_analysis_emResponse(){
    setInterfaceName("option_premium_analysis_em");
    }

    public static option_premium_analysis_emResponse of(


    String p_qi1quan2dai4ma3,

    String p_qi1quan2ming2cheng1,

    Double p_zui4xin1jia4,

    Double p_zhang3die1fu2,

    Double p_xing2quan2jia4,

    Double p_zhe2yi4jia4lu4,

    String p_biao1de5ming2cheng1,

    Double p_biao1de5zui4xin1jia4,

    Double p_biao1de5zhang3die1fu2,

    Double p_ying2kui1ping2heng2jia4,

    String p_dao4qi1ri4,


    Map.Entry
    <String
    , String>... others){
    option_premium_analysis_emResponse t = new option_premium_analysis_emResponse();


    t.p_qi1quan2dai4ma3 = p_qi1quan2dai4ma3;

    t.p_qi1quan2ming2cheng1 = p_qi1quan2ming2cheng1;

    t.p_zui4xin1jia4 = p_zui4xin1jia4;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_xing2quan2jia4 = p_xing2quan2jia4;

    t.p_zhe2yi4jia4lu4 = p_zhe2yi4jia4lu4;

    t.p_biao1de5ming2cheng1 = p_biao1de5ming2cheng1;

    t.p_biao1de5zui4xin1jia4 = p_biao1de5zui4xin1jia4;

    t.p_biao1de5zhang3die1fu2 = p_biao1de5zhang3die1fu2;

    t.p_ying2kui1ping2heng2jia4 = p_ying2kui1ping2heng2jia4;

    t.p_dao4qi1ri4 = p_dao4qi1ri4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 期权代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("期权代码")
    
    
    private String p_qi1quan2dai4ma3;

    public String getP_qi1quan2dai4ma3() { return this.p_qi1quan2dai4ma3;}
    public void setP_qi1quan2dai4ma3(String v) { this.p_qi1quan2dai4ma3 = v;}

    /**
    * name: 期权名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("期权名称")
    
    
    private String p_qi1quan2ming2cheng1;

    public String getP_qi1quan2ming2cheng1() { return this.p_qi1quan2ming2cheng1;}
    public void setP_qi1quan2ming2cheng1(String v) { this.p_qi1quan2ming2cheng1 = v;}

    /**
    * name: 最新价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("最新价")
    
    
    private Double p_zui4xin1jia4;

    public Double getP_zui4xin1jia4() { return this.p_zui4xin1jia4;}
    public void setP_zui4xin1jia4(Double v) { this.p_zui4xin1jia4 = v;}

    /**
    * name: 涨跌幅
    * type: float64
    * desc: 注意单位: %;
    * required: 
    */
    @JsonProperty("涨跌幅")
    
    
    private Double p_zhang3die1fu2;

    public Double getP_zhang3die1fu2() { return this.p_zhang3die1fu2;}
    public void setP_zhang3die1fu2(Double v) { this.p_zhang3die1fu2 = v;}

    /**
    * name: 行权价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("行权价")
    
    
    private Double p_xing2quan2jia4;

    public Double getP_xing2quan2jia4() { return this.p_xing2quan2jia4;}
    public void setP_xing2quan2jia4(Double v) { this.p_xing2quan2jia4 = v;}

    /**
    * name: 折溢价率
    * type: float64
    * desc: 注意: 折溢价反映的是投资者以现价买入某期权并持有至到期时，标的需要上升或下跌多少才能使这笔投资保本。
    * required: 
    */
    @JsonProperty("折溢价率")
    
    
    private Double p_zhe2yi4jia4lu4;

    public Double getP_zhe2yi4jia4lu4() { return this.p_zhe2yi4jia4lu4;}
    public void setP_zhe2yi4jia4lu4(Double v) { this.p_zhe2yi4jia4lu4 = v;}

    /**
    * name: 标的名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("标的名称")
    
    
    private String p_biao1de5ming2cheng1;

    public String getP_biao1de5ming2cheng1() { return this.p_biao1de5ming2cheng1;}
    public void setP_biao1de5ming2cheng1(String v) { this.p_biao1de5ming2cheng1 = v;}

    /**
    * name: 标的最新价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("标的最新价")
    
    
    private Double p_biao1de5zui4xin1jia4;

    public Double getP_biao1de5zui4xin1jia4() { return this.p_biao1de5zui4xin1jia4;}
    public void setP_biao1de5zui4xin1jia4(Double v) { this.p_biao1de5zui4xin1jia4 = v;}

    /**
    * name: 标的涨跌幅
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("标的涨跌幅")
    
    
    private Double p_biao1de5zhang3die1fu2;

    public Double getP_biao1de5zhang3die1fu2() { return this.p_biao1de5zhang3die1fu2;}
    public void setP_biao1de5zhang3die1fu2(Double v) { this.p_biao1de5zhang3die1fu2 = v;}

    /**
    * name: 盈亏平衡价
    * type: float64
    * desc: 注意: 指期权投资者实现投资收益为零时标的证券的价格。
    * required: 
    */
    @JsonProperty("盈亏平衡价")
    
    
    private Double p_ying2kui1ping2heng2jia4;

    public Double getP_ying2kui1ping2heng2jia4() { return this.p_ying2kui1ping2heng2jia4;}
    public void setP_ying2kui1ping2heng2jia4(Double v) { this.p_ying2kui1ping2heng2jia4 = v;}

    /**
    * name: 到期日
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("到期日")
    
    
    private String p_dao4qi1ri4;

    public String getP_dao4qi1ri4() { return this.p_dao4qi1ri4;}
    public void setP_dao4qi1ri4(String v) { this.p_dao4qi1ri4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
