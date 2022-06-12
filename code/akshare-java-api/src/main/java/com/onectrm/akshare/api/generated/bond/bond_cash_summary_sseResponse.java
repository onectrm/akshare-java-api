
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: bond
* 接口: bond_cash_summary_sse
* 目标地址: http://bond.sse.com.cn/data/statistics/overview/bondow/
* 描述: 上登债券信息网-市场数据-市场统计-市场概览-债券现券市场概览
* 限量: 单次返回指定交易日的债券现券市场概览数据
*/
public class bond_cash_summary_sseResponse extends AkShareRequestAndResponse {
    public bond_cash_summary_sseResponse(){
        setInterfaceName("bond_cash_summary_sse");
    }

    public static bond_cash_summary_sseResponse of(


    Double p_tuo1guan3mian4zhi2,

    Integer p_tuo1guan3zhi3shu4,

    LocalDate p_shu4ju4ri4qi1,

    Double p_tuo1guan3shi4zhi2,

    String p_zhai4quan4xian4huo4,


    Map.Entry<String, String>... others){
    bond_cash_summary_sseResponse t = new bond_cash_summary_sseResponse();


    t.p_tuo1guan3mian4zhi2 = p_tuo1guan3mian4zhi2;

    t.p_tuo1guan3zhi3shu4 = p_tuo1guan3zhi3shu4;

    t.p_shu4ju4ri4qi1 = p_shu4ju4ri4qi1;

    t.p_tuo1guan3shi4zhi2 = p_tuo1guan3shi4zhi2;

    t.p_zhai4quan4xian4huo4 = p_zhai4quan4xian4huo4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 托管面值
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("托管面值")
    
    
    private Double p_tuo1guan3mian4zhi2;

    public Double getP_tuo1guan3mian4zhi2() { return this.p_tuo1guan3mian4zhi2;}
    public void setP_tuo1guan3mian4zhi2(Double v) { this.p_tuo1guan3mian4zhi2 = v;}

    /**
    * name: 托管只数
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("托管只数")
    
    
    private Integer p_tuo1guan3zhi3shu4;

    public Integer getP_tuo1guan3zhi3shu4() { return this.p_tuo1guan3zhi3shu4;}
    public void setP_tuo1guan3zhi3shu4(Integer v) { this.p_tuo1guan3zhi3shu4 = v;}

    /**
    * name: 数据日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("数据日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_shu4ju4ri4qi1;

    public LocalDate getP_shu4ju4ri4qi1() { return this.p_shu4ju4ri4qi1;}
    public void setP_shu4ju4ri4qi1(LocalDate v) { this.p_shu4ju4ri4qi1 = v;}

    /**
    * name: 托管市值
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("托管市值")
    
    
    private Double p_tuo1guan3shi4zhi2;

    public Double getP_tuo1guan3shi4zhi2() { return this.p_tuo1guan3shi4zhi2;}
    public void setP_tuo1guan3shi4zhi2(Double v) { this.p_tuo1guan3shi4zhi2 = v;}

    /**
    * name: 债券现货
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("债券现货")
    
    
    private String p_zhai4quan4xian4huo4;

    public String getP_zhai4quan4xian4huo4() { return this.p_zhai4quan4xian4huo4;}
    public void setP_zhai4quan4xian4huo4(String v) { this.p_zhai4quan4xian4huo4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
