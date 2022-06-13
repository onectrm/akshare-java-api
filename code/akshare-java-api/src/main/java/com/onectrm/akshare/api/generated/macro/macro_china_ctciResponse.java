
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
    * 接口: macro_china_ctci
    * 目标地址: http://jgjc.ndrc.gov.cn/dmzs.aspx?clmId=741
    * 描述: 获取中国电煤价格指数-全国综合电煤价格指数图, 20140101-至今的所有历史数据
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_ctciResponse extends AkShareRequestAndResponse {
    public macro_china_ctciResponse(){
    setInterfaceName("macro_china_ctci");
    }

    public static macro_china_ctciResponse of(


    LocalDate p_date,

    Double p_value,


    Map.Entry
    <String
    , String>... others){
    macro_china_ctciResponse t = new macro_china_ctciResponse();


    t.p_date = p_date;

    t.p_value = p_value;


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
    * desc: 日期
    * required: Y
    */
    @JsonProperty("date")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}

    /**
    * name: value
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("value")
    
    
    private Double p_value;

    public Double getP_value() { return this.p_value;}
    public void setP_value(Double v) { this.p_value = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
