
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
    * 接口: stock_lrb_em
    * 目标地址: http://data.eastmoney.com/bbsj/202003/lrb.html
    * 描述: 东方财富-数据中心-年报季报-业绩快报-利润表
    * 限量: 单次获取指定 date 的利润表数据
    */
    public class stock_lrb_emResponse extends AkShareRequestAndResponse {
    public stock_lrb_emResponse(){
    setInterfaceName("stock_lrb_em");
    }

    public static stock_lrb_emResponse of(


    Integer p_xu4hao4,

    String p_gu3piao4dai4ma3,

    String p_gu3piao4jian3cheng1,

    Double p_jing4li4run4,

    Double p_jing4li4run4tong2bi3,

    Double p_ying2ye4zong3shou1ru4,

    Double p_ying2ye4zong3shou1ru4tong2bi3,

    Double p_ying2ye4zong3zhi1chu1ying2ye4zhi1chu1,

    Double p_ying2ye4zong3zhi1chu1xiao1shou4fei4yong4,

    Double p_ying2ye4zong3zhi1chu1guan3li3fei4yong4,

    Double p_ying2ye4zong3zhi1chu1cai2wu4fei4yong4,

    Double p_ying2ye4zong3zhi1chu1ying2ye4zong3zhi1chu1,

    Double p_ying2ye4li4run4,

    Double p_li4run4zong3e2,

    LocalDate p_gong1gao4ri4qi1,


    Map.Entry
    <String
    , String>... others){
    stock_lrb_emResponse t = new stock_lrb_emResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_gu3piao4dai4ma3 = p_gu3piao4dai4ma3;

    t.p_gu3piao4jian3cheng1 = p_gu3piao4jian3cheng1;

    t.p_jing4li4run4 = p_jing4li4run4;

    t.p_jing4li4run4tong2bi3 = p_jing4li4run4tong2bi3;

    t.p_ying2ye4zong3shou1ru4 = p_ying2ye4zong3shou1ru4;

    t.p_ying2ye4zong3shou1ru4tong2bi3 = p_ying2ye4zong3shou1ru4tong2bi3;

    t.p_ying2ye4zong3zhi1chu1ying2ye4zhi1chu1 = p_ying2ye4zong3zhi1chu1ying2ye4zhi1chu1;

    t.p_ying2ye4zong3zhi1chu1xiao1shou4fei4yong4 = p_ying2ye4zong3zhi1chu1xiao1shou4fei4yong4;

    t.p_ying2ye4zong3zhi1chu1guan3li3fei4yong4 = p_ying2ye4zong3zhi1chu1guan3li3fei4yong4;

    t.p_ying2ye4zong3zhi1chu1cai2wu4fei4yong4 = p_ying2ye4zong3zhi1chu1cai2wu4fei4yong4;

    t.p_ying2ye4zong3zhi1chu1ying2ye4zong3zhi1chu1 = p_ying2ye4zong3zhi1chu1ying2ye4zong3zhi1chu1;

    t.p_ying2ye4li4run4 = p_ying2ye4li4run4;

    t.p_li4run4zong3e2 = p_li4run4zong3e2;

    t.p_gong1gao4ri4qi1 = p_gong1gao4ri4qi1;


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
    * name: 股票简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股票简称")
    
    
    private String p_gu3piao4jian3cheng1;

    public String getP_gu3piao4jian3cheng1() { return this.p_gu3piao4jian3cheng1;}
    public void setP_gu3piao4jian3cheng1(String v) { this.p_gu3piao4jian3cheng1 = v;}

    /**
    * name: 净利润
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("净利润")
    
    
    private Double p_jing4li4run4;

    public Double getP_jing4li4run4() { return this.p_jing4li4run4;}
    public void setP_jing4li4run4(Double v) { this.p_jing4li4run4 = v;}

    /**
    * name: 净利润同比
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("净利润同比")
    
    
    private Double p_jing4li4run4tong2bi3;

    public Double getP_jing4li4run4tong2bi3() { return this.p_jing4li4run4tong2bi3;}
    public void setP_jing4li4run4tong2bi3(Double v) { this.p_jing4li4run4tong2bi3 = v;}

    /**
    * name: 营业总收入
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("营业总收入")
    
    
    private Double p_ying2ye4zong3shou1ru4;

    public Double getP_ying2ye4zong3shou1ru4() { return this.p_ying2ye4zong3shou1ru4;}
    public void setP_ying2ye4zong3shou1ru4(Double v) { this.p_ying2ye4zong3shou1ru4 = v;}

    /**
    * name: 营业总收入同比
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("营业总收入同比")
    
    
    private Double p_ying2ye4zong3shou1ru4tong2bi3;

    public Double getP_ying2ye4zong3shou1ru4tong2bi3() { return this.p_ying2ye4zong3shou1ru4tong2bi3;}
    public void setP_ying2ye4zong3shou1ru4tong2bi3(Double v) { this.p_ying2ye4zong3shou1ru4tong2bi3 = v;}

    /**
    * name: 营业总支出-营业支出
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("营业总支出-营业支出")
    
    
    private Double p_ying2ye4zong3zhi1chu1ying2ye4zhi1chu1;

    public Double getP_ying2ye4zong3zhi1chu1ying2ye4zhi1chu1() { return this.p_ying2ye4zong3zhi1chu1ying2ye4zhi1chu1;}
    public void setP_ying2ye4zong3zhi1chu1ying2ye4zhi1chu1(Double v) { this.p_ying2ye4zong3zhi1chu1ying2ye4zhi1chu1 = v;}

    /**
    * name: 营业总支出-销售费用
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("营业总支出-销售费用")
    
    
    private Double p_ying2ye4zong3zhi1chu1xiao1shou4fei4yong4;

    public Double getP_ying2ye4zong3zhi1chu1xiao1shou4fei4yong4() { return this.p_ying2ye4zong3zhi1chu1xiao1shou4fei4yong4;}
    public void setP_ying2ye4zong3zhi1chu1xiao1shou4fei4yong4(Double v) { this.p_ying2ye4zong3zhi1chu1xiao1shou4fei4yong4 = v;}

    /**
    * name: 营业总支出-管理费用
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("营业总支出-管理费用")
    
    
    private Double p_ying2ye4zong3zhi1chu1guan3li3fei4yong4;

    public Double getP_ying2ye4zong3zhi1chu1guan3li3fei4yong4() { return this.p_ying2ye4zong3zhi1chu1guan3li3fei4yong4;}
    public void setP_ying2ye4zong3zhi1chu1guan3li3fei4yong4(Double v) { this.p_ying2ye4zong3zhi1chu1guan3li3fei4yong4 = v;}

    /**
    * name: 营业总支出-财务费用
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("营业总支出-财务费用")
    
    
    private Double p_ying2ye4zong3zhi1chu1cai2wu4fei4yong4;

    public Double getP_ying2ye4zong3zhi1chu1cai2wu4fei4yong4() { return this.p_ying2ye4zong3zhi1chu1cai2wu4fei4yong4;}
    public void setP_ying2ye4zong3zhi1chu1cai2wu4fei4yong4(Double v) { this.p_ying2ye4zong3zhi1chu1cai2wu4fei4yong4 = v;}

    /**
    * name: 营业总支出-营业总支出
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("营业总支出-营业总支出")
    
    
    private Double p_ying2ye4zong3zhi1chu1ying2ye4zong3zhi1chu1;

    public Double getP_ying2ye4zong3zhi1chu1ying2ye4zong3zhi1chu1() { return this.p_ying2ye4zong3zhi1chu1ying2ye4zong3zhi1chu1;}
    public void setP_ying2ye4zong3zhi1chu1ying2ye4zong3zhi1chu1(Double v) { this.p_ying2ye4zong3zhi1chu1ying2ye4zong3zhi1chu1 = v;}

    /**
    * name: 营业利润
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("营业利润")
    
    
    private Double p_ying2ye4li4run4;

    public Double getP_ying2ye4li4run4() { return this.p_ying2ye4li4run4;}
    public void setP_ying2ye4li4run4(Double v) { this.p_ying2ye4li4run4 = v;}

    /**
    * name: 利润总额
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("利润总额")
    
    
    private Double p_li4run4zong3e2;

    public Double getP_li4run4zong3e2() { return this.p_li4run4zong3e2;}
    public void setP_li4run4zong3e2(Double v) { this.p_li4run4zong3e2 = v;}

    /**
    * name: 公告日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("公告日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_gong1gao4ri4qi1;

    public LocalDate getP_gong1gao4ri4qi1() { return this.p_gong1gao4ri4qi1;}
    public void setP_gong1gao4ri4qi1(LocalDate v) { this.p_gong1gao4ri4qi1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
