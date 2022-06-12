
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
* 接口: macro_china_gdp
* 目标地址: http://data.eastmoney.com/cjsj/gdp.html
* 描述: 获取中国国内生产总值, 数据区间从 200601 至今, 月度数据
* 限量: 单次返回所有历史数据
*/
public class macro_china_gdpResponse extends AkShareRequestAndResponse {
    public macro_china_gdpResponse(){
        setInterfaceName("macro_china_gdp");
    }

    public static macro_china_gdpResponse of(


    Double p_di4yi1chan3ye4jue2dui4zhi2,

    Double p_di4yi1chan3ye4tong2bi3zeng1zhang3,

    Double p_di4er4chan3ye4jue2dui4zhi2,

    Double p_di4er4chan3ye4tong2bi3zeng1zhang3,

    Double p_guo2nei4sheng1chan3zong3zhi2tong2bi3zeng1zhang3,

    String p_ji4du4,

    Double p_di4san1chan3ye4jue2dui4zhi2,

    Double p_guo2nei4sheng1chan3zong3zhi2jue2dui4zhi2,

    Double p_di4san1chan3ye4tong2bi3zeng1zhang3,


    Map.Entry<String, String>... others){
    macro_china_gdpResponse t = new macro_china_gdpResponse();


    t.p_di4yi1chan3ye4jue2dui4zhi2 = p_di4yi1chan3ye4jue2dui4zhi2;

    t.p_di4yi1chan3ye4tong2bi3zeng1zhang3 = p_di4yi1chan3ye4tong2bi3zeng1zhang3;

    t.p_di4er4chan3ye4jue2dui4zhi2 = p_di4er4chan3ye4jue2dui4zhi2;

    t.p_di4er4chan3ye4tong2bi3zeng1zhang3 = p_di4er4chan3ye4tong2bi3zeng1zhang3;

    t.p_guo2nei4sheng1chan3zong3zhi2tong2bi3zeng1zhang3 = p_guo2nei4sheng1chan3zong3zhi2tong2bi3zeng1zhang3;

    t.p_ji4du4 = p_ji4du4;

    t.p_di4san1chan3ye4jue2dui4zhi2 = p_di4san1chan3ye4jue2dui4zhi2;

    t.p_guo2nei4sheng1chan3zong3zhi2jue2dui4zhi2 = p_guo2nei4sheng1chan3zong3zhi2jue2dui4zhi2;

    t.p_di4san1chan3ye4tong2bi3zeng1zhang3 = p_di4san1chan3ye4tong2bi3zeng1zhang3;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 第一产业-绝对值
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("第一产业-绝对值")
    
    
    private Double p_di4yi1chan3ye4jue2dui4zhi2;

    public Double getP_di4yi1chan3ye4jue2dui4zhi2() { return this.p_di4yi1chan3ye4jue2dui4zhi2;}
    public void setP_di4yi1chan3ye4jue2dui4zhi2(Double v) { this.p_di4yi1chan3ye4jue2dui4zhi2 = v;}

    /**
    * name: 第一产业-同比增长
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("第一产业-同比增长")
    
    
    private Double p_di4yi1chan3ye4tong2bi3zeng1zhang3;

    public Double getP_di4yi1chan3ye4tong2bi3zeng1zhang3() { return this.p_di4yi1chan3ye4tong2bi3zeng1zhang3;}
    public void setP_di4yi1chan3ye4tong2bi3zeng1zhang3(Double v) { this.p_di4yi1chan3ye4tong2bi3zeng1zhang3 = v;}

    /**
    * name: 第二产业-绝对值
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("第二产业-绝对值")
    
    
    private Double p_di4er4chan3ye4jue2dui4zhi2;

    public Double getP_di4er4chan3ye4jue2dui4zhi2() { return this.p_di4er4chan3ye4jue2dui4zhi2;}
    public void setP_di4er4chan3ye4jue2dui4zhi2(Double v) { this.p_di4er4chan3ye4jue2dui4zhi2 = v;}

    /**
    * name: 第二产业-同比增长
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("第二产业-同比增长")
    
    
    private Double p_di4er4chan3ye4tong2bi3zeng1zhang3;

    public Double getP_di4er4chan3ye4tong2bi3zeng1zhang3() { return this.p_di4er4chan3ye4tong2bi3zeng1zhang3;}
    public void setP_di4er4chan3ye4tong2bi3zeng1zhang3(Double v) { this.p_di4er4chan3ye4tong2bi3zeng1zhang3 = v;}

    /**
    * name: 国内生产总值-同比增长
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("国内生产总值-同比增长")
    
    
    private Double p_guo2nei4sheng1chan3zong3zhi2tong2bi3zeng1zhang3;

    public Double getP_guo2nei4sheng1chan3zong3zhi2tong2bi3zeng1zhang3() { return this.p_guo2nei4sheng1chan3zong3zhi2tong2bi3zeng1zhang3;}
    public void setP_guo2nei4sheng1chan3zong3zhi2tong2bi3zeng1zhang3(Double v) { this.p_guo2nei4sheng1chan3zong3zhi2tong2bi3zeng1zhang3 = v;}

    /**
    * name: 季度
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("季度")
    
    
    private String p_ji4du4;

    public String getP_ji4du4() { return this.p_ji4du4;}
    public void setP_ji4du4(String v) { this.p_ji4du4 = v;}

    /**
    * name: 第三产业-绝对值
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("第三产业-绝对值")
    
    
    private Double p_di4san1chan3ye4jue2dui4zhi2;

    public Double getP_di4san1chan3ye4jue2dui4zhi2() { return this.p_di4san1chan3ye4jue2dui4zhi2;}
    public void setP_di4san1chan3ye4jue2dui4zhi2(Double v) { this.p_di4san1chan3ye4jue2dui4zhi2 = v;}

    /**
    * name: 国内生产总值-绝对值
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("国内生产总值-绝对值")
    
    
    private Double p_guo2nei4sheng1chan3zong3zhi2jue2dui4zhi2;

    public Double getP_guo2nei4sheng1chan3zong3zhi2jue2dui4zhi2() { return this.p_guo2nei4sheng1chan3zong3zhi2jue2dui4zhi2;}
    public void setP_guo2nei4sheng1chan3zong3zhi2jue2dui4zhi2(Double v) { this.p_guo2nei4sheng1chan3zong3zhi2jue2dui4zhi2 = v;}

    /**
    * name: 第三产业-同比增长
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("第三产业-同比增长")
    
    
    private Double p_di4san1chan3ye4tong2bi3zeng1zhang3;

    public Double getP_di4san1chan3ye4tong2bi3zeng1zhang3() { return this.p_di4san1chan3ye4tong2bi3zeng1zhang3;}
    public void setP_di4san1chan3ye4tong2bi3zeng1zhang3(Double v) { this.p_di4san1chan3ye4tong2bi3zeng1zhang3 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}