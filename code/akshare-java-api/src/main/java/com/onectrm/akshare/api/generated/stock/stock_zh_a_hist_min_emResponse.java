
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
* 接口: stock_zh_a_hist_min_em
* 目标地址: http://quote.eastmoney.com/concept/sh603777.html?from=classic
* 描述: 东方财富网-行情首页-沪深京 A 股-每日分时行情; 该接口只能获取近期的分时数据，注意时间周期的设置
* 限量: 单次返回指定股票、频率、复权调整和时间区间的分时数据, 其中 1 分钟数据只返回近 5 个交易日数据且不复权
*/
public class stock_zh_a_hist_min_emResponse extends AkShareRequestAndResponse {
    public stock_zh_a_hist_min_emResponse(){
        setInterfaceName("stock_zh_a_hist_min_em");
    }

    public static stock_zh_a_hist_min_emResponse of(


    Double p_cheng2jiao1e2,

    Double p_shou1pan2,

    LocalDateTime p_shi2jian1,

    Double p_kai1pan2,

    Double p_zui4di1,

    Double p_zui4gao1,

    Double p_zui4xin1jia4,

    Double p_cheng2jiao1liang4,


    Map.Entry<String, String>... others){
    stock_zh_a_hist_min_emResponse t = new stock_zh_a_hist_min_emResponse();


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
