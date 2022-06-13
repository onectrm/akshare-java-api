
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:50 CST 2022*/
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
    * 接口: stock_zh_a_tick_163
    * 目标地址: http://quotes.money.163.com/trade/cjmx_000001.html#01b05(示例)
    * 描述: A 股 Tick 数据是从网易财经获取, 历史数据按日频率更新, 晚上 10 更新数据; 可以调用 **ak.stock_zh_a_tick_163_now(symbol=&quot;000001&quot;)** 接口获取
    * 限量: 单次返回具体某个 A 上市公司的近 5 个交易日的历史分笔行情数据; 该接口目前还不支持北交所的股票; 该接口目前不能返回 上交所 数据
    */
    public class stock_zh_a_tick_163Response extends AkShareRequestAndResponse {
    public stock_zh_a_tick_163Response(){
    setInterfaceName("stock_zh_a_tick_163");
    }

    public static stock_zh_a_tick_163Response of(


    LocalDateTime p_shi2jian1,

    Double p_cheng2jiao1jia4,

    Double p_jia4ge2bian4dong4,

    Integer p_cheng2jiao1liang4,

    Double p_cheng2jiao1e2,

    String p_xing4zhi4,


    Map.Entry
    <String
    , String>... others){
    stock_zh_a_tick_163Response t = new stock_zh_a_tick_163Response();


    t.p_shi2jian1 = p_shi2jian1;

    t.p_cheng2jiao1jia4 = p_cheng2jiao1jia4;

    t.p_jia4ge2bian4dong4 = p_jia4ge2bian4dong4;

    t.p_cheng2jiao1liang4 = p_cheng2jiao1liang4;

    t.p_cheng2jiao1e2 = p_cheng2jiao1e2;

    t.p_xing4zhi4 = p_xing4zhi4;


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
    * name: 成交价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("成交价")
    
    
    private Double p_cheng2jiao1jia4;

    public Double getP_cheng2jiao1jia4() { return this.p_cheng2jiao1jia4;}
    public void setP_cheng2jiao1jia4(Double v) { this.p_cheng2jiao1jia4 = v;}

    /**
    * name: 价格变动
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("价格变动")
    
    
    private Double p_jia4ge2bian4dong4;

    public Double getP_jia4ge2bian4dong4() { return this.p_jia4ge2bian4dong4;}
    public void setP_jia4ge2bian4dong4(Double v) { this.p_jia4ge2bian4dong4 = v;}

    /**
    * name: 成交量
    * type: int64
    * desc: 注意单位: 手
    * required: 
    */
    @JsonProperty("成交量")
    
    
    private Integer p_cheng2jiao1liang4;

    public Integer getP_cheng2jiao1liang4() { return this.p_cheng2jiao1liang4;}
    public void setP_cheng2jiao1liang4(Integer v) { this.p_cheng2jiao1liang4 = v;}

    /**
    * name: 成交额
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("成交额")
    
    
    private Double p_cheng2jiao1e2;

    public Double getP_cheng2jiao1e2() { return this.p_cheng2jiao1e2;}
    public void setP_cheng2jiao1e2(Double v) { this.p_cheng2jiao1e2 = v;}

    /**
    * name: 性质
    * type: object
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
