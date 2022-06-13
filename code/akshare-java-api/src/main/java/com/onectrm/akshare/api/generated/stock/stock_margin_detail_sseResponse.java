
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
    * 接口: stock_margin_detail_sse
    * 目标地址: http://www.sse.com.cn/market/othersdata/margin/detail/
    * 描述: 上海证券交易所-融资融券数据-融资融券明细数据
    * 限量: 单次返回交易日的所有历史数据
    */
    public class stock_margin_detail_sseResponse extends AkShareRequestAndResponse {
    public stock_margin_detail_sseResponse(){
    setInterfaceName("stock_margin_detail_sse");
    }

    public static stock_margin_detail_sseResponse of(


    LocalDate p_xin4yong4jiao1yi4ri4qi1,

    String p_biao1de5zheng4quan4dai4ma3,

    String p_biao1de5zheng4quan4jian3cheng1,

    Double p_rong2zi1yu2e2,

    Double p_rong2zi1mai3ru4e2,

    Double p_rong2zi1chang2hai2e2,

    Double p_rong2quan4yu2liang4,

    Double p_rong2quan4mai4chu1liang4,

    Double p_rong2quan4chang2hai2liang4,


    Map.Entry
    <String
    , String>... others){
    stock_margin_detail_sseResponse t = new stock_margin_detail_sseResponse();


    t.p_xin4yong4jiao1yi4ri4qi1 = p_xin4yong4jiao1yi4ri4qi1;

    t.p_biao1de5zheng4quan4dai4ma3 = p_biao1de5zheng4quan4dai4ma3;

    t.p_biao1de5zheng4quan4jian3cheng1 = p_biao1de5zheng4quan4jian3cheng1;

    t.p_rong2zi1yu2e2 = p_rong2zi1yu2e2;

    t.p_rong2zi1mai3ru4e2 = p_rong2zi1mai3ru4e2;

    t.p_rong2zi1chang2hai2e2 = p_rong2zi1chang2hai2e2;

    t.p_rong2quan4yu2liang4 = p_rong2quan4yu2liang4;

    t.p_rong2quan4mai4chu1liang4 = p_rong2quan4mai4chu1liang4;

    t.p_rong2quan4chang2hai2liang4 = p_rong2quan4chang2hai2liang4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 信用交易日期
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("信用交易日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_xin4yong4jiao1yi4ri4qi1;

    public LocalDate getP_xin4yong4jiao1yi4ri4qi1() { return this.p_xin4yong4jiao1yi4ri4qi1;}
    public void setP_xin4yong4jiao1yi4ri4qi1(LocalDate v) { this.p_xin4yong4jiao1yi4ri4qi1 = v;}

    /**
    * name: 标的证券代码
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("标的证券代码")
    
    
    private String p_biao1de5zheng4quan4dai4ma3;

    public String getP_biao1de5zheng4quan4dai4ma3() { return this.p_biao1de5zheng4quan4dai4ma3;}
    public void setP_biao1de5zheng4quan4dai4ma3(String v) { this.p_biao1de5zheng4quan4dai4ma3 = v;}

    /**
    * name: 标的证券简称
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("标的证券简称")
    
    
    private String p_biao1de5zheng4quan4jian3cheng1;

    public String getP_biao1de5zheng4quan4jian3cheng1() { return this.p_biao1de5zheng4quan4jian3cheng1;}
    public void setP_biao1de5zheng4quan4jian3cheng1(String v) { this.p_biao1de5zheng4quan4jian3cheng1 = v;}

    /**
    * name: 融资余额
    * type: float
    * desc: 注意单位: 元
    * required: Y
    */
    @JsonProperty("融资余额")
    
    
    private Double p_rong2zi1yu2e2;

    public Double getP_rong2zi1yu2e2() { return this.p_rong2zi1yu2e2;}
    public void setP_rong2zi1yu2e2(Double v) { this.p_rong2zi1yu2e2 = v;}

    /**
    * name: 融资买入额
    * type: float
    * desc: 注意单位: 元
    * required: Y
    */
    @JsonProperty("融资买入额")
    
    
    private Double p_rong2zi1mai3ru4e2;

    public Double getP_rong2zi1mai3ru4e2() { return this.p_rong2zi1mai3ru4e2;}
    public void setP_rong2zi1mai3ru4e2(Double v) { this.p_rong2zi1mai3ru4e2 = v;}

    /**
    * name: 融资偿还额
    * type: float
    * desc: 注意单位: 元
    * required: Y
    */
    @JsonProperty("融资偿还额")
    
    
    private Double p_rong2zi1chang2hai2e2;

    public Double getP_rong2zi1chang2hai2e2() { return this.p_rong2zi1chang2hai2e2;}
    public void setP_rong2zi1chang2hai2e2(Double v) { this.p_rong2zi1chang2hai2e2 = v;}

    /**
    * name: 融券余量
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("融券余量")
    
    
    private Double p_rong2quan4yu2liang4;

    public Double getP_rong2quan4yu2liang4() { return this.p_rong2quan4yu2liang4;}
    public void setP_rong2quan4yu2liang4(Double v) { this.p_rong2quan4yu2liang4 = v;}

    /**
    * name: 融券卖出量
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("融券卖出量")
    
    
    private Double p_rong2quan4mai4chu1liang4;

    public Double getP_rong2quan4mai4chu1liang4() { return this.p_rong2quan4mai4chu1liang4;}
    public void setP_rong2quan4mai4chu1liang4(Double v) { this.p_rong2quan4mai4chu1liang4 = v;}

    /**
    * name: 融券偿还量
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("融券偿还量")
    
    
    private Double p_rong2quan4chang2hai2liang4;

    public Double getP_rong2quan4chang2hai2liang4() { return this.p_rong2quan4chang2hai2liang4;}
    public void setP_rong2quan4chang2hai2liang4(Double v) { this.p_rong2quan4chang2hai2liang4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
