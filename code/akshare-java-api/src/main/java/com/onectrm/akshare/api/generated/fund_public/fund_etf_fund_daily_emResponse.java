
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: fund_public
* 接口: fund_etf_fund_daily_em
* 目标地址: http://fund.eastmoney.com/cnjy_dwjz.html
* 描述: 东方财富网站-天天基金网-基金数据-场内交易基金-实时数据, 此接口数据每个交易日 **16:00～23:00**
* 限量: 单次返回当前时刻所有数据
*/
public class fund_etf_fund_daily_emResponse extends AkShareRequestAndResponse {
    public fund_etf_fund_daily_emResponse(){
        setInterfaceName("fund_etf_fund_daily_em");
    }

    public static fund_etf_fund_daily_emResponse of(


    String p_shi4jia4,

    String p_zhe2jia4lu4,

    Double p_qian2yi1ge4jiao1yi4ri4dan1wei4jing4zhi2,

    String p_zeng1zhang3lu4,

    Double p_dang1qian2jiao1yi4ri4dan1wei4jing4zhi2,

    String p_ji1jin1jian3cheng1,

    String p_ji1jin1dai4ma3,

    Double p_dang1qian2jiao1yi4ri4lei3ji4jing4zhi2,

    Double p_qian2yi1ge4jiao1yi4ri4lei3ji4jing4zhi2,

    Double p_zeng1zhang3zhi2,

    Double p_lei4xing2,


    Map.Entry<String, String>... others){
    fund_etf_fund_daily_emResponse t = new fund_etf_fund_daily_emResponse();


    t.p_shi4jia4 = p_shi4jia4;

    t.p_zhe2jia4lu4 = p_zhe2jia4lu4;

    t.p_qian2yi1ge4jiao1yi4ri4dan1wei4jing4zhi2 = p_qian2yi1ge4jiao1yi4ri4dan1wei4jing4zhi2;

    t.p_zeng1zhang3lu4 = p_zeng1zhang3lu4;

    t.p_dang1qian2jiao1yi4ri4dan1wei4jing4zhi2 = p_dang1qian2jiao1yi4ri4dan1wei4jing4zhi2;

    t.p_ji1jin1jian3cheng1 = p_ji1jin1jian3cheng1;

    t.p_ji1jin1dai4ma3 = p_ji1jin1dai4ma3;

    t.p_dang1qian2jiao1yi4ri4lei3ji4jing4zhi2 = p_dang1qian2jiao1yi4ri4lei3ji4jing4zhi2;

    t.p_qian2yi1ge4jiao1yi4ri4lei3ji4jing4zhi2 = p_qian2yi1ge4jiao1yi4ri4lei3ji4jing4zhi2;

    t.p_zeng1zhang3zhi2 = p_zeng1zhang3zhi2;

    t.p_lei4xing2 = p_lei4xing2;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 市价
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("市价")
    
    
    private String p_shi4jia4;

    public String getP_shi4jia4() { return this.p_shi4jia4;}
    public void setP_shi4jia4(String v) { this.p_shi4jia4 = v;}

    /**
    * name: 折价率
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("折价率")
    
    
    private String p_zhe2jia4lu4;

    public String getP_zhe2jia4lu4() { return this.p_zhe2jia4lu4;}
    public void setP_zhe2jia4lu4(String v) { this.p_zhe2jia4lu4 = v;}

    /**
    * name: 前一个交易日-单位净值
    * type: float64
    * desc: 会返回具体的日期值作为字段
    * required: 
    */
    @JsonProperty("前一个交易日-单位净值")
    
    
    private Double p_qian2yi1ge4jiao1yi4ri4dan1wei4jing4zhi2;

    public Double getP_qian2yi1ge4jiao1yi4ri4dan1wei4jing4zhi2() { return this.p_qian2yi1ge4jiao1yi4ri4dan1wei4jing4zhi2;}
    public void setP_qian2yi1ge4jiao1yi4ri4dan1wei4jing4zhi2(Double v) { this.p_qian2yi1ge4jiao1yi4ri4dan1wei4jing4zhi2 = v;}

    /**
    * name: 增长率
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("增长率")
    
    
    private String p_zeng1zhang3lu4;

    public String getP_zeng1zhang3lu4() { return this.p_zeng1zhang3lu4;}
    public void setP_zeng1zhang3lu4(String v) { this.p_zeng1zhang3lu4 = v;}

    /**
    * name: 当前交易日-单位净值
    * type: float64
    * desc: 会返回具体的日期值作为字段
    * required: 
    */
    @JsonProperty("当前交易日-单位净值")
    
    
    private Double p_dang1qian2jiao1yi4ri4dan1wei4jing4zhi2;

    public Double getP_dang1qian2jiao1yi4ri4dan1wei4jing4zhi2() { return this.p_dang1qian2jiao1yi4ri4dan1wei4jing4zhi2;}
    public void setP_dang1qian2jiao1yi4ri4dan1wei4jing4zhi2(Double v) { this.p_dang1qian2jiao1yi4ri4dan1wei4jing4zhi2 = v;}

    /**
    * name: 基金简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("基金简称")
    
    
    private String p_ji1jin1jian3cheng1;

    public String getP_ji1jin1jian3cheng1() { return this.p_ji1jin1jian3cheng1;}
    public void setP_ji1jin1jian3cheng1(String v) { this.p_ji1jin1jian3cheng1 = v;}

    /**
    * name: 基金代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("基金代码")
    
    
    private String p_ji1jin1dai4ma3;

    public String getP_ji1jin1dai4ma3() { return this.p_ji1jin1dai4ma3;}
    public void setP_ji1jin1dai4ma3(String v) { this.p_ji1jin1dai4ma3 = v;}

    /**
    * name: 当前交易日-累计净值
    * type: float64
    * desc: 会返回具体的日期值作为字段
    * required: 
    */
    @JsonProperty("当前交易日-累计净值")
    
    
    private Double p_dang1qian2jiao1yi4ri4lei3ji4jing4zhi2;

    public Double getP_dang1qian2jiao1yi4ri4lei3ji4jing4zhi2() { return this.p_dang1qian2jiao1yi4ri4lei3ji4jing4zhi2;}
    public void setP_dang1qian2jiao1yi4ri4lei3ji4jing4zhi2(Double v) { this.p_dang1qian2jiao1yi4ri4lei3ji4jing4zhi2 = v;}

    /**
    * name: 前一个交易日-累计净值
    * type: float64
    * desc: 会返回具体的日期值作为字段
    * required: 
    */
    @JsonProperty("前一个交易日-累计净值")
    
    
    private Double p_qian2yi1ge4jiao1yi4ri4lei3ji4jing4zhi2;

    public Double getP_qian2yi1ge4jiao1yi4ri4lei3ji4jing4zhi2() { return this.p_qian2yi1ge4jiao1yi4ri4lei3ji4jing4zhi2;}
    public void setP_qian2yi1ge4jiao1yi4ri4lei3ji4jing4zhi2(Double v) { this.p_qian2yi1ge4jiao1yi4ri4lei3ji4jing4zhi2 = v;}

    /**
    * name: 增长值
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("增长值")
    
    
    private Double p_zeng1zhang3zhi2;

    public Double getP_zeng1zhang3zhi2() { return this.p_zeng1zhang3zhi2;}
    public void setP_zeng1zhang3zhi2(Double v) { this.p_zeng1zhang3zhi2 = v;}

    /**
    * name: 类型
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("类型")
    
    
    private Double p_lei4xing2;

    public Double getP_lei4xing2() { return this.p_lei4xing2;}
    public void setP_lei4xing2(Double v) { this.p_lei4xing2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
