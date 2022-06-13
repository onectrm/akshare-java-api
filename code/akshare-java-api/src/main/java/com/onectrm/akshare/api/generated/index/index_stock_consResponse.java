
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.index;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: index
    * 接口: index_stock_cons
    * 目标地址: http://vip.stock.finance.sina.com.cn/corp/view/vII_NewestComponent.php?page=1&amp;indexid=399639
    * 描述: 指定指数的最新成份股票信息, 注意该接口返回的数据有部分是重复会导致数据缺失, 可以调用 **ak.index_stock_cons_sina()** 获取主流指数数据, 或调用**ak.index_stock_cons_csindex()**获取中证指数网提供的成分数据
    * 限量: 单次返回某一个国家的具体某一个指数, 每次最大返回 5000 条, 想获取较长时间的历史数据请分时间段获取, 建议用 for 循环获取多个国家的多个指数, 注意不要大量获取, 以免给对方服务器造成压力!
    */
    public class index_stock_consResponse extends AkShareRequestAndResponse {
    public index_stock_consResponse(){
    setInterfaceName("index_stock_cons");
    }

    public static index_stock_consResponse of(


    LocalDate p_ri4qi1,

    Double p_shou1pan2,

    Double p_kai1pan2,

    Double p_gao1,

    Double p_di1,

    Double p_jiao1yi4liang4,


    Map.Entry
    <String
    , String>... others){
    index_stock_consResponse t = new index_stock_consResponse();


    t.p_ri4qi1 = p_ri4qi1;

    t.p_shou1pan2 = p_shou1pan2;

    t.p_kai1pan2 = p_kai1pan2;

    t.p_gao1 = p_gao1;

    t.p_di1 = p_di1;

    t.p_jiao1yi4liang4 = p_jiao1yi4liang4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 日期
    * type: object
    * desc: 日期
    * required: 
    */
    @JsonProperty("日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_ri4qi1;

    public LocalDate getP_ri4qi1() { return this.p_ri4qi1;}
    public void setP_ri4qi1(LocalDate v) { this.p_ri4qi1 = v;}

    /**
    * name: 收盘
    * type: float64
    * desc: 收盘价
    * required: 
    */
    @JsonProperty("收盘")
    
    
    private Double p_shou1pan2;

    public Double getP_shou1pan2() { return this.p_shou1pan2;}
    public void setP_shou1pan2(Double v) { this.p_shou1pan2 = v;}

    /**
    * name: 开盘
    * type: float64
    * desc: 开盘价
    * required: 
    */
    @JsonProperty("开盘")
    
    
    private Double p_kai1pan2;

    public Double getP_kai1pan2() { return this.p_kai1pan2;}
    public void setP_kai1pan2(Double v) { this.p_kai1pan2 = v;}

    /**
    * name: 高
    * type: float64
    * desc: 最高价
    * required: 
    */
    @JsonProperty("高")
    
    
    private Double p_gao1;

    public Double getP_gao1() { return this.p_gao1;}
    public void setP_gao1(Double v) { this.p_gao1 = v;}

    /**
    * name: 低
    * type: float64
    * desc: 最低价
    * required: 
    */
    @JsonProperty("低")
    
    
    private Double p_di1;

    public Double getP_di1() { return this.p_di1;}
    public void setP_di1(Double v) { this.p_di1 = v;}

    /**
    * name: 交易量
    * type: float64
    * desc: 交易量
    * required: 
    */
    @JsonProperty("交易量")
    
    
    private Double p_jiao1yi4liang4;

    public Double getP_jiao1yi4liang4() { return this.p_jiao1yi4liang4;}
    public void setP_jiao1yi4liang4(Double v) { this.p_jiao1yi4liang4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
