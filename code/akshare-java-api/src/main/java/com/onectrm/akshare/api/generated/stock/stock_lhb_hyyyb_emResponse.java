
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
    * 接口: stock_lhb_hyyyb_em
    * 目标地址: https://data.eastmoney.com/stock/jgmmtj.html
    * 描述: 东方财富网-数据中心-龙虎榜单-每日活跃营业部
    * 限量: 单次返回所有历史数据
    */
    public class stock_lhb_hyyyb_emResponse extends AkShareRequestAndResponse {
    public stock_lhb_hyyyb_emResponse(){
    setInterfaceName("stock_lhb_hyyyb_em");
    }

    public static stock_lhb_hyyyb_emResponse of(


    Integer p_xu4hao4,

    String p_ying2ye4bu4ming2cheng1,

    String p_shang4bang3ri4,

    Double p_mai3ru4ge4gu3shu4,

    Double p_mai4chu1ge4gu3shu4,

    Double p_mai3ru4zong3jin1e2,

    Double p_mai4chu1zong3jin1e2,

    Double p_zong3mai3mai4jing4e2,

    String p_mai3ru4gu3piao4,


    Map.Entry
    <String
    , String>... others){
    stock_lhb_hyyyb_emResponse t = new stock_lhb_hyyyb_emResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_ying2ye4bu4ming2cheng1 = p_ying2ye4bu4ming2cheng1;

    t.p_shang4bang3ri4 = p_shang4bang3ri4;

    t.p_mai3ru4ge4gu3shu4 = p_mai3ru4ge4gu3shu4;

    t.p_mai4chu1ge4gu3shu4 = p_mai4chu1ge4gu3shu4;

    t.p_mai3ru4zong3jin1e2 = p_mai3ru4zong3jin1e2;

    t.p_mai4chu1zong3jin1e2 = p_mai4chu1zong3jin1e2;

    t.p_zong3mai3mai4jing4e2 = p_zong3mai3mai4jing4e2;

    t.p_mai3ru4gu3piao4 = p_mai3ru4gu3piao4;


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
    * name: 营业部名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("营业部名称")
    
    
    private String p_ying2ye4bu4ming2cheng1;

    public String getP_ying2ye4bu4ming2cheng1() { return this.p_ying2ye4bu4ming2cheng1;}
    public void setP_ying2ye4bu4ming2cheng1(String v) { this.p_ying2ye4bu4ming2cheng1 = v;}

    /**
    * name: 上榜日
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("上榜日")
    
    
    private String p_shang4bang3ri4;

    public String getP_shang4bang3ri4() { return this.p_shang4bang3ri4;}
    public void setP_shang4bang3ri4(String v) { this.p_shang4bang3ri4 = v;}

    /**
    * name: 买入个股数
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("买入个股数")
    
    
    private Double p_mai3ru4ge4gu3shu4;

    public Double getP_mai3ru4ge4gu3shu4() { return this.p_mai3ru4ge4gu3shu4;}
    public void setP_mai3ru4ge4gu3shu4(Double v) { this.p_mai3ru4ge4gu3shu4 = v;}

    /**
    * name: 卖出个股数
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("卖出个股数")
    
    
    private Double p_mai4chu1ge4gu3shu4;

    public Double getP_mai4chu1ge4gu3shu4() { return this.p_mai4chu1ge4gu3shu4;}
    public void setP_mai4chu1ge4gu3shu4(Double v) { this.p_mai4chu1ge4gu3shu4 = v;}

    /**
    * name: 买入总金额
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("买入总金额")
    
    
    private Double p_mai3ru4zong3jin1e2;

    public Double getP_mai3ru4zong3jin1e2() { return this.p_mai3ru4zong3jin1e2;}
    public void setP_mai3ru4zong3jin1e2(Double v) { this.p_mai3ru4zong3jin1e2 = v;}

    /**
    * name: 卖出总金额
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("卖出总金额")
    
    
    private Double p_mai4chu1zong3jin1e2;

    public Double getP_mai4chu1zong3jin1e2() { return this.p_mai4chu1zong3jin1e2;}
    public void setP_mai4chu1zong3jin1e2(Double v) { this.p_mai4chu1zong3jin1e2 = v;}

    /**
    * name: 总买卖净额
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("总买卖净额")
    
    
    private Double p_zong3mai3mai4jing4e2;

    public Double getP_zong3mai3mai4jing4e2() { return this.p_zong3mai3mai4jing4e2;}
    public void setP_zong3mai3mai4jing4e2(Double v) { this.p_zong3mai3mai4jing4e2 = v;}

    /**
    * name: 买入股票
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("买入股票")
    
    
    private String p_mai3ru4gu3piao4;

    public String getP_mai3ru4gu3piao4() { return this.p_mai3ru4gu3piao4;}
    public void setP_mai3ru4gu3piao4(String v) { this.p_mai3ru4gu3piao4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
