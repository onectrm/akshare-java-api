
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
* 接口: stock_hsgt_board_rank_em
* 目标地址: http://data.eastmoney.com/hsgtcg/hy.html
* 描述: 东方财富网-数据中心-沪深港通持股-板块排行
* 限量: 单次获取指定 symbol 和 indicator 的所有数据
*/
public class stock_hsgt_board_rank_emResponse extends AkShareRequestAndResponse {
    public stock_hsgt_board_rank_emResponse(){
        setInterfaceName("stock_hsgt_board_rank_em");
    }

    public static stock_hsgt_board_rank_emResponse of(


    Double p_jin1ri4zeng1chi2zui4da4gu3shi4zhi2,

    Double p_bei3xiang4zi1jin1jin1ri4chi2gu3gu3piao4zhi3shu4,

    Integer p_xu4hao4,

    Double p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4ban3kuai4bi3,

    Double p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2zeng1fu2,

    String p_ming2cheng1,

    Double p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4gu3piao4zhi3shu4,

    Double p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4bei3xiang4zi1jin1bi3,

    LocalDateTime p_bao4gao4shi2jian1,

    Double p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2,

    Double p_jin1ri4jian3chi2zui4da4gu3zhan4gu3ben3bi3,

    Double p_bei3xiang4zi1jin1jin1ri4chi2gu3shi4zhi2,

    Double p_jin1ri4zeng1chi2zui4da4gu3zhan4gu3ben3bi3,

    Double p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4bei3xiang4zi1jin1bi3,

    Double p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4ban3kuai4bi3,

    Double p_jin1ri4jian3chi2zui4da4gu3shi4zhi2,

    Double p_zui4xin1zhang3die1fu2,


    Map.Entry<String, String>... others){
    stock_hsgt_board_rank_emResponse t = new stock_hsgt_board_rank_emResponse();


    t.p_jin1ri4zeng1chi2zui4da4gu3shi4zhi2 = p_jin1ri4zeng1chi2zui4da4gu3shi4zhi2;

    t.p_bei3xiang4zi1jin1jin1ri4chi2gu3gu3piao4zhi3shu4 = p_bei3xiang4zi1jin1jin1ri4chi2gu3gu3piao4zhi3shu4;

    t.p_xu4hao4 = p_xu4hao4;

    t.p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4ban3kuai4bi3 = p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4ban3kuai4bi3;

    t.p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2zeng1fu2 = p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2zeng1fu2;

    t.p_ming2cheng1 = p_ming2cheng1;

    t.p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4gu3piao4zhi3shu4 = p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4gu3piao4zhi3shu4;

    t.p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4bei3xiang4zi1jin1bi3 = p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4bei3xiang4zi1jin1bi3;

    t.p_bao4gao4shi2jian1 = p_bao4gao4shi2jian1;

    t.p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2 = p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2;

    t.p_jin1ri4jian3chi2zui4da4gu3zhan4gu3ben3bi3 = p_jin1ri4jian3chi2zui4da4gu3zhan4gu3ben3bi3;

    t.p_bei3xiang4zi1jin1jin1ri4chi2gu3shi4zhi2 = p_bei3xiang4zi1jin1jin1ri4chi2gu3shi4zhi2;

    t.p_jin1ri4zeng1chi2zui4da4gu3zhan4gu3ben3bi3 = p_jin1ri4zeng1chi2zui4da4gu3zhan4gu3ben3bi3;

    t.p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4bei3xiang4zi1jin1bi3 = p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4bei3xiang4zi1jin1bi3;

    t.p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4ban3kuai4bi3 = p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4ban3kuai4bi3;

    t.p_jin1ri4jian3chi2zui4da4gu3shi4zhi2 = p_jin1ri4jian3chi2zui4da4gu3shi4zhi2;

    t.p_zui4xin1zhang3die1fu2 = p_zui4xin1zhang3die1fu2;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 今日增持最大股-市值
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("今日增持最大股-市值")
    
    
    private Double p_jin1ri4zeng1chi2zui4da4gu3shi4zhi2;

    public Double getP_jin1ri4zeng1chi2zui4da4gu3shi4zhi2() { return this.p_jin1ri4zeng1chi2zui4da4gu3shi4zhi2;}
    public void setP_jin1ri4zeng1chi2zui4da4gu3shi4zhi2(Double v) { this.p_jin1ri4zeng1chi2zui4da4gu3shi4zhi2 = v;}

    /**
    * name: 北向资金今日持股-股票只数
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("北向资金今日持股-股票只数")
    
    
    private Double p_bei3xiang4zi1jin1jin1ri4chi2gu3gu3piao4zhi3shu4;

    public Double getP_bei3xiang4zi1jin1jin1ri4chi2gu3gu3piao4zhi3shu4() { return this.p_bei3xiang4zi1jin1jin1ri4chi2gu3gu3piao4zhi3shu4;}
    public void setP_bei3xiang4zi1jin1jin1ri4chi2gu3gu3piao4zhi3shu4(Double v) { this.p_bei3xiang4zi1jin1jin1ri4chi2gu3gu3piao4zhi3shu4 = v;}

    /**
    * name: 序号
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("序号")
    
    
    private Integer p_xu4hao4;

    public Integer getP_xu4hao4() { return this.p_xu4hao4;}
    public void setP_xu4hao4(Integer v) { this.p_xu4hao4 = v;}

    /**
    * name: 北向资金今日持股-占板块比
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("北向资金今日持股-占板块比")
    
    
    private Double p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4ban3kuai4bi3;

    public Double getP_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4ban3kuai4bi3() { return this.p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4ban3kuai4bi3;}
    public void setP_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4ban3kuai4bi3(Double v) { this.p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4ban3kuai4bi3 = v;}

    /**
    * name: 北向资金今日增持估计-市值增幅
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("北向资金今日增持估计-市值增幅")
    
    
    private Double p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2zeng1fu2;

    public Double getP_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2zeng1fu2() { return this.p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2zeng1fu2;}
    public void setP_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2zeng1fu2(Double v) { this.p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2zeng1fu2 = v;}

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
    * name: 北向资金今日增持估计-股票只数
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("北向资金今日增持估计-股票只数")
    
    
    private Double p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4gu3piao4zhi3shu4;

    public Double getP_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4gu3piao4zhi3shu4() { return this.p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4gu3piao4zhi3shu4;}
    public void setP_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4gu3piao4zhi3shu4(Double v) { this.p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4gu3piao4zhi3shu4 = v;}

    /**
    * name: 北向资金今日增持估计-占北向资金比
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("北向资金今日增持估计-占北向资金比")
    
    
    private Double p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4bei3xiang4zi1jin1bi3;

    public Double getP_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4bei3xiang4zi1jin1bi3() { return this.p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4bei3xiang4zi1jin1bi3;}
    public void setP_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4bei3xiang4zi1jin1bi3(Double v) { this.p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4bei3xiang4zi1jin1bi3 = v;}

    /**
    * name: 报告时间
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("报告时间")
    
    @JsonDeserialize(using = JacksonDateTimeDeserializer.class) 
    private LocalDateTime p_bao4gao4shi2jian1;

    public LocalDateTime getP_bao4gao4shi2jian1() { return this.p_bao4gao4shi2jian1;}
    public void setP_bao4gao4shi2jian1(LocalDateTime v) { this.p_bao4gao4shi2jian1 = v;}

    /**
    * name: 北向资金今日增持估计-市值
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("北向资金今日增持估计-市值")
    
    
    private Double p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2;

    public Double getP_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2() { return this.p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2;}
    public void setP_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2(Double v) { this.p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2 = v;}

    /**
    * name: 今日减持最大股-占股本比
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("今日减持最大股-占股本比")
    
    
    private Double p_jin1ri4jian3chi2zui4da4gu3zhan4gu3ben3bi3;

    public Double getP_jin1ri4jian3chi2zui4da4gu3zhan4gu3ben3bi3() { return this.p_jin1ri4jian3chi2zui4da4gu3zhan4gu3ben3bi3;}
    public void setP_jin1ri4jian3chi2zui4da4gu3zhan4gu3ben3bi3(Double v) { this.p_jin1ri4jian3chi2zui4da4gu3zhan4gu3ben3bi3 = v;}

    /**
    * name: 北向资金今日持股-市值
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("北向资金今日持股-市值")
    
    
    private Double p_bei3xiang4zi1jin1jin1ri4chi2gu3shi4zhi2;

    public Double getP_bei3xiang4zi1jin1jin1ri4chi2gu3shi4zhi2() { return this.p_bei3xiang4zi1jin1jin1ri4chi2gu3shi4zhi2;}
    public void setP_bei3xiang4zi1jin1jin1ri4chi2gu3shi4zhi2(Double v) { this.p_bei3xiang4zi1jin1jin1ri4chi2gu3shi4zhi2 = v;}

    /**
    * name: 今日增持最大股-占股本比
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("今日增持最大股-占股本比")
    
    
    private Double p_jin1ri4zeng1chi2zui4da4gu3zhan4gu3ben3bi3;

    public Double getP_jin1ri4zeng1chi2zui4da4gu3zhan4gu3ben3bi3() { return this.p_jin1ri4zeng1chi2zui4da4gu3zhan4gu3ben3bi3;}
    public void setP_jin1ri4zeng1chi2zui4da4gu3zhan4gu3ben3bi3(Double v) { this.p_jin1ri4zeng1chi2zui4da4gu3zhan4gu3ben3bi3 = v;}

    /**
    * name: 北向资金今日持股-占北向资金比
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("北向资金今日持股-占北向资金比")
    
    
    private Double p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4bei3xiang4zi1jin1bi3;

    public Double getP_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4bei3xiang4zi1jin1bi3() { return this.p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4bei3xiang4zi1jin1bi3;}
    public void setP_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4bei3xiang4zi1jin1bi3(Double v) { this.p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4bei3xiang4zi1jin1bi3 = v;}

    /**
    * name: 北向资金今日增持估计-占板块比
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("北向资金今日增持估计-占板块比")
    
    
    private Double p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4ban3kuai4bi3;

    public Double getP_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4ban3kuai4bi3() { return this.p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4ban3kuai4bi3;}
    public void setP_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4ban3kuai4bi3(Double v) { this.p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4ban3kuai4bi3 = v;}

    /**
    * name: 今日减持最大股-市值
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("今日减持最大股-市值")
    
    
    private Double p_jin1ri4jian3chi2zui4da4gu3shi4zhi2;

    public Double getP_jin1ri4jian3chi2zui4da4gu3shi4zhi2() { return this.p_jin1ri4jian3chi2zui4da4gu3shi4zhi2;}
    public void setP_jin1ri4jian3chi2zui4da4gu3shi4zhi2(Double v) { this.p_jin1ri4jian3chi2zui4da4gu3shi4zhi2 = v;}

    /**
    * name: 最新涨跌幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("最新涨跌幅")
    
    
    private Double p_zui4xin1zhang3die1fu2;

    public Double getP_zui4xin1zhang3die1fu2() { return this.p_zui4xin1zhang3die1fu2;}
    public void setP_zui4xin1zhang3die1fu2(Double v) { this.p_zui4xin1zhang3die1fu2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
