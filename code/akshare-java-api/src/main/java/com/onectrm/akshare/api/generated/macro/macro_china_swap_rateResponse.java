
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:50 CST 2022*/
    package com.onectrm.akshare.api.generated.macro;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: macro
    * 接口: macro_china_swap_rate
    * 目标地址: http://www.chinamoney.com.cn/chinese/bkcurvfxhis/?cfgItemType=72&amp;curveType=FR007
    * 描述: 国家统计局-FR007 利率互换曲线历史数据
    * 限量: 单次返回所有历史数据, 该接口只能获取近一年的数据的数据，其中每次只能获取一个月的数据
    */
    public class macro_china_swap_rateResponse extends AkShareRequestAndResponse {
    public macro_china_swap_rateResponse(){
    setInterfaceName("macro_china_swap_rate");
    }

    public static macro_china_swap_rateResponse of(


    LocalDate p_ri4qi1,

    String p_qu3xian4ming2cheng1,

    String p_shi2ke4,

    String p_jia4ge2lei4xing2,

    Double p_1M,

    Double p_3M,

    Double p_6M,

    Double p_9M,

    Double p_1Y,

    Double p_2Y,

    Double p_3Y,

    Double p_4Y,

    Double p_5Y,

    Double p_7Y,

    Double p_10Y,


    Map.Entry
    <String
    , String>... others){
    macro_china_swap_rateResponse t = new macro_china_swap_rateResponse();


    t.p_ri4qi1 = p_ri4qi1;

    t.p_qu3xian4ming2cheng1 = p_qu3xian4ming2cheng1;

    t.p_shi2ke4 = p_shi2ke4;

    t.p_jia4ge2lei4xing2 = p_jia4ge2lei4xing2;

    t.p_1M = p_1M;

    t.p_3M = p_3M;

    t.p_6M = p_6M;

    t.p_9M = p_9M;

    t.p_1Y = p_1Y;

    t.p_2Y = p_2Y;

    t.p_3Y = p_3Y;

    t.p_4Y = p_4Y;

    t.p_5Y = p_5Y;

    t.p_7Y = p_7Y;

    t.p_10Y = p_10Y;


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
    * desc: 
    * required: 
    */
    @JsonProperty("日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_ri4qi1;

    public LocalDate getP_ri4qi1() { return this.p_ri4qi1;}
    public void setP_ri4qi1(LocalDate v) { this.p_ri4qi1 = v;}

    /**
    * name: 曲线名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("曲线名称")
    
    
    private String p_qu3xian4ming2cheng1;

    public String getP_qu3xian4ming2cheng1() { return this.p_qu3xian4ming2cheng1;}
    public void setP_qu3xian4ming2cheng1(String v) { this.p_qu3xian4ming2cheng1 = v;}

    /**
    * name: 时刻
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("时刻")
    
    
    private String p_shi2ke4;

    public String getP_shi2ke4() { return this.p_shi2ke4;}
    public void setP_shi2ke4(String v) { this.p_shi2ke4 = v;}

    /**
    * name: 价格类型
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("价格类型")
    
    
    private String p_jia4ge2lei4xing2;

    public String getP_jia4ge2lei4xing2() { return this.p_jia4ge2lei4xing2;}
    public void setP_jia4ge2lei4xing2(String v) { this.p_jia4ge2lei4xing2 = v;}

    /**
    * name: 1M
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("1M")
    
    
    private Double p_1M;

    public Double getP_1M() { return this.p_1M;}
    public void setP_1M(Double v) { this.p_1M = v;}

    /**
    * name: 3M
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("3M")
    
    
    private Double p_3M;

    public Double getP_3M() { return this.p_3M;}
    public void setP_3M(Double v) { this.p_3M = v;}

    /**
    * name: 6M
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("6M")
    
    
    private Double p_6M;

    public Double getP_6M() { return this.p_6M;}
    public void setP_6M(Double v) { this.p_6M = v;}

    /**
    * name: 9M
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("9M")
    
    
    private Double p_9M;

    public Double getP_9M() { return this.p_9M;}
    public void setP_9M(Double v) { this.p_9M = v;}

    /**
    * name: 1Y
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("1Y")
    
    
    private Double p_1Y;

    public Double getP_1Y() { return this.p_1Y;}
    public void setP_1Y(Double v) { this.p_1Y = v;}

    /**
    * name: 2Y
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("2Y")
    
    
    private Double p_2Y;

    public Double getP_2Y() { return this.p_2Y;}
    public void setP_2Y(Double v) { this.p_2Y = v;}

    /**
    * name: 3Y
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("3Y")
    
    
    private Double p_3Y;

    public Double getP_3Y() { return this.p_3Y;}
    public void setP_3Y(Double v) { this.p_3Y = v;}

    /**
    * name: 4Y
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("4Y")
    
    
    private Double p_4Y;

    public Double getP_4Y() { return this.p_4Y;}
    public void setP_4Y(Double v) { this.p_4Y = v;}

    /**
    * name: 5Y
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("5Y")
    
    
    private Double p_5Y;

    public Double getP_5Y() { return this.p_5Y;}
    public void setP_5Y(Double v) { this.p_5Y = v;}

    /**
    * name: 7Y
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("7Y")
    
    
    private Double p_7Y;

    public Double getP_7Y() { return this.p_7Y;}
    public void setP_7Y(Double v) { this.p_7Y = v;}

    /**
    * name: 10Y
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("10Y")
    
    
    private Double p_10Y;

    public Double getP_10Y() { return this.p_10Y;}
    public void setP_10Y(Double v) { this.p_10Y = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
