
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: index
* 接口: stock_zh_index_hist_csindex
* 目标地址: https://www.csindex.com.cn/zh-CN/indices/index-detail/H30374#/indices/family/detail?indexCode=H30374
* 描述: 中证指数日频率的数据
* 限量: 该接口返回指定 symbol 的 start_date 和 end_date 的指数日频率数据
*/
public class stock_zh_index_hist_csindexResponse extends AkShareRequestAndResponse {
    public stock_zh_index_hist_csindexResponse(){
        setInterfaceName("stock_zh_index_hist_csindex");
    }

    public static stock_zh_index_hist_csindexResponse of(


    String p_zhi3shu4zhong1wen2quan2cheng1,

    Double p_zhang3die1,

    String p_zhi3shu4ying1wen2quan2cheng1,

    Double p_yang4ben3shu4liang4,

    Double p_cheng2jiao1liang4,

    String p_zhi3shu4zhong1wen2jian3cheng1,

    String p_zhi3shu4ying1wen2jian3cheng1,

    Double p_shou1pan2,

    LocalDate p_ri4qi1,

    String p_zhi3shu4dai4ma3,

    Double p_kai1pan2,

    Double p_zui4di1,

    Double p_zui4gao1,

    Double p_zhang3die1fu2,

    Double p_cheng2jiao1jin1e2,


    Map.Entry<String, String>... others){
    stock_zh_index_hist_csindexResponse t = new stock_zh_index_hist_csindexResponse();


    t.p_zhi3shu4zhong1wen2quan2cheng1 = p_zhi3shu4zhong1wen2quan2cheng1;

    t.p_zhang3die1 = p_zhang3die1;

    t.p_zhi3shu4ying1wen2quan2cheng1 = p_zhi3shu4ying1wen2quan2cheng1;

    t.p_yang4ben3shu4liang4 = p_yang4ben3shu4liang4;

    t.p_cheng2jiao1liang4 = p_cheng2jiao1liang4;

    t.p_zhi3shu4zhong1wen2jian3cheng1 = p_zhi3shu4zhong1wen2jian3cheng1;

    t.p_zhi3shu4ying1wen2jian3cheng1 = p_zhi3shu4ying1wen2jian3cheng1;

    t.p_shou1pan2 = p_shou1pan2;

    t.p_ri4qi1 = p_ri4qi1;

    t.p_zhi3shu4dai4ma3 = p_zhi3shu4dai4ma3;

    t.p_kai1pan2 = p_kai1pan2;

    t.p_zui4di1 = p_zui4di1;

    t.p_zui4gao1 = p_zui4gao1;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_cheng2jiao1jin1e2 = p_cheng2jiao1jin1e2;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 指数中文全称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("指数中文全称")
    
    
    private String p_zhi3shu4zhong1wen2quan2cheng1;

    public String getP_zhi3shu4zhong1wen2quan2cheng1() { return this.p_zhi3shu4zhong1wen2quan2cheng1;}
    public void setP_zhi3shu4zhong1wen2quan2cheng1(String v) { this.p_zhi3shu4zhong1wen2quan2cheng1 = v;}

    /**
    * name: 涨跌
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("涨跌")
    
    
    private Double p_zhang3die1;

    public Double getP_zhang3die1() { return this.p_zhang3die1;}
    public void setP_zhang3die1(Double v) { this.p_zhang3die1 = v;}

    /**
    * name: 指数英文全称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("指数英文全称")
    
    
    private String p_zhi3shu4ying1wen2quan2cheng1;

    public String getP_zhi3shu4ying1wen2quan2cheng1() { return this.p_zhi3shu4ying1wen2quan2cheng1;}
    public void setP_zhi3shu4ying1wen2quan2cheng1(String v) { this.p_zhi3shu4ying1wen2quan2cheng1 = v;}

    /**
    * name: 样本数量
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("样本数量")
    
    
    private Double p_yang4ben3shu4liang4;

    public Double getP_yang4ben3shu4liang4() { return this.p_yang4ben3shu4liang4;}
    public void setP_yang4ben3shu4liang4(Double v) { this.p_yang4ben3shu4liang4 = v;}

    /**
    * name: 成交量
    * type: float64
    * desc: 注意单位: 万手
    * required: 
    */
    @JsonProperty("成交量")
    
    
    private Double p_cheng2jiao1liang4;

    public Double getP_cheng2jiao1liang4() { return this.p_cheng2jiao1liang4;}
    public void setP_cheng2jiao1liang4(Double v) { this.p_cheng2jiao1liang4 = v;}

    /**
    * name: 指数中文简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("指数中文简称")
    
    
    private String p_zhi3shu4zhong1wen2jian3cheng1;

    public String getP_zhi3shu4zhong1wen2jian3cheng1() { return this.p_zhi3shu4zhong1wen2jian3cheng1;}
    public void setP_zhi3shu4zhong1wen2jian3cheng1(String v) { this.p_zhi3shu4zhong1wen2jian3cheng1 = v;}

    /**
    * name: 指数英文简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("指数英文简称")
    
    
    private String p_zhi3shu4ying1wen2jian3cheng1;

    public String getP_zhi3shu4ying1wen2jian3cheng1() { return this.p_zhi3shu4ying1wen2jian3cheng1;}
    public void setP_zhi3shu4ying1wen2jian3cheng1(String v) { this.p_zhi3shu4ying1wen2jian3cheng1 = v;}

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
    * name: 指数代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("指数代码")
    
    
    private String p_zhi3shu4dai4ma3;

    public String getP_zhi3shu4dai4ma3() { return this.p_zhi3shu4dai4ma3;}
    public void setP_zhi3shu4dai4ma3(String v) { this.p_zhi3shu4dai4ma3 = v;}

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
    * name: 成交金额
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("成交金额")
    
    
    private Double p_cheng2jiao1jin1e2;

    public Double getP_cheng2jiao1jin1e2() { return this.p_cheng2jiao1jin1e2;}
    public void setP_cheng2jiao1jin1e2(Double v) { this.p_cheng2jiao1jin1e2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}