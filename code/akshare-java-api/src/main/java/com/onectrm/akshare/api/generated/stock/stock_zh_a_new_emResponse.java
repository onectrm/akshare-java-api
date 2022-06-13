
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
    * 接口: stock_zh_a_new_em
    * 目标地址: http://quote.eastmoney.com/center/gridlist.html#newshares
    * 描述: 东方财富网-行情中心-沪深个股-新股
    * 限量: 单次返回当前交易日新股板块的所有股票的行情数据
    */
    public class stock_zh_a_new_emResponse extends AkShareRequestAndResponse {
    public stock_zh_a_new_emResponse(){
    setInterfaceName("stock_zh_a_new_em");
    }

    public static stock_zh_a_new_emResponse of(


    Integer p_xu4hao4,

    String p_dai4ma3,

    String p_ming2cheng1,

    Double p_zui4xin1jia4,

    Double p_zhang3die1fu2,

    Double p_zhang3die1e2,

    Double p_cheng2jiao1liang4,

    Double p_cheng2jiao1e2,

    Double p_zhen4fu2,

    Double p_zui4gao1,

    Double p_zui4di1,

    Double p_jin1kai1,

    Double p_zuo2shou1,

    Double p_liang4bi3,

    Double p_huan4shou3lu4,

    Double p_shi4ying2lu4dong4tai4,

    Double p_shi4jing4lu4,


    Map.Entry
    <String
    , String>... others){
    stock_zh_a_new_emResponse t = new stock_zh_a_new_emResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_dai4ma3 = p_dai4ma3;

    t.p_ming2cheng1 = p_ming2cheng1;

    t.p_zui4xin1jia4 = p_zui4xin1jia4;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_zhang3die1e2 = p_zhang3die1e2;

    t.p_cheng2jiao1liang4 = p_cheng2jiao1liang4;

    t.p_cheng2jiao1e2 = p_cheng2jiao1e2;

    t.p_zhen4fu2 = p_zhen4fu2;

    t.p_zui4gao1 = p_zui4gao1;

    t.p_zui4di1 = p_zui4di1;

    t.p_jin1kai1 = p_jin1kai1;

    t.p_zuo2shou1 = p_zuo2shou1;

    t.p_liang4bi3 = p_liang4bi3;

    t.p_huan4shou3lu4 = p_huan4shou3lu4;

    t.p_shi4ying2lu4dong4tai4 = p_shi4ying2lu4dong4tai4;

    t.p_shi4jing4lu4 = p_shi4jing4lu4;


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
    * desc: 
    * required: 
    */
    @JsonProperty("涨跌额")
    
    
    private Double p_zhang3die1e2;

    public Double getP_zhang3die1e2() { return this.p_zhang3die1e2;}
    public void setP_zhang3die1e2(Double v) { this.p_zhang3die1e2 = v;}

    /**
    * name: 成交量
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("成交量")
    
    
    private Double p_cheng2jiao1liang4;

    public Double getP_cheng2jiao1liang4() { return this.p_cheng2jiao1liang4;}
    public void setP_cheng2jiao1liang4(Double v) { this.p_cheng2jiao1liang4 = v;}

    /**
    * name: 成交额
    * type: float64
    * desc: 
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
    * name: 量比
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("量比")
    
    
    private Double p_liang4bi3;

    public Double getP_liang4bi3() { return this.p_liang4bi3;}
    public void setP_liang4bi3(Double v) { this.p_liang4bi3 = v;}

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
    * name: 市盈率-动态
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("市盈率-动态")
    
    
    private Double p_shi4ying2lu4dong4tai4;

    public Double getP_shi4ying2lu4dong4tai4() { return this.p_shi4ying2lu4dong4tai4;}
    public void setP_shi4ying2lu4dong4tai4(Double v) { this.p_shi4ying2lu4dong4tai4 = v;}

    /**
    * name: 市净率
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("市净率")
    
    
    private Double p_shi4jing4lu4;

    public Double getP_shi4jing4lu4() { return this.p_shi4jing4lu4;}
    public void setP_shi4jing4lu4(Double v) { this.p_shi4jing4lu4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
