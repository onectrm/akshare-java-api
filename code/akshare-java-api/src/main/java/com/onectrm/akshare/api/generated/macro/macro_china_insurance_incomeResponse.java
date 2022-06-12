
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.macro;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: macro
* 接口: macro_china_insurance_income
* 目标地址: https://data.eastmoney.com/cjsj/hyzs_list_EMM00088870.html
* 描述: 原保险保费收入, 数据区间从 200407-至今
* 限量: 单次返回所有历史数据
*/
public class macro_china_insurance_incomeResponse extends AkShareRequestAndResponse {
    public macro_china_insurance_incomeResponse(){
        setInterfaceName("macro_china_insurance_income");
    }

    public static macro_china_insurance_incomeResponse of(


    Double p_jin42nian2zhang3die1fu2,

    Double p_jin46yue4zhang3die1fu2,

    Double p_jin43yue4zhang3die1fu2,

    LocalDate p_ri4qi1,

    Double p_jin43nian2zhang3die1fu2,

    Integer p_zui4xin1zhi2,

    Double p_zhang3die1fu2,

    Double p_jin41nian2zhang3die1fu2,


    Map.Entry<String, String>... others){
    macro_china_insurance_incomeResponse t = new macro_china_insurance_incomeResponse();


    t.p_jin42nian2zhang3die1fu2 = p_jin42nian2zhang3die1fu2;

    t.p_jin46yue4zhang3die1fu2 = p_jin46yue4zhang3die1fu2;

    t.p_jin43yue4zhang3die1fu2 = p_jin43yue4zhang3die1fu2;

    t.p_ri4qi1 = p_ri4qi1;

    t.p_jin43nian2zhang3die1fu2 = p_jin43nian2zhang3die1fu2;

    t.p_zui4xin1zhi2 = p_zui4xin1zhi2;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_jin41nian2zhang3die1fu2 = p_jin41nian2zhang3die1fu2;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 近2年涨跌幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("近2年涨跌幅")
    
    
    private Double p_jin42nian2zhang3die1fu2;

    public Double getP_jin42nian2zhang3die1fu2() { return this.p_jin42nian2zhang3die1fu2;}
    public void setP_jin42nian2zhang3die1fu2(Double v) { this.p_jin42nian2zhang3die1fu2 = v;}

    /**
    * name: 近6月涨跌幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("近6月涨跌幅")
    
    
    private Double p_jin46yue4zhang3die1fu2;

    public Double getP_jin46yue4zhang3die1fu2() { return this.p_jin46yue4zhang3die1fu2;}
    public void setP_jin46yue4zhang3die1fu2(Double v) { this.p_jin46yue4zhang3die1fu2 = v;}

    /**
    * name: 近3月涨跌幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("近3月涨跌幅")
    
    
    private Double p_jin43yue4zhang3die1fu2;

    public Double getP_jin43yue4zhang3die1fu2() { return this.p_jin43yue4zhang3die1fu2;}
    public void setP_jin43yue4zhang3die1fu2(Double v) { this.p_jin43yue4zhang3die1fu2 = v;}

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
    * name: 近3年涨跌幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("近3年涨跌幅")
    
    
    private Double p_jin43nian2zhang3die1fu2;

    public Double getP_jin43nian2zhang3die1fu2() { return this.p_jin43nian2zhang3die1fu2;}
    public void setP_jin43nian2zhang3die1fu2(Double v) { this.p_jin43nian2zhang3die1fu2 = v;}

    /**
    * name: 最新值
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("最新值")
    
    
    private Integer p_zui4xin1zhi2;

    public Integer getP_zui4xin1zhi2() { return this.p_zui4xin1zhi2;}
    public void setP_zui4xin1zhi2(Integer v) { this.p_zui4xin1zhi2 = v;}

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
    * name: 近1年涨跌幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("近1年涨跌幅")
    
    
    private Double p_jin41nian2zhang3die1fu2;

    public Double getP_jin41nian2zhang3die1fu2() { return this.p_jin41nian2zhang3die1fu2;}
    public void setP_jin41nian2zhang3die1fu2(Double v) { this.p_jin41nian2zhang3die1fu2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
