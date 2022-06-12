
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:02 CST 2022*/
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
* 接口: air_quality_watch_point
* 目标地址: https://www.zq12369.com/environment.php
* 描述: 获取每个城市的所有空气质量监测点的数据
* 限量: 单次返回指定城市指定日期区间的所有监测点的空气质量数据
*/
public class air_quality_watch_pointRequest extends AkShareRequestAndResponse {
    public air_quality_watch_pointRequest(){
        setInterfaceName("air_quality_watch_point");
    }

    public static air_quality_watch_pointRequest of(


    LocalDate p_enddate,

    String p_city,

    LocalDate p_startdate,


    Map.Entry<String, String>... others){
    air_quality_watch_pointRequest t = new air_quality_watch_pointRequest();


    t.p_enddate = p_enddate;

    t.p_city = p_city;

    t.p_startdate = p_startdate;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;2020-04-27&quot;
    * required: Y
    */
    @JsonProperty("end_date")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_enddate;

    public LocalDate getP_enddate() { return this.p_enddate;}
    public void setP_enddate(LocalDate v) { this.p_enddate = v;}

    /**
    * name: city
    * type: str
    * desc: city=&quot;杭州&quot;; 调用 air_city_table 接口获取所有城市列表
    * required: Y
    */
    @JsonProperty("city")
    
    
    private String p_city;

    public String getP_city() { return this.p_city;}
    public void setP_city(String v) { this.p_city = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;2018-01-01&quot;
    * required: Y
    */
    @JsonProperty("start_date")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_startdate;

    public LocalDate getP_startdate() { return this.p_startdate;}
    public void setP_startdate(LocalDate v) { this.p_startdate = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
