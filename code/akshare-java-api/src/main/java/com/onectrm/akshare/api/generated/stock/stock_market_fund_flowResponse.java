
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
* 接口: stock_market_fund_flow
* 目标地址: http://data.eastmoney.com/zjlx/dpzjlx.html
* 描述: 获取东方财富网-数据中心-资金流向-大盘
* 限量: 单次获取大盘资金流向历史数据
*/
public class stock_market_fund_flowResponse extends AkShareRequestAndResponse {
    public stock_market_fund_flowResponse(){
        setInterfaceName("stock_market_fund_flow");
    }

    public static stock_market_fund_flowResponse of(


    Double p_chao1da4dan1jing4liu2ru4jing4e2,

    Double p_shen1zheng4zhang3die1fu2,

    Double p_zhong1dan1jing4liu2ru4jing4e2,

    Double p_shang4zheng4shou1pan2jia4,

    Double p_chao1da4dan1jing4liu2ru4jing4zhan4bi3,

    Double p_da4dan1jing4liu2ru4jing4zhan4bi3,

    String p_zhu3li4jing4liu2ru4jing4e2,

    Double p_xiao3dan1jing4liu2ru4jing4zhan4bi3,

    Double p_da4dan1jing4liu2ru4jing4e2,

    Double p_xiao3dan1jing4liu2ru4jing4e2,

    Double p_zhong1dan1jing4liu2ru4jing4zhan4bi3,

    LocalDate p_ri4qi1,

    Double p_shen1zheng4shou1pan2jia4,

    Double p_shang4zheng4zhang3die1fu2,

    Double p_zhu3li4jing4liu2ru4jing4zhan4bi3,


    Map.Entry<String, String>... others){
    stock_market_fund_flowResponse t = new stock_market_fund_flowResponse();


    t.p_chao1da4dan1jing4liu2ru4jing4e2 = p_chao1da4dan1jing4liu2ru4jing4e2;

    t.p_shen1zheng4zhang3die1fu2 = p_shen1zheng4zhang3die1fu2;

    t.p_zhong1dan1jing4liu2ru4jing4e2 = p_zhong1dan1jing4liu2ru4jing4e2;

    t.p_shang4zheng4shou1pan2jia4 = p_shang4zheng4shou1pan2jia4;

    t.p_chao1da4dan1jing4liu2ru4jing4zhan4bi3 = p_chao1da4dan1jing4liu2ru4jing4zhan4bi3;

    t.p_da4dan1jing4liu2ru4jing4zhan4bi3 = p_da4dan1jing4liu2ru4jing4zhan4bi3;

    t.p_zhu3li4jing4liu2ru4jing4e2 = p_zhu3li4jing4liu2ru4jing4e2;

    t.p_xiao3dan1jing4liu2ru4jing4zhan4bi3 = p_xiao3dan1jing4liu2ru4jing4zhan4bi3;

    t.p_da4dan1jing4liu2ru4jing4e2 = p_da4dan1jing4liu2ru4jing4e2;

    t.p_xiao3dan1jing4liu2ru4jing4e2 = p_xiao3dan1jing4liu2ru4jing4e2;

    t.p_zhong1dan1jing4liu2ru4jing4zhan4bi3 = p_zhong1dan1jing4liu2ru4jing4zhan4bi3;

    t.p_ri4qi1 = p_ri4qi1;

    t.p_shen1zheng4shou1pan2jia4 = p_shen1zheng4shou1pan2jia4;

    t.p_shang4zheng4zhang3die1fu2 = p_shang4zheng4zhang3die1fu2;

    t.p_zhu3li4jing4liu2ru4jing4zhan4bi3 = p_zhu3li4jing4liu2ru4jing4zhan4bi3;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 超大单净流入-净额
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("超大单净流入-净额")
    
    
    private Double p_chao1da4dan1jing4liu2ru4jing4e2;

    public Double getP_chao1da4dan1jing4liu2ru4jing4e2() { return this.p_chao1da4dan1jing4liu2ru4jing4e2;}
    public void setP_chao1da4dan1jing4liu2ru4jing4e2(Double v) { this.p_chao1da4dan1jing4liu2ru4jing4e2 = v;}

    /**
    * name: 深证-涨跌幅
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("深证-涨跌幅")
    
    
    private Double p_shen1zheng4zhang3die1fu2;

    public Double getP_shen1zheng4zhang3die1fu2() { return this.p_shen1zheng4zhang3die1fu2;}
    public void setP_shen1zheng4zhang3die1fu2(Double v) { this.p_shen1zheng4zhang3die1fu2 = v;}

    /**
    * name: 中单净流入-净额
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("中单净流入-净额")
    
    
    private Double p_zhong1dan1jing4liu2ru4jing4e2;

    public Double getP_zhong1dan1jing4liu2ru4jing4e2() { return this.p_zhong1dan1jing4liu2ru4jing4e2;}
    public void setP_zhong1dan1jing4liu2ru4jing4e2(Double v) { this.p_zhong1dan1jing4liu2ru4jing4e2 = v;}

    /**
    * name: 上证-收盘价
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("上证-收盘价")
    
    
    private Double p_shang4zheng4shou1pan2jia4;

    public Double getP_shang4zheng4shou1pan2jia4() { return this.p_shang4zheng4shou1pan2jia4;}
    public void setP_shang4zheng4shou1pan2jia4(Double v) { this.p_shang4zheng4shou1pan2jia4 = v;}

    /**
    * name: 超大单净流入-净占比
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("超大单净流入-净占比")
    
    
    private Double p_chao1da4dan1jing4liu2ru4jing4zhan4bi3;

    public Double getP_chao1da4dan1jing4liu2ru4jing4zhan4bi3() { return this.p_chao1da4dan1jing4liu2ru4jing4zhan4bi3;}
    public void setP_chao1da4dan1jing4liu2ru4jing4zhan4bi3(Double v) { this.p_chao1da4dan1jing4liu2ru4jing4zhan4bi3 = v;}

    /**
    * name: 大单净流入-净占比
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("大单净流入-净占比")
    
    
    private Double p_da4dan1jing4liu2ru4jing4zhan4bi3;

    public Double getP_da4dan1jing4liu2ru4jing4zhan4bi3() { return this.p_da4dan1jing4liu2ru4jing4zhan4bi3;}
    public void setP_da4dan1jing4liu2ru4jing4zhan4bi3(Double v) { this.p_da4dan1jing4liu2ru4jing4zhan4bi3 = v;}

    /**
    * name: 主力净流入-净额
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("主力净流入-净额")
    
    
    private String p_zhu3li4jing4liu2ru4jing4e2;

    public String getP_zhu3li4jing4liu2ru4jing4e2() { return this.p_zhu3li4jing4liu2ru4jing4e2;}
    public void setP_zhu3li4jing4liu2ru4jing4e2(String v) { this.p_zhu3li4jing4liu2ru4jing4e2 = v;}

    /**
    * name: 小单净流入-净占比
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("小单净流入-净占比")
    
    
    private Double p_xiao3dan1jing4liu2ru4jing4zhan4bi3;

    public Double getP_xiao3dan1jing4liu2ru4jing4zhan4bi3() { return this.p_xiao3dan1jing4liu2ru4jing4zhan4bi3;}
    public void setP_xiao3dan1jing4liu2ru4jing4zhan4bi3(Double v) { this.p_xiao3dan1jing4liu2ru4jing4zhan4bi3 = v;}

    /**
    * name: 大单净流入-净额
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("大单净流入-净额")
    
    
    private Double p_da4dan1jing4liu2ru4jing4e2;

    public Double getP_da4dan1jing4liu2ru4jing4e2() { return this.p_da4dan1jing4liu2ru4jing4e2;}
    public void setP_da4dan1jing4liu2ru4jing4e2(Double v) { this.p_da4dan1jing4liu2ru4jing4e2 = v;}

    /**
    * name: 小单净流入-净额
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("小单净流入-净额")
    
    
    private Double p_xiao3dan1jing4liu2ru4jing4e2;

    public Double getP_xiao3dan1jing4liu2ru4jing4e2() { return this.p_xiao3dan1jing4liu2ru4jing4e2;}
    public void setP_xiao3dan1jing4liu2ru4jing4e2(Double v) { this.p_xiao3dan1jing4liu2ru4jing4e2 = v;}

    /**
    * name: 中单净流入-净占比
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("中单净流入-净占比")
    
    
    private Double p_zhong1dan1jing4liu2ru4jing4zhan4bi3;

    public Double getP_zhong1dan1jing4liu2ru4jing4zhan4bi3() { return this.p_zhong1dan1jing4liu2ru4jing4zhan4bi3;}
    public void setP_zhong1dan1jing4liu2ru4jing4zhan4bi3(Double v) { this.p_zhong1dan1jing4liu2ru4jing4zhan4bi3 = v;}

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
    * name: 深证-收盘价
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("深证-收盘价")
    
    
    private Double p_shen1zheng4shou1pan2jia4;

    public Double getP_shen1zheng4shou1pan2jia4() { return this.p_shen1zheng4shou1pan2jia4;}
    public void setP_shen1zheng4shou1pan2jia4(Double v) { this.p_shen1zheng4shou1pan2jia4 = v;}

    /**
    * name: 上证-涨跌幅
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("上证-涨跌幅")
    
    
    private Double p_shang4zheng4zhang3die1fu2;

    public Double getP_shang4zheng4zhang3die1fu2() { return this.p_shang4zheng4zhang3die1fu2;}
    public void setP_shang4zheng4zhang3die1fu2(Double v) { this.p_shang4zheng4zhang3die1fu2 = v;}

    /**
    * name: 主力净流入-净占比
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("主力净流入-净占比")
    
    
    private Double p_zhu3li4jing4liu2ru4jing4zhan4bi3;

    public Double getP_zhu3li4jing4liu2ru4jing4zhan4bi3() { return this.p_zhu3li4jing4liu2ru4jing4zhan4bi3;}
    public void setP_zhu3li4jing4liu2ru4jing4zhan4bi3(Double v) { this.p_zhu3li4jing4liu2ru4jing4zhan4bi3 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
