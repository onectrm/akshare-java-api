
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:02 CST 2022*/
package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: stock
* 接口: stock_cg_equity_mortgage_cninfo
* 目标地址: http://webapi.cninfo.com.cn/#/thematicStatistics
* 描述: 巨潮资讯-数据中心-专题统计-公司治理-股权质押
* 限量: 单次指定 date 的股权质押数据
*/
public class stock_cg_equity_mortgage_cninfoResponse extends AkShareRequestAndResponse {
    public stock_cg_equity_mortgage_cninfoResponse(){
        setInterfaceName("stock_cg_equity_mortgage_cninfo");
    }

    public static stock_cg_equity_mortgage_cninfoResponse of(


    Double p_zhi4ya1shu4liang4,

    Double p_zhi4ya1jie3chu2shu4liang4,

    String p_chu1zhi4ren2,

    String p_zhi4ya1shi4xiang4,

    Double p_zhan4zong3gu3ben3bi3li4,

    Double p_lei3ji4zhi4ya1zhan4zong3gu3ben3bi3li4,

    String p_zhi4quan2ren2,

    LocalDate p_gong1gao4ri4qi1,

    String p_gu3piao4jian3cheng1,

    String p_gu3piao4dai4ma3,


    Map.Entry<String, String>... others){
    stock_cg_equity_mortgage_cninfoResponse t = new stock_cg_equity_mortgage_cninfoResponse();


    t.p_zhi4ya1shu4liang4 = p_zhi4ya1shu4liang4;

    t.p_zhi4ya1jie3chu2shu4liang4 = p_zhi4ya1jie3chu2shu4liang4;

    t.p_chu1zhi4ren2 = p_chu1zhi4ren2;

    t.p_zhi4ya1shi4xiang4 = p_zhi4ya1shi4xiang4;

    t.p_zhan4zong3gu3ben3bi3li4 = p_zhan4zong3gu3ben3bi3li4;

    t.p_lei3ji4zhi4ya1zhan4zong3gu3ben3bi3li4 = p_lei3ji4zhi4ya1zhan4zong3gu3ben3bi3li4;

    t.p_zhi4quan2ren2 = p_zhi4quan2ren2;

    t.p_gong1gao4ri4qi1 = p_gong1gao4ri4qi1;

    t.p_gu3piao4jian3cheng1 = p_gu3piao4jian3cheng1;

    t.p_gu3piao4dai4ma3 = p_gu3piao4dai4ma3;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 质押数量
    * type: float64
    * desc: 注意单位: 万股
    * required: 
    */
    @JsonProperty("质押数量")
    
    
    private Double p_zhi4ya1shu4liang4;

    public Double getP_zhi4ya1shu4liang4() { return this.p_zhi4ya1shu4liang4;}
    public void setP_zhi4ya1shu4liang4(Double v) { this.p_zhi4ya1shu4liang4 = v;}

    /**
    * name: 质押解除数量
    * type: float64
    * desc: 注意单位: 万股
    * required: 
    */
    @JsonProperty("质押解除数量")
    
    
    private Double p_zhi4ya1jie3chu2shu4liang4;

    public Double getP_zhi4ya1jie3chu2shu4liang4() { return this.p_zhi4ya1jie3chu2shu4liang4;}
    public void setP_zhi4ya1jie3chu2shu4liang4(Double v) { this.p_zhi4ya1jie3chu2shu4liang4 = v;}

    /**
    * name: 出质人
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("出质人")
    
    
    private String p_chu1zhi4ren2;

    public String getP_chu1zhi4ren2() { return this.p_chu1zhi4ren2;}
    public void setP_chu1zhi4ren2(String v) { this.p_chu1zhi4ren2 = v;}

    /**
    * name: 质押事项
    * type: object
    * desc: 注意单位: 万元
    * required: 
    */
    @JsonProperty("质押事项")
    
    
    private String p_zhi4ya1shi4xiang4;

    public String getP_zhi4ya1shi4xiang4() { return this.p_zhi4ya1shi4xiang4;}
    public void setP_zhi4ya1shi4xiang4(String v) { this.p_zhi4ya1shi4xiang4 = v;}

    /**
    * name: 占总股本比例
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("占总股本比例")
    
    
    private Double p_zhan4zong3gu3ben3bi3li4;

    public Double getP_zhan4zong3gu3ben3bi3li4() { return this.p_zhan4zong3gu3ben3bi3li4;}
    public void setP_zhan4zong3gu3ben3bi3li4(Double v) { this.p_zhan4zong3gu3ben3bi3li4 = v;}

    /**
    * name: 累计质押占总股本比例
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("累计质押占总股本比例")
    
    
    private Double p_lei3ji4zhi4ya1zhan4zong3gu3ben3bi3li4;

    public Double getP_lei3ji4zhi4ya1zhan4zong3gu3ben3bi3li4() { return this.p_lei3ji4zhi4ya1zhan4zong3gu3ben3bi3li4;}
    public void setP_lei3ji4zhi4ya1zhan4zong3gu3ben3bi3li4(Double v) { this.p_lei3ji4zhi4ya1zhan4zong3gu3ben3bi3li4 = v;}

    /**
    * name: 质权人
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("质权人")
    
    
    private String p_zhi4quan2ren2;

    public String getP_zhi4quan2ren2() { return this.p_zhi4quan2ren2;}
    public void setP_zhi4quan2ren2(String v) { this.p_zhi4quan2ren2 = v;}

    /**
    * name: 公告日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("公告日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_gong1gao4ri4qi1;

    public LocalDate getP_gong1gao4ri4qi1() { return this.p_gong1gao4ri4qi1;}
    public void setP_gong1gao4ri4qi1(LocalDate v) { this.p_gong1gao4ri4qi1 = v;}

    /**
    * name: 股票简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股票简称")
    
    
    private String p_gu3piao4jian3cheng1;

    public String getP_gu3piao4jian3cheng1() { return this.p_gu3piao4jian3cheng1;}
    public void setP_gu3piao4jian3cheng1(String v) { this.p_gu3piao4jian3cheng1 = v;}

    /**
    * name: 股票代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股票代码")
    
    
    private String p_gu3piao4dai4ma3;

    public String getP_gu3piao4dai4ma3() { return this.p_gu3piao4dai4ma3;}
    public void setP_gu3piao4dai4ma3(String v) { this.p_gu3piao4dai4ma3 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}