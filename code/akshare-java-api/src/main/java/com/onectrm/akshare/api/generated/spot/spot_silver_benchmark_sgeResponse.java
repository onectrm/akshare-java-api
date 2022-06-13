
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:50 CST 2022*/
    package com.onectrm.akshare.api.generated.spot;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: spot
    * 接口: spot_silver_benchmark_sge
    * 目标地址: https://www.sge.com.cn/sjzx/shyjzj
    * 描述: 上海黄金交易所-数据资讯-上海银基准价-历史数据
    * 限量: 单次返回所有历史数据
    */
    public class spot_silver_benchmark_sgeResponse extends AkShareRequestAndResponse {
    public spot_silver_benchmark_sgeResponse(){
    setInterfaceName("spot_silver_benchmark_sge");
    }

    public static spot_silver_benchmark_sgeResponse of(


    LocalDateTime p_jiao1yi4shi2jian1,

    Double p_wan3pan2jia4,

    Double p_zao3pan2jia4,


    Map.Entry
    <String
    , String>... others){
    spot_silver_benchmark_sgeResponse t = new spot_silver_benchmark_sgeResponse();


    t.p_jiao1yi4shi2jian1 = p_jiao1yi4shi2jian1;

    t.p_wan3pan2jia4 = p_wan3pan2jia4;

    t.p_zao3pan2jia4 = p_zao3pan2jia4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 交易时间
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("交易时间")
    
    @JsonDeserialize(using =
        JacksonDateTimeDeserializer.class)
    
    private LocalDateTime p_jiao1yi4shi2jian1;

    public LocalDateTime getP_jiao1yi4shi2jian1() { return this.p_jiao1yi4shi2jian1;}
    public void setP_jiao1yi4shi2jian1(LocalDateTime v) { this.p_jiao1yi4shi2jian1 = v;}

    /**
    * name: 晚盘价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("晚盘价")
    
    
    private Double p_wan3pan2jia4;

    public Double getP_wan3pan2jia4() { return this.p_wan3pan2jia4;}
    public void setP_wan3pan2jia4(Double v) { this.p_wan3pan2jia4 = v;}

    /**
    * name: 早盘价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("早盘价")
    
    
    private Double p_zao3pan2jia4;

    public Double getP_zao3pan2jia4() { return this.p_zao3pan2jia4;}
    public void setP_zao3pan2jia4(Double v) { this.p_zao3pan2jia4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
