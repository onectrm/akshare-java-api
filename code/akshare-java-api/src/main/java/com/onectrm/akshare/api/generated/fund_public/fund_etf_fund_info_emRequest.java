
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: fund_public
* 接口: fund_etf_fund_info_em
* 目标地址: http://fundf10.eastmoney.com/jjjz_004186.html
* 描述: 东方财富网站-天天基金网-基金数据-场内交易基金-历史净值数据
* 限量: 单次返回当前时刻所有历史数据
*/
public class fund_etf_fund_info_emRequest extends AkShareRequestAndResponse {
    public fund_etf_fund_info_emRequest(){
        setInterfaceName("fund_etf_fund_info_em");
    }

    public static fund_etf_fund_info_emRequest of(


    LocalDateTime p_enddate,

    LocalDateTime p_startdate,

    String p_fund,


    Map.Entry<String, String>... others){
    fund_etf_fund_info_emRequest t = new fund_etf_fund_info_emRequest();


    t.p_enddate = p_enddate;

    t.p_startdate = p_startdate;

    t.p_fund = p_fund;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: end_date
    * type: str
    * desc: end_date=&quot;20500101&quot;; 结束时间
    * required: 
    */
    @JsonProperty("end_date")
    
    @JsonDeserialize(using = JacksonDateTimeDeserializer.class) 
    private LocalDateTime p_enddate;

    public LocalDateTime getP_enddate() { return this.p_enddate;}
    public void setP_enddate(LocalDateTime v) { this.p_enddate = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&quot;20000101&quot;; 开始时间
    * required: 
    */
    @JsonProperty("start_date")
    
    @JsonDeserialize(using = JacksonDateTimeDeserializer.class) 
    private LocalDateTime p_startdate;

    public LocalDateTime getP_startdate() { return this.p_startdate;}
    public void setP_startdate(LocalDateTime v) { this.p_startdate = v;}

    /**
    * name: fund
    * type: str
    * desc: fund=&quot;511280&quot;; 基金代码, 可以通过调用 **fund_etf_fund_daily_em** 获取
    * required: 
    */
    @JsonProperty("fund")
    
    
    private String p_fund;

    public String getP_fund() { return this.p_fund;}
    public void setP_fund(String v) { this.p_fund = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
