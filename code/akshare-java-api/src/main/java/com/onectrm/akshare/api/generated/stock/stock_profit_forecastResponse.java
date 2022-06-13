
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
    * 接口: stock_profit_forecast
    * 目标地址: http://data.eastmoney.com/report/profitforecast.jshtml
    * 描述: 东方财富网-数据中心-研究报告-盈利预测
    * 限量: 单次返回所有历史数据
    */
    public class stock_profit_forecastResponse extends AkShareRequestAndResponse {
    public stock_profit_forecastResponse(){
    setInterfaceName("stock_profit_forecast");
    }

    public static stock_profit_forecastResponse of(


    Integer p_xu4hao4,

    String p_dai4ma3,

    String p_ming2cheng1,

    Integer p_yan2bao4shu4,

    Double p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai3ru4,

    Double p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zeng1chi2,

    Double p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zhong1xing4,

    Double p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4jian3chi2,

    Double p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai4chu1,


    Map.Entry
    <String
    , String>... others){
    stock_profit_forecastResponse t = new stock_profit_forecastResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_dai4ma3 = p_dai4ma3;

    t.p_ming2cheng1 = p_ming2cheng1;

    t.p_yan2bao4shu4 = p_yan2bao4shu4;

    t.p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai3ru4 = p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai3ru4;

    t.p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zeng1chi2 = p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zeng1chi2;

    t.p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zhong1xing4 = p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zhong1xing4;

    t.p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4jian3chi2 = p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4jian3chi2;

    t.p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai4chu1 = p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai4chu1;


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
    * name: 代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("代码")
    
    
    private String p_dai4ma3;

    public String getP_dai4ma3() { return this.p_dai4ma3;}
    public void setP_dai4ma3(String v) { this.p_dai4ma3 = v;}

    /**
    * name: 名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("名称")
    
    
    private String p_ming2cheng1;

    public String getP_ming2cheng1() { return this.p_ming2cheng1;}
    public void setP_ming2cheng1(String v) { this.p_ming2cheng1 = v;}

    /**
    * name: 研报数
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("研报数")
    
    
    private Integer p_yan2bao4shu4;

    public Integer getP_yan2bao4shu4() { return this.p_yan2bao4shu4;}
    public void setP_yan2bao4shu4(Integer v) { this.p_yan2bao4shu4 = v;}

    /**
    * name: 机构投资评级(近六个月)-买入
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("机构投资评级(近六个月)-买入")
    
    
    private Double p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai3ru4;

    public Double getP_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai3ru4() { return this.p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai3ru4;}
    public void setP_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai3ru4(Double v) { this.p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai3ru4 = v;}

    /**
    * name: 机构投资评级(近六个月)-增持
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("机构投资评级(近六个月)-增持")
    
    
    private Double p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zeng1chi2;

    public Double getP_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zeng1chi2() { return this.p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zeng1chi2;}
    public void setP_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zeng1chi2(Double v) { this.p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zeng1chi2 = v;}

    /**
    * name: 机构投资评级(近六个月)-中性
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("机构投资评级(近六个月)-中性")
    
    
    private Double p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zhong1xing4;

    public Double getP_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zhong1xing4() { return this.p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zhong1xing4;}
    public void setP_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zhong1xing4(Double v) { this.p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zhong1xing4 = v;}

    /**
    * name: 机构投资评级(近六个月)-减持
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("机构投资评级(近六个月)-减持")
    
    
    private Double p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4jian3chi2;

    public Double getP_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4jian3chi2() { return this.p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4jian3chi2;}
    public void setP_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4jian3chi2(Double v) { this.p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4jian3chi2 = v;}

    /**
    * name: 机构投资评级(近六个月)-卖出
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("机构投资评级(近六个月)-卖出")
    
    
    private Double p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai4chu1;

    public Double getP_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai4chu1() { return this.p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai4chu1;}
    public void setP_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai4chu1(Double v) { this.p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai4chu1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
