
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:02 CST 2022*/
package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: option
* 接口: option_czce_hist
* 目标地址: http://www.czce.com.cn/cn/jysj/lshqxz/H770319index_1.htm
* 描述: 郑州商品交易所的商品期权历史行情数据
* 限量: 单次返回指定年份指定品种期权历史行情数据
*/
public class option_czce_histResponse extends AkShareRequestAndResponse {
    public option_czce_histResponse(){
        setInterfaceName("option_czce_hist");
    }

    public static option_czce_histResponse of(


    Double p_xing2quan2liang4,

    String p_pin3zhong3dai4ma3,

    Double p_jin1jie2suan4,

    String p_cheng2jiao1liang4shou3,

    String p_cheng2jiao1e2wan4yuan2,

    Double p_jin1shou1pan2,

    Double p_yin3han2bo1dong4lu4,

    LocalDate p_jiao1yi4ri4qi1,

    Double p_zui4di1jia4,

    String p_zeng1jian3liang4,

    Double p_zhang3die12,

    Double p_zhang3die11,

    String p_kong1pan2liang4,

    Double p_zui4gao1jia4,

    Double p_DELTA,

    Double p_jin1kai1pan2,

    Double p_zuo2jie2suan4,


    Map.Entry<String, String>... others){
    option_czce_histResponse t = new option_czce_histResponse();


    t.p_xing2quan2liang4 = p_xing2quan2liang4;

    t.p_pin3zhong3dai4ma3 = p_pin3zhong3dai4ma3;

    t.p_jin1jie2suan4 = p_jin1jie2suan4;

    t.p_cheng2jiao1liang4shou3 = p_cheng2jiao1liang4shou3;

    t.p_cheng2jiao1e2wan4yuan2 = p_cheng2jiao1e2wan4yuan2;

    t.p_jin1shou1pan2 = p_jin1shou1pan2;

    t.p_yin3han2bo1dong4lu4 = p_yin3han2bo1dong4lu4;

    t.p_jiao1yi4ri4qi1 = p_jiao1yi4ri4qi1;

    t.p_zui4di1jia4 = p_zui4di1jia4;

    t.p_zeng1jian3liang4 = p_zeng1jian3liang4;

    t.p_zhang3die12 = p_zhang3die12;

    t.p_zhang3die11 = p_zhang3die11;

    t.p_kong1pan2liang4 = p_kong1pan2liang4;

    t.p_zui4gao1jia4 = p_zui4gao1jia4;

    t.p_DELTA = p_DELTA;

    t.p_jin1kai1pan2 = p_jin1kai1pan2;

    t.p_zuo2jie2suan4 = p_zuo2jie2suan4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 行权量
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("行权量")
    
    
    private Double p_xing2quan2liang4;

    public Double getP_xing2quan2liang4() { return this.p_xing2quan2liang4;}
    public void setP_xing2quan2liang4(Double v) { this.p_xing2quan2liang4 = v;}

    /**
    * name: 品种代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("品种代码")
    
    
    private String p_pin3zhong3dai4ma3;

    public String getP_pin3zhong3dai4ma3() { return this.p_pin3zhong3dai4ma3;}
    public void setP_pin3zhong3dai4ma3(String v) { this.p_pin3zhong3dai4ma3 = v;}

    /**
    * name: 今结算
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("今结算")
    
    
    private Double p_jin1jie2suan4;

    public Double getP_jin1jie2suan4() { return this.p_jin1jie2suan4;}
    public void setP_jin1jie2suan4(Double v) { this.p_jin1jie2suan4 = v;}

    /**
    * name: 成交量(手)
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("成交量(手)")
    
    
    private String p_cheng2jiao1liang4shou3;

    public String getP_cheng2jiao1liang4shou3() { return this.p_cheng2jiao1liang4shou3;}
    public void setP_cheng2jiao1liang4shou3(String v) { this.p_cheng2jiao1liang4shou3 = v;}

    /**
    * name: 成交额(万元)
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("成交额(万元)")
    
    
    private String p_cheng2jiao1e2wan4yuan2;

    public String getP_cheng2jiao1e2wan4yuan2() { return this.p_cheng2jiao1e2wan4yuan2;}
    public void setP_cheng2jiao1e2wan4yuan2(String v) { this.p_cheng2jiao1e2wan4yuan2 = v;}

    /**
    * name: 今收盘
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("今收盘")
    
    
    private Double p_jin1shou1pan2;

    public Double getP_jin1shou1pan2() { return this.p_jin1shou1pan2;}
    public void setP_jin1shou1pan2(Double v) { this.p_jin1shou1pan2 = v;}

    /**
    * name: 隐含波动率
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("隐含波动率")
    
    
    private Double p_yin3han2bo1dong4lu4;

    public Double getP_yin3han2bo1dong4lu4() { return this.p_yin3han2bo1dong4lu4;}
    public void setP_yin3han2bo1dong4lu4(Double v) { this.p_yin3han2bo1dong4lu4 = v;}

    /**
    * name: 交易日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("交易日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_jiao1yi4ri4qi1;

    public LocalDate getP_jiao1yi4ri4qi1() { return this.p_jiao1yi4ri4qi1;}
    public void setP_jiao1yi4ri4qi1(LocalDate v) { this.p_jiao1yi4ri4qi1 = v;}

    /**
    * name: 最低价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("最低价")
    
    
    private Double p_zui4di1jia4;

    public Double getP_zui4di1jia4() { return this.p_zui4di1jia4;}
    public void setP_zui4di1jia4(Double v) { this.p_zui4di1jia4 = v;}

    /**
    * name: 增减量
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("增减量")
    
    
    private String p_zeng1jian3liang4;

    public String getP_zeng1jian3liang4() { return this.p_zeng1jian3liang4;}
    public void setP_zeng1jian3liang4(String v) { this.p_zeng1jian3liang4 = v;}

    /**
    * name: 涨跌2
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("涨跌2")
    
    
    private Double p_zhang3die12;

    public Double getP_zhang3die12() { return this.p_zhang3die12;}
    public void setP_zhang3die12(Double v) { this.p_zhang3die12 = v;}

    /**
    * name: 涨跌1
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("涨跌1")
    
    
    private Double p_zhang3die11;

    public Double getP_zhang3die11() { return this.p_zhang3die11;}
    public void setP_zhang3die11(Double v) { this.p_zhang3die11 = v;}

    /**
    * name: 空盘量
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("空盘量")
    
    
    private String p_kong1pan2liang4;

    public String getP_kong1pan2liang4() { return this.p_kong1pan2liang4;}
    public void setP_kong1pan2liang4(String v) { this.p_kong1pan2liang4 = v;}

    /**
    * name: 最高价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("最高价")
    
    
    private Double p_zui4gao1jia4;

    public Double getP_zui4gao1jia4() { return this.p_zui4gao1jia4;}
    public void setP_zui4gao1jia4(Double v) { this.p_zui4gao1jia4 = v;}

    /**
    * name: DELTA
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("DELTA")
    
    
    private Double p_DELTA;

    public Double getP_DELTA() { return this.p_DELTA;}
    public void setP_DELTA(Double v) { this.p_DELTA = v;}

    /**
    * name: 今开盘
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("今开盘")
    
    
    private Double p_jin1kai1pan2;

    public Double getP_jin1kai1pan2() { return this.p_jin1kai1pan2;}
    public void setP_jin1kai1pan2(Double v) { this.p_jin1kai1pan2 = v;}

    /**
    * name: 昨结算
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("昨结算")
    
    
    private Double p_zuo2jie2suan4;

    public Double getP_zuo2jie2suan4() { return this.p_zuo2jie2suan4;}
    public void setP_zuo2jie2suan4(Double v) { this.p_zuo2jie2suan4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
