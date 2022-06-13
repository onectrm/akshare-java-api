
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
    * 接口: stock_yzxdr_em
    * 目标地址: http://data.eastmoney.com/yzxdr/
    * 描述: 东方财富网-数据中心-特色数据-一致行动人
    * 限量: 单次返回所有历史数据
    */
    public class stock_yzxdr_emResponse extends AkShareRequestAndResponse {
    public stock_yzxdr_emResponse(){
    setInterfaceName("stock_yzxdr_em");
    }

    public static stock_yzxdr_emResponse of(


    String p_xu4hao4,

    String p_gu3piao4dai4ma3,

    String p_gu3piao4jian3cheng1,

    String p_yi1zhi4xing2dong4ren2,

    String p_gu3dong1pai2ming2,

    Integer p_chi2gu3shu4liang4,

    Double p_chi2gu3bi3li4,

    String p_chi2gu3shu4liang4bian4dong4,

    String p_xing2ye4,

    LocalDate p_gong1gao4ri4qi1,


    Map.Entry
    <String
    , String>... others){
    stock_yzxdr_emResponse t = new stock_yzxdr_emResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_gu3piao4dai4ma3 = p_gu3piao4dai4ma3;

    t.p_gu3piao4jian3cheng1 = p_gu3piao4jian3cheng1;

    t.p_yi1zhi4xing2dong4ren2 = p_yi1zhi4xing2dong4ren2;

    t.p_gu3dong1pai2ming2 = p_gu3dong1pai2ming2;

    t.p_chi2gu3shu4liang4 = p_chi2gu3shu4liang4;

    t.p_chi2gu3bi3li4 = p_chi2gu3bi3li4;

    t.p_chi2gu3shu4liang4bian4dong4 = p_chi2gu3shu4liang4bian4dong4;

    t.p_xing2ye4 = p_xing2ye4;

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
    * type: int32
    * desc: 
    * required: 
    */
    @JsonProperty("序号")
    
    
    private String p_xu4hao4;

    public String getP_xu4hao4() { return this.p_xu4hao4;}
    public void setP_xu4hao4(String v) { this.p_xu4hao4 = v;}

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
    * name: 一致行动人
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("一致行动人")
    
    
    private String p_yi1zhi4xing2dong4ren2;

    public String getP_yi1zhi4xing2dong4ren2() { return this.p_yi1zhi4xing2dong4ren2;}
    public void setP_yi1zhi4xing2dong4ren2(String v) { this.p_yi1zhi4xing2dong4ren2 = v;}

    /**
    * name: 股东排名
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股东排名")
    
    
    private String p_gu3dong1pai2ming2;

    public String getP_gu3dong1pai2ming2() { return this.p_gu3dong1pai2ming2;}
    public void setP_gu3dong1pai2ming2(String v) { this.p_gu3dong1pai2ming2 = v;}

    /**
    * name: 持股数量
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("持股数量")
    
    
    private Integer p_chi2gu3shu4liang4;

    public Integer getP_chi2gu3shu4liang4() { return this.p_chi2gu3shu4liang4;}
    public void setP_chi2gu3shu4liang4(Integer v) { this.p_chi2gu3shu4liang4 = v;}

    /**
    * name: 持股比例
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("持股比例")
    
    
    private Double p_chi2gu3bi3li4;

    public Double getP_chi2gu3bi3li4() { return this.p_chi2gu3bi3li4;}
    public void setP_chi2gu3bi3li4(Double v) { this.p_chi2gu3bi3li4 = v;}

    /**
    * name: 持股数量变动
    * type: object
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("持股数量变动")
    
    
    private String p_chi2gu3shu4liang4bian4dong4;

    public String getP_chi2gu3shu4liang4bian4dong4() { return this.p_chi2gu3shu4liang4bian4dong4;}
    public void setP_chi2gu3shu4liang4bian4dong4(String v) { this.p_chi2gu3shu4liang4bian4dong4 = v;}

    /**
    * name: 行业
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("行业")
    
    
    private String p_xing2ye4;

    public String getP_xing2ye4() { return this.p_xing2ye4;}
    public void setP_xing2ye4(String v) { this.p_xing2ye4 = v;}

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
