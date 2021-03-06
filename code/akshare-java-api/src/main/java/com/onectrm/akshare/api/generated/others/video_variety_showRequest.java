
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
    * 接口: video_variety_show
    * 目标地址: https://www.endata.com.cn/Video/index.html
    * 描述: 艺恩-视频放映-综艺节目
    * 限量: 返回前一日的综艺播映数据
    */
    public class video_variety_showRequest extends AkShareRequestAndResponse {
    public video_variety_showRequest(){
    setInterfaceName("video_variety_show");
    }

    public static video_variety_showRequest of(



    Map.Entry
    <String
    , String>... others){
    video_variety_showRequest t = new video_variety_showRequest();



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
