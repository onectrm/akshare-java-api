
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
    * 接口: macro_usa_adp_employment
    * 目标地址: https://datacenter.jin10.com/reportType/dc_adp_nonfarm_employment
    * 描述: 获取美国ADP就业人数报告, 数据区间从20010601-至今
    * 限量: 单次返回某一个所有历史数据
    */
    public class macro_usa_adp_employmentResponse extends AkShareRequestAndResponse {
    public macro_usa_adp_employmentResponse(){
    setInterfaceName("macro_usa_adp_employment");
    }

    public static macro_usa_adp_employmentResponse of(


    LocalDate p_ri4qi1,

    Double p_jin1zhi2wan4ren2,


    Map.Entry
    <String
    , String>... others){
    macro_usa_adp_employmentResponse t = new macro_usa_adp_employmentResponse();


    t.p_ri4qi1 = p_ri4qi1;

    t.p_jin1zhi2wan4ren2 = p_jin1zhi2wan4ren2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 日期
    * type: str
    * desc: 日期-索引
    * required: Y
    */
    @JsonProperty("日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_ri4qi1;

    public LocalDate getP_ri4qi1() { return this.p_ri4qi1;}
    public void setP_ri4qi1(LocalDate v) { this.p_ri4qi1 = v;}

    /**
    * name: 今值(万人)
    * type: float
    * desc: 今值(万人)
    * required: Y
    */
    @JsonProperty("今值(万人)")
    
    
    private Double p_jin1zhi2wan4ren2;

    public Double getP_jin1zhi2wan4ren2() { return this.p_jin1zhi2wan4ren2;}
    public void setP_jin1zhi2wan4ren2(Double v) { this.p_jin1zhi2wan4ren2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
