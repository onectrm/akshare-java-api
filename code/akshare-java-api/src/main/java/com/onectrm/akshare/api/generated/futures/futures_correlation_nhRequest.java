
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: futures
* 接口: futures_correlation_nh
* 目标地址: http://www.nanhua.net/nhzc/correltable.html
* 描述: 南华期货-统计监控-相关系数走势
* 限量: 单次返回指定 date 和 period 的所有历史数据
*/
public class futures_correlation_nhRequest extends AkShareRequestAndResponse {
    public futures_correlation_nhRequest(){
        setInterfaceName("futures_correlation_nh");
    }

    public static futures_correlation_nhRequest of(


    LocalDate p_date,

    String p_period,


    Map.Entry<String, String>... others){
    futures_correlation_nhRequest t = new futures_correlation_nhRequest();


    t.p_date = p_date;

    t.p_period = p_period;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: date
    * type: str
    * desc: date=&quot;20220104&quot;;
    * required: 
    */
    @JsonProperty("date")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}

    /**
    * name: period
    * type: str
    * desc: period=&quot;20&quot;; choice of {&quot;5&quot;, &quot;20&quot;, &quot;60&quot;, &quot;120&quot;}
    * required: 
    */
    @JsonProperty("period")
    
    
    private String p_period;

    public String getP_period() { return this.p_period;}
    public void setP_period(String v) { this.p_period = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}