
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.event;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: event
    * 接口: covid_19_csse_daily
    * 目标地址: https://github.com/CSSEGISandData/COVID-19
    * 描述: 获取 **COVID-19** 每个自然日的全球统计数据, 如本地无法读取数据，请参考 **[答疑专栏]** 问题 12 修改本地 host 后获取
    * 限量: 单次返回指定 **date** 的所有历史数据
    */
    public class covid_19_csse_dailyRequest extends AkShareRequestAndResponse {
    public covid_19_csse_dailyRequest(){
    setInterfaceName("covid_19_csse_daily");
    }

    public static covid_19_csse_dailyRequest of(


    LocalDate p_date,


    Map.Entry
    <String
    , String>... others){
    covid_19_csse_dailyRequest t = new covid_19_csse_dailyRequest();


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
    * desc: date=&quot;2020-04-06&quot;; 从 **2020-01-22** 开始至今
    * required: Y
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
