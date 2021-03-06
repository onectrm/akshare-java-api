
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
    * 接口: sport_olympic_hist
    * 目标地址: https://www.kaggle.com/marcogdepinto/let-s-discover-more-about-the-olympic-games
    * 描述: 奥运会-奖牌数据
    * 限量: 单次返回 1896-2016 年度的奥运奖牌数据
    */
    public class sport_olympic_histRequest extends AkShareRequestAndResponse {
    public sport_olympic_histRequest(){
    setInterfaceName("sport_olympic_hist");
    }

    public static sport_olympic_histRequest of(



    Map.Entry
    <String
    , String>... others){
    sport_olympic_histRequest t = new sport_olympic_histRequest();



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
