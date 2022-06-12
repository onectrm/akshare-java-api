
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
* 接口: air_quality_rank
* 目标地址: https://www.zq12369.com/environment.php
* 描述: 获取指定 date 时间点上所有城市(168个)的空气质量数据
* 限量: 单次返回所有的数据
*/
public class air_quality_rankRequest extends AkShareRequestAndResponse {
    public air_quality_rankRequest(){
        setInterfaceName("air_quality_rank");
    }

    public static air_quality_rankRequest of(


    LocalDate p_date,


    Map.Entry<String, String>... others){
    air_quality_rankRequest t = new air_quality_rankRequest();


    t.p_date = p_date;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: date
    * type: str
    * desc: date=&quot;&quot;; &quot;&quot;: 当前时刻空气质量排名, 默认; &quot;20200312&quot;: 当日空气质量排名; &quot;202003&quot;: 当月空气质量排名; &quot;2019&quot;: 当年空气质量排名;
    * required: 
    */
    @JsonProperty("date")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}