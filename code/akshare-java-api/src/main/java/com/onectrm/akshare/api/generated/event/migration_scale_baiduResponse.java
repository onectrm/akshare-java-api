
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.event;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: event
* 接口: migration_scale_baidu
* 目标地址: https://qianxi.baidu.com/?from=shoubai#city=0
* 描述: 获取百度-百度地图慧眼-百度迁徙-迁徙规模
* 限量: 单次返回当前城市的去年和今年的迁徙规模数据, 查询参数中的 **start_date** 不要随意更改
*/
public class migration_scale_baiduResponse extends AkShareRequestAndResponse {
    public migration_scale_baiduResponse(){
        setInterfaceName("migration_scale_baidu");
    }

    public static migration_scale_baiduResponse of(


    LocalDate p_ri4qi1,

    String p_qian1xi3gui1mo2zhi3shu4,


    Map.Entry<String, String>... others){
    migration_scale_baiduResponse t = new migration_scale_baiduResponse();


    t.p_ri4qi1 = p_ri4qi1;

    t.p_qian1xi3gui1mo2zhi3shu4 = p_qian1xi3gui1mo2zhi3shu4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 日期
    * type: 索引
    * desc: 去年和今年的日期
    * required: 
    */
    @JsonProperty("日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_ri4qi1;

    public LocalDate getP_ri4qi1() { return this.p_ri4qi1;}
    public void setP_ri4qi1(LocalDate v) { this.p_ri4qi1 = v;}

    /**
    * name: 迁徙规模指数
    * type: str
    * desc: 定义参见百度, 同 covid_19_baidu 定义
    * required: 
    */
    @JsonProperty("迁徙规模指数")
    
    
    private String p_qian1xi3gui1mo2zhi3shu4;

    public String getP_qian1xi3gui1mo2zhi3shu4() { return this.p_qian1xi3gui1mo2zhi3shu4;}
    public void setP_qian1xi3gui1mo2zhi3shu4(String v) { this.p_qian1xi3gui1mo2zhi3shu4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
