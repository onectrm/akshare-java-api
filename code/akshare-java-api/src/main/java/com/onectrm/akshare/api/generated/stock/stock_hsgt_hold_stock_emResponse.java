
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
* 接口: stock_hsgt_hold_stock_em
* 目标地址: http://data.eastmoney.com/hsgtcg/list.html
* 描述: 东方财富网-数据中心-沪深港通持股-个股排行
* 限量: 单次获取指定 market 和 indicator 的所有数据
*/
public class stock_hsgt_hold_stock_emResponse extends AkShareRequestAndResponse {
    public stock_hsgt_hold_stock_emResponse(){
        setInterfaceName("stock_hsgt_hold_stock_em");
    }

    public static stock_hsgt_hold_stock_emResponse of(


    String p_xu4hao4,

    Double p_jin1ri4chi2gu3zhan4zong3gu3ben3bi3,

    Double p_zeng1chi2gu1ji4shi4zhi2,

    String p_ming2cheng1,

    Double p_jin1ri4zhang3die1fu2,

    Double p_jin1ri4chi2gu3shi4zhi2,

    String p_zeng1chi2gu1ji4shi4zhi2zeng1fu2,

    Double p_zeng1chi2gu1ji4zhan4liu2tong1gu3bi3,

    String p_suo3shu3ban3kuai4,

    Double p_jin1ri4shou1pan2jia4,

    Double p_jin1ri4chi2gu3gu3shu4,

    LocalDate p_ri4qi1,

    Double p_zeng1chi2gu1ji4zhan4zong3gu3ben3bi3,

    Double p_jin1ri4chi2gu3zhan4liu2tong1gu3bi3,

    String p_dai4ma3,

    Double p_zeng1chi2gu1ji4gu3shu4,


    Map.Entry<String, String>... others){
    stock_hsgt_hold_stock_emResponse t = new stock_hsgt_hold_stock_emResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_jin1ri4chi2gu3zhan4zong3gu3ben3bi3 = p_jin1ri4chi2gu3zhan4zong3gu3ben3bi3;

    t.p_zeng1chi2gu1ji4shi4zhi2 = p_zeng1chi2gu1ji4shi4zhi2;

    t.p_ming2cheng1 = p_ming2cheng1;

    t.p_jin1ri4zhang3die1fu2 = p_jin1ri4zhang3die1fu2;

    t.p_jin1ri4chi2gu3shi4zhi2 = p_jin1ri4chi2gu3shi4zhi2;

    t.p_zeng1chi2gu1ji4shi4zhi2zeng1fu2 = p_zeng1chi2gu1ji4shi4zhi2zeng1fu2;

    t.p_zeng1chi2gu1ji4zhan4liu2tong1gu3bi3 = p_zeng1chi2gu1ji4zhan4liu2tong1gu3bi3;

    t.p_suo3shu3ban3kuai4 = p_suo3shu3ban3kuai4;

    t.p_jin1ri4shou1pan2jia4 = p_jin1ri4shou1pan2jia4;

    t.p_jin1ri4chi2gu3gu3shu4 = p_jin1ri4chi2gu3gu3shu4;

    t.p_ri4qi1 = p_ri4qi1;

    t.p_zeng1chi2gu1ji4zhan4zong3gu3ben3bi3 = p_zeng1chi2gu1ji4zhan4zong3gu3ben3bi3;

    t.p_jin1ri4chi2gu3zhan4liu2tong1gu3bi3 = p_jin1ri4chi2gu3zhan4liu2tong1gu3bi3;

    t.p_dai4ma3 = p_dai4ma3;

    t.p_zeng1chi2gu1ji4gu3shu4 = p_zeng1chi2gu1ji4gu3shu4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 序号
    * type: int32
    * desc: 
    * required: 
    */
    @JsonProperty("序号")
    
    
    private String p_xu4hao4;

    public String getP_xu4hao4() { return this.p_xu4hao4;}
    public void setP_xu4hao4(String v) { this.p_xu4hao4 = v;}

    /**
    * name: 今日持股-占总股本比
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("今日持股-占总股本比")
    
    
    private Double p_jin1ri4chi2gu3zhan4zong3gu3ben3bi3;

    public Double getP_jin1ri4chi2gu3zhan4zong3gu3ben3bi3() { return this.p_jin1ri4chi2gu3zhan4zong3gu3ben3bi3;}
    public void setP_jin1ri4chi2gu3zhan4zong3gu3ben3bi3(Double v) { this.p_jin1ri4chi2gu3zhan4zong3gu3ben3bi3 = v;}

    /**
    * name: 增持估计-市值
    * type: float64
    * desc: 注意单位: 万; 主要字段名根据 indicator 变化
    * required: 
    */
    @JsonProperty("增持估计-市值")
    
    
    private Double p_zeng1chi2gu1ji4shi4zhi2;

    public Double getP_zeng1chi2gu1ji4shi4zhi2() { return this.p_zeng1chi2gu1ji4shi4zhi2;}
    public void setP_zeng1chi2gu1ji4shi4zhi2(Double v) { this.p_zeng1chi2gu1ji4shi4zhi2 = v;}

    /**
    * name: 名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("名称")
    
    
    private String p_ming2cheng1;

    public String getP_ming2cheng1() { return this.p_ming2cheng1;}
    public void setP_ming2cheng1(String v) { this.p_ming2cheng1 = v;}

    /**
    * name: 今日涨跌幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("今日涨跌幅")
    
    
    private Double p_jin1ri4zhang3die1fu2;

    public Double getP_jin1ri4zhang3die1fu2() { return this.p_jin1ri4zhang3die1fu2;}
    public void setP_jin1ri4zhang3die1fu2(Double v) { this.p_jin1ri4zhang3die1fu2 = v;}

    /**
    * name: 今日持股-市值
    * type: float64
    * desc: 注意单位: 万
    * required: 
    */
    @JsonProperty("今日持股-市值")
    
    
    private Double p_jin1ri4chi2gu3shi4zhi2;

    public Double getP_jin1ri4chi2gu3shi4zhi2() { return this.p_jin1ri4chi2gu3shi4zhi2;}
    public void setP_jin1ri4chi2gu3shi4zhi2(Double v) { this.p_jin1ri4chi2gu3shi4zhi2 = v;}

    /**
    * name: 增持估计-市值增幅
    * type: object
    * desc: 注意单位: %; 主要字段名根据 indicator 变化
    * required: 
    */
    @JsonProperty("增持估计-市值增幅")
    
    
    private String p_zeng1chi2gu1ji4shi4zhi2zeng1fu2;

    public String getP_zeng1chi2gu1ji4shi4zhi2zeng1fu2() { return this.p_zeng1chi2gu1ji4shi4zhi2zeng1fu2;}
    public void setP_zeng1chi2gu1ji4shi4zhi2zeng1fu2(String v) { this.p_zeng1chi2gu1ji4shi4zhi2zeng1fu2 = v;}

    /**
    * name: 增持估计-占流通股比
    * type: float64
    * desc: 注意单位: ‰; 主要字段名根据 indicator 变化
    * required: 
    */
    @JsonProperty("增持估计-占流通股比")
    
    
    private Double p_zeng1chi2gu1ji4zhan4liu2tong1gu3bi3;

    public Double getP_zeng1chi2gu1ji4zhan4liu2tong1gu3bi3() { return this.p_zeng1chi2gu1ji4zhan4liu2tong1gu3bi3;}
    public void setP_zeng1chi2gu1ji4zhan4liu2tong1gu3bi3(Double v) { this.p_zeng1chi2gu1ji4zhan4liu2tong1gu3bi3 = v;}

    /**
    * name: 所属板块
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("所属板块")
    
    
    private String p_suo3shu3ban3kuai4;

    public String getP_suo3shu3ban3kuai4() { return this.p_suo3shu3ban3kuai4;}
    public void setP_suo3shu3ban3kuai4(String v) { this.p_suo3shu3ban3kuai4 = v;}

    /**
    * name: 今日收盘价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("今日收盘价")
    
    
    private Double p_jin1ri4shou1pan2jia4;

    public Double getP_jin1ri4shou1pan2jia4() { return this.p_jin1ri4shou1pan2jia4;}
    public void setP_jin1ri4shou1pan2jia4(Double v) { this.p_jin1ri4shou1pan2jia4 = v;}

    /**
    * name: 今日持股-股数
    * type: float64
    * desc: 注意单位: 万
    * required: 
    */
    @JsonProperty("今日持股-股数")
    
    
    private Double p_jin1ri4chi2gu3gu3shu4;

    public Double getP_jin1ri4chi2gu3gu3shu4() { return this.p_jin1ri4chi2gu3gu3shu4;}
    public void setP_jin1ri4chi2gu3gu3shu4(Double v) { this.p_jin1ri4chi2gu3gu3shu4 = v;}

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
    * name: 增持估计-占总股本比
    * type: float64
    * desc: 注意单位: ‰; 主要字段名根据 indicator 变化
    * required: 
    */
    @JsonProperty("增持估计-占总股本比")
    
    
    private Double p_zeng1chi2gu1ji4zhan4zong3gu3ben3bi3;

    public Double getP_zeng1chi2gu1ji4zhan4zong3gu3ben3bi3() { return this.p_zeng1chi2gu1ji4zhan4zong3gu3ben3bi3;}
    public void setP_zeng1chi2gu1ji4zhan4zong3gu3ben3bi3(Double v) { this.p_zeng1chi2gu1ji4zhan4zong3gu3ben3bi3 = v;}

    /**
    * name: 今日持股-占流通股比
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("今日持股-占流通股比")
    
    
    private Double p_jin1ri4chi2gu3zhan4liu2tong1gu3bi3;

    public Double getP_jin1ri4chi2gu3zhan4liu2tong1gu3bi3() { return this.p_jin1ri4chi2gu3zhan4liu2tong1gu3bi3;}
    public void setP_jin1ri4chi2gu3zhan4liu2tong1gu3bi3(Double v) { this.p_jin1ri4chi2gu3zhan4liu2tong1gu3bi3 = v;}

    /**
    * name: 代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("代码")
    
    
    private String p_dai4ma3;

    public String getP_dai4ma3() { return this.p_dai4ma3;}
    public void setP_dai4ma3(String v) { this.p_dai4ma3 = v;}

    /**
    * name: 增持估计-股数
    * type: float64
    * desc: 注意单位: 万; 主要字段名根据 indicator 变化
    * required: 
    */
    @JsonProperty("增持估计-股数")
    
    
    private Double p_zeng1chi2gu1ji4gu3shu4;

    public Double getP_zeng1chi2gu1ji4gu3shu4() { return this.p_zeng1chi2gu1ji4gu3shu4;}
    public void setP_zeng1chi2gu1ji4gu3shu4(Double v) { this.p_zeng1chi2gu1ji4gu3shu4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}