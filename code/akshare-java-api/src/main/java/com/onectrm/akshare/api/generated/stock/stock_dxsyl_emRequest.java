
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
    * 接口: stock_dxsyl_em
    * 目标地址: http://data.eastmoney.com/xg/xg/dxsyl.html
    * 描述: 东方财富网-数据中心-新股申购-打新收益率
    * 限量: 单次获取所有打新收益率数据
    */
    public class stock_dxsyl_emRequest extends AkShareRequestAndResponse {
    public stock_dxsyl_emRequest(){
    setInterfaceName("stock_dxsyl_em");
    }

    public static stock_dxsyl_emRequest of(



    Map.Entry
    <String
    , String>... others){
    stock_dxsyl_emRequest t = new stock_dxsyl_emRequest();



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
