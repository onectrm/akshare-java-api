
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
    * 接口: stock_dzjy_yybph
    * 目标地址: http://data.eastmoney.com/dzjy/dzjy_yybph.aspx
    * 描述: 东方财富网-数据中心-大宗交易-营业部排行
    * 限量: 单次返回所有历史数据
    */
    public class stock_dzjy_yybphResponse extends AkShareRequestAndResponse {
    public stock_dzjy_yybphResponse(){
    setInterfaceName("stock_dzjy_yybph");
    }

    public static stock_dzjy_yybphResponse of(


    Integer p_xu4hao4,

    String p_ying2ye4bu4ming2cheng1,

    Double p_shang4bang3hou41tian1mai3ru4ci4shu4,

    Double p_shang4bang3hou41tian1ping2jun1zhang3fu2,

    Double p_shang4bang3hou41tian1shang4zhang3gai4lu4,

    Double p_shang4bang3hou45tian1mai3ru4ci4shu4,

    Double p_shang4bang3hou45tian1ping2jun1zhang3fu2,

    Double p_shang4bang3hou45tian1shang4zhang3gai4lu4,

    Double p_shang4bang3hou410tian1mai3ru4ci4shu4,

    Double p_shang4bang3hou410tian1ping2jun1zhang3fu2,

    Double p_shang4bang3hou410tian1shang4zhang3gai4lu4,

    Double p_shang4bang3hou420tian1mai3ru4ci4shu4,

    Double p_shang4bang3hou420tian1ping2jun1zhang3fu2,

    Double p_shang4bang3hou420tian1shang4zhang3gai4lu4,


    Map.Entry
    <String
    , String>... others){
    stock_dzjy_yybphResponse t = new stock_dzjy_yybphResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_ying2ye4bu4ming2cheng1 = p_ying2ye4bu4ming2cheng1;

    t.p_shang4bang3hou41tian1mai3ru4ci4shu4 = p_shang4bang3hou41tian1mai3ru4ci4shu4;

    t.p_shang4bang3hou41tian1ping2jun1zhang3fu2 = p_shang4bang3hou41tian1ping2jun1zhang3fu2;

    t.p_shang4bang3hou41tian1shang4zhang3gai4lu4 = p_shang4bang3hou41tian1shang4zhang3gai4lu4;

    t.p_shang4bang3hou45tian1mai3ru4ci4shu4 = p_shang4bang3hou45tian1mai3ru4ci4shu4;

    t.p_shang4bang3hou45tian1ping2jun1zhang3fu2 = p_shang4bang3hou45tian1ping2jun1zhang3fu2;

    t.p_shang4bang3hou45tian1shang4zhang3gai4lu4 = p_shang4bang3hou45tian1shang4zhang3gai4lu4;

    t.p_shang4bang3hou410tian1mai3ru4ci4shu4 = p_shang4bang3hou410tian1mai3ru4ci4shu4;

    t.p_shang4bang3hou410tian1ping2jun1zhang3fu2 = p_shang4bang3hou410tian1ping2jun1zhang3fu2;

    t.p_shang4bang3hou410tian1shang4zhang3gai4lu4 = p_shang4bang3hou410tian1shang4zhang3gai4lu4;

    t.p_shang4bang3hou420tian1mai3ru4ci4shu4 = p_shang4bang3hou420tian1mai3ru4ci4shu4;

    t.p_shang4bang3hou420tian1ping2jun1zhang3fu2 = p_shang4bang3hou420tian1ping2jun1zhang3fu2;

    t.p_shang4bang3hou420tian1shang4zhang3gai4lu4 = p_shang4bang3hou420tian1shang4zhang3gai4lu4;


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
    * name: 上榜后1天-买入次数
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("上榜后1天-买入次数")
    
    
    private Double p_shang4bang3hou41tian1mai3ru4ci4shu4;

    public Double getP_shang4bang3hou41tian1mai3ru4ci4shu4() { return this.p_shang4bang3hou41tian1mai3ru4ci4shu4;}
    public void setP_shang4bang3hou41tian1mai3ru4ci4shu4(Double v) { this.p_shang4bang3hou41tian1mai3ru4ci4shu4 = v;}

    /**
    * name: 上榜后1天-平均涨幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("上榜后1天-平均涨幅")
    
    
    private Double p_shang4bang3hou41tian1ping2jun1zhang3fu2;

    public Double getP_shang4bang3hou41tian1ping2jun1zhang3fu2() { return this.p_shang4bang3hou41tian1ping2jun1zhang3fu2;}
    public void setP_shang4bang3hou41tian1ping2jun1zhang3fu2(Double v) { this.p_shang4bang3hou41tian1ping2jun1zhang3fu2 = v;}

    /**
    * name: 上榜后1天-上涨概率
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("上榜后1天-上涨概率")
    
    
    private Double p_shang4bang3hou41tian1shang4zhang3gai4lu4;

    public Double getP_shang4bang3hou41tian1shang4zhang3gai4lu4() { return this.p_shang4bang3hou41tian1shang4zhang3gai4lu4;}
    public void setP_shang4bang3hou41tian1shang4zhang3gai4lu4(Double v) { this.p_shang4bang3hou41tian1shang4zhang3gai4lu4 = v;}

    /**
    * name: 上榜后5天-买入次数
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("上榜后5天-买入次数")
    
    
    private Double p_shang4bang3hou45tian1mai3ru4ci4shu4;

    public Double getP_shang4bang3hou45tian1mai3ru4ci4shu4() { return this.p_shang4bang3hou45tian1mai3ru4ci4shu4;}
    public void setP_shang4bang3hou45tian1mai3ru4ci4shu4(Double v) { this.p_shang4bang3hou45tian1mai3ru4ci4shu4 = v;}

    /**
    * name: 上榜后5天-平均涨幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("上榜后5天-平均涨幅")
    
    
    private Double p_shang4bang3hou45tian1ping2jun1zhang3fu2;

    public Double getP_shang4bang3hou45tian1ping2jun1zhang3fu2() { return this.p_shang4bang3hou45tian1ping2jun1zhang3fu2;}
    public void setP_shang4bang3hou45tian1ping2jun1zhang3fu2(Double v) { this.p_shang4bang3hou45tian1ping2jun1zhang3fu2 = v;}

    /**
    * name: 上榜后5天-上涨概率
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("上榜后5天-上涨概率")
    
    
    private Double p_shang4bang3hou45tian1shang4zhang3gai4lu4;

    public Double getP_shang4bang3hou45tian1shang4zhang3gai4lu4() { return this.p_shang4bang3hou45tian1shang4zhang3gai4lu4;}
    public void setP_shang4bang3hou45tian1shang4zhang3gai4lu4(Double v) { this.p_shang4bang3hou45tian1shang4zhang3gai4lu4 = v;}

    /**
    * name: 上榜后10天-买入次数
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("上榜后10天-买入次数")
    
    
    private Double p_shang4bang3hou410tian1mai3ru4ci4shu4;

    public Double getP_shang4bang3hou410tian1mai3ru4ci4shu4() { return this.p_shang4bang3hou410tian1mai3ru4ci4shu4;}
    public void setP_shang4bang3hou410tian1mai3ru4ci4shu4(Double v) { this.p_shang4bang3hou410tian1mai3ru4ci4shu4 = v;}

    /**
    * name: 上榜后10天-平均涨幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("上榜后10天-平均涨幅")
    
    
    private Double p_shang4bang3hou410tian1ping2jun1zhang3fu2;

    public Double getP_shang4bang3hou410tian1ping2jun1zhang3fu2() { return this.p_shang4bang3hou410tian1ping2jun1zhang3fu2;}
    public void setP_shang4bang3hou410tian1ping2jun1zhang3fu2(Double v) { this.p_shang4bang3hou410tian1ping2jun1zhang3fu2 = v;}

    /**
    * name: 上榜后10天-上涨概率
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("上榜后10天-上涨概率")
    
    
    private Double p_shang4bang3hou410tian1shang4zhang3gai4lu4;

    public Double getP_shang4bang3hou410tian1shang4zhang3gai4lu4() { return this.p_shang4bang3hou410tian1shang4zhang3gai4lu4;}
    public void setP_shang4bang3hou410tian1shang4zhang3gai4lu4(Double v) { this.p_shang4bang3hou410tian1shang4zhang3gai4lu4 = v;}

    /**
    * name: 上榜后20天-买入次数
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("上榜后20天-买入次数")
    
    
    private Double p_shang4bang3hou420tian1mai3ru4ci4shu4;

    public Double getP_shang4bang3hou420tian1mai3ru4ci4shu4() { return this.p_shang4bang3hou420tian1mai3ru4ci4shu4;}
    public void setP_shang4bang3hou420tian1mai3ru4ci4shu4(Double v) { this.p_shang4bang3hou420tian1mai3ru4ci4shu4 = v;}

    /**
    * name: 上榜后20天-平均涨幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("上榜后20天-平均涨幅")
    
    
    private Double p_shang4bang3hou420tian1ping2jun1zhang3fu2;

    public Double getP_shang4bang3hou420tian1ping2jun1zhang3fu2() { return this.p_shang4bang3hou420tian1ping2jun1zhang3fu2;}
    public void setP_shang4bang3hou420tian1ping2jun1zhang3fu2(Double v) { this.p_shang4bang3hou420tian1ping2jun1zhang3fu2 = v;}

    /**
    * name: 上榜后20天-上涨概率
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("上榜后20天-上涨概率")
    
    
    private Double p_shang4bang3hou420tian1shang4zhang3gai4lu4;

    public Double getP_shang4bang3hou420tian1shang4zhang3gai4lu4() { return this.p_shang4bang3hou420tian1shang4zhang3gai4lu4;}
    public void setP_shang4bang3hou420tian1shang4zhang3gai4lu4(Double v) { this.p_shang4bang3hou420tian1shang4zhang3gai4lu4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
