
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: bond
    * 接口: bond_cb_redeem_jsl
    * 目标地址: https://www.jisilu.cn/data/cbnew/#redeem
    * 描述: 集思录可转债-强赎
    * 限量: 单次返回所有数据
    */
    public class bond_cb_redeem_jslRequest extends AkShareRequestAndResponse {
    public bond_cb_redeem_jslRequest(){
    setInterfaceName("bond_cb_redeem_jsl");
    }

    public static bond_cb_redeem_jslRequest of(



    Map.Entry
    <String
    , String>... others){
    bond_cb_redeem_jslRequest t = new bond_cb_redeem_jslRequest();



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
