
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
    * 接口: stock_sector_fund_flow_rank
    * 目标地址: http://data.eastmoney.com/bkzj/hy.html
    * 描述: 东方财富网-数据中心-资金流向-板块资金流-排名
    * 限量: 单次获取指定板块的指定期限的资金流排名数据
    */
    public class stock_sector_fund_flow_rankResponse extends AkShareRequestAndResponse {
    public stock_sector_fund_flow_rankResponse(){
    setInterfaceName("stock_sector_fund_flow_rank");
    }

    public static stock_sector_fund_flow_rankResponse of(


    String p_ming2cheng1,

    String p_jin1ri4zhang3die1fu2,

    Double p_zhu3li4jing4liu2ru4jing4e2,

    Double p_zhu3li4jing4liu2ru4jing4zhan4bi3,

    Double p_chao1da4dan1jing4liu2ru4jing4e2,

    Double p_chao1da4dan1jing4liu2ru4jing4zhan4bi3,

    Double p_da4dan1jing4liu2ru4jing4e2,

    Double p_da4dan1jing4liu2ru4jing4zhan4bi3,

    Double p_zhong1dan1jing4liu2ru4jing4e2,

    Double p_zhong1dan1jing4liu2ru4jing4zhan4bi3,

    Double p_xiao3dan1jing4liu2ru4jing4e2,

    Double p_xiao3dan1jing4liu2ru4jing4zhan4bi3,

    Double p_zhu3li4jing4liu2ru4zui4da4gu3,


    Map.Entry
    <String
    , String>... others){
    stock_sector_fund_flow_rankResponse t = new stock_sector_fund_flow_rankResponse();


    t.p_ming2cheng1 = p_ming2cheng1;

    t.p_jin1ri4zhang3die1fu2 = p_jin1ri4zhang3die1fu2;

    t.p_zhu3li4jing4liu2ru4jing4e2 = p_zhu3li4jing4liu2ru4jing4e2;

    t.p_zhu3li4jing4liu2ru4jing4zhan4bi3 = p_zhu3li4jing4liu2ru4jing4zhan4bi3;

    t.p_chao1da4dan1jing4liu2ru4jing4e2 = p_chao1da4dan1jing4liu2ru4jing4e2;

    t.p_chao1da4dan1jing4liu2ru4jing4zhan4bi3 = p_chao1da4dan1jing4liu2ru4jing4zhan4bi3;

    t.p_da4dan1jing4liu2ru4jing4e2 = p_da4dan1jing4liu2ru4jing4e2;

    t.p_da4dan1jing4liu2ru4jing4zhan4bi3 = p_da4dan1jing4liu2ru4jing4zhan4bi3;

    t.p_zhong1dan1jing4liu2ru4jing4e2 = p_zhong1dan1jing4liu2ru4jing4e2;

    t.p_zhong1dan1jing4liu2ru4jing4zhan4bi3 = p_zhong1dan1jing4liu2ru4jing4zhan4bi3;

    t.p_xiao3dan1jing4liu2ru4jing4e2 = p_xiao3dan1jing4liu2ru4jing4e2;

    t.p_xiao3dan1jing4liu2ru4jing4zhan4bi3 = p_xiao3dan1jing4liu2ru4jing4zhan4bi3;

    t.p_zhu3li4jing4liu2ru4zui4da4gu3 = p_zhu3li4jing4liu2ru4zui4da4gu3;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 名称
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("名称")
    
    
    private String p_ming2cheng1;

    public String getP_ming2cheng1() { return this.p_ming2cheng1;}
    public void setP_ming2cheng1(String v) { this.p_ming2cheng1 = v;}

    /**
    * name: 今日涨跌幅
    * type: str
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("今日涨跌幅")
    
    
    private String p_jin1ri4zhang3die1fu2;

    public String getP_jin1ri4zhang3die1fu2() { return this.p_jin1ri4zhang3die1fu2;}
    public void setP_jin1ri4zhang3die1fu2(String v) { this.p_jin1ri4zhang3die1fu2 = v;}

    /**
    * name: 主力净流入-净额
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("主力净流入-净额")
    
    
    private Double p_zhu3li4jing4liu2ru4jing4e2;

    public Double getP_zhu3li4jing4liu2ru4jing4e2() { return this.p_zhu3li4jing4liu2ru4jing4e2;}
    public void setP_zhu3li4jing4liu2ru4jing4e2(Double v) { this.p_zhu3li4jing4liu2ru4jing4e2 = v;}

    /**
    * name: 主力净流入-净占比
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("主力净流入-净占比")
    
    
    private Double p_zhu3li4jing4liu2ru4jing4zhan4bi3;

    public Double getP_zhu3li4jing4liu2ru4jing4zhan4bi3() { return this.p_zhu3li4jing4liu2ru4jing4zhan4bi3;}
    public void setP_zhu3li4jing4liu2ru4jing4zhan4bi3(Double v) { this.p_zhu3li4jing4liu2ru4jing4zhan4bi3 = v;}

    /**
    * name: 超大单净流入-净额
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("超大单净流入-净额")
    
    
    private Double p_chao1da4dan1jing4liu2ru4jing4e2;

    public Double getP_chao1da4dan1jing4liu2ru4jing4e2() { return this.p_chao1da4dan1jing4liu2ru4jing4e2;}
    public void setP_chao1da4dan1jing4liu2ru4jing4e2(Double v) { this.p_chao1da4dan1jing4liu2ru4jing4e2 = v;}

    /**
    * name: 超大单净流入-净占比
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("超大单净流入-净占比")
    
    
    private Double p_chao1da4dan1jing4liu2ru4jing4zhan4bi3;

    public Double getP_chao1da4dan1jing4liu2ru4jing4zhan4bi3() { return this.p_chao1da4dan1jing4liu2ru4jing4zhan4bi3;}
    public void setP_chao1da4dan1jing4liu2ru4jing4zhan4bi3(Double v) { this.p_chao1da4dan1jing4liu2ru4jing4zhan4bi3 = v;}

    /**
    * name: 大单净流入-净额
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("大单净流入-净额")
    
    
    private Double p_da4dan1jing4liu2ru4jing4e2;

    public Double getP_da4dan1jing4liu2ru4jing4e2() { return this.p_da4dan1jing4liu2ru4jing4e2;}
    public void setP_da4dan1jing4liu2ru4jing4e2(Double v) { this.p_da4dan1jing4liu2ru4jing4e2 = v;}

    /**
    * name: 大单净流入-净占比
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("大单净流入-净占比")
    
    
    private Double p_da4dan1jing4liu2ru4jing4zhan4bi3;

    public Double getP_da4dan1jing4liu2ru4jing4zhan4bi3() { return this.p_da4dan1jing4liu2ru4jing4zhan4bi3;}
    public void setP_da4dan1jing4liu2ru4jing4zhan4bi3(Double v) { this.p_da4dan1jing4liu2ru4jing4zhan4bi3 = v;}

    /**
    * name: 中单净流入-净额
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("中单净流入-净额")
    
    
    private Double p_zhong1dan1jing4liu2ru4jing4e2;

    public Double getP_zhong1dan1jing4liu2ru4jing4e2() { return this.p_zhong1dan1jing4liu2ru4jing4e2;}
    public void setP_zhong1dan1jing4liu2ru4jing4e2(Double v) { this.p_zhong1dan1jing4liu2ru4jing4e2 = v;}

    /**
    * name: 中单净流入-净占比
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("中单净流入-净占比")
    
    
    private Double p_zhong1dan1jing4liu2ru4jing4zhan4bi3;

    public Double getP_zhong1dan1jing4liu2ru4jing4zhan4bi3() { return this.p_zhong1dan1jing4liu2ru4jing4zhan4bi3;}
    public void setP_zhong1dan1jing4liu2ru4jing4zhan4bi3(Double v) { this.p_zhong1dan1jing4liu2ru4jing4zhan4bi3 = v;}

    /**
    * name: 小单净流入-净额
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("小单净流入-净额")
    
    
    private Double p_xiao3dan1jing4liu2ru4jing4e2;

    public Double getP_xiao3dan1jing4liu2ru4jing4e2() { return this.p_xiao3dan1jing4liu2ru4jing4e2;}
    public void setP_xiao3dan1jing4liu2ru4jing4e2(Double v) { this.p_xiao3dan1jing4liu2ru4jing4e2 = v;}

    /**
    * name: 小单净流入-净占比
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("小单净流入-净占比")
    
    
    private Double p_xiao3dan1jing4liu2ru4jing4zhan4bi3;

    public Double getP_xiao3dan1jing4liu2ru4jing4zhan4bi3() { return this.p_xiao3dan1jing4liu2ru4jing4zhan4bi3;}
    public void setP_xiao3dan1jing4liu2ru4jing4zhan4bi3(Double v) { this.p_xiao3dan1jing4liu2ru4jing4zhan4bi3 = v;}

    /**
    * name: 主力净流入最大股
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("主力净流入最大股")
    
    
    private Double p_zhu3li4jing4liu2ru4zui4da4gu3;

    public Double getP_zhu3li4jing4liu2ru4zui4da4gu3() { return this.p_zhu3li4jing4liu2ru4zui4da4gu3;}
    public void setP_zhu3li4jing4liu2ru4zui4da4gu3(Double v) { this.p_zhu3li4jing4liu2ru4zui4da4gu3 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
