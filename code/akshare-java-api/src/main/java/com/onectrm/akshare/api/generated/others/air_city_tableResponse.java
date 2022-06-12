
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:02 CST 2022*/
package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: others
* 接口: air_city_table
* 目标地址: https://www.aqistudy.cn/
* 描述: 所有能获取空气质量数据的城市表
* 限量: 单次返回所有可以获取的城市表数据
*/
public class air_city_tableResponse extends AkShareRequestAndResponse {
    public air_city_tableResponse(){
        setInterfaceName("air_city_table");
    }

    public static air_city_tableResponse of(


    String p_cheng2shi4,

    String p_kong1qi4zhi4liang4,

    Integer p_xu4hao4,

    String p_sheng3fen4,

    Double p_AQI,

    String p_shou3yao4wu1ran3wu4,

    String p_PM25nong2du4,


    Map.Entry<String, String>... others){
    air_city_tableResponse t = new air_city_tableResponse();


    t.p_cheng2shi4 = p_cheng2shi4;

    t.p_kong1qi4zhi4liang4 = p_kong1qi4zhi4liang4;

    t.p_xu4hao4 = p_xu4hao4;

    t.p_sheng3fen4 = p_sheng3fen4;

    t.p_AQI = p_AQI;

    t.p_shou3yao4wu1ran3wu4 = p_shou3yao4wu1ran3wu4;

    t.p_PM25nong2du4 = p_PM25nong2du4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 城市
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("城市")
    
    
    private String p_cheng2shi4;

    public String getP_cheng2shi4() { return this.p_cheng2shi4;}
    public void setP_cheng2shi4(String v) { this.p_cheng2shi4 = v;}

    /**
    * name: 空气质量
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("空气质量")
    
    
    private String p_kong1qi4zhi4liang4;

    public String getP_kong1qi4zhi4liang4() { return this.p_kong1qi4zhi4liang4;}
    public void setP_kong1qi4zhi4liang4(String v) { this.p_kong1qi4zhi4liang4 = v;}

    /**
    * name: 序号
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("序号")
    
    
    private Integer p_xu4hao4;

    public Integer getP_xu4hao4() { return this.p_xu4hao4;}
    public void setP_xu4hao4(Integer v) { this.p_xu4hao4 = v;}

    /**
    * name: 省份
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("省份")
    
    
    private String p_sheng3fen4;

    public String getP_sheng3fen4() { return this.p_sheng3fen4;}
    public void setP_sheng3fen4(String v) { this.p_sheng3fen4 = v;}

    /**
    * name: AQI
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("AQI")
    
    
    private Double p_AQI;

    public Double getP_AQI() { return this.p_AQI;}
    public void setP_AQI(Double v) { this.p_AQI = v;}

    /**
    * name: 首要污染物
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("首要污染物")
    
    
    private String p_shou3yao4wu1ran3wu4;

    public String getP_shou3yao4wu1ran3wu4() { return this.p_shou3yao4wu1ran3wu4;}
    public void setP_shou3yao4wu1ran3wu4(String v) { this.p_shou3yao4wu1ran3wu4 = v;}

    /**
    * name: PM2.5浓度
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("PM2.5浓度")
    
    
    private String p_PM25nong2du4;

    public String getP_PM25nong2du4() { return this.p_PM25nong2du4;}
    public void setP_PM25nong2du4(String v) { this.p_PM25nong2du4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}