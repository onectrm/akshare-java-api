
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:50 CST 2022*/
    package com.onectrm.akshare.api.generated.spot;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: spot
    * 接口: spot_silver_benchmark_sge
    * 目标地址: https://www.sge.com.cn/sjzx/shyjzj
    * 描述: 上海黄金交易所-数据资讯-上海银基准价-历史数据
    * 限量: 单次返回所有历史数据
    */
    public class spot_silver_benchmark_sgeRequest extends AkShareRequestAndResponse {
    public spot_silver_benchmark_sgeRequest(){
    setInterfaceName("spot_silver_benchmark_sge");
    }

    public static spot_silver_benchmark_sgeRequest of(



    Map.Entry
    <String
    , String>... others){
    spot_silver_benchmark_sgeRequest t = new spot_silver_benchmark_sgeRequest();



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
