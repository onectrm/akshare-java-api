
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
    * 接口: stock_industry_pe_ratio_cninfo
    * 目标地址: http://webapi.cninfo.com.cn/#/thematicStatistics
    * 描述: 巨潮资讯-数据中心-行业分析-行业市盈率
    * 限量: 单次获取指定行业在指定交易日的所有数据
    */
    public class stock_industry_pe_ratio_cninfoResponse extends AkShareRequestAndResponse {
    public stock_industry_pe_ratio_cninfoResponse(){
    setInterfaceName("stock_industry_pe_ratio_cninfo");
    }

    public static stock_industry_pe_ratio_cninfoResponse of(


    LocalDate p_bian4dong4ri4qi1,

    String p_xing2ye4fen1lei4,

    Integer p_xing2ye4ceng2ji2,

    String p_xing2ye4bian1ma3,

    String p_xing2ye4ming2cheng1,

    Double p_gong1si1shu4liang4,

    Double p_na4ru4ji4suan4gong1si1shu4liang4,

    Double p_zong3shi4zhi2jing4tai4,

    Double p_jing4li4run4jing4tai4,

    Double p_jing4tai4shi4ying2lu4jia1quan2ping2jun1,

    Double p_jing4tai4shi4ying2lu4zhong1wei4shu4,

    Double p_jing4tai4shi4ying2lu4suan4shu4ping2jun1,


    Map.Entry
    <String
    , String>... others){
    stock_industry_pe_ratio_cninfoResponse t = new stock_industry_pe_ratio_cninfoResponse();


    t.p_bian4dong4ri4qi1 = p_bian4dong4ri4qi1;

    t.p_xing2ye4fen1lei4 = p_xing2ye4fen1lei4;

    t.p_xing2ye4ceng2ji2 = p_xing2ye4ceng2ji2;

    t.p_xing2ye4bian1ma3 = p_xing2ye4bian1ma3;

    t.p_xing2ye4ming2cheng1 = p_xing2ye4ming2cheng1;

    t.p_gong1si1shu4liang4 = p_gong1si1shu4liang4;

    t.p_na4ru4ji4suan4gong1si1shu4liang4 = p_na4ru4ji4suan4gong1si1shu4liang4;

    t.p_zong3shi4zhi2jing4tai4 = p_zong3shi4zhi2jing4tai4;

    t.p_jing4li4run4jing4tai4 = p_jing4li4run4jing4tai4;

    t.p_jing4tai4shi4ying2lu4jia1quan2ping2jun1 = p_jing4tai4shi4ying2lu4jia1quan2ping2jun1;

    t.p_jing4tai4shi4ying2lu4zhong1wei4shu4 = p_jing4tai4shi4ying2lu4zhong1wei4shu4;

    t.p_jing4tai4shi4ying2lu4suan4shu4ping2jun1 = p_jing4tai4shi4ying2lu4suan4shu4ping2jun1;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 变动日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("变动日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_bian4dong4ri4qi1;

    public LocalDate getP_bian4dong4ri4qi1() { return this.p_bian4dong4ri4qi1;}
    public void setP_bian4dong4ri4qi1(LocalDate v) { this.p_bian4dong4ri4qi1 = v;}

    /**
    * name: 行业分类
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("行业分类")
    
    
    private String p_xing2ye4fen1lei4;

    public String getP_xing2ye4fen1lei4() { return this.p_xing2ye4fen1lei4;}
    public void setP_xing2ye4fen1lei4(String v) { this.p_xing2ye4fen1lei4 = v;}

    /**
    * name: 行业层级
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("行业层级")
    
    
    private Integer p_xing2ye4ceng2ji2;

    public Integer getP_xing2ye4ceng2ji2() { return this.p_xing2ye4ceng2ji2;}
    public void setP_xing2ye4ceng2ji2(Integer v) { this.p_xing2ye4ceng2ji2 = v;}

    /**
    * name: 行业编码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("行业编码")
    
    
    private String p_xing2ye4bian1ma3;

    public String getP_xing2ye4bian1ma3() { return this.p_xing2ye4bian1ma3;}
    public void setP_xing2ye4bian1ma3(String v) { this.p_xing2ye4bian1ma3 = v;}

    /**
    * name: 行业名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("行业名称")
    
    
    private String p_xing2ye4ming2cheng1;

    public String getP_xing2ye4ming2cheng1() { return this.p_xing2ye4ming2cheng1;}
    public void setP_xing2ye4ming2cheng1(String v) { this.p_xing2ye4ming2cheng1 = v;}

    /**
    * name: 公司数量
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("公司数量")
    
    
    private Double p_gong1si1shu4liang4;

    public Double getP_gong1si1shu4liang4() { return this.p_gong1si1shu4liang4;}
    public void setP_gong1si1shu4liang4(Double v) { this.p_gong1si1shu4liang4 = v;}

    /**
    * name: 纳入计算公司数量
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("纳入计算公司数量")
    
    
    private Double p_na4ru4ji4suan4gong1si1shu4liang4;

    public Double getP_na4ru4ji4suan4gong1si1shu4liang4() { return this.p_na4ru4ji4suan4gong1si1shu4liang4;}
    public void setP_na4ru4ji4suan4gong1si1shu4liang4(Double v) { this.p_na4ru4ji4suan4gong1si1shu4liang4 = v;}

    /**
    * name: 总市值-静态
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("总市值-静态")
    
    
    private Double p_zong3shi4zhi2jing4tai4;

    public Double getP_zong3shi4zhi2jing4tai4() { return this.p_zong3shi4zhi2jing4tai4;}
    public void setP_zong3shi4zhi2jing4tai4(Double v) { this.p_zong3shi4zhi2jing4tai4 = v;}

    /**
    * name: 净利润-静态
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("净利润-静态")
    
    
    private Double p_jing4li4run4jing4tai4;

    public Double getP_jing4li4run4jing4tai4() { return this.p_jing4li4run4jing4tai4;}
    public void setP_jing4li4run4jing4tai4(Double v) { this.p_jing4li4run4jing4tai4 = v;}

    /**
    * name: 静态市盈率-加权平均
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("静态市盈率-加权平均")
    
    
    private Double p_jing4tai4shi4ying2lu4jia1quan2ping2jun1;

    public Double getP_jing4tai4shi4ying2lu4jia1quan2ping2jun1() { return this.p_jing4tai4shi4ying2lu4jia1quan2ping2jun1;}
    public void setP_jing4tai4shi4ying2lu4jia1quan2ping2jun1(Double v) { this.p_jing4tai4shi4ying2lu4jia1quan2ping2jun1 = v;}

    /**
    * name: 静态市盈率-中位数
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("静态市盈率-中位数")
    
    
    private Double p_jing4tai4shi4ying2lu4zhong1wei4shu4;

    public Double getP_jing4tai4shi4ying2lu4zhong1wei4shu4() { return this.p_jing4tai4shi4ying2lu4zhong1wei4shu4;}
    public void setP_jing4tai4shi4ying2lu4zhong1wei4shu4(Double v) { this.p_jing4tai4shi4ying2lu4zhong1wei4shu4 = v;}

    /**
    * name: 静态市盈率-算术平均
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("静态市盈率-算术平均")
    
    
    private Double p_jing4tai4shi4ying2lu4suan4shu4ping2jun1;

    public Double getP_jing4tai4shi4ying2lu4suan4shu4ping2jun1() { return this.p_jing4tai4shi4ying2lu4suan4shu4ping2jun1;}
    public void setP_jing4tai4shi4ying2lu4suan4shu4ping2jun1(Double v) { this.p_jing4tai4shi4ying2lu4suan4shu4ping2jun1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
