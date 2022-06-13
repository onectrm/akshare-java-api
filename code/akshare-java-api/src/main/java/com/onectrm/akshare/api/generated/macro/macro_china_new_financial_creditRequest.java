
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
    * 接口: macro_china_new_financial_credit
    * 目标地址: http://data.eastmoney.com/cjsj/xzxd.html
    * 描述: 中国新增信贷数据数据, 数据区间从 200801 至今, 月度数据
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_new_financial_creditRequest extends AkShareRequestAndResponse {
    public macro_china_new_financial_creditRequest(){
    setInterfaceName("macro_china_new_financial_credit");
    }

    public static macro_china_new_financial_creditRequest of(



    Map.Entry
    <String
    , String>... others){
    macro_china_new_financial_creditRequest t = new macro_china_new_financial_creditRequest();



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
