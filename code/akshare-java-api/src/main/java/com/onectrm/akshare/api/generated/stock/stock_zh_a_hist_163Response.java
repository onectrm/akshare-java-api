
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
    * 接口: stock_zh_a_hist_163
    * 目标地址: http://quotes.money.163.com/trade/lsjysj_601318.html?year=2022&amp;season=2
    * 描述: 网易财经-行情首页-沪深 A 股-每日行情; 该接口主要用户获取流通市值、总市值等指标
    * 限量: 单次返回指定沪深 A 股（不包含北交所）上市公司指定日期间的历史行情日频率数据, 该接口只返回未复权数据
    */
    public class stock_zh_a_hist_163Response extends AkShareRequestAndResponse {
    public stock_zh_a_hist_163Response(){
    setInterfaceName("stock_zh_a_hist_163");
    }

    public static stock_zh_a_hist_163Response of(


    LocalDate p_ri4qi1,

    String p_gu3piao4dai4ma3,

    String p_ming2cheng1,

    Double p_shou1pan2jia4,

    Double p_zui4gao1jia4,

    Double p_zui4di1jia4,

    Double p_kai1pan2jia4,

    Double p_qian2shou1pan2,

    Double p_zhang3die1e2,

    Double p_zhang3die1fu2,

    Double p_huan4shou3lu4,

    Double p_cheng2jiao1liang4,

    Double p_cheng2jiao1jin1e2,

    Double p_zong3shi4zhi2,

    Double p_liu2tong1shi4zhi2,


    Map.Entry
    <String
    , String>... others){
    stock_zh_a_hist_163Response t = new stock_zh_a_hist_163Response();


    t.p_ri4qi1 = p_ri4qi1;

    t.p_gu3piao4dai4ma3 = p_gu3piao4dai4ma3;

    t.p_ming2cheng1 = p_ming2cheng1;

    t.p_shou1pan2jia4 = p_shou1pan2jia4;

    t.p_zui4gao1jia4 = p_zui4gao1jia4;

    t.p_zui4di1jia4 = p_zui4di1jia4;

    t.p_kai1pan2jia4 = p_kai1pan2jia4;

    t.p_qian2shou1pan2 = p_qian2shou1pan2;

    t.p_zhang3die1e2 = p_zhang3die1e2;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_huan4shou3lu4 = p_huan4shou3lu4;

    t.p_cheng2jiao1liang4 = p_cheng2jiao1liang4;

    t.p_cheng2jiao1jin1e2 = p_cheng2jiao1jin1e2;

    t.p_zong3shi4zhi2 = p_zong3shi4zhi2;

    t.p_liu2tong1shi4zhi2 = p_liu2tong1shi4zhi2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_ri4qi1;

    public LocalDate getP_ri4qi1() { return this.p_ri4qi1;}
    public void setP_ri4qi1(LocalDate v) { this.p_ri4qi1 = v;}

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
    * name: 名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("名称")
    
    
    private String p_ming2cheng1;

    public String getP_ming2cheng1() { return this.p_ming2cheng1;}
    public void setP_ming2cheng1(String v) { this.p_ming2cheng1 = v;}

    /**
    * name: 收盘价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("收盘价")
    
    
    private Double p_shou1pan2jia4;

    public Double getP_shou1pan2jia4() { return this.p_shou1pan2jia4;}
    public void setP_shou1pan2jia4(Double v) { this.p_shou1pan2jia4 = v;}

    /**
    * name: 最高价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("最高价")
    
    
    private Double p_zui4gao1jia4;

    public Double getP_zui4gao1jia4() { return this.p_zui4gao1jia4;}
    public void setP_zui4gao1jia4(Double v) { this.p_zui4gao1jia4 = v;}

    /**
    * name: 最低价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("最低价")
    
    
    private Double p_zui4di1jia4;

    public Double getP_zui4di1jia4() { return this.p_zui4di1jia4;}
    public void setP_zui4di1jia4(Double v) { this.p_zui4di1jia4 = v;}

    /**
    * name: 开盘价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("开盘价")
    
    
    private Double p_kai1pan2jia4;

    public Double getP_kai1pan2jia4() { return this.p_kai1pan2jia4;}
    public void setP_kai1pan2jia4(Double v) { this.p_kai1pan2jia4 = v;}

    /**
    * name: 前收盘
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("前收盘")
    
    
    private Double p_qian2shou1pan2;

    public Double getP_qian2shou1pan2() { return this.p_qian2shou1pan2;}
    public void setP_qian2shou1pan2(Double v) { this.p_qian2shou1pan2 = v;}

    /**
    * name: 涨跌额
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("涨跌额")
    
    
    private Double p_zhang3die1e2;

    public Double getP_zhang3die1e2() { return this.p_zhang3die1e2;}
    public void setP_zhang3die1e2(Double v) { this.p_zhang3die1e2 = v;}

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
    * name: 换手率
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("换手率")
    
    
    private Double p_huan4shou3lu4;

    public Double getP_huan4shou3lu4() { return this.p_huan4shou3lu4;}
    public void setP_huan4shou3lu4(Double v) { this.p_huan4shou3lu4 = v;}

    /**
    * name: 成交量
    * type: float64
    * desc: 注意单位: 股
    * required: 
    */
    @JsonProperty("成交量")
    
    
    private Double p_cheng2jiao1liang4;

    public Double getP_cheng2jiao1liang4() { return this.p_cheng2jiao1liang4;}
    public void setP_cheng2jiao1liang4(Double v) { this.p_cheng2jiao1liang4 = v;}

    /**
    * name: 成交金额
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("成交金额")
    
    
    private Double p_cheng2jiao1jin1e2;

    public Double getP_cheng2jiao1jin1e2() { return this.p_cheng2jiao1jin1e2;}
    public void setP_cheng2jiao1jin1e2(Double v) { this.p_cheng2jiao1jin1e2 = v;}

    /**
    * name: 总市值
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("总市值")
    
    
    private Double p_zong3shi4zhi2;

    public Double getP_zong3shi4zhi2() { return this.p_zong3shi4zhi2;}
    public void setP_zong3shi4zhi2(Double v) { this.p_zong3shi4zhi2 = v;}

    /**
    * name: 流通市值
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("流通市值")
    
    
    private Double p_liu2tong1shi4zhi2;

    public Double getP_liu2tong1shi4zhi2() { return this.p_liu2tong1shi4zhi2;}
    public void setP_liu2tong1shi4zhi2(Double v) { this.p_liu2tong1shi4zhi2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
