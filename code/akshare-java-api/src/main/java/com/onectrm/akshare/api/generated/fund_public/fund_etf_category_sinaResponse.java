
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
    * 接口: fund_etf_category_sina
    * 目标地址: http://vip.stock.finance.sina.com.cn/fund_center/index.html#jjhqetf
    * 描述: 新浪财经-基金列表及行情数据
    * 限量: 单次返回指定 symbol 基金的所有数据
    */
    public class fund_etf_category_sinaResponse extends AkShareRequestAndResponse {
    public fund_etf_category_sinaResponse(){
    setInterfaceName("fund_etf_category_sina");
    }

    public static fund_etf_category_sinaResponse of(


    String p_dai4ma3,

    String p_ming2cheng1,

    Double p_zui4xin1jia4,

    Double p_zhang3die1e2,

    Double p_zhang3die1fu2,

    Double p_mai3ru4,

    Double p_mai4chu1,

    Double p_zuo2shou1,

    Double p_jin1kai1,

    Double p_zui4gao1,

    Double p_zui4di1,

    Integer p_cheng2jiao1liang4,

    Integer p_cheng2jiao1e2,


    Map.Entry
    <String
    , String>... others){
    fund_etf_category_sinaResponse t = new fund_etf_category_sinaResponse();


    t.p_dai4ma3 = p_dai4ma3;

    t.p_ming2cheng1 = p_ming2cheng1;

    t.p_zui4xin1jia4 = p_zui4xin1jia4;

    t.p_zhang3die1e2 = p_zhang3die1e2;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_mai3ru4 = p_mai3ru4;

    t.p_mai4chu1 = p_mai4chu1;

    t.p_zuo2shou1 = p_zuo2shou1;

    t.p_jin1kai1 = p_jin1kai1;

    t.p_zui4gao1 = p_zui4gao1;

    t.p_zui4di1 = p_zui4di1;

    t.p_cheng2jiao1liang4 = p_cheng2jiao1liang4;

    t.p_cheng2jiao1e2 = p_cheng2jiao1e2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("代码")
    
    
    private String p_dai4ma3;

    public String getP_dai4ma3() { return this.p_dai4ma3;}
    public void setP_dai4ma3(String v) { this.p_dai4ma3 = v;}

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
    * name: 买入
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("买入")
    
    
    private Double p_mai3ru4;

    public Double getP_mai3ru4() { return this.p_mai3ru4;}
    public void setP_mai3ru4(Double v) { this.p_mai3ru4 = v;}

    /**
    * name: 卖出
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("卖出")
    
    
    private Double p_mai4chu1;

    public Double getP_mai4chu1() { return this.p_mai4chu1;}
    public void setP_mai4chu1(Double v) { this.p_mai4chu1 = v;}

    /**
    * name: 昨收
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("昨收")
    
    
    private Double p_zuo2shou1;

    public Double getP_zuo2shou1() { return this.p_zuo2shou1;}
    public void setP_zuo2shou1(Double v) { this.p_zuo2shou1 = v;}

    /**
    * name: 今开
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("今开")
    
    
    private Double p_jin1kai1;

    public Double getP_jin1kai1() { return this.p_jin1kai1;}
    public void setP_jin1kai1(Double v) { this.p_jin1kai1 = v;}

    /**
    * name: 最高
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("最高")
    
    
    private Double p_zui4gao1;

    public Double getP_zui4gao1() { return this.p_zui4gao1;}
    public void setP_zui4gao1(Double v) { this.p_zui4gao1 = v;}

    /**
    * name: 最低
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("最低")
    
    
    private Double p_zui4di1;

    public Double getP_zui4di1() { return this.p_zui4di1;}
    public void setP_zui4di1(Double v) { this.p_zui4di1 = v;}

    /**
    * name: 成交量
    * type: int64
    * desc: 注意单位: 股
    * required: 
    */
    @JsonProperty("成交量")
    
    
    private Integer p_cheng2jiao1liang4;

    public Integer getP_cheng2jiao1liang4() { return this.p_cheng2jiao1liang4;}
    public void setP_cheng2jiao1liang4(Integer v) { this.p_cheng2jiao1liang4 = v;}

    /**
    * name: 成交额
    * type: int64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("成交额")
    
    
    private Integer p_cheng2jiao1e2;

    public Integer getP_cheng2jiao1e2() { return this.p_cheng2jiao1e2;}
    public void setP_cheng2jiao1e2(Integer v) { this.p_cheng2jiao1e2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
