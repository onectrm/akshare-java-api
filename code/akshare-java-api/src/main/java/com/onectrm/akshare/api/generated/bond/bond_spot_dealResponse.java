
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
* 接口: bond_spot_deal
* 目标地址: http://www.chinamoney.com.cn/chinese/mkdatabond/
* 描述: 中国外汇交易中心暨全国银行间同业拆借中心-市场数据-市场行情-债券市场行情-现券市场成交行情
* 限量: 单次返回所有即期数据
*/
public class bond_spot_dealResponse extends AkShareRequestAndResponse {
    public bond_spot_dealResponse(){
        setInterfaceName("bond_spot_deal");
    }

    public static bond_spot_dealResponse of(


    String p_zhai4quan4jian3cheng1,

    Double p_jia1quan2shou1yi4lu4,

    Double p_zhang3die1,

    Double p_cheng2jiao1jing4jia4,

    Double p_jiao1yi4liang4,

    Double p_zui4xin1shou1yi4lu4,


    Map.Entry<String, String>... others){
    bond_spot_dealResponse t = new bond_spot_dealResponse();


    t.p_zhai4quan4jian3cheng1 = p_zhai4quan4jian3cheng1;

    t.p_jia1quan2shou1yi4lu4 = p_jia1quan2shou1yi4lu4;

    t.p_zhang3die1 = p_zhang3die1;

    t.p_cheng2jiao1jing4jia4 = p_cheng2jiao1jing4jia4;

    t.p_jiao1yi4liang4 = p_jiao1yi4liang4;

    t.p_zui4xin1shou1yi4lu4 = p_zui4xin1shou1yi4lu4;


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
    * name: 加权收益率
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("加权收益率")
    
    
    private Double p_jia1quan2shou1yi4lu4;

    public Double getP_jia1quan2shou1yi4lu4() { return this.p_jia1quan2shou1yi4lu4;}
    public void setP_jia1quan2shou1yi4lu4(Double v) { this.p_jia1quan2shou1yi4lu4 = v;}

    /**
    * name: 涨跌
    * type: float64
    * desc: 注意单位: BP
    * required: 
    */
    @JsonProperty("涨跌")
    
    
    private Double p_zhang3die1;

    public Double getP_zhang3die1() { return this.p_zhang3die1;}
    public void setP_zhang3die1(Double v) { this.p_zhang3die1 = v;}

    /**
    * name: 成交净价
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("成交净价")
    
    
    private Double p_cheng2jiao1jing4jia4;

    public Double getP_cheng2jiao1jing4jia4() { return this.p_cheng2jiao1jing4jia4;}
    public void setP_cheng2jiao1jing4jia4(Double v) { this.p_cheng2jiao1jing4jia4 = v;}

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
    * name: 最新收益率
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("最新收益率")
    
    
    private Double p_zui4xin1shou1yi4lu4;

    public Double getP_zui4xin1shou1yi4lu4() { return this.p_zui4xin1shou1yi4lu4;}
    public void setP_zui4xin1shou1yi4lu4(Double v) { this.p_zui4xin1shou1yi4lu4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
