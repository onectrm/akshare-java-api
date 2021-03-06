
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
    * 接口: stock_a_pe_and_pb
    * 目标地址: https://legulegu.com/stockdata/hs300-ttm-lyr https://legulegu.com/stockdata/hs300-pb
    * 描述: 乐咕乐股-指定市场的A股的市盈率和市净率，包括等权和加权。目标的两个网页分别展示市盈率和市净率，但实际上是来自同一个API的数据
    * 限量: 单次获取指定 market 的所有数据
    */
    public class stock_a_pe_and_pbResponse extends AkShareRequestAndResponse {
    public stock_a_pe_and_pbResponse(){
    setInterfaceName("stock_a_pe_and_pb");
    }

    public static stock_a_pe_and_pbResponse of(


    LocalDate p_date,

    Double p_addTtmPe,

    Double p_middleAddTtmPe,

    Double p_addLyrPe,

    Double p_middleAddLyrPe,

    Double p_addPb,

    Double p_averageTtmPe,

    Double p_averageLyrPe,

    Double p_averagePb,

    Double p_middleAveragePb,

    Double p_close,


    Map.Entry
    <String
    , String>... others){
    stock_a_pe_and_pbResponse t = new stock_a_pe_and_pbResponse();


    t.p_date = p_date;

    t.p_addTtmPe = p_addTtmPe;

    t.p_middleAddTtmPe = p_middleAddTtmPe;

    t.p_addLyrPe = p_addLyrPe;

    t.p_middleAddLyrPe = p_middleAddLyrPe;

    t.p_addPb = p_addPb;

    t.p_averageTtmPe = p_averageTtmPe;

    t.p_averageLyrPe = p_averageLyrPe;

    t.p_averagePb = p_averagePb;

    t.p_middleAveragePb = p_middleAveragePb;

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
    * name: addTtmPe
    * type: float64
    * desc: (加权)滚动市盈率
    * required: 
    */
    @JsonProperty("addTtmPe")
    
    
    private Double p_addTtmPe;

    public Double getP_addTtmPe() { return this.p_addTtmPe;}
    public void setP_addTtmPe(Double v) { this.p_addTtmPe = v;}

    /**
    * name: middleAddTtmPe
    * type: float64
    * desc: (加权)滚动市盈率中位数
    * required: 
    */
    @JsonProperty("middleAddTtmPe")
    
    
    private Double p_middleAddTtmPe;

    public Double getP_middleAddTtmPe() { return this.p_middleAddTtmPe;}
    public void setP_middleAddTtmPe(Double v) { this.p_middleAddTtmPe = v;}

    /**
    * name: addLyrPe
    * type: float64
    * desc: (加权)静态市盈率
    * required: 
    */
    @JsonProperty("addLyrPe")
    
    
    private Double p_addLyrPe;

    public Double getP_addLyrPe() { return this.p_addLyrPe;}
    public void setP_addLyrPe(Double v) { this.p_addLyrPe = v;}

    /**
    * name: middleAddLyrPe
    * type: float64
    * desc: (加权)静态市盈率中位数
    * required: 
    */
    @JsonProperty("middleAddLyrPe")
    
    
    private Double p_middleAddLyrPe;

    public Double getP_middleAddLyrPe() { return this.p_middleAddLyrPe;}
    public void setP_middleAddLyrPe(Double v) { this.p_middleAddLyrPe = v;}

    /**
    * name: addPb
    * type: float64
    * desc: (加权)市净率
    * required: 
    */
    @JsonProperty("addPb")
    
    
    private Double p_addPb;

    public Double getP_addPb() { return this.p_addPb;}
    public void setP_addPb(Double v) { this.p_addPb = v;}

    /**
    * name: averageTtmPe
    * type: float64
    * desc: 等权滚动市盈率
    * required: 
    */
    @JsonProperty("averageTtmPe")
    
    
    private Double p_averageTtmPe;

    public Double getP_averageTtmPe() { return this.p_averageTtmPe;}
    public void setP_averageTtmPe(Double v) { this.p_averageTtmPe = v;}

    /**
    * name: averageLyrPe
    * type: float64
    * desc: 等权静态市盈率
    * required: 
    */
    @JsonProperty("averageLyrPe")
    
    
    private Double p_averageLyrPe;

    public Double getP_averageLyrPe() { return this.p_averageLyrPe;}
    public void setP_averageLyrPe(Double v) { this.p_averageLyrPe = v;}

    /**
    * name: averagePb
    * type: float64
    * desc: 等权市净率
    * required: 
    */
    @JsonProperty("averagePb")
    
    
    private Double p_averagePb;

    public Double getP_averagePb() { return this.p_averagePb;}
    public void setP_averagePb(Double v) { this.p_averagePb = v;}

    /**
    * name: middleAveragePb
    * type: float64
    * desc: 等权市净率中位数
    * required: 
    */
    @JsonProperty("middleAveragePb")
    
    
    private Double p_middleAveragePb;

    public Double getP_middleAveragePb() { return this.p_middleAveragePb;}
    public void setP_middleAveragePb(Double v) { this.p_middleAveragePb = v;}

    /**
    * name: close
    * type: float64
    * desc: 收盘点位
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
