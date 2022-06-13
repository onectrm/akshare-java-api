
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
    * 接口: sunrise_monthly
    * 目标地址: https://www.timeanddate.com/sun/china/
    * 描述: 获取中国各大城市-日出和日落时间, 数据区间从19990101-至今, 推荐使用代理访问
    * 限量: 单次返回指定日期所在月份每天的数据, 如果是未来日期则为预测值
    */
    public class sunrise_monthlyRequest extends AkShareRequestAndResponse {
    public sunrise_monthlyRequest(){
    setInterfaceName("sunrise_monthly");
    }

    public static sunrise_monthlyRequest of(


    LocalDate p_date,

    String p_city,


    Map.Entry
    <String
    , String>... others){
    sunrise_monthlyRequest t = new sunrise_monthlyRequest();


    t.p_date = p_date;

    t.p_city = p_city;


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
    * desc: date=&quot;20190801&quot;
    * required: Y
    */
    @JsonProperty("date")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}

    /**
    * name: city
    * type: str
    * desc: city=&quot;北京&quot;
    * required: Y
    */
    @JsonProperty("city")
    
    
    private String p_city;

    public String getP_city() { return this.p_city;}
    public void setP_city(String v) { this.p_city = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
