
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
    * 接口: stock_lh_yyb_capital
    * 目标地址: http://data.10jqka.com.cn/market/longhu/
    * 描述: 龙虎榜-营业部排行-资金实力最强
    * 限量: 单次返回所有历史数据
    */
    public class stock_lh_yyb_capitalResponse extends AkShareRequestAndResponse {
    public stock_lh_yyb_capitalResponse(){
    setInterfaceName("stock_lh_yyb_capital");
    }

    public static stock_lh_yyb_capitalResponse of(


    Integer p_xu4hao4,

    String p_ying2ye4bu4ming2cheng1,

    Integer p_jin1ri4zui4gao1cao1zuo4,

    String p_jin1ri4zui4gao1jin1e2,

    String p_jin1ri4zui4gao1mai3ru4jin1e2,

    String p_lei3ji4can1yu3jin1e2,

    String p_lei3ji4mai3ru4jin1e2,


    Map.Entry
    <String
    , String>... others){
    stock_lh_yyb_capitalResponse t = new stock_lh_yyb_capitalResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_ying2ye4bu4ming2cheng1 = p_ying2ye4bu4ming2cheng1;

    t.p_jin1ri4zui4gao1cao1zuo4 = p_jin1ri4zui4gao1cao1zuo4;

    t.p_jin1ri4zui4gao1jin1e2 = p_jin1ri4zui4gao1jin1e2;

    t.p_jin1ri4zui4gao1mai3ru4jin1e2 = p_jin1ri4zui4gao1mai3ru4jin1e2;

    t.p_lei3ji4can1yu3jin1e2 = p_lei3ji4can1yu3jin1e2;

    t.p_lei3ji4mai3ru4jin1e2 = p_lei3ji4mai3ru4jin1e2;


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
    * name: 今日最高操作
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("今日最高操作")
    
    
    private Integer p_jin1ri4zui4gao1cao1zuo4;

    public Integer getP_jin1ri4zui4gao1cao1zuo4() { return this.p_jin1ri4zui4gao1cao1zuo4;}
    public void setP_jin1ri4zui4gao1cao1zuo4(Integer v) { this.p_jin1ri4zui4gao1cao1zuo4 = v;}

    /**
    * name: 今日最高金额
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("今日最高金额")
    
    
    private String p_jin1ri4zui4gao1jin1e2;

    public String getP_jin1ri4zui4gao1jin1e2() { return this.p_jin1ri4zui4gao1jin1e2;}
    public void setP_jin1ri4zui4gao1jin1e2(String v) { this.p_jin1ri4zui4gao1jin1e2 = v;}

    /**
    * name: 今日最高买入金额
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("今日最高买入金额")
    
    
    private String p_jin1ri4zui4gao1mai3ru4jin1e2;

    public String getP_jin1ri4zui4gao1mai3ru4jin1e2() { return this.p_jin1ri4zui4gao1mai3ru4jin1e2;}
    public void setP_jin1ri4zui4gao1mai3ru4jin1e2(String v) { this.p_jin1ri4zui4gao1mai3ru4jin1e2 = v;}

    /**
    * name: 累计参与金额
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("累计参与金额")
    
    
    private String p_lei3ji4can1yu3jin1e2;

    public String getP_lei3ji4can1yu3jin1e2() { return this.p_lei3ji4can1yu3jin1e2;}
    public void setP_lei3ji4can1yu3jin1e2(String v) { this.p_lei3ji4can1yu3jin1e2 = v;}

    /**
    * name: 累计买入金额
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("累计买入金额")
    
    
    private String p_lei3ji4mai3ru4jin1e2;

    public String getP_lei3ji4mai3ru4jin1e2() { return this.p_lei3ji4mai3ru4jin1e2;}
    public void setP_lei3ji4mai3ru4jin1e2(String v) { this.p_lei3ji4mai3ru4jin1e2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
