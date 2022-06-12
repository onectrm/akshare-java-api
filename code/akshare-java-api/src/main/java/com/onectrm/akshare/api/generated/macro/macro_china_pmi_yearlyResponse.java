
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
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
* 接口: macro_china_pmi_yearly
* 目标地址: https://datacenter.jin10.com/reportType/dc_chinese_manufacturing_pmi
* 描述: 获取中国年度PMI数据, 数据区间从20050201-至今
* 限量: 单次返回所有历史数据
*/
public class macro_china_pmi_yearlyResponse extends AkShareRequestAndResponse {
    public macro_china_pmi_yearlyResponse(){
        setInterfaceName("macro_china_pmi_yearly");
    }

    public static macro_china_pmi_yearlyResponse of(


    Double p_value,

    LocalDate p_index,


    Map.Entry<String, String>... others){
    macro_china_pmi_yearlyResponse t = new macro_china_pmi_yearlyResponse();


    t.p_value = p_value;

    t.p_index = p_index;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: value
    * type: float
    * desc: 年率
    * required: Y
    */
    @JsonProperty("value")
    
    
    private Double p_value;

    public Double getP_value() { return this.p_value;}
    public void setP_value(Double v) { this.p_value = v;}

    /**
    * name: index
    * type: str
    * desc: 日期-索引
    * required: Y
    */
    @JsonProperty("index")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_index;

    public LocalDate getP_index() { return this.p_index;}
    public void setP_index(LocalDate v) { this.p_index = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}