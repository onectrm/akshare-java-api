
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
* 接口: stock_hsgt_institution_statistics_em
* 目标地址: http://data.eastmoney.com/hsgtcg/InstitutionStatistics.aspx
* 描述: 东方财富网-数据中心-沪深港通-沪深港通持股-机构排行
* 限量: 单次获取指定 market 的所有数据, 该接口只能获取近期的数据
*/
public class stock_hsgt_institution_statistics_emResponse extends AkShareRequestAndResponse {
    public stock_hsgt_institution_statistics_emResponse(){
        setInterfaceName("stock_hsgt_institution_statistics_em");
    }

    public static stock_hsgt_institution_statistics_emResponse of(


    Double p_chi2gu3shi4zhi2,

    Double p_chi2gu3shi4zhi2bian4hua45ri4,

    Double p_chi2gu3shi4zhi2bian4hua410ri4,

    Double p_chi2gu3zhi3shu4,

    LocalDate p_chi2gu3ri4qi1,

    String p_ji1gou4ming2cheng1,

    Double p_chi2gu3shi4zhi2bian4hua41ri4,


    Map.Entry<String, String>... others){
    stock_hsgt_institution_statistics_emResponse t = new stock_hsgt_institution_statistics_emResponse();


    t.p_chi2gu3shi4zhi2 = p_chi2gu3shi4zhi2;

    t.p_chi2gu3shi4zhi2bian4hua45ri4 = p_chi2gu3shi4zhi2bian4hua45ri4;

    t.p_chi2gu3shi4zhi2bian4hua410ri4 = p_chi2gu3shi4zhi2bian4hua410ri4;

    t.p_chi2gu3zhi3shu4 = p_chi2gu3zhi3shu4;

    t.p_chi2gu3ri4qi1 = p_chi2gu3ri4qi1;

    t.p_ji1gou4ming2cheng1 = p_ji1gou4ming2cheng1;

    t.p_chi2gu3shi4zhi2bian4hua41ri4 = p_chi2gu3shi4zhi2bian4hua41ri4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 持股市值
    * type: float64
    * desc: 注意单位: 元; 南向持股单位为: 港元
    * required: 
    */
    @JsonProperty("持股市值")
    
    
    private Double p_chi2gu3shi4zhi2;

    public Double getP_chi2gu3shi4zhi2() { return this.p_chi2gu3shi4zhi2;}
    public void setP_chi2gu3shi4zhi2(Double v) { this.p_chi2gu3shi4zhi2 = v;}

    /**
    * name: 持股市值变化-5日
    * type: float64
    * desc: 注意单位: 元; 南向持股单位为: 港元
    * required: 
    */
    @JsonProperty("持股市值变化-5日")
    
    
    private Double p_chi2gu3shi4zhi2bian4hua45ri4;

    public Double getP_chi2gu3shi4zhi2bian4hua45ri4() { return this.p_chi2gu3shi4zhi2bian4hua45ri4;}
    public void setP_chi2gu3shi4zhi2bian4hua45ri4(Double v) { this.p_chi2gu3shi4zhi2bian4hua45ri4 = v;}

    /**
    * name: 持股市值变化-10日
    * type: float64
    * desc: 注意单位: 元; 南向持股单位为: 港元
    * required: 
    */
    @JsonProperty("持股市值变化-10日")
    
    
    private Double p_chi2gu3shi4zhi2bian4hua410ri4;

    public Double getP_chi2gu3shi4zhi2bian4hua410ri4() { return this.p_chi2gu3shi4zhi2bian4hua410ri4;}
    public void setP_chi2gu3shi4zhi2bian4hua410ri4(Double v) { this.p_chi2gu3shi4zhi2bian4hua410ri4 = v;}

    /**
    * name: 持股只数
    * type: float64
    * desc: 注意单位: 只
    * required: 
    */
    @JsonProperty("持股只数")
    
    
    private Double p_chi2gu3zhi3shu4;

    public Double getP_chi2gu3zhi3shu4() { return this.p_chi2gu3zhi3shu4;}
    public void setP_chi2gu3zhi3shu4(Double v) { this.p_chi2gu3zhi3shu4 = v;}

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
    * name: 机构名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("机构名称")
    
    
    private String p_ji1gou4ming2cheng1;

    public String getP_ji1gou4ming2cheng1() { return this.p_ji1gou4ming2cheng1;}
    public void setP_ji1gou4ming2cheng1(String v) { this.p_ji1gou4ming2cheng1 = v;}

    /**
    * name: 持股市值变化-1日
    * type: float64
    * desc: 注意单位: 元; 南向持股单位为: 港元
    * required: 
    */
    @JsonProperty("持股市值变化-1日")
    
    
    private Double p_chi2gu3shi4zhi2bian4hua41ri4;

    public Double getP_chi2gu3shi4zhi2bian4hua41ri4() { return this.p_chi2gu3shi4zhi2bian4hua41ri4;}
    public void setP_chi2gu3shi4zhi2bian4hua41ri4(Double v) { this.p_chi2gu3shi4zhi2bian4hua41ri4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
