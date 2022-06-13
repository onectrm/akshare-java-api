
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
    * 接口: stock_a_ttm_lyr
    * 目标地址: https://www.legulegu.com/stockdata/a-ttm-lyr
    * 描述: 乐咕乐股-A 股等权重市盈率与中位数市盈率
    * 限量: 单次返回所有数据
    */
    public class stock_a_ttm_lyrResponse extends AkShareRequestAndResponse {
    public stock_a_ttm_lyrResponse(){
    setInterfaceName("stock_a_ttm_lyr");
    }

    public static stock_a_ttm_lyrResponse of(


    LocalDate p_date,

    Double p_middlePETTM,

    Double p_averagePETTM,

    Double p_middlePELYR,

    Double p_averagePELYR,

    Double p_quantileInAllHistoryMiddlePeTtm,

    Double p_quantileInRecent10YearsMiddlePeTtm,

    Double p_quantileInAllHistoryAveragePeTtm,

    Double p_quantileInRecent10YearsAveragePeTtm,

    Double p_quantileInAllHistoryMiddlePeLyr,

    Double p_quantileInRecent10YearsMiddlePeLyr,

    Double p_quantileInAllHistoryAveragePeLyr,

    Double p_quantileInRecent10YearsAveragePeLyr,

    Double p_close,


    Map.Entry
    <String
    , String>... others){
    stock_a_ttm_lyrResponse t = new stock_a_ttm_lyrResponse();


    t.p_date = p_date;

    t.p_middlePETTM = p_middlePETTM;

    t.p_averagePETTM = p_averagePETTM;

    t.p_middlePELYR = p_middlePELYR;

    t.p_averagePELYR = p_averagePELYR;

    t.p_quantileInAllHistoryMiddlePeTtm = p_quantileInAllHistoryMiddlePeTtm;

    t.p_quantileInRecent10YearsMiddlePeTtm = p_quantileInRecent10YearsMiddlePeTtm;

    t.p_quantileInAllHistoryAveragePeTtm = p_quantileInAllHistoryAveragePeTtm;

    t.p_quantileInRecent10YearsAveragePeTtm = p_quantileInRecent10YearsAveragePeTtm;

    t.p_quantileInAllHistoryMiddlePeLyr = p_quantileInAllHistoryMiddlePeLyr;

    t.p_quantileInRecent10YearsMiddlePeLyr = p_quantileInRecent10YearsMiddlePeLyr;

    t.p_quantileInAllHistoryAveragePeLyr = p_quantileInAllHistoryAveragePeLyr;

    t.p_quantileInRecent10YearsAveragePeLyr = p_quantileInRecent10YearsAveragePeLyr;

    t.p_close = p_close;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: date
    * type: object
    * desc: 日期
    * required: 
    */
    @JsonProperty("date")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}

    /**
    * name: middlePETTM
    * type: float64
    * desc: 全A股滚动市盈率(TTM)中位数
    * required: 
    */
    @JsonProperty("middlePETTM")
    
    
    private Double p_middlePETTM;

    public Double getP_middlePETTM() { return this.p_middlePETTM;}
    public void setP_middlePETTM(Double v) { this.p_middlePETTM = v;}

    /**
    * name: averagePETTM
    * type: float64
    * desc: 全A股滚动市盈率(TTM)等权平均
    * required: 
    */
    @JsonProperty("averagePETTM")
    
    
    private Double p_averagePETTM;

    public Double getP_averagePETTM() { return this.p_averagePETTM;}
    public void setP_averagePETTM(Double v) { this.p_averagePETTM = v;}

    /**
    * name: middlePELYR
    * type: float64
    * desc: 全A股静态市盈率(LYR)中位数
    * required: 
    */
    @JsonProperty("middlePELYR")
    
    
    private Double p_middlePELYR;

    public Double getP_middlePELYR() { return this.p_middlePELYR;}
    public void setP_middlePELYR(Double v) { this.p_middlePELYR = v;}

    /**
    * name: averagePELYR
    * type: float64
    * desc: 全A股静态市盈率(LYR)等权平均
    * required: 
    */
    @JsonProperty("averagePELYR")
    
    
    private Double p_averagePELYR;

    public Double getP_averagePELYR() { return this.p_averagePELYR;}
    public void setP_averagePELYR(Double v) { this.p_averagePELYR = v;}

    /**
    * name: quantileInAllHistoryMiddlePeTtm
    * type: float64
    * desc: 当前&quot;TTM(滚动市盈率)中位数&quot;在历史数据上的分位数
    * required: 
    */
    @JsonProperty("quantileInAllHistoryMiddlePeTtm")
    
    
    private Double p_quantileInAllHistoryMiddlePeTtm;

    public Double getP_quantileInAllHistoryMiddlePeTtm() { return this.p_quantileInAllHistoryMiddlePeTtm;}
    public void setP_quantileInAllHistoryMiddlePeTtm(Double v) { this.p_quantileInAllHistoryMiddlePeTtm = v;}

    /**
    * name: quantileInRecent10YearsMiddlePeTtm
    * type: float64
    * desc: 当前&quot;TTM(滚动市盈率)中位数&quot;在最近10年数据上的分位数
    * required: 
    */
    @JsonProperty("quantileInRecent10YearsMiddlePeTtm")
    
    
    private Double p_quantileInRecent10YearsMiddlePeTtm;

    public Double getP_quantileInRecent10YearsMiddlePeTtm() { return this.p_quantileInRecent10YearsMiddlePeTtm;}
    public void setP_quantileInRecent10YearsMiddlePeTtm(Double v) { this.p_quantileInRecent10YearsMiddlePeTtm = v;}

    /**
    * name: quantileInAllHistoryAveragePeTtm
    * type: float64
    * desc: 当前&quot;TTM(滚动市盈率)等权平均&quot;在历史数据上的分位数
    * required: 
    */
    @JsonProperty("quantileInAllHistoryAveragePeTtm")
    
    
    private Double p_quantileInAllHistoryAveragePeTtm;

    public Double getP_quantileInAllHistoryAveragePeTtm() { return this.p_quantileInAllHistoryAveragePeTtm;}
    public void setP_quantileInAllHistoryAveragePeTtm(Double v) { this.p_quantileInAllHistoryAveragePeTtm = v;}

    /**
    * name: quantileInRecent10YearsAveragePeTtm
    * type: float64
    * desc: 当前&quot;TTM(滚动市盈率)等权平均&quot;在在最近10年数据上的分位数
    * required: 
    */
    @JsonProperty("quantileInRecent10YearsAveragePeTtm")
    
    
    private Double p_quantileInRecent10YearsAveragePeTtm;

    public Double getP_quantileInRecent10YearsAveragePeTtm() { return this.p_quantileInRecent10YearsAveragePeTtm;}
    public void setP_quantileInRecent10YearsAveragePeTtm(Double v) { this.p_quantileInRecent10YearsAveragePeTtm = v;}

    /**
    * name: quantileInAllHistoryMiddlePeLyr
    * type: float64
    * desc: 当前&quot;LYR(静态市盈率)中位数&quot;在历史数据上的分位数
    * required: 
    */
    @JsonProperty("quantileInAllHistoryMiddlePeLyr")
    
    
    private Double p_quantileInAllHistoryMiddlePeLyr;

    public Double getP_quantileInAllHistoryMiddlePeLyr() { return this.p_quantileInAllHistoryMiddlePeLyr;}
    public void setP_quantileInAllHistoryMiddlePeLyr(Double v) { this.p_quantileInAllHistoryMiddlePeLyr = v;}

    /**
    * name: quantileInRecent10YearsMiddlePeLyr
    * type: float64
    * desc: 当前&quot;LYR(静态市盈率)中位数&quot;在最近10年数据上的分位数
    * required: 
    */
    @JsonProperty("quantileInRecent10YearsMiddlePeLyr")
    
    
    private Double p_quantileInRecent10YearsMiddlePeLyr;

    public Double getP_quantileInRecent10YearsMiddlePeLyr() { return this.p_quantileInRecent10YearsMiddlePeLyr;}
    public void setP_quantileInRecent10YearsMiddlePeLyr(Double v) { this.p_quantileInRecent10YearsMiddlePeLyr = v;}

    /**
    * name: quantileInAllHistoryAveragePeLyr
    * type: float64
    * desc: 当前&quot;LYR(静态市盈率)等权平均&quot;在历史数据上的分位数
    * required: 
    */
    @JsonProperty("quantileInAllHistoryAveragePeLyr")
    
    
    private Double p_quantileInAllHistoryAveragePeLyr;

    public Double getP_quantileInAllHistoryAveragePeLyr() { return this.p_quantileInAllHistoryAveragePeLyr;}
    public void setP_quantileInAllHistoryAveragePeLyr(Double v) { this.p_quantileInAllHistoryAveragePeLyr = v;}

    /**
    * name: quantileInRecent10YearsAveragePeLyr
    * type: float64
    * desc: 当前&quot;LYR(静态市盈率)等权平均&quot;在最近10年数据上的分位数
    * required: 
    */
    @JsonProperty("quantileInRecent10YearsAveragePeLyr")
    
    
    private Double p_quantileInRecent10YearsAveragePeLyr;

    public Double getP_quantileInRecent10YearsAveragePeLyr() { return this.p_quantileInRecent10YearsAveragePeLyr;}
    public void setP_quantileInRecent10YearsAveragePeLyr(Double v) { this.p_quantileInRecent10YearsAveragePeLyr = v;}

    /**
    * name: close
    * type: float64
    * desc: 沪深300指数
    * required: 
    */
    @JsonProperty("close")
    
    
    private Double p_close;

    public Double getP_close() { return this.p_close;}
    public void setP_close(Double v) { this.p_close = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
