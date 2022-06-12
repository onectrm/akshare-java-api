
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
* 接口: nicorn_company
* 目标地址: https://www.itjuzi.com/unicorn
* 描述: 获取独角兽公司数据库, 该数据未更新
* 限量: 返回所有历史数据, 该数据未更新
*/
public class nicorn_companyResponse extends AkShareRequestAndResponse {
    public nicorn_companyResponse(){
        setInterfaceName("nicorn_company");
    }

    public static nicorn_companyResponse of(


    String p_gong1si1,

    String p_di4qu1,

    String p_xing2ye4,

    String p_xu4hao4,

    String p_zi5xing2ye4,


    Map.Entry<String, String>... others){
    nicorn_companyResponse t = new nicorn_companyResponse();


    t.p_gong1si1 = p_gong1si1;

    t.p_di4qu1 = p_di4qu1;

    t.p_xing2ye4 = p_xing2ye4;

    t.p_xu4hao4 = p_xu4hao4;

    t.p_zi5xing2ye4 = p_zi5xing2ye4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 公司
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("公司")
    
    
    private String p_gong1si1;

    public String getP_gong1si1() { return this.p_gong1si1;}
    public void setP_gong1si1(String v) { this.p_gong1si1 = v;}

    /**
    * name: 地区
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("地区")
    
    
    private String p_di4qu1;

    public String getP_di4qu1() { return this.p_di4qu1;}
    public void setP_di4qu1(String v) { this.p_di4qu1 = v;}

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
    * name: 序号
    * type: int32
    * desc: 
    * required: 
    */
    @JsonProperty("序号")
    
    
    private String p_xu4hao4;

    public String getP_xu4hao4() { return this.p_xu4hao4;}
    public void setP_xu4hao4(String v) { this.p_xu4hao4 = v;}

    /**
    * name: 子行业
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("子行业")
    
    
    private String p_zi5xing2ye4;

    public String getP_zi5xing2ye4() { return this.p_zi5xing2ye4;}
    public void setP_zi5xing2ye4(String v) { this.p_zi5xing2ye4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
