
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
* 接口: stock_hk_hist
* 目标地址: http://quote.eastmoney.com/hk/08367.html
* 描述: 港股-历史行情数据, 可以选择返回复权后数据, 更新频率为日频
* 限量: 单次返回指定上市公司的历史行情数据
*/
public class stock_hk_histResponse extends AkShareRequestAndResponse {
    public stock_hk_histResponse(){
        setInterfaceName("stock_hk_hist");
    }

    public static stock_hk_histResponse of(


    Double p_cheng2jiao1e2,

    Double p_zhang3die1e2,

    Double p_shou1pan2,

    LocalDate p_ri4qi1,

    Double p_kai1pan2,

    Double p_zui4di1,

    Double p_zui4gao1,

    Double p_huan4shou3lu4,

    Double p_zhang3die1fu2,

    Double p_zhen4fu2,

    Integer p_cheng2jiao1liang4,


    Map.Entry<String, String>... others){
    stock_hk_histResponse t = new stock_hk_histResponse();


    t.p_cheng2jiao1e2 = p_cheng2jiao1e2;

    t.p_zhang3die1e2 = p_zhang3die1e2;

    t.p_shou1pan2 = p_shou1pan2;

    t.p_ri4qi1 = p_ri4qi1;

    t.p_kai1pan2 = p_kai1pan2;

    t.p_zui4di1 = p_zui4di1;

    t.p_zui4gao1 = p_zui4gao1;

    t.p_huan4shou3lu4 = p_huan4shou3lu4;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_zhen4fu2 = p_zhen4fu2;

    t.p_cheng2jiao1liang4 = p_cheng2jiao1liang4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 成交额
    * type: float64
    * desc: 注意单位: 港元
    * required: 
    */
    @JsonProperty("成交额")
    
    
    private Double p_cheng2jiao1e2;

    public Double getP_cheng2jiao1e2() { return this.p_cheng2jiao1e2;}
    public void setP_cheng2jiao1e2(Double v) { this.p_cheng2jiao1e2 = v;}

    /**
    * name: 涨跌额
    * type: float64
    * desc: 注意单位: 港元
    * required: 
    */
    @JsonProperty("涨跌额")
    
    
    private Double p_zhang3die1e2;

    public Double getP_zhang3die1e2() { return this.p_zhang3die1e2;}
    public void setP_zhang3die1e2(Double v) { this.p_zhang3die1e2 = v;}

    /**
    * name: 收盘
    * type: float64
    * desc: 注意单位: 港元
    * required: 
    */
    @JsonProperty("收盘")
    
    
    private Double p_shou1pan2;

    public Double getP_shou1pan2() { return this.p_shou1pan2;}
    public void setP_shou1pan2(Double v) { this.p_shou1pan2 = v;}

    /**
    * name: 日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_ri4qi1;

    public LocalDate getP_ri4qi1() { return this.p_ri4qi1;}
    public void setP_ri4qi1(LocalDate v) { this.p_ri4qi1 = v;}

    /**
    * name: 开盘
    * type: float64
    * desc: 注意单位: 港元
    * required: 
    */
    @JsonProperty("开盘")
    
    
    private Double p_kai1pan2;

    public Double getP_kai1pan2() { return this.p_kai1pan2;}
    public void setP_kai1pan2(Double v) { this.p_kai1pan2 = v;}

    /**
    * name: 最低
    * type: float64
    * desc: 注意单位: 港元
    * required: 
    */
    @JsonProperty("最低")
    
    
    private Double p_zui4di1;

    public Double getP_zui4di1() { return this.p_zui4di1;}
    public void setP_zui4di1(Double v) { this.p_zui4di1 = v;}

    /**
    * name: 最高
    * type: float64
    * desc: 注意单位: 港元
    * required: 
    */
    @JsonProperty("最高")
    
    
    private Double p_zui4gao1;

    public Double getP_zui4gao1() { return this.p_zui4gao1;}
    public void setP_zui4gao1(Double v) { this.p_zui4gao1 = v;}

    /**
    * name: 换手率
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("换手率")
    
    
    private Double p_huan4shou3lu4;

    public Double getP_huan4shou3lu4() { return this.p_huan4shou3lu4;}
    public void setP_huan4shou3lu4(Double v) { this.p_huan4shou3lu4 = v;}

    /**
    * name: 涨跌幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("涨跌幅")
    
    
    private Double p_zhang3die1fu2;

    public Double getP_zhang3die1fu2() { return this.p_zhang3die1fu2;}
    public void setP_zhang3die1fu2(Double v) { this.p_zhang3die1fu2 = v;}

    /**
    * name: 振幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("振幅")
    
    
    private Double p_zhen4fu2;

    public Double getP_zhen4fu2() { return this.p_zhen4fu2;}
    public void setP_zhen4fu2(Double v) { this.p_zhen4fu2 = v;}

    /**
    * name: 成交量
    * type: int64
    * desc: 注意单位: 股
    * required: 
    */
    @JsonProperty("成交量")
    
    
    private Integer p_cheng2jiao1liang4;

    public Integer getP_cheng2jiao1liang4() { return this.p_cheng2jiao1liang4;}
    public void setP_cheng2jiao1liang4(Integer v) { this.p_cheng2jiao1liang4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
