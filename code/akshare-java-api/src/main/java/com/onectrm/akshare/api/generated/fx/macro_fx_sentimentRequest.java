
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.fx;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: fx
* 接口: macro_fx_sentiment
* 目标地址: https://datacenter.jin10.com/reportType/dc_ssi_trends
* 描述: 获取货币对-投机情绪报告
* 限量: 单次返回指定日期所有品种的数据(所指定的日期必须在当前交易日之前的30个交易日内)
*/
public class macro_fx_sentimentRequest extends AkShareRequestAndResponse {
    public macro_fx_sentimentRequest(){
        setInterfaceName("macro_fx_sentiment");
    }

    public static macro_fx_sentimentRequest of(


    LocalDate p_enddate,

    LocalDate p_startdate,


    Map.Entry<String, String>... others){
    macro_fx_sentimentRequest t = new macro_fx_sentimentRequest();


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
    * desc: end_date=&quot;2020-04-07&quot;; 与 start_date 一致
    * required: Y
    */
    @JsonProperty("end_date")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_enddate;

    public LocalDate getP_enddate() { return this.p_enddate;}
    public void setP_enddate(LocalDate v) { this.p_enddate = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;2020-04-07&quot;; 所指定的日期必须在当前交易日之前的30个交易日内
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
