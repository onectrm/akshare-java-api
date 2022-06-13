
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
    * 接口: stock_dzjy_mrtj
    * 目标地址: http://data.eastmoney.com/dzjy/dzjy_mrtj.aspx
    * 描述: 东方财富网-数据中心-大宗交易-每日统计
    * 限量: 单次返回所有历史数据
    */
    public class stock_dzjy_mrtjResponse extends AkShareRequestAndResponse {
    public stock_dzjy_mrtjResponse(){
    setInterfaceName("stock_dzjy_mrtj");
    }

    public static stock_dzjy_mrtjResponse of(


    Integer p_xu4hao4,

    LocalDate p_jiao1yi4ri4qi1,

    String p_zheng4quan4dai4ma3,

    String p_zheng4quan4jian3cheng1,

    Double p_zhang3die1fu2,

    Double p_shou1pan2jia4,

    Double p_cheng2jiao1jun1jia4,

    Double p_zhe2yi4lu4,

    Integer p_cheng2jiao1bi3shu4,

    Double p_cheng2jiao1zong3liang4,

    Double p_cheng2jiao1zong3e2,

    Double p_cheng2jiao1zong3e2liu2tong1shi4zhi2,


    Map.Entry
    <String
    , String>... others){
    stock_dzjy_mrtjResponse t = new stock_dzjy_mrtjResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_jiao1yi4ri4qi1 = p_jiao1yi4ri4qi1;

    t.p_zheng4quan4dai4ma3 = p_zheng4quan4dai4ma3;

    t.p_zheng4quan4jian3cheng1 = p_zheng4quan4jian3cheng1;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_shou1pan2jia4 = p_shou1pan2jia4;

    t.p_cheng2jiao1jun1jia4 = p_cheng2jiao1jun1jia4;

    t.p_zhe2yi4lu4 = p_zhe2yi4lu4;

    t.p_cheng2jiao1bi3shu4 = p_cheng2jiao1bi3shu4;

    t.p_cheng2jiao1zong3liang4 = p_cheng2jiao1zong3liang4;

    t.p_cheng2jiao1zong3e2 = p_cheng2jiao1zong3e2;

    t.p_cheng2jiao1zong3e2liu2tong1shi4zhi2 = p_cheng2jiao1zong3e2liu2tong1shi4zhi2;


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
    * name: 交易日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("交易日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_jiao1yi4ri4qi1;

    public LocalDate getP_jiao1yi4ri4qi1() { return this.p_jiao1yi4ri4qi1;}
    public void setP_jiao1yi4ri4qi1(LocalDate v) { this.p_jiao1yi4ri4qi1 = v;}

    /**
    * name: 证券代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("证券代码")
    
    
    private String p_zheng4quan4dai4ma3;

    public String getP_zheng4quan4dai4ma3() { return this.p_zheng4quan4dai4ma3;}
    public void setP_zheng4quan4dai4ma3(String v) { this.p_zheng4quan4dai4ma3 = v;}

    /**
    * name: 证券简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("证券简称")
    
    
    private String p_zheng4quan4jian3cheng1;

    public String getP_zheng4quan4jian3cheng1() { return this.p_zheng4quan4jian3cheng1;}
    public void setP_zheng4quan4jian3cheng1(String v) { this.p_zheng4quan4jian3cheng1 = v;}

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
    * name: 成交均价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("成交均价")
    
    
    private Double p_cheng2jiao1jun1jia4;

    public Double getP_cheng2jiao1jun1jia4() { return this.p_cheng2jiao1jun1jia4;}
    public void setP_cheng2jiao1jun1jia4(Double v) { this.p_cheng2jiao1jun1jia4 = v;}

    /**
    * name: 折溢率
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("折溢率")
    
    
    private Double p_zhe2yi4lu4;

    public Double getP_zhe2yi4lu4() { return this.p_zhe2yi4lu4;}
    public void setP_zhe2yi4lu4(Double v) { this.p_zhe2yi4lu4 = v;}

    /**
    * name: 成交笔数
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("成交笔数")
    
    
    private Integer p_cheng2jiao1bi3shu4;

    public Integer getP_cheng2jiao1bi3shu4() { return this.p_cheng2jiao1bi3shu4;}
    public void setP_cheng2jiao1bi3shu4(Integer v) { this.p_cheng2jiao1bi3shu4 = v;}

    /**
    * name: 成交总量
    * type: float64
    * desc: 注意单位: 万股
    * required: 
    */
    @JsonProperty("成交总量")
    
    
    private Double p_cheng2jiao1zong3liang4;

    public Double getP_cheng2jiao1zong3liang4() { return this.p_cheng2jiao1zong3liang4;}
    public void setP_cheng2jiao1zong3liang4(Double v) { this.p_cheng2jiao1zong3liang4 = v;}

    /**
    * name: 成交总额
    * type: float64
    * desc: 注意单位: 万元
    * required: 
    */
    @JsonProperty("成交总额")
    
    
    private Double p_cheng2jiao1zong3e2;

    public Double getP_cheng2jiao1zong3e2() { return this.p_cheng2jiao1zong3e2;}
    public void setP_cheng2jiao1zong3e2(Double v) { this.p_cheng2jiao1zong3e2 = v;}

    /**
    * name: 成交总额/流通市值
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("成交总额/流通市值")
    
    
    private Double p_cheng2jiao1zong3e2liu2tong1shi4zhi2;

    public Double getP_cheng2jiao1zong3e2liu2tong1shi4zhi2() { return this.p_cheng2jiao1zong3e2liu2tong1shi4zhi2;}
    public void setP_cheng2jiao1zong3e2liu2tong1shi4zhi2(Double v) { this.p_cheng2jiao1zong3e2liu2tong1shi4zhi2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
