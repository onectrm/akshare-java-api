
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
    * 接口: stock_zh_a_hist
    * 目标地址: http://quote.eastmoney.com/concept/sh603777.html?from=classic(示例)
    * 描述: 东方财富-沪深京 A 股日频率数据; 历史数据按日频率更新, 当日收盘价请在收盘后获取
    * 限量: 单次返回指定沪深京 A 股上市公司、指定周期和指定日期间的历史行情日频率数据
    */
    public class stock_zh_a_histResponse extends AkShareRequestAndResponse {
    public stock_zh_a_histResponse(){
    setInterfaceName("stock_zh_a_hist");
    }

    public static stock_zh_a_histResponse of(


    LocalDate p_ri4qi1,

    Double p_kai1pan2,

    Double p_shou1pan2,

    Double p_zui4gao1,

    Double p_zui4di1,

    String p_cheng2jiao1liang4,

    Double p_cheng2jiao1e2,

    Double p_zhen4fu2,

    Double p_zhang3die1fu2,

    Double p_zhang3die1e2,

    Double p_huan4shou3lu4,


    Map.Entry
    <String
    , String>... others){
    stock_zh_a_histResponse t = new stock_zh_a_histResponse();


    t.p_ri4qi1 = p_ri4qi1;

    t.p_kai1pan2 = p_kai1pan2;

    t.p_shou1pan2 = p_shou1pan2;

    t.p_zui4gao1 = p_zui4gao1;

    t.p_zui4di1 = p_zui4di1;

    t.p_cheng2jiao1liang4 = p_cheng2jiao1liang4;

    t.p_cheng2jiao1e2 = p_cheng2jiao1e2;

    t.p_zhen4fu2 = p_zhen4fu2;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_zhang3die1e2 = p_zhang3die1e2;

    t.p_huan4shou3lu4 = p_huan4shou3lu4;


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
    * desc: 交易日
    * required: 
    */
    @JsonProperty("日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_ri4qi1;

    public LocalDate getP_ri4qi1() { return this.p_ri4qi1;}
    public void setP_ri4qi1(LocalDate v) { this.p_ri4qi1 = v;}

    /**
    * name: 开盘
    * type: float64
    * desc: 开盘价
    * required: 
    */
    @JsonProperty("开盘")
    
    
    private Double p_kai1pan2;

    public Double getP_kai1pan2() { return this.p_kai1pan2;}
    public void setP_kai1pan2(Double v) { this.p_kai1pan2 = v;}

    /**
    * name: 收盘
    * type: float64
    * desc: 收盘价
    * required: 
    */
    @JsonProperty("收盘")
    
    
    private Double p_shou1pan2;

    public Double getP_shou1pan2() { return this.p_shou1pan2;}
    public void setP_shou1pan2(Double v) { this.p_shou1pan2 = v;}

    /**
    * name: 最高
    * type: float64
    * desc: 最高价
    * required: 
    */
    @JsonProperty("最高")
    
    
    private Double p_zui4gao1;

    public Double getP_zui4gao1() { return this.p_zui4gao1;}
    public void setP_zui4gao1(Double v) { this.p_zui4gao1 = v;}

    /**
    * name: 最低
    * type: float64
    * desc: 最低价
    * required: 
    */
    @JsonProperty("最低")
    
    
    private Double p_zui4di1;

    public Double getP_zui4di1() { return this.p_zui4di1;}
    public void setP_zui4di1(Double v) { this.p_zui4di1 = v;}

    /**
    * name: 成交量
    * type: int32
    * desc: 注意单位: 手
    * required: 
    */
    @JsonProperty("成交量")
    
    
    private String p_cheng2jiao1liang4;

    public String getP_cheng2jiao1liang4() { return this.p_cheng2jiao1liang4;}
    public void setP_cheng2jiao1liang4(String v) { this.p_cheng2jiao1liang4 = v;}

    /**
    * name: 成交额
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("成交额")
    
    
    private Double p_cheng2jiao1e2;

    public Double getP_cheng2jiao1e2() { return this.p_cheng2jiao1e2;}
    public void setP_cheng2jiao1e2(Double v) { this.p_cheng2jiao1e2 = v;}

    /**
    * name: 振幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("振幅")
    
    
    private Double p_zhen4fu2;

    public Double getP_zhen4fu2() { return this.p_zhen4fu2;}
    public void setP_zhen4fu2(Double v) { this.p_zhen4fu2 = v;}

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
    * name: 涨跌额
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("涨跌额")
    
    
    private Double p_zhang3die1e2;

    public Double getP_zhang3die1e2() { return this.p_zhang3die1e2;}
    public void setP_zhang3die1e2(Double v) { this.p_zhang3die1e2 = v;}

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


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
