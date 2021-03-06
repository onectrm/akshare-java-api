
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.fx;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: fx
    * 接口: macro_fx_sentiment
    * 目标地址: https://datacenter.jin10.com/reportType/dc_ssi_trends
    * 描述: 获取货币对-投机情绪报告
    * 限量: 单次返回指定日期所有品种的数据(所指定的日期必须在当前交易日之前的30个交易日内)
    */
    public class macro_fx_sentimentResponse extends AkShareRequestAndResponse {
    public macro_fx_sentimentResponse(){
    setInterfaceName("macro_fx_sentiment");
    }

    public static macro_fx_sentimentResponse of(


    LocalDate p_ri4qi1suo3yin3,

    String p_AUDJPY,

    String p_AUDUSD,

    String p_EURAUD,

    String p_EURJPY,

    String p_EURUSD,

    String p_GBPJPY,

    String p_GBPUSD,

    String p_NZDUSD,

    String p_USDCAD,

    String p_USDCHF,

    String p_USDJPY,

    String p_USDX,

    String p_XAUUSD,


    Map.Entry
    <String
    , String>... others){
    macro_fx_sentimentResponse t = new macro_fx_sentimentResponse();


    t.p_ri4qi1suo3yin3 = p_ri4qi1suo3yin3;

    t.p_AUDJPY = p_AUDJPY;

    t.p_AUDUSD = p_AUDUSD;

    t.p_EURAUD = p_EURAUD;

    t.p_EURJPY = p_EURJPY;

    t.p_EURUSD = p_EURUSD;

    t.p_GBPJPY = p_GBPJPY;

    t.p_GBPUSD = p_GBPUSD;

    t.p_NZDUSD = p_NZDUSD;

    t.p_USDCAD = p_USDCAD;

    t.p_USDCHF = p_USDCHF;

    t.p_USDJPY = p_USDJPY;

    t.p_USDX = p_USDX;

    t.p_XAUUSD = p_XAUUSD;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 日期索引
    * type: str
    * desc: 间隔10分钟
    * required: Y
    */
    @JsonProperty("日期索引")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_ri4qi1suo3yin3;

    public LocalDate getP_ri4qi1suo3yin3() { return this.p_ri4qi1suo3yin3;}
    public void setP_ri4qi1suo3yin3(LocalDate v) { this.p_ri4qi1suo3yin3 = v;}

    /**
    * name: AUDJPY
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("AUDJPY")
    
    
    private String p_AUDJPY;

    public String getP_AUDJPY() { return this.p_AUDJPY;}
    public void setP_AUDJPY(String v) { this.p_AUDJPY = v;}

    /**
    * name: AUDUSD
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("AUDUSD")
    
    
    private String p_AUDUSD;

    public String getP_AUDUSD() { return this.p_AUDUSD;}
    public void setP_AUDUSD(String v) { this.p_AUDUSD = v;}

    /**
    * name: EURAUD
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("EURAUD")
    
    
    private String p_EURAUD;

    public String getP_EURAUD() { return this.p_EURAUD;}
    public void setP_EURAUD(String v) { this.p_EURAUD = v;}

    /**
    * name: EURJPY
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("EURJPY")
    
    
    private String p_EURJPY;

    public String getP_EURJPY() { return this.p_EURJPY;}
    public void setP_EURJPY(String v) { this.p_EURJPY = v;}

    /**
    * name: EURUSD
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("EURUSD")
    
    
    private String p_EURUSD;

    public String getP_EURUSD() { return this.p_EURUSD;}
    public void setP_EURUSD(String v) { this.p_EURUSD = v;}

    /**
    * name: GBPJPY
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("GBPJPY")
    
    
    private String p_GBPJPY;

    public String getP_GBPJPY() { return this.p_GBPJPY;}
    public void setP_GBPJPY(String v) { this.p_GBPJPY = v;}

    /**
    * name: GBPUSD
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("GBPUSD")
    
    
    private String p_GBPUSD;

    public String getP_GBPUSD() { return this.p_GBPUSD;}
    public void setP_GBPUSD(String v) { this.p_GBPUSD = v;}

    /**
    * name: NZDUSD
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("NZDUSD")
    
    
    private String p_NZDUSD;

    public String getP_NZDUSD() { return this.p_NZDUSD;}
    public void setP_NZDUSD(String v) { this.p_NZDUSD = v;}

    /**
    * name: USDCAD
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("USDCAD")
    
    
    private String p_USDCAD;

    public String getP_USDCAD() { return this.p_USDCAD;}
    public void setP_USDCAD(String v) { this.p_USDCAD = v;}

    /**
    * name: USDCHF
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("USDCHF")
    
    
    private String p_USDCHF;

    public String getP_USDCHF() { return this.p_USDCHF;}
    public void setP_USDCHF(String v) { this.p_USDCHF = v;}

    /**
    * name: USDJPY
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("USDJPY")
    
    
    private String p_USDJPY;

    public String getP_USDJPY() { return this.p_USDJPY;}
    public void setP_USDJPY(String v) { this.p_USDJPY = v;}

    /**
    * name: USDX
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("USDX")
    
    
    private String p_USDX;

    public String getP_USDX() { return this.p_USDX;}
    public void setP_USDX(String v) { this.p_USDX = v;}

    /**
    * name: XAUUSD
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("XAUUSD")
    
    
    private String p_XAUUSD;

    public String getP_XAUUSD() { return this.p_XAUUSD;}
    public void setP_XAUUSD(String v) { this.p_XAUUSD = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
