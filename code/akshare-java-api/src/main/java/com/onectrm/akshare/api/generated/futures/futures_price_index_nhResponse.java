
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
* 接口: futures_price_index_nh
* 目标地址: http://www.nanhua.net/nhzc/varietytrend.html
* 描述: 南华期货-商品指数历史走势-价格指数
* 限量: 单次返回指定 symbol 的所有历史数据
*/
public class futures_price_index_nhResponse extends AkShareRequestAndResponse {
    public futures_price_index_nhResponse(){
        setInterfaceName("futures_price_index_nh");
    }

    public static futures_price_index_nhResponse of(


    Double p_value,

    LocalDate p_date,


    Map.Entry<String, String>... others){
    futures_price_index_nhResponse t = new futures_price_index_nhResponse();


    t.p_value = p_value;

    t.p_date = p_date;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: value
    * type: float
    * desc: 指数数值
    * required: 
    */
    @JsonProperty("value")
    
    
    private Double p_value;

    public Double getP_value() { return this.p_value;}
    public void setP_value(Double v) { this.p_value = v;}

    /**
    * name: date
    * type: object
    * desc: 
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
