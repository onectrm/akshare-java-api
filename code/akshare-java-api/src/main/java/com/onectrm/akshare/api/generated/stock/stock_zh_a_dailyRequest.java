
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
* 接口: stock_zh_a_daily
* 目标地址: https://finance.sina.com.cn/realstock/company/sh600006/nc.shtml(示例)
* 描述: 新浪财经-沪深京 A 股的数据, 历史数据按日频率更新; 注意其中的 **sh689009** 为 CDR, 请
* 限量: 单次返回指定沪深京 A 股上市公司指定日期间的历史行情日频率数据, 多次获取容易封禁 IP
*/
public class stock_zh_a_dailyRequest extends AkShareRequestAndResponse {
    public stock_zh_a_dailyRequest(){
        setInterfaceName("stock_zh_a_daily");
    }

    public static stock_zh_a_dailyRequest of(


    LocalDate p_enddate,

    String p_adjust,

    String p_symbol,

    LocalDate p_startdate,


    Map.Entry<String, String>... others){
    stock_zh_a_dailyRequest t = new stock_zh_a_dailyRequest();


    t.p_enddate = p_enddate;

    t.p_adjust = p_adjust;

    t.p_symbol = p_symbol;

    t.p_startdate = p_startdate;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: end_date
    * type: str
    * desc: end_date=&#39;20201116&#39;; 结束查询的日期
    * required: 
    */
    @JsonProperty("end_date")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_enddate;

    public LocalDate getP_enddate() { return this.p_enddate;}
    public void setP_enddate(LocalDate v) { this.p_enddate = v;}

    /**
    * name: adjust
    * type: str
    * desc: 默认返回不复权的数据; qfq: 返回前复权后的数据; hfq: 返回后复权后的数据; hfq-factor: 返回后复权因子; qfq-factor: 返回前复权因子
    * required: 
    */
    @JsonProperty("adjust")
    
    
    private String p_adjust;

    public String getP_adjust() { return this.p_adjust;}
    public void setP_adjust(String v) { this.p_adjust = v;}

    /**
    * name: symbol
    * type: str
    * desc: symbol=&#39;sh600000&#39;; 股票代码可以在 **ak.stock_zh_a_spot** 中获取
    * required: 
    */
    @JsonProperty("symbol")
    
    
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}

    /**
    * name: start_date
    * type: str
    * desc: start_date=&#39;20201103&#39;; 开始查询的日期
    * required: 
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