
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
    * 接口: stock_sse_deal_daily
    * 目标地址: http://www.sse.com.cn/market/stockdata/overview/day/
    * 描述: 上海证券交易所-数据-股票数据-成交概况-股票成交概况-每日股票情况
    * 限量: 单次返回指定日期的每日概况数据, 当前交易日数据需要在收盘后获取; 注意在 20211227（包含）之后输出格式变化
    */
    public class stock_sse_deal_dailyRequest extends AkShareRequestAndResponse {
    public stock_sse_deal_dailyRequest(){
    setInterfaceName("stock_sse_deal_daily");
    }

    public static stock_sse_deal_dailyRequest of(


    LocalDate p_date,


    Map.Entry
    <String
    , String>... others){
    stock_sse_deal_dailyRequest t = new stock_sse_deal_dailyRequest();


    t.p_date = p_date;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: date
    * type: str
    * desc: date=&quot;20200619&quot;; 当前交易日的数据需要交易所收盘后统计; 注意在 20211227（包含）之后输出格式变化
    * required: 
    */
    @JsonProperty("date")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
