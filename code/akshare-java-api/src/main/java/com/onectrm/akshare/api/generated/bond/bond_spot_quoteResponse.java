
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: bond
* 接口: bond_spot_quote
* 目标地址: http://www.chinamoney.com.cn/chinese/mkdatabond/
* 描述: 中国外汇交易中心暨全国银行间同业拆借中心-市场数据-市场行情-债券市场行情-现券市场做市报价
* 限量: 单次返回所有数据
*/
public class bond_spot_quoteResponse extends AkShareRequestAndResponse {
    public bond_spot_quoteResponse(){
        setInterfaceName("bond_spot_quote");
    }

    public static bond_spot_quoteResponse of(


    String p_zhai4quan4jian3cheng1,

    Double p_mai4chu1jing4jia4,

    Double p_mai3ru4jing4jia4,

    String p_bao4jia4ji1gou4,

    Double p_mai3ru4shou1yi4lu4,

    Double p_mai4chu1shou1yi4lu4,


    Map.Entry<String, String>... others){
    bond_spot_quoteResponse t = new bond_spot_quoteResponse();


    t.p_zhai4quan4jian3cheng1 = p_zhai4quan4jian3cheng1;

    t.p_mai4chu1jing4jia4 = p_mai4chu1jing4jia4;

    t.p_mai3ru4jing4jia4 = p_mai3ru4jing4jia4;

    t.p_bao4jia4ji1gou4 = p_bao4jia4ji1gou4;

    t.p_mai3ru4shou1yi4lu4 = p_mai3ru4shou1yi4lu4;

    t.p_mai4chu1shou1yi4lu4 = p_mai4chu1shou1yi4lu4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 债券简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("债券简称")
    
    
    private String p_zhai4quan4jian3cheng1;

    public String getP_zhai4quan4jian3cheng1() { return this.p_zhai4quan4jian3cheng1;}
    public void setP_zhai4quan4jian3cheng1(String v) { this.p_zhai4quan4jian3cheng1 = v;}

    /**
    * name: 卖出净价
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("卖出净价")
    
    
    private Double p_mai4chu1jing4jia4;

    public Double getP_mai4chu1jing4jia4() { return this.p_mai4chu1jing4jia4;}
    public void setP_mai4chu1jing4jia4(Double v) { this.p_mai4chu1jing4jia4 = v;}

    /**
    * name: 买入净价
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("买入净价")
    
    
    private Double p_mai3ru4jing4jia4;

    public Double getP_mai3ru4jing4jia4() { return this.p_mai3ru4jing4jia4;}
    public void setP_mai3ru4jing4jia4(Double v) { this.p_mai3ru4jing4jia4 = v;}

    /**
    * name: 报价机构
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("报价机构")
    
    
    private String p_bao4jia4ji1gou4;

    public String getP_bao4jia4ji1gou4() { return this.p_bao4jia4ji1gou4;}
    public void setP_bao4jia4ji1gou4(String v) { this.p_bao4jia4ji1gou4 = v;}

    /**
    * name: 买入收益率
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("买入收益率")
    
    
    private Double p_mai3ru4shou1yi4lu4;

    public Double getP_mai3ru4shou1yi4lu4() { return this.p_mai3ru4shou1yi4lu4;}
    public void setP_mai3ru4shou1yi4lu4(Double v) { this.p_mai3ru4shou1yi4lu4 = v;}

    /**
    * name: 卖出收益率
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("卖出收益率")
    
    
    private Double p_mai4chu1shou1yi4lu4;

    public Double getP_mai4chu1shou1yi4lu4() { return this.p_mai4chu1shou1yi4lu4;}
    public void setP_mai4chu1shou1yi4lu4(Double v) { this.p_mai4chu1shou1yi4lu4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}