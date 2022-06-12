
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
* 接口: stock_hsgt_stock_statistics_em
* 目标地址: http://data.eastmoney.com/hsgtcg/StockStatistics.aspx
* 描述: 东方财富网-数据中心-沪深港通-沪深港通持股-每日个股统计
* 限量: 单次获取指定 market 的 start_date 和 end_date 之间的所有数据, 该接口只能获取近期的数据
*/
public class stock_hsgt_stock_statistics_emResponse extends AkShareRequestAndResponse {
    public stock_hsgt_stock_statistics_emResponse(){
        setInterfaceName("stock_hsgt_stock_statistics_em");
    }

    public static stock_hsgt_stock_statistics_emResponse of(


    Double p_chi2gu3shi4zhi2,

    Double p_dang1ri4zhang3die1fu2,

    Double p_chi2gu3shi4zhi2bian4hua45ri4,

    Double p_chi2gu3shi4zhi2bian4hua410ri4,

    Double p_chi2gu3shu4liang4,

    LocalDate p_chi2gu3ri4qi1,

    String p_gu3piao4jian3cheng1,

    String p_gu3piao4dai4ma3,

    Double p_chi2gu3shu4liang4zhan4fa1xing2gu3bai3fen1bi3,

    Double p_chi2gu3shi4zhi2bian4hua41ri4,

    Double p_dang1ri4shou1pan2jia4,


    Map.Entry<String, String>... others){
    stock_hsgt_stock_statistics_emResponse t = new stock_hsgt_stock_statistics_emResponse();


    t.p_chi2gu3shi4zhi2 = p_chi2gu3shi4zhi2;

    t.p_dang1ri4zhang3die1fu2 = p_dang1ri4zhang3die1fu2;

    t.p_chi2gu3shi4zhi2bian4hua45ri4 = p_chi2gu3shi4zhi2bian4hua45ri4;

    t.p_chi2gu3shi4zhi2bian4hua410ri4 = p_chi2gu3shi4zhi2bian4hua410ri4;

    t.p_chi2gu3shu4liang4 = p_chi2gu3shu4liang4;

    t.p_chi2gu3ri4qi1 = p_chi2gu3ri4qi1;

    t.p_gu3piao4jian3cheng1 = p_gu3piao4jian3cheng1;

    t.p_gu3piao4dai4ma3 = p_gu3piao4dai4ma3;

    t.p_chi2gu3shu4liang4zhan4fa1xing2gu3bai3fen1bi3 = p_chi2gu3shu4liang4zhan4fa1xing2gu3bai3fen1bi3;

    t.p_chi2gu3shi4zhi2bian4hua41ri4 = p_chi2gu3shi4zhi2bian4hua41ri4;

    t.p_dang1ri4shou1pan2jia4 = p_dang1ri4shou1pan2jia4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 持股市值
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("持股市值")
    
    
    private Double p_chi2gu3shi4zhi2;

    public Double getP_chi2gu3shi4zhi2() { return this.p_chi2gu3shi4zhi2;}
    public void setP_chi2gu3shi4zhi2(Double v) { this.p_chi2gu3shi4zhi2 = v;}

    /**
    * name: 当日涨跌幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("当日涨跌幅")
    
    
    private Double p_dang1ri4zhang3die1fu2;

    public Double getP_dang1ri4zhang3die1fu2() { return this.p_dang1ri4zhang3die1fu2;}
    public void setP_dang1ri4zhang3die1fu2(Double v) { this.p_dang1ri4zhang3die1fu2 = v;}

    /**
    * name: 持股市值变化-5日
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("持股市值变化-5日")
    
    
    private Double p_chi2gu3shi4zhi2bian4hua45ri4;

    public Double getP_chi2gu3shi4zhi2bian4hua45ri4() { return this.p_chi2gu3shi4zhi2bian4hua45ri4;}
    public void setP_chi2gu3shi4zhi2bian4hua45ri4(Double v) { this.p_chi2gu3shi4zhi2bian4hua45ri4 = v;}

    /**
    * name: 持股市值变化-10日
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("持股市值变化-10日")
    
    
    private Double p_chi2gu3shi4zhi2bian4hua410ri4;

    public Double getP_chi2gu3shi4zhi2bian4hua410ri4() { return this.p_chi2gu3shi4zhi2bian4hua410ri4;}
    public void setP_chi2gu3shi4zhi2bian4hua410ri4(Double v) { this.p_chi2gu3shi4zhi2bian4hua410ri4 = v;}

    /**
    * name: 持股数量
    * type: float64
    * desc: 注意单位: 股
    * required: 
    */
    @JsonProperty("持股数量")
    
    
    private Double p_chi2gu3shu4liang4;

    public Double getP_chi2gu3shu4liang4() { return this.p_chi2gu3shu4liang4;}
    public void setP_chi2gu3shu4liang4(Double v) { this.p_chi2gu3shu4liang4 = v;}

    /**
    * name: 持股日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("持股日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_chi2gu3ri4qi1;

    public LocalDate getP_chi2gu3ri4qi1() { return this.p_chi2gu3ri4qi1;}
    public void setP_chi2gu3ri4qi1(LocalDate v) { this.p_chi2gu3ri4qi1 = v;}

    /**
    * name: 股票简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股票简称")
    
    
    private String p_gu3piao4jian3cheng1;

    public String getP_gu3piao4jian3cheng1() { return this.p_gu3piao4jian3cheng1;}
    public void setP_gu3piao4jian3cheng1(String v) { this.p_gu3piao4jian3cheng1 = v;}

    /**
    * name: 股票代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股票代码")
    
    
    private String p_gu3piao4dai4ma3;

    public String getP_gu3piao4dai4ma3() { return this.p_gu3piao4dai4ma3;}
    public void setP_gu3piao4dai4ma3(String v) { this.p_gu3piao4dai4ma3 = v;}

    /**
    * name: 持股数量占发行股百分比
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("持股数量占发行股百分比")
    
    
    private Double p_chi2gu3shu4liang4zhan4fa1xing2gu3bai3fen1bi3;

    public Double getP_chi2gu3shu4liang4zhan4fa1xing2gu3bai3fen1bi3() { return this.p_chi2gu3shu4liang4zhan4fa1xing2gu3bai3fen1bi3;}
    public void setP_chi2gu3shu4liang4zhan4fa1xing2gu3bai3fen1bi3(Double v) { this.p_chi2gu3shu4liang4zhan4fa1xing2gu3bai3fen1bi3 = v;}

    /**
    * name: 持股市值变化-1日
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("持股市值变化-1日")
    
    
    private Double p_chi2gu3shi4zhi2bian4hua41ri4;

    public Double getP_chi2gu3shi4zhi2bian4hua41ri4() { return this.p_chi2gu3shi4zhi2bian4hua41ri4;}
    public void setP_chi2gu3shi4zhi2bian4hua41ri4(Double v) { this.p_chi2gu3shi4zhi2bian4hua41ri4 = v;}

    /**
    * name: 当日收盘价
    * type: float64
    * desc: 注意单位: 元; 南向持股单位为: 港元
    * required: 
    */
    @JsonProperty("当日收盘价")
    
    
    private Double p_dang1ri4shou1pan2jia4;

    public Double getP_dang1ri4shou1pan2jia4() { return this.p_dang1ri4shou1pan2jia4;}
    public void setP_dang1ri4shou1pan2jia4(Double v) { this.p_dang1ri4shou1pan2jia4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}