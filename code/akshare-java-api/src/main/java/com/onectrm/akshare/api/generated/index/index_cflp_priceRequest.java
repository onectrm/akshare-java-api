
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: index
* 接口: index_cflp_price
* 目标地址: http://index.0256.cn/expx.htm
* 描述: 获取指定 symbol 的中国公路物流运价指数的数据
* 限量: 只能获取近期的数据; 目前该接口数据源更新有几个交易日的延时
*/
public class index_cflp_priceRequest extends AkShareRequestAndResponse {
    public index_cflp_priceRequest(){
        setInterfaceName("index_cflp_price");
    }

    public static index_cflp_priceRequest of(


    LocalDate p_enddate,

    LocalDateTime p_startdate,


    Map.Entry<String, String>... others){
    index_cflp_priceRequest t = new index_cflp_priceRequest();


    t.p_enddate = p_enddate;

    t.p_startdate = p_startdate;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20200327&quot;; 只能获取当前交易日近一个月内的数据
    * required: 
    */
    @JsonProperty("end_date")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_enddate;

    public LocalDate getP_enddate() { return this.p_enddate;}
    public void setP_enddate(LocalDate v) { this.p_enddate = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;20200320&quot;; 注意开始和结束之间的时间跨度不能太长, 只能获取当前交易日近一个月内的数据
    * required: 
    */
    @JsonProperty("start_date")
    
    @JsonDeserialize(using = JacksonDateTimeDeserializer.class) 
    private LocalDateTime p_startdate;

    public LocalDateTime getP_startdate() { return this.p_startdate;}
    public void setP_startdate(LocalDateTime v) { this.p_startdate = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}