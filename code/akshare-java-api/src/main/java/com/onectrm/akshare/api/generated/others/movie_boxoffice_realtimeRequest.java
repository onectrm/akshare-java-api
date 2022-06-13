
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
    * 接口: movie_boxoffice_realtime
    * 目标地址: https://www.endata.com.cn/BoxOffice/BO/RealTime/reTimeBO.html
    * 描述: 当前时刻的实时电影票房数据, 每 5 分钟更新一次数据, 实时票房包含今天未开映场次已售出的票房
    * 限量: 当前时刻的实时票房数据
    */
    public class movie_boxoffice_realtimeRequest extends AkShareRequestAndResponse {
    public movie_boxoffice_realtimeRequest(){
    setInterfaceName("movie_boxoffice_realtime");
    }

    public static movie_boxoffice_realtimeRequest of(



    Map.Entry
    <String
    , String>... others){
    movie_boxoffice_realtimeRequest t = new movie_boxoffice_realtimeRequest();



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
