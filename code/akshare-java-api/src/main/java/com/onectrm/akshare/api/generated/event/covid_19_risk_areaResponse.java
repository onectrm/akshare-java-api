
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
* 接口: covid_19_risk_area
* 目标地址: http://bmfw.www.gov.cn/yqfxdjcx/risk.html
* 描述: 卫生健康委-疫情风险等级查询
* 限量: 单次返回当前时刻所有数据
*/
public class covid_19_risk_areaResponse extends AkShareRequestAndResponse {
    public covid_19_risk_areaResponse(){
        setInterfaceName("covid_19_risk_area");
    }

    public static covid_19_risk_areaResponse of(


    String p_city,

    Integer p_number,

    String p_province,

    String p_areaname,

    LocalDateTime p_reportdate,

    String p_communitys,

    String p_county,

    String p_grade,


    Map.Entry<String, String>... others){
    covid_19_risk_areaResponse t = new covid_19_risk_areaResponse();


    t.p_city = p_city;

    t.p_number = p_number;

    t.p_province = p_province;

    t.p_areaname = p_areaname;

    t.p_reportdate = p_reportdate;

    t.p_communitys = p_communitys;

    t.p_county = p_county;

    t.p_grade = p_grade;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: city
    * type: object
    * desc: 市
    * required: 
    */
    @JsonProperty("city")
    
    
    private String p_city;

    public String getP_city() { return this.p_city;}
    public void setP_city(String v) { this.p_city = v;}

    /**
    * name: number
    * type: int64
    * desc: 数量
    * required: 
    */
    @JsonProperty("number")
    
    
    private Integer p_number;

    public Integer getP_number() { return this.p_number;}
    public void setP_number(Integer v) { this.p_number = v;}

    /**
    * name: province
    * type: object
    * desc: 省
    * required: 
    */
    @JsonProperty("province")
    
    
    private String p_province;

    public String getP_province() { return this.p_province;}
    public void setP_province(String v) { this.p_province = v;}

    /**
    * name: area_name
    * type: object
    * desc: 区
    * required: 
    */
    @JsonProperty("area_name")
    
    
    private String p_areaname;

    public String getP_areaname() { return this.p_areaname;}
    public void setP_areaname(String v) { this.p_areaname = v;}

    /**
    * name: report_date
    * type: object
    * desc: 报告时间
    * required: 
    */
    @JsonProperty("report_date")
    
    @JsonDeserialize(using = JacksonDateTimeDeserializer.class) 
    private LocalDateTime p_reportdate;

    public LocalDateTime getP_reportdate() { return this.p_reportdate;}
    public void setP_reportdate(LocalDateTime v) { this.p_reportdate = v;}

    /**
    * name: communitys
    * type: object
    * desc: 社区
    * required: 
    */
    @JsonProperty("communitys")
    
    
    private String p_communitys;

    public String getP_communitys() { return this.p_communitys;}
    public void setP_communitys(String v) { this.p_communitys = v;}

    /**
    * name: county
    * type: object
    * desc: 乡镇
    * required: 
    */
    @JsonProperty("county")
    
    
    private String p_county;

    public String getP_county() { return this.p_county;}
    public void setP_county(String v) { this.p_county = v;}

    /**
    * name: grade
    * type: object
    * desc: 等级
    * required: 
    */
    @JsonProperty("grade")
    
    
    private String p_grade;

    public String getP_grade() { return this.p_grade;}
    public void setP_grade(String v) { this.p_grade = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}