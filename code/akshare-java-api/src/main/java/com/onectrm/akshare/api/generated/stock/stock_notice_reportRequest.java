
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
* 接口: stock_notice_report
* 目标地址: http://data.eastmoney.com/notices/hsa/5.html
* 描述: 东方财富网-数据中心-公告大全-沪深 A 股公告
* 限量: 单次获取指定 symbol 和 date 的数据
*/
public class stock_notice_reportRequest extends AkShareRequestAndResponse {
    public stock_notice_reportRequest(){
        setInterfaceName("stock_notice_report");
    }

    public static stock_notice_reportRequest of(


    LocalDate p_date,

    String p_symbol,


    Map.Entry<String, String>... others){
    stock_notice_reportRequest t = new stock_notice_reportRequest();


    t.p_date = p_date;

    t.p_symbol = p_symbol;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: date
    * type: str
    * desc: date=&quot;20220511&quot;; 指定日期
    * required: 
    */
    @JsonProperty("date")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}

    /**
    * name: symbol
    * type: str
    * desc: symbol=&#39;财务报告&#39;; choice of {&quot;全部&quot;, &quot;重大事项&quot;, &quot;财务报告&quot;, &quot;融资公告&quot;, &quot;风险提示&quot;, &quot;资产重组&quot;, &quot;信息变更&quot;, &quot;持股变动&quot;}
    * required: 
    */
    @JsonProperty("symbol")
    
    
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
