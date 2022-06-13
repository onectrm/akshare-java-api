
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
    * 接口: stock_report_fund_hold_detail
    * 目标地址: http://data.eastmoney.com/zlsj/ccjj/2020-12-31-008286.html
    * 描述: 获取东方财富网-数据中心-主力数据-基金持仓-基金持仓明细表
    * 限量: 单次返回指定 symbol 和 date 的所有历史数据
    */
    public class stock_report_fund_hold_detailResponse extends AkShareRequestAndResponse {
    public stock_report_fund_hold_detailResponse(){
    setInterfaceName("stock_report_fund_hold_detail");
    }

    public static stock_report_fund_hold_detailResponse of(


    LocalDate p_xu4hao4,

    Double p_gu3piao4dai4ma3,

    Double p_gu3piao4jian3cheng1,

    Double p_chi2gu3shu4,

    Double p_chi2gu3shi4zhi2,

    Double p_zhan4zong3gu3ben3bi3li4,

    Double p_zhan4liu2tong1gu3ben3bi3li4,


    Map.Entry
    <String
    , String>... others){
    stock_report_fund_hold_detailResponse t = new stock_report_fund_hold_detailResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_gu3piao4dai4ma3 = p_gu3piao4dai4ma3;

    t.p_gu3piao4jian3cheng1 = p_gu3piao4jian3cheng1;

    t.p_chi2gu3shu4 = p_chi2gu3shu4;

    t.p_chi2gu3shi4zhi2 = p_chi2gu3shi4zhi2;

    t.p_zhan4zong3gu3ben3bi3li4 = p_zhan4zong3gu3ben3bi3li4;

    t.p_zhan4liu2tong1gu3ben3bi3li4 = p_zhan4liu2tong1gu3ben3bi3li4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 序号
    * type: datetime
    * desc: 
    * required: Y
    */
    @JsonProperty("序号")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_xu4hao4;

    public LocalDate getP_xu4hao4() { return this.p_xu4hao4;}
    public void setP_xu4hao4(LocalDate v) { this.p_xu4hao4 = v;}

    /**
    * name: 股票代码
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("股票代码")
    
    
    private Double p_gu3piao4dai4ma3;

    public Double getP_gu3piao4dai4ma3() { return this.p_gu3piao4dai4ma3;}
    public void setP_gu3piao4dai4ma3(Double v) { this.p_gu3piao4dai4ma3 = v;}

    /**
    * name: 股票简称
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("股票简称")
    
    
    private Double p_gu3piao4jian3cheng1;

    public Double getP_gu3piao4jian3cheng1() { return this.p_gu3piao4jian3cheng1;}
    public void setP_gu3piao4jian3cheng1(Double v) { this.p_gu3piao4jian3cheng1 = v;}

    /**
    * name: 持股数
    * type: float
    * desc: 注意单位: 股
    * required: Y
    */
    @JsonProperty("持股数")
    
    
    private Double p_chi2gu3shu4;

    public Double getP_chi2gu3shu4() { return this.p_chi2gu3shu4;}
    public void setP_chi2gu3shu4(Double v) { this.p_chi2gu3shu4 = v;}

    /**
    * name: 持股市值
    * type: float
    * desc: 注意单位: 元
    * required: Y
    */
    @JsonProperty("持股市值")
    
    
    private Double p_chi2gu3shi4zhi2;

    public Double getP_chi2gu3shi4zhi2() { return this.p_chi2gu3shi4zhi2;}
    public void setP_chi2gu3shi4zhi2(Double v) { this.p_chi2gu3shi4zhi2 = v;}

    /**
    * name: 占总股本比例
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("占总股本比例")
    
    
    private Double p_zhan4zong3gu3ben3bi3li4;

    public Double getP_zhan4zong3gu3ben3bi3li4() { return this.p_zhan4zong3gu3ben3bi3li4;}
    public void setP_zhan4zong3gu3ben3bi3li4(Double v) { this.p_zhan4zong3gu3ben3bi3li4 = v;}

    /**
    * name: 占流通股本比例
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("占流通股本比例")
    
    
    private Double p_zhan4liu2tong1gu3ben3bi3li4;

    public Double getP_zhan4liu2tong1gu3ben3bi3li4() { return this.p_zhan4liu2tong1gu3ben3bi3li4;}
    public void setP_zhan4liu2tong1gu3ben3bi3li4(Double v) { this.p_zhan4liu2tong1gu3ben3bi3li4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
