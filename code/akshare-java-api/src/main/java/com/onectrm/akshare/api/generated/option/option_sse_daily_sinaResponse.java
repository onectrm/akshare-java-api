
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:50 CST 2022*/
    package com.onectrm.akshare.api.generated.option;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: option
    * 接口: option_sse_daily_sina
    * 目标地址: https://stock.finance.sina.com.cn/futures/view/optionsCffexDP.php
    * 描述: 期权行情日数据
    * 限量: 单次返回期权行情日数据
    */
    public class option_sse_daily_sinaResponse extends AkShareRequestAndResponse {
    public option_sse_daily_sinaResponse(){
    setInterfaceName("option_sse_daily_sina");
    }

    public static option_sse_daily_sinaResponse of(


    LocalDateTime p_shi2jian1,

    Double p_kai1pan2,

    Double p_zui4gao1,

    Double p_zui4di1,

    Double p_shou1pan2,

    Integer p_cheng2jiao1,


    Map.Entry
    <String
    , String>... others){
    option_sse_daily_sinaResponse t = new option_sse_daily_sinaResponse();


    t.p_shi2jian1 = p_shi2jian1;

    t.p_kai1pan2 = p_kai1pan2;

    t.p_zui4gao1 = p_zui4gao1;

    t.p_zui4di1 = p_zui4di1;

    t.p_shou1pan2 = p_shou1pan2;

    t.p_cheng2jiao1 = p_cheng2jiao1;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 时间
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("时间")
    
    @JsonDeserialize(using =
        JacksonDateTimeDeserializer.class)
    
    private LocalDateTime p_shi2jian1;

    public LocalDateTime getP_shi2jian1() { return this.p_shi2jian1;}
    public void setP_shi2jian1(LocalDateTime v) { this.p_shi2jian1 = v;}

    /**
    * name: 开盘
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("开盘")
    
    
    private Double p_kai1pan2;

    public Double getP_kai1pan2() { return this.p_kai1pan2;}
    public void setP_kai1pan2(Double v) { this.p_kai1pan2 = v;}

    /**
    * name: 最高
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("最高")
    
    
    private Double p_zui4gao1;

    public Double getP_zui4gao1() { return this.p_zui4gao1;}
    public void setP_zui4gao1(Double v) { this.p_zui4gao1 = v;}

    /**
    * name: 最低
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("最低")
    
    
    private Double p_zui4di1;

    public Double getP_zui4di1() { return this.p_zui4di1;}
    public void setP_zui4di1(Double v) { this.p_zui4di1 = v;}

    /**
    * name: 收盘
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("收盘")
    
    
    private Double p_shou1pan2;

    public Double getP_shou1pan2() { return this.p_shou1pan2;}
    public void setP_shou1pan2(Double v) { this.p_shou1pan2 = v;}

    /**
    * name: 成交
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("成交")
    
    
    private Integer p_cheng2jiao1;

    public Integer getP_cheng2jiao1() { return this.p_cheng2jiao1;}
    public void setP_cheng2jiao1(Integer v) { this.p_cheng2jiao1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
