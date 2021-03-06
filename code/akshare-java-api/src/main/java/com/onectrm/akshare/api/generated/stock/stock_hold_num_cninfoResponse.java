
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
    * 接口: stock_hold_num_cninfo
    * 目标地址: http://webapi.cninfo.com.cn/#/thematicStatistics
    * 描述: 巨潮资讯-数据中心-专题统计-股东股本-股东人数及持股集中度
    * 限量: 单次指定 date 的股东人数及持股集中度数据, 从 20170331 开始
    */
    public class stock_hold_num_cninfoResponse extends AkShareRequestAndResponse {
    public stock_hold_num_cninfoResponse(){
    setInterfaceName("stock_hold_num_cninfo");
    }

    public static stock_hold_num_cninfoResponse of(


    String p_zheng4juan4dai4ma3,

    String p_zheng4quan4jian3cheng1,

    LocalDate p_bian4dong4ri4qi1,

    Integer p_ben3qi1gu3dong1ren2shu4,

    Double p_shang4qi1gu3dong1ren2shu4,

    Double p_gu3dong1ren2shu4zeng1fu2,

    Integer p_ben3qi1ren2jun1chi2gu3shu4liang4,

    Double p_shang4qi1ren2jun1chi2gu3shu4liang4,

    Double p_ren2jun1chi2gu3shu4liang4zeng1fu2,


    Map.Entry
    <String
    , String>... others){
    stock_hold_num_cninfoResponse t = new stock_hold_num_cninfoResponse();


    t.p_zheng4juan4dai4ma3 = p_zheng4juan4dai4ma3;

    t.p_zheng4quan4jian3cheng1 = p_zheng4quan4jian3cheng1;

    t.p_bian4dong4ri4qi1 = p_bian4dong4ri4qi1;

    t.p_ben3qi1gu3dong1ren2shu4 = p_ben3qi1gu3dong1ren2shu4;

    t.p_shang4qi1gu3dong1ren2shu4 = p_shang4qi1gu3dong1ren2shu4;

    t.p_gu3dong1ren2shu4zeng1fu2 = p_gu3dong1ren2shu4zeng1fu2;

    t.p_ben3qi1ren2jun1chi2gu3shu4liang4 = p_ben3qi1ren2jun1chi2gu3shu4liang4;

    t.p_shang4qi1ren2jun1chi2gu3shu4liang4 = p_shang4qi1ren2jun1chi2gu3shu4liang4;

    t.p_ren2jun1chi2gu3shu4liang4zeng1fu2 = p_ren2jun1chi2gu3shu4liang4zeng1fu2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 证劵代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("证劵代码")
    
    
    private String p_zheng4juan4dai4ma3;

    public String getP_zheng4juan4dai4ma3() { return this.p_zheng4juan4dai4ma3;}
    public void setP_zheng4juan4dai4ma3(String v) { this.p_zheng4juan4dai4ma3 = v;}

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
    * name: 本期股东人数
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("本期股东人数")
    
    
    private Integer p_ben3qi1gu3dong1ren2shu4;

    public Integer getP_ben3qi1gu3dong1ren2shu4() { return this.p_ben3qi1gu3dong1ren2shu4;}
    public void setP_ben3qi1gu3dong1ren2shu4(Integer v) { this.p_ben3qi1gu3dong1ren2shu4 = v;}

    /**
    * name: 上期股东人数
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("上期股东人数")
    
    
    private Double p_shang4qi1gu3dong1ren2shu4;

    public Double getP_shang4qi1gu3dong1ren2shu4() { return this.p_shang4qi1gu3dong1ren2shu4;}
    public void setP_shang4qi1gu3dong1ren2shu4(Double v) { this.p_shang4qi1gu3dong1ren2shu4 = v;}

    /**
    * name: 股东人数增幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("股东人数增幅")
    
    
    private Double p_gu3dong1ren2shu4zeng1fu2;

    public Double getP_gu3dong1ren2shu4zeng1fu2() { return this.p_gu3dong1ren2shu4zeng1fu2;}
    public void setP_gu3dong1ren2shu4zeng1fu2(Double v) { this.p_gu3dong1ren2shu4zeng1fu2 = v;}

    /**
    * name: 本期人均持股数量
    * type: int64
    * desc: 注意单位: 万股
    * required: 
    */
    @JsonProperty("本期人均持股数量")
    
    
    private Integer p_ben3qi1ren2jun1chi2gu3shu4liang4;

    public Integer getP_ben3qi1ren2jun1chi2gu3shu4liang4() { return this.p_ben3qi1ren2jun1chi2gu3shu4liang4;}
    public void setP_ben3qi1ren2jun1chi2gu3shu4liang4(Integer v) { this.p_ben3qi1ren2jun1chi2gu3shu4liang4 = v;}

    /**
    * name: 上期人均持股数量
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("上期人均持股数量")
    
    
    private Double p_shang4qi1ren2jun1chi2gu3shu4liang4;

    public Double getP_shang4qi1ren2jun1chi2gu3shu4liang4() { return this.p_shang4qi1ren2jun1chi2gu3shu4liang4;}
    public void setP_shang4qi1ren2jun1chi2gu3shu4liang4(Double v) { this.p_shang4qi1ren2jun1chi2gu3shu4liang4 = v;}

    /**
    * name: 人均持股数量增幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("人均持股数量增幅")
    
    
    private Double p_ren2jun1chi2gu3shu4liang4zeng1fu2;

    public Double getP_ren2jun1chi2gu3shu4liang4zeng1fu2() { return this.p_ren2jun1chi2gu3shu4liang4zeng1fu2;}
    public void setP_ren2jun1chi2gu3shu4liang4zeng1fu2(Double v) { this.p_ren2jun1chi2gu3shu4liang4zeng1fu2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
