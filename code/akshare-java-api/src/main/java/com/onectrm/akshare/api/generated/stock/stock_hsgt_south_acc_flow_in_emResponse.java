
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
* 接口: stock_hsgt_south_acc_flow_in_em
* 目标地址: http://data.eastmoney.com/hsgtcg/
* 描述: 东方财富网-数据中心-沪深港通持股-南向概括-累计净流入, 注: 资金净流入=当日资金限额-当日资金余额; 资金净流入包含当日成交净买额和当日买入申报未成交金额; 南向资金是沪股通与深股通的资金加总
* 限量: 单次返回指定 symbol 的所有数据
*/
public class stock_hsgt_south_acc_flow_in_emResponse extends AkShareRequestAndResponse {
    public stock_hsgt_south_acc_flow_in_emResponse(){
        setInterfaceName("stock_hsgt_south_acc_flow_in_em");
    }

    public static stock_hsgt_south_acc_flow_in_emResponse of(


    Double p_value,

    LocalDateTime p_date,


    Map.Entry<String, String>... others){
    stock_hsgt_south_acc_flow_in_emResponse t = new stock_hsgt_south_acc_flow_in_emResponse();


    t.p_value = p_value;

    t.p_date = p_date;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: value
    * type: float64
    * desc: 注意单位: 万元
    * required: 
    */
    @JsonProperty("value")
    
    
    private Double p_value;

    public Double getP_value() { return this.p_value;}
    public void setP_value(Double v) { this.p_value = v;}

    /**
    * name: date
    * type: object
    * desc: 日期时间
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
