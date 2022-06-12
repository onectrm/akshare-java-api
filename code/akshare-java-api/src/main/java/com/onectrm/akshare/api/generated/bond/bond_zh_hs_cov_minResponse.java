
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
* 接口: bond_zh_hs_cov_min
* 目标地址: https://quote.eastmoney.com/concept/sz128039.html
* 描述: 东方财富网-可转债-分时行情
* 限量: 单次返回指定可转债、指定频率、复权调整和时间区间的分时数据, 其中 1 分钟数据只返回近 1 个交易日数据且不复权
*/
public class bond_zh_hs_cov_minResponse extends AkShareRequestAndResponse {
    public bond_zh_hs_cov_minResponse(){
        setInterfaceName("bond_zh_hs_cov_min");
    }

    public static bond_zh_hs_cov_minResponse of(


    Double p_cheng2jiao1e2,

    Double p_shou1pan2,

    LocalDateTime p_shi2jian1,

    Double p_kai1pan2,

    Double p_zui4di1,

    Double p_zui4gao1,

    Double p_zui4xin1jia4,

    Double p_cheng2jiao1liang4,


    Map.Entry<String, String>... others){
    bond_zh_hs_cov_minResponse t = new bond_zh_hs_cov_minResponse();


    t.p_cheng2jiao1e2 = p_cheng2jiao1e2;

    t.p_shou1pan2 = p_shou1pan2;

    t.p_shi2jian1 = p_shi2jian1;

    t.p_kai1pan2 = p_kai1pan2;

    t.p_zui4di1 = p_zui4di1;

    t.p_zui4gao1 = p_zui4gao1;

    t.p_zui4xin1jia4 = p_zui4xin1jia4;

    t.p_cheng2jiao1liang4 = p_cheng2jiao1liang4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 成交额
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("成交额")
    
    
    private Double p_cheng2jiao1e2;

    public Double getP_cheng2jiao1e2() { return this.p_cheng2jiao1e2;}
    public void setP_cheng2jiao1e2(Double v) { this.p_cheng2jiao1e2 = v;}

    /**
    * name: 收盘
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("收盘")
    
    
    private Double p_shou1pan2;

    public Double getP_shou1pan2() { return this.p_shou1pan2;}
    public void setP_shou1pan2(Double v) { this.p_shou1pan2 = v;}

    /**
    * name: 时间
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("时间")
    
    @JsonDeserialize(using = JacksonDateTimeDeserializer.class) 
    private LocalDateTime p_shi2jian1;

    public LocalDateTime getP_shi2jian1() { return this.p_shi2jian1;}
    public void setP_shi2jian1(LocalDateTime v) { this.p_shi2jian1 = v;}

    /**
    * name: 开盘
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("开盘")
    
    
    private Double p_kai1pan2;

    public Double getP_kai1pan2() { return this.p_kai1pan2;}
    public void setP_kai1pan2(Double v) { this.p_kai1pan2 = v;}

    /**
    * name: 最低
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("最低")
    
    
    private Double p_zui4di1;

    public Double getP_zui4di1() { return this.p_zui4di1;}
    public void setP_zui4di1(Double v) { this.p_zui4di1 = v;}

    /**
    * name: 最高
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("最高")
    
    
    private Double p_zui4gao1;

    public Double getP_zui4gao1() { return this.p_zui4gao1;}
    public void setP_zui4gao1(Double v) { this.p_zui4gao1 = v;}

    /**
    * name: 最新价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("最新价")
    
    
    private Double p_zui4xin1jia4;

    public Double getP_zui4xin1jia4() { return this.p_zui4xin1jia4;}
    public void setP_zui4xin1jia4(Double v) { this.p_zui4xin1jia4 = v;}

    /**
    * name: 成交量
    * type: float64
    * desc: 注意单位: 手
    * required: 
    */
    @JsonProperty("成交量")
    
    
    private Double p_cheng2jiao1liang4;

    public Double getP_cheng2jiao1liang4() { return this.p_cheng2jiao1liang4;}
    public void setP_cheng2jiao1liang4(Double v) { this.p_cheng2jiao1liang4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
