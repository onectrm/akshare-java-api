
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
* 接口: macro_china_daily_energy
* 目标地址: https://datacenter.jin10.com/reportType/dc_qihuo_energy_report
* 描述: 获取中国日度沿海六大电库存数据, 数据区间从20160101-至今, 不再更新, 只能获得历史数据
* 限量: 单次返回所有历史数据
*/
public class macro_china_daily_energyResponse extends AkShareRequestAndResponse {
    public macro_china_daily_energyResponse(){
        setInterfaceName("macro_china_daily_energy");
    }

    public static macro_china_daily_energyResponse of(


    LocalDate p_ri4qi1,

    Double p_shu4zhi2,


    Map.Entry<String, String>... others){
    macro_china_daily_energyResponse t = new macro_china_daily_energyResponse();


    t.p_ri4qi1 = p_ri4qi1;

    t.p_shu4zhi2 = p_shu4zhi2;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



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

    /**
    * name: 数值
    * type: float
    * desc: energy
    * required: Y
    */
    @JsonProperty("数值")
    
    
    private Double p_shu4zhi2;

    public Double getP_shu4zhi2() { return this.p_shu4zhi2;}
    public void setP_shu4zhi2(Double v) { this.p_shu4zhi2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}