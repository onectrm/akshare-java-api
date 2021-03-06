
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:50 CST 2022*/
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: others
    * 接口: death_company
    * 目标地址: https://www.itjuzi.com/deathCompany
    * 描述: 新经济死亡公司数据库
    * 限量: 返回所有历史数据
    */
    public class death_companyRequest extends AkShareRequestAndResponse {
    public death_companyRequest(){
    setInterfaceName("death_company");
    }

    public static death_companyRequest of(



    Map.Entry
    <String
    , String>... others){
    death_companyRequest t = new death_companyRequest();



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
