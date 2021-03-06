
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: fund_public
    * 接口: fund_portfolio_change_em
    * 目标地址: http://fundf10.eastmoney.com/ccbd_000001.html
    * 描述: 天天基金网-基金档案-投资组合-重大变动
    * 限量: 单次返回指定 symbol、indicator 和 date 的所有重大变动数据
    */
    public class fund_portfolio_change_emResponse extends AkShareRequestAndResponse {
    public fund_portfolio_change_emResponse(){
    setInterfaceName("fund_portfolio_change_em");
    }

    public static fund_portfolio_change_emResponse of(


    Integer p_xu4hao4,

    String p_gu3piao4dai4ma3,

    String p_gu3piao4ming2cheng1,

    Double p_ben3qi1lei3ji4mai3ru4jin1e2,

    Double p_zhan4qi1chu1ji1jin1zi1chan3jing4zhi2bi3li4,

    String p_ji4du4,


    Map.Entry
    <String
    , String>... others){
    fund_portfolio_change_emResponse t = new fund_portfolio_change_emResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_gu3piao4dai4ma3 = p_gu3piao4dai4ma3;

    t.p_gu3piao4ming2cheng1 = p_gu3piao4ming2cheng1;

    t.p_ben3qi1lei3ji4mai3ru4jin1e2 = p_ben3qi1lei3ji4mai3ru4jin1e2;

    t.p_zhan4qi1chu1ji1jin1zi1chan3jing4zhi2bi3li4 = p_zhan4qi1chu1ji1jin1zi1chan3jing4zhi2bi3li4;

    t.p_ji4du4 = p_ji4du4;


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
    * name: 本期累计买入金额
    * type: float64
    * desc: 注意单位: 万元
    * required: 
    */
    @JsonProperty("本期累计买入金额")
    
    
    private Double p_ben3qi1lei3ji4mai3ru4jin1e2;

    public Double getP_ben3qi1lei3ji4mai3ru4jin1e2() { return this.p_ben3qi1lei3ji4mai3ru4jin1e2;}
    public void setP_ben3qi1lei3ji4mai3ru4jin1e2(Double v) { this.p_ben3qi1lei3ji4mai3ru4jin1e2 = v;}

    /**
    * name: 占期初基金资产净值比例
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("占期初基金资产净值比例")
    
    
    private Double p_zhan4qi1chu1ji1jin1zi1chan3jing4zhi2bi3li4;

    public Double getP_zhan4qi1chu1ji1jin1zi1chan3jing4zhi2bi3li4() { return this.p_zhan4qi1chu1ji1jin1zi1chan3jing4zhi2bi3li4;}
    public void setP_zhan4qi1chu1ji1jin1zi1chan3jing4zhi2bi3li4(Double v) { this.p_zhan4qi1chu1ji1jin1zi1chan3jing4zhi2bi3li4 = v;}

    /**
    * name: 季度
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("季度")
    
    
    private String p_ji4du4;

    public String getP_ji4du4() { return this.p_ji4du4;}
    public void setP_ji4du4(String v) { this.p_ji4du4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
