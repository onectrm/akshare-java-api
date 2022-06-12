
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.interest_rate;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: interest_rate
* 接口: macro_bank_japan_interest_rate
* 目标地址: https://datacenter.jin10.com/reportType/dc_japan_interest_rate_decision
* 描述: 日本利率决议报告, 数据区间从 20080214-至今
* 限量: 单次返回所有历史数据
*/
public class macro_bank_japan_interest_rateResponse extends AkShareRequestAndResponse {
    public macro_bank_japan_interest_rateResponse(){
        setInterfaceName("macro_bank_japan_interest_rate");
    }

    public static macro_bank_japan_interest_rateResponse of(


    String p_shang1pin3,

    LocalDate p_ri4qi1,

    Double p_yu4ce4zhi2,

    Double p_jin1zhi2,

    Double p_qian2zhi2,


    Map.Entry<String, String>... others){
    macro_bank_japan_interest_rateResponse t = new macro_bank_japan_interest_rateResponse();


    t.p_shang1pin3 = p_shang1pin3;

    t.p_ri4qi1 = p_ri4qi1;

    t.p_yu4ce4zhi2 = p_yu4ce4zhi2;

    t.p_jin1zhi2 = p_jin1zhi2;

    t.p_qian2zhi2 = p_qian2zhi2;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 商品
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("商品")
    
    
    private String p_shang1pin3;

    public String getP_shang1pin3() { return this.p_shang1pin3;}
    public void setP_shang1pin3(String v) { this.p_shang1pin3 = v;}

    /**
    * name: 日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_ri4qi1;

    public LocalDate getP_ri4qi1() { return this.p_ri4qi1;}
    public void setP_ri4qi1(LocalDate v) { this.p_ri4qi1 = v;}

    /**
    * name: 预测值
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("预测值")
    
    
    private Double p_yu4ce4zhi2;

    public Double getP_yu4ce4zhi2() { return this.p_yu4ce4zhi2;}
    public void setP_yu4ce4zhi2(Double v) { this.p_yu4ce4zhi2 = v;}

    /**
    * name: 今值
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("今值")
    
    
    private Double p_jin1zhi2;

    public Double getP_jin1zhi2() { return this.p_jin1zhi2;}
    public void setP_jin1zhi2(Double v) { this.p_jin1zhi2 = v;}

    /**
    * name: 前值
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("前值")
    
    
    private Double p_qian2zhi2;

    public Double getP_qian2zhi2() { return this.p_qian2zhi2;}
    public void setP_qian2zhi2(Double v) { this.p_qian2zhi2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
