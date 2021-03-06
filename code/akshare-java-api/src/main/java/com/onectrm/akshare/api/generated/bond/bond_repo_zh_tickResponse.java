
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: bond
    * 接口: bond_repo_zh_tick
    * 目标地址: http://stockhtm.finance.qq.com/sstock/ggcx/131802.shtml
    * 描述: 债券-质押式回购-实时行情-成交明细; 该接口暂不可用
    * 限量: 单次返回所有指定日期的成交明细数据
    */
    public class bond_repo_zh_tickResponse extends AkShareRequestAndResponse {
    public bond_repo_zh_tickResponse(){
    setInterfaceName("bond_repo_zh_tick");
    }

    public static bond_repo_zh_tickResponse of(


    LocalDateTime p_cheng2jiao1shi2jian1,

    Double p_cheng2jiao1jia4ge2,

    Double p_jia4ge2bian4dong4,

    Double p_cheng2jiao1liang4shou3,

    Double p_cheng2jiao1e2yuan2,

    String p_xing4zhi4,


    Map.Entry
    <String
    , String>... others){
    bond_repo_zh_tickResponse t = new bond_repo_zh_tickResponse();


    t.p_cheng2jiao1shi2jian1 = p_cheng2jiao1shi2jian1;

    t.p_cheng2jiao1jia4ge2 = p_cheng2jiao1jia4ge2;

    t.p_jia4ge2bian4dong4 = p_jia4ge2bian4dong4;

    t.p_cheng2jiao1liang4shou3 = p_cheng2jiao1liang4shou3;

    t.p_cheng2jiao1e2yuan2 = p_cheng2jiao1e2yuan2;

    t.p_xing4zhi4 = p_xing4zhi4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 成交时间
    * type: str
    * desc: 时间: 09:25:04;
    * required: 
    */
    @JsonProperty("成交时间")
    
    @JsonDeserialize(using =
        JacksonDateTimeDeserializer.class)
    
    private LocalDateTime p_cheng2jiao1shi2jian1;

    public LocalDateTime getP_cheng2jiao1shi2jian1() { return this.p_cheng2jiao1shi2jian1;}
    public void setP_cheng2jiao1shi2jian1(LocalDateTime v) { this.p_cheng2jiao1shi2jian1 = v;}

    /**
    * name: 成交价格
    * type: float
    * desc: 
    * required: 
    */
    @JsonProperty("成交价格")
    
    
    private Double p_cheng2jiao1jia4ge2;

    public Double getP_cheng2jiao1jia4ge2() { return this.p_cheng2jiao1jia4ge2;}
    public void setP_cheng2jiao1jia4ge2(Double v) { this.p_cheng2jiao1jia4ge2 = v;}

    /**
    * name: 价格变动
    * type: float
    * desc: 
    * required: 
    */
    @JsonProperty("价格变动")
    
    
    private Double p_jia4ge2bian4dong4;

    public Double getP_jia4ge2bian4dong4() { return this.p_jia4ge2bian4dong4;}
    public void setP_jia4ge2bian4dong4(Double v) { this.p_jia4ge2bian4dong4 = v;}

    /**
    * name: 成交量(手)
    * type: float
    * desc: 
    * required: 
    */
    @JsonProperty("成交量(手)")
    
    
    private Double p_cheng2jiao1liang4shou3;

    public Double getP_cheng2jiao1liang4shou3() { return this.p_cheng2jiao1liang4shou3;}
    public void setP_cheng2jiao1liang4shou3(Double v) { this.p_cheng2jiao1liang4shou3 = v;}

    /**
    * name: 成交额(元)
    * type: float
    * desc: 
    * required: 
    */
    @JsonProperty("成交额(元)")
    
    
    private Double p_cheng2jiao1e2yuan2;

    public Double getP_cheng2jiao1e2yuan2() { return this.p_cheng2jiao1e2yuan2;}
    public void setP_cheng2jiao1e2yuan2(Double v) { this.p_cheng2jiao1e2yuan2 = v;}

    /**
    * name: 性质
    * type: str
    * desc: 买卖盘标记
    * required: 
    */
    @JsonProperty("性质")
    
    
    private String p_xing4zhi4;

    public String getP_xing4zhi4() { return this.p_xing4zhi4;}
    public void setP_xing4zhi4(String v) { this.p_xing4zhi4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
