
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
    * 接口: stock_staq_net_stop
    * 目标地址: http://quote.eastmoney.com/center/gridlist.html#staq_net_board
    * 描述: 东方财富网-行情中心-沪深个股-两网及退市
    * 限量: 单次获取所有两网及退市的股票数据
    */
    public class stock_staq_net_stopRequest extends AkShareRequestAndResponse {
    public stock_staq_net_stopRequest(){
    setInterfaceName("stock_staq_net_stop");
    }

    public static stock_staq_net_stopRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_staq_net_stopRequest t = new stock_staq_net_stopRequest();



    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }




    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
