
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:02 CST 2022*/
package com.onectrm.akshare.api.generated.macro;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: macro
* 接口: macro_usa_core_ppi
* 目标地址: https://datacenter.jin10.com/reportType/dc_usa_core_ppi
* 描述: 获取美国核心生产者物价指数(PPI)报告, 数据区间从20080318-至今
* 限量: 单次返回所有历史数据
*/
public class macro_usa_core_ppiResponse extends AkShareRequestAndResponse {
    public macro_usa_core_ppiResponse(){
        setInterfaceName("macro_usa_core_ppi");
    }

    public static macro_usa_core_ppiResponse of(


    Double p_zhi2,

    LocalDate p_ri4qi1,


    Map.Entry<String, String>... others){
    macro_usa_core_ppiResponse t = new macro_usa_core_ppiResponse();


    t.p_zhi2 = p_zhi2;

    t.p_ri4qi1 = p_ri4qi1;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 值
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("值")
    
    
    private Double p_zhi2;

    public Double getP_zhi2() { return this.p_zhi2;}
    public void setP_zhi2(Double v) { this.p_zhi2 = v;}

    /**
    * name: 日期
    * type: str
    * desc: 日期-索引
    * required: Y
    */
    @JsonProperty("日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_ri4qi1;

    public LocalDate getP_ri4qi1() { return this.p_ri4qi1;}
    public void setP_ri4qi1(LocalDate v) { this.p_ri4qi1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
