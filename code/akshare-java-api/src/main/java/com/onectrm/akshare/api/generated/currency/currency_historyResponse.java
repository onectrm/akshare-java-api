
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.currency;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: currency
* 接口: currency_history
* 目标地址: https://currencyscoop.com/
* 描述: 获取货币报价历史数据
* 限量: 单次返回指定货币在指定交易日的报价历史数据-免费账号每月限量访问 5000 次
*/
public class currency_historyResponse extends AkShareRequestAndResponse {
    public currency_historyResponse(){
        setInterfaceName("currency_history");
    }

    public static currency_historyResponse of(


    LocalDateTime p_date,

    Double p_base,

    String p_rates,


    Map.Entry<String, String>... others){
    currency_historyResponse t = new currency_historyResponse();


    t.p_date = p_date;

    t.p_base = p_base;

    t.p_rates = p_rates;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: date
    * type: str
    * desc: 日期时间-注意时区
    * required: Y
    */
    @JsonProperty("date")
    
    @JsonDeserialize(using = JacksonDateTimeDeserializer.class) 
    private LocalDateTime p_date;

    public LocalDateTime getP_date() { return this.p_date;}
    public void setP_date(LocalDateTime v) { this.p_date = v;}

    /**
    * name: base
    * type: float
    * desc: 货币
    * required: Y
    */
    @JsonProperty("base")
    
    
    private Double p_base;

    public Double getP_base() { return this.p_base;}
    public void setP_base(Double v) { this.p_base = v;}

    /**
    * name: rates
    * type: str
    * desc: 比率
    * required: Y
    */
    @JsonProperty("rates")
    
    
    private String p_rates;

    public String getP_rates() { return this.p_rates;}
    public void setP_rates(String v) { this.p_rates = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
