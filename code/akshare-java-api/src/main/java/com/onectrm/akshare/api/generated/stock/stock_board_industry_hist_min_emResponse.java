
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
* 接口: stock_board_industry_hist_min_em
* 目标地址: http://quote.eastmoney.com/bk/90.BK1027.html
* 描述: 东方财富-沪深板块-行业板块-分时历史行情数据
* 限量: 单次返回指定 symbol 和 period 的所有历史数据
*/
public class stock_board_industry_hist_min_emResponse extends AkShareRequestAndResponse {
    public stock_board_industry_hist_min_emResponse(){
        setInterfaceName("stock_board_industry_hist_min_em");
    }

    public static stock_board_industry_hist_min_emResponse of(


    Double p_zhang3die1e2,

    Double p_cheng2jiao1e2,

    Double p_shou1pan2,

    Double p_kai1pan2,

    Double p_zui4di1,

    Double p_zui4gao1,

    Double p_huan4shou3lu4,

    Double p_zhang3die1fu2,

    Double p_zhen4fu2,

    LocalDateTime p_ri4qi1shi2jian1,

    Integer p_cheng2jiao1liang4,


    Map.Entry<String, String>... others){
    stock_board_industry_hist_min_emResponse t = new stock_board_industry_hist_min_emResponse();


    t.p_zhang3die1e2 = p_zhang3die1e2;

    t.p_cheng2jiao1e2 = p_cheng2jiao1e2;

    t.p_shou1pan2 = p_shou1pan2;

    t.p_kai1pan2 = p_kai1pan2;

    t.p_zui4di1 = p_zui4di1;

    t.p_zui4gao1 = p_zui4gao1;

    t.p_huan4shou3lu4 = p_huan4shou3lu4;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_zhen4fu2 = p_zhen4fu2;

    t.p_ri4qi1shi2jian1 = p_ri4qi1shi2jian1;

    t.p_cheng2jiao1liang4 = p_cheng2jiao1liang4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 涨跌额
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("涨跌额")
    
    
    private Double p_zhang3die1e2;

    public Double getP_zhang3die1e2() { return this.p_zhang3die1e2;}
    public void setP_zhang3die1e2(Double v) { this.p_zhang3die1e2 = v;}

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
    * name: 日期时间
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("日期时间")
    
    @JsonDeserialize(using = JacksonDateTimeDeserializer.class) 
    private LocalDateTime p_ri4qi1shi2jian1;

    public LocalDateTime getP_ri4qi1shi2jian1() { return this.p_ri4qi1shi2jian1;}
    public void setP_ri4qi1shi2jian1(LocalDateTime v) { this.p_ri4qi1shi2jian1 = v;}

    /**
    * name: 成交量
    * type: int64
    * desc: 
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