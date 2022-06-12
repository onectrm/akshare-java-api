
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.fx;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: fx
* 接口: fx_pair_quote
* 目标地址: http://www.chinamoney.com.cn/chinese/mkdatapfx/
* 描述: 获取外币对即期报价
* 限量: 单次返回当前时点最近更新的即时数据
*/
public class fx_pair_quoteResponse extends AkShareRequestAndResponse {
    public fx_pair_quoteResponse(){
        setInterfaceName("fx_pair_quote");
    }

    public static fx_pair_quoteResponse of(


    Double p_mai4bao4jia4,

    String p_huo4bi4dui4,

    LocalDateTime p_shi2jian1,

    Double p_zhong1jian1jia4,

    Double p_mai3bao4jia4,


    Map.Entry<String, String>... others){
    fx_pair_quoteResponse t = new fx_pair_quoteResponse();


    t.p_mai4bao4jia4 = p_mai4bao4jia4;

    t.p_huo4bi4dui4 = p_huo4bi4dui4;

    t.p_shi2jian1 = p_shi2jian1;

    t.p_zhong1jian1jia4 = p_zhong1jian1jia4;

    t.p_mai3bao4jia4 = p_mai3bao4jia4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 卖报价
    * type: float
    * desc: e.g., &quot;0.68461&quot;
    * required: Y
    */
    @JsonProperty("卖报价")
    
    
    private Double p_mai4bao4jia4;

    public Double getP_mai4bao4jia4() { return this.p_mai4bao4jia4;}
    public void setP_mai4bao4jia4(Double v) { this.p_mai4bao4jia4 = v;}

    /**
    * name: 货币对
    * type: str
    * desc: e.g., &quot;AUD/USD&quot;
    * required: Y
    */
    @JsonProperty("货币对")
    
    
    private String p_huo4bi4dui4;

    public String getP_huo4bi4dui4() { return this.p_huo4bi4dui4;}
    public void setP_huo4bi4dui4(String v) { this.p_huo4bi4dui4 = v;}

    /**
    * name: 时间
    * type: str
    * desc: 为空
    * required: Y
    */
    @JsonProperty("时间")
    
    @JsonDeserialize(using = JacksonDateTimeDeserializer.class) 
    private LocalDateTime p_shi2jian1;

    public LocalDateTime getP_shi2jian1() { return this.p_shi2jian1;}
    public void setP_shi2jian1(LocalDateTime v) { this.p_shi2jian1 = v;}

    /**
    * name: 中间价
    * type: float
    * desc: 为空
    * required: Y
    */
    @JsonProperty("中间价")
    
    
    private Double p_zhong1jian1jia4;

    public Double getP_zhong1jian1jia4() { return this.p_zhong1jian1jia4;}
    public void setP_zhong1jian1jia4(Double v) { this.p_zhong1jian1jia4 = v;}

    /**
    * name: 买报价
    * type: float
    * desc: e.g., &quot;0.68460&quot;
    * required: Y
    */
    @JsonProperty("买报价")
    
    
    private Double p_mai3bao4jia4;

    public Double getP_mai3bao4jia4() { return this.p_mai3bao4jia4;}
    public void setP_mai3bao4jia4(Double v) { this.p_mai3bao4jia4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}