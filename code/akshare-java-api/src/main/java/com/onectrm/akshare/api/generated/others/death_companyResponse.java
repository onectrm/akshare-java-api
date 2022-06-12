
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
* 接口: death_company
* 目标地址: https://www.itjuzi.com/deathCompany
* 描述: 新经济死亡公司数据库
* 限量: 返回所有历史数据
*/
public class death_companyResponse extends AkShareRequestAndResponse {
    public death_companyResponse(){
        setInterfaceName("death_company");
    }

    public static death_companyResponse of(


    Double p_rong2zi1gui1mo2,

    String p_xing2ye4,

    Integer p_cun2huo2tian1shu4,

    String p_gong1si1jian3cheng1,

    String p_di4dian3,

    LocalDateTime p_guan1bi4shi2jian1,

    LocalDateTime p_cheng2li4shi2jian1,


    Map.Entry<String, String>... others){
    death_companyResponse t = new death_companyResponse();


    t.p_rong2zi1gui1mo2 = p_rong2zi1gui1mo2;

    t.p_xing2ye4 = p_xing2ye4;

    t.p_cun2huo2tian1shu4 = p_cun2huo2tian1shu4;

    t.p_gong1si1jian3cheng1 = p_gong1si1jian3cheng1;

    t.p_di4dian3 = p_di4dian3;

    t.p_guan1bi4shi2jian1 = p_guan1bi4shi2jian1;

    t.p_cheng2li4shi2jian1 = p_cheng2li4shi2jian1;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 融资规模
    * type: float64
    * desc: 注意单位: 万元
    * required: 
    */
    @JsonProperty("融资规模")
    
    
    private Double p_rong2zi1gui1mo2;

    public Double getP_rong2zi1gui1mo2() { return this.p_rong2zi1gui1mo2;}
    public void setP_rong2zi1gui1mo2(Double v) { this.p_rong2zi1gui1mo2 = v;}

    /**
    * name: 行业
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("行业")
    
    
    private String p_xing2ye4;

    public String getP_xing2ye4() { return this.p_xing2ye4;}
    public void setP_xing2ye4(String v) { this.p_xing2ye4 = v;}

    /**
    * name: 存活天数
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("存活天数")
    
    
    private Integer p_cun2huo2tian1shu4;

    public Integer getP_cun2huo2tian1shu4() { return this.p_cun2huo2tian1shu4;}
    public void setP_cun2huo2tian1shu4(Integer v) { this.p_cun2huo2tian1shu4 = v;}

    /**
    * name: 公司简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("公司简称")
    
    
    private String p_gong1si1jian3cheng1;

    public String getP_gong1si1jian3cheng1() { return this.p_gong1si1jian3cheng1;}
    public void setP_gong1si1jian3cheng1(String v) { this.p_gong1si1jian3cheng1 = v;}

    /**
    * name: 地点
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("地点")
    
    
    private String p_di4dian3;

    public String getP_di4dian3() { return this.p_di4dian3;}
    public void setP_di4dian3(String v) { this.p_di4dian3 = v;}

    /**
    * name: 关闭时间
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("关闭时间")
    
    @JsonDeserialize(using = JacksonDateTimeDeserializer.class) 
    private LocalDateTime p_guan1bi4shi2jian1;

    public LocalDateTime getP_guan1bi4shi2jian1() { return this.p_guan1bi4shi2jian1;}
    public void setP_guan1bi4shi2jian1(LocalDateTime v) { this.p_guan1bi4shi2jian1 = v;}

    /**
    * name: 成立时间
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("成立时间")
    
    @JsonDeserialize(using = JacksonDateTimeDeserializer.class) 
    private LocalDateTime p_cheng2li4shi2jian1;

    public LocalDateTime getP_cheng2li4shi2jian1() { return this.p_cheng2li4shi2jian1;}
    public void setP_cheng2li4shi2jian1(LocalDateTime v) { this.p_cheng2li4shi2jian1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
