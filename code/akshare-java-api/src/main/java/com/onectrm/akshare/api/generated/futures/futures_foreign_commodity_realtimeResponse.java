
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: futures
    * 接口: futures_foreign_commodity_realtime
    * 目标地址: https://finance.sina.com.cn/money/future/hf.html
    * 描述: 新浪财经-外盘商品期货数据
    * 限量: 单次返回当前交易日的订阅的所有期货品种的数据
    */
    public class futures_foreign_commodity_realtimeResponse extends AkShareRequestAndResponse {
    public futures_foreign_commodity_realtimeResponse(){
    setInterfaceName("futures_foreign_commodity_realtime");
    }

    public static futures_foreign_commodity_realtimeResponse of(


    String p_ming2cheng1,

    Double p_zui4xin1jia4,

    Double p_ren2min2bi4bao4jia4,

    Double p_zhang3die1e2,

    Double p_zhang3die1fu2,

    Double p_kai1pan2jia4,

    Double p_zui4gao1jia4,

    Double p_zui4di1jia4,

    Double p_zuo2ri4jie2suan4jia4,

    Double p_chi2cang1liang4,

    Double p_mai3jia4,

    Double p_mai4jia4,

    LocalDateTime p_xing2qing2shi2jian1,

    LocalDate p_ri4qi1,


    Map.Entry
    <String
    , String>... others){
    futures_foreign_commodity_realtimeResponse t = new futures_foreign_commodity_realtimeResponse();


    t.p_ming2cheng1 = p_ming2cheng1;

    t.p_zui4xin1jia4 = p_zui4xin1jia4;

    t.p_ren2min2bi4bao4jia4 = p_ren2min2bi4bao4jia4;

    t.p_zhang3die1e2 = p_zhang3die1e2;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_kai1pan2jia4 = p_kai1pan2jia4;

    t.p_zui4gao1jia4 = p_zui4gao1jia4;

    t.p_zui4di1jia4 = p_zui4di1jia4;

    t.p_zuo2ri4jie2suan4jia4 = p_zuo2ri4jie2suan4jia4;

    t.p_chi2cang1liang4 = p_chi2cang1liang4;

    t.p_mai3jia4 = p_mai3jia4;

    t.p_mai4jia4 = p_mai4jia4;

    t.p_xing2qing2shi2jian1 = p_xing2qing2shi2jian1;

    t.p_ri4qi1 = p_ri4qi1;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



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
    * name: 人民币报价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("人民币报价")
    
    
    private Double p_ren2min2bi4bao4jia4;

    public Double getP_ren2min2bi4bao4jia4() { return this.p_ren2min2bi4bao4jia4;}
    public void setP_ren2min2bi4bao4jia4(Double v) { this.p_ren2min2bi4bao4jia4 = v;}

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
    * desc: 
    * required: 
    */
    @JsonProperty("涨跌幅")
    
    
    private Double p_zhang3die1fu2;

    public Double getP_zhang3die1fu2() { return this.p_zhang3die1fu2;}
    public void setP_zhang3die1fu2(Double v) { this.p_zhang3die1fu2 = v;}

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
    * name: 昨日结算价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("昨日结算价")
    
    
    private Double p_zuo2ri4jie2suan4jia4;

    public Double getP_zuo2ri4jie2suan4jia4() { return this.p_zuo2ri4jie2suan4jia4;}
    public void setP_zuo2ri4jie2suan4jia4(Double v) { this.p_zuo2ri4jie2suan4jia4 = v;}

    /**
    * name: 持仓量
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("持仓量")
    
    
    private Double p_chi2cang1liang4;

    public Double getP_chi2cang1liang4() { return this.p_chi2cang1liang4;}
    public void setP_chi2cang1liang4(Double v) { this.p_chi2cang1liang4 = v;}

    /**
    * name: 买价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("买价")
    
    
    private Double p_mai3jia4;

    public Double getP_mai3jia4() { return this.p_mai3jia4;}
    public void setP_mai3jia4(Double v) { this.p_mai3jia4 = v;}

    /**
    * name: 卖价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("卖价")
    
    
    private Double p_mai4jia4;

    public Double getP_mai4jia4() { return this.p_mai4jia4;}
    public void setP_mai4jia4(Double v) { this.p_mai4jia4 = v;}

    /**
    * name: 行情时间
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("行情时间")
    
    @JsonDeserialize(using =
        JacksonDateTimeDeserializer.class)
    
    private LocalDateTime p_xing2qing2shi2jian1;

    public LocalDateTime getP_xing2qing2shi2jian1() { return this.p_xing2qing2shi2jian1;}
    public void setP_xing2qing2shi2jian1(LocalDateTime v) { this.p_xing2qing2shi2jian1 = v;}

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


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
