
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
* 接口: macro_china_gksccz
* 目标地址: http://www.chinamoney.com.cn/chinese/yhgkscczh/
* 描述: 央行公开市场操作; 数据区间从 20040116 至今
* 限量: 单次返回所有历史数据
*/
public class macro_china_gkscczResponse extends AkShareRequestAndResponse {
    public macro_china_gkscczResponse(){
        setInterfaceName("macro_china_gksccz");
    }

    public static macro_china_gkscczResponse of(


    LocalDate p_cao1zuo4ri4qi1,

    Double p_jiao1yi4liang4,

    String p_zheng4ni4hui2gou4,

    Double p_qi1xian4,

    Double p_zhong1biao1li4lu4,


    Map.Entry<String, String>... others){
    macro_china_gkscczResponse t = new macro_china_gkscczResponse();


    t.p_cao1zuo4ri4qi1 = p_cao1zuo4ri4qi1;

    t.p_jiao1yi4liang4 = p_jiao1yi4liang4;

    t.p_zheng4ni4hui2gou4 = p_zheng4ni4hui2gou4;

    t.p_qi1xian4 = p_qi1xian4;

    t.p_zhong1biao1li4lu4 = p_zhong1biao1li4lu4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 操作日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("操作日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_cao1zuo4ri4qi1;

    public LocalDate getP_cao1zuo4ri4qi1() { return this.p_cao1zuo4ri4qi1;}
    public void setP_cao1zuo4ri4qi1(LocalDate v) { this.p_cao1zuo4ri4qi1 = v;}

    /**
    * name: 交易量
    * type: float64
    * desc: 注意单位: 亿
    * required: 
    */
    @JsonProperty("交易量")
    
    
    private Double p_jiao1yi4liang4;

    public Double getP_jiao1yi4liang4() { return this.p_jiao1yi4liang4;}
    public void setP_jiao1yi4liang4(Double v) { this.p_jiao1yi4liang4 = v;}

    /**
    * name: 正/逆回购
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("正/逆回购")
    
    
    private String p_zheng4ni4hui2gou4;

    public String getP_zheng4ni4hui2gou4() { return this.p_zheng4ni4hui2gou4;}
    public void setP_zheng4ni4hui2gou4(String v) { this.p_zheng4ni4hui2gou4 = v;}

    /**
    * name: 期限
    * type: float64
    * desc: 注意单位: 天
    * required: 
    */
    @JsonProperty("期限")
    
    
    private Double p_qi1xian4;

    public Double getP_qi1xian4() { return this.p_qi1xian4;}
    public void setP_qi1xian4(Double v) { this.p_qi1xian4 = v;}

    /**
    * name: 中标利率
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("中标利率")
    
    
    private Double p_zhong1biao1li4lu4;

    public Double getP_zhong1biao1li4lu4() { return this.p_zhong1biao1li4lu4;}
    public void setP_zhong1biao1li4lu4(Double v) { this.p_zhong1biao1li4lu4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}