
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
* 接口: stock_xjll_em
* 目标地址: http://data.eastmoney.com/bbsj/202003/xjll.html
* 描述: 东方财富-数据中心-年报季报-业绩快报-现金流量表
* 限量: 单次获取指定 date 的现金流量表数据
*/
public class stock_xjll_emResponse extends AkShareRequestAndResponse {
    public stock_xjll_emResponse(){
        setInterfaceName("stock_xjll_em");
    }

    public static stock_xjll_emResponse of(


    Double p_jing4xian4jin1liu2jing4xian4jin1liu2,

    Double p_tou2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2,

    Double p_rong2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2,

    Double p_rong2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3,

    Integer p_xu4hao4,

    LocalDate p_gong1gao4ri4qi1,

    String p_gu3piao4jian3cheng1,

    Double p_tou2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3,

    String p_gu3piao4dai4ma3,

    Double p_jing4xian4jin1liu2tong2bi3zeng1zhang3,

    Double p_jing1ying2xing4xian4jin1liu2xian4jin1liu2liang4jing4e2,

    Double p_jing1ying2xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3,


    Map.Entry<String, String>... others){
    stock_xjll_emResponse t = new stock_xjll_emResponse();


    t.p_jing4xian4jin1liu2jing4xian4jin1liu2 = p_jing4xian4jin1liu2jing4xian4jin1liu2;

    t.p_tou2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2 = p_tou2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2;

    t.p_rong2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2 = p_rong2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2;

    t.p_rong2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3 = p_rong2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3;

    t.p_xu4hao4 = p_xu4hao4;

    t.p_gong1gao4ri4qi1 = p_gong1gao4ri4qi1;

    t.p_gu3piao4jian3cheng1 = p_gu3piao4jian3cheng1;

    t.p_tou2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3 = p_tou2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3;

    t.p_gu3piao4dai4ma3 = p_gu3piao4dai4ma3;

    t.p_jing4xian4jin1liu2tong2bi3zeng1zhang3 = p_jing4xian4jin1liu2tong2bi3zeng1zhang3;

    t.p_jing1ying2xing4xian4jin1liu2xian4jin1liu2liang4jing4e2 = p_jing1ying2xing4xian4jin1liu2xian4jin1liu2liang4jing4e2;

    t.p_jing1ying2xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3 = p_jing1ying2xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 净现金流-净现金流
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("净现金流-净现金流")
    
    
    private Double p_jing4xian4jin1liu2jing4xian4jin1liu2;

    public Double getP_jing4xian4jin1liu2jing4xian4jin1liu2() { return this.p_jing4xian4jin1liu2jing4xian4jin1liu2;}
    public void setP_jing4xian4jin1liu2jing4xian4jin1liu2(Double v) { this.p_jing4xian4jin1liu2jing4xian4jin1liu2 = v;}

    /**
    * name: 投资性现金流-现金流量净额
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("投资性现金流-现金流量净额")
    
    
    private Double p_tou2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2;

    public Double getP_tou2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2() { return this.p_tou2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2;}
    public void setP_tou2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2(Double v) { this.p_tou2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2 = v;}

    /**
    * name: 融资性现金流-现金流量净额
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("融资性现金流-现金流量净额")
    
    
    private Double p_rong2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2;

    public Double getP_rong2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2() { return this.p_rong2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2;}
    public void setP_rong2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2(Double v) { this.p_rong2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2 = v;}

    /**
    * name: 融资性现金流-净现金流占比
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("融资性现金流-净现金流占比")
    
    
    private Double p_rong2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3;

    public Double getP_rong2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3() { return this.p_rong2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3;}
    public void setP_rong2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3(Double v) { this.p_rong2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3 = v;}

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
    * name: 公告日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("公告日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_gong1gao4ri4qi1;

    public LocalDate getP_gong1gao4ri4qi1() { return this.p_gong1gao4ri4qi1;}
    public void setP_gong1gao4ri4qi1(LocalDate v) { this.p_gong1gao4ri4qi1 = v;}

    /**
    * name: 股票简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股票简称")
    
    
    private String p_gu3piao4jian3cheng1;

    public String getP_gu3piao4jian3cheng1() { return this.p_gu3piao4jian3cheng1;}
    public void setP_gu3piao4jian3cheng1(String v) { this.p_gu3piao4jian3cheng1 = v;}

    /**
    * name: 投资性现金流-净现金流占比
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("投资性现金流-净现金流占比")
    
    
    private Double p_tou2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3;

    public Double getP_tou2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3() { return this.p_tou2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3;}
    public void setP_tou2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3(Double v) { this.p_tou2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3 = v;}

    /**
    * name: 股票代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股票代码")
    
    
    private String p_gu3piao4dai4ma3;

    public String getP_gu3piao4dai4ma3() { return this.p_gu3piao4dai4ma3;}
    public void setP_gu3piao4dai4ma3(String v) { this.p_gu3piao4dai4ma3 = v;}

    /**
    * name: 净现金流-同比增长
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("净现金流-同比增长")
    
    
    private Double p_jing4xian4jin1liu2tong2bi3zeng1zhang3;

    public Double getP_jing4xian4jin1liu2tong2bi3zeng1zhang3() { return this.p_jing4xian4jin1liu2tong2bi3zeng1zhang3;}
    public void setP_jing4xian4jin1liu2tong2bi3zeng1zhang3(Double v) { this.p_jing4xian4jin1liu2tong2bi3zeng1zhang3 = v;}

    /**
    * name: 经营性现金流-现金流量净额
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("经营性现金流-现金流量净额")
    
    
    private Double p_jing1ying2xing4xian4jin1liu2xian4jin1liu2liang4jing4e2;

    public Double getP_jing1ying2xing4xian4jin1liu2xian4jin1liu2liang4jing4e2() { return this.p_jing1ying2xing4xian4jin1liu2xian4jin1liu2liang4jing4e2;}
    public void setP_jing1ying2xing4xian4jin1liu2xian4jin1liu2liang4jing4e2(Double v) { this.p_jing1ying2xing4xian4jin1liu2xian4jin1liu2liang4jing4e2 = v;}

    /**
    * name: 经营性现金流-净现金流占比
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("经营性现金流-净现金流占比")
    
    
    private Double p_jing1ying2xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3;

    public Double getP_jing1ying2xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3() { return this.p_jing1ying2xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3;}
    public void setP_jing1ying2xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3(Double v) { this.p_jing1ying2xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
