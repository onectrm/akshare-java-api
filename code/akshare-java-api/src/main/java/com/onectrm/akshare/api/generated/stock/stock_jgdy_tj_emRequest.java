
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:02 CST 2022*/
package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: stock
* 接口: stock_jgdy_tj_em
* 目标地址: http://data.eastmoney.com/jgdy/tj.html
* 描述: 东方财富网-数据中心-特色数据-机构调研-机构调研统计
* 限量: 单次返回所有历史数据
*/
public class stock_jgdy_tj_emRequest extends AkShareRequestAndResponse {
    public stock_jgdy_tj_emRequest(){
        setInterfaceName("stock_jgdy_tj_em");
    }

    public static stock_jgdy_tj_emRequest of(


    LocalDateTime p_date,


    Map.Entry<String, String>... others){
    stock_jgdy_tj_emRequest t = new stock_jgdy_tj_emRequest();


    t.p_date = p_date;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: date
    * type: str
    * desc: date=&quot;20180928&quot;; 开始查询的时间
    * required: 
    */
    @JsonProperty("date")
    
    @JsonDeserialize(using = JacksonDateTimeDeserializer.class) 
    private LocalDateTime p_date;

    public LocalDateTime getP_date() { return this.p_date;}
    public void setP_date(LocalDateTime v) { this.p_date = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
