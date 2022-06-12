
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
* 接口: currency_hist
* 目标地址: https://cn.investing.com/currencies/
* 描述: 获取指定外币对指定时间的历史数据, 此接口需要使用代理访问
* 限量: 单次返回指定时间的所有历史数据
*/
public class currency_histResponse extends AkShareRequestAndResponse {
    public currency_histResponse(){
        setInterfaceName("currency_hist");
    }

    public static currency_histResponse of(


    Double p_gao1,

    Double p_shou1pan2,

    LocalDate p_ri4qi1,

    Double p_kai1pan2,

    Double p_zhang3die1fu2,

    Double p_di1,


    Map.Entry<String, String>... others){
    currency_histResponse t = new currency_histResponse();


    t.p_gao1 = p_gao1;

    t.p_shou1pan2 = p_shou1pan2;

    t.p_ri4qi1 = p_ri4qi1;

    t.p_kai1pan2 = p_kai1pan2;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_di1 = p_di1;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 高
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("高")
    
    
    private Double p_gao1;

    public Double getP_gao1() { return this.p_gao1;}
    public void setP_gao1(Double v) { this.p_gao1 = v;}

    /**
    * name: 收盘
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("收盘")
    
    
    private Double p_shou1pan2;

    public Double getP_shou1pan2() { return this.p_shou1pan2;}
    public void setP_shou1pan2(Double v) { this.p_shou1pan2 = v;}

    /**
    * name: 日期
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_ri4qi1;

    public LocalDate getP_ri4qi1() { return this.p_ri4qi1;}
    public void setP_ri4qi1(LocalDate v) { this.p_ri4qi1 = v;}

    /**
    * name: 开盘
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("开盘")
    
    
    private Double p_kai1pan2;

    public Double getP_kai1pan2() { return this.p_kai1pan2;}
    public void setP_kai1pan2(Double v) { this.p_kai1pan2 = v;}

    /**
    * name: 涨跌幅
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("涨跌幅")
    
    
    private Double p_zhang3die1fu2;

    public Double getP_zhang3die1fu2() { return this.p_zhang3die1fu2;}
    public void setP_zhang3die1fu2(Double v) { this.p_zhang3die1fu2 = v;}

    /**
    * name: 低
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("低")
    
    
    private Double p_di1;

    public Double getP_di1() { return this.p_di1;}
    public void setP_di1(Double v) { this.p_di1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}