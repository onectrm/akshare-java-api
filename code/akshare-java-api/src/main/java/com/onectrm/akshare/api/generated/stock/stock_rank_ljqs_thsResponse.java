
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
* 接口: stock_rank_ljqs_ths
* 目标地址: http://data.10jqka.com.cn/rank/ljqs/
* 描述: 同花顺-数据中心-技术选股-量价齐升
* 限量: 单次返回所有数据
*/
public class stock_rank_ljqs_thsResponse extends AkShareRequestAndResponse {
    public stock_rank_ljqs_thsResponse(){
        setInterfaceName("stock_rank_ljqs_ths");
    }

    public static stock_rank_ljqs_thsResponse of(


    String p_suo3shu3xing2ye4,

    Integer p_xu4hao4,

    Double p_lei3ji4huan4shou3lu4,

    String p_gu3piao4jian3cheng1,

    Double p_jie1duan4zhang3fu2,

    Integer p_liang4jia4qi2sheng1tian1shu4,

    String p_gu3piao4dai4ma3,

    Double p_zui4xin1jia4,


    Map.Entry<String, String>... others){
    stock_rank_ljqs_thsResponse t = new stock_rank_ljqs_thsResponse();


    t.p_suo3shu3xing2ye4 = p_suo3shu3xing2ye4;

    t.p_xu4hao4 = p_xu4hao4;

    t.p_lei3ji4huan4shou3lu4 = p_lei3ji4huan4shou3lu4;

    t.p_gu3piao4jian3cheng1 = p_gu3piao4jian3cheng1;

    t.p_jie1duan4zhang3fu2 = p_jie1duan4zhang3fu2;

    t.p_liang4jia4qi2sheng1tian1shu4 = p_liang4jia4qi2sheng1tian1shu4;

    t.p_gu3piao4dai4ma3 = p_gu3piao4dai4ma3;

    t.p_zui4xin1jia4 = p_zui4xin1jia4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 所属行业
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("所属行业")
    
    
    private String p_suo3shu3xing2ye4;

    public String getP_suo3shu3xing2ye4() { return this.p_suo3shu3xing2ye4;}
    public void setP_suo3shu3xing2ye4(String v) { this.p_suo3shu3xing2ye4 = v;}

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
    * name: 累计换手率
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("累计换手率")
    
    
    private Double p_lei3ji4huan4shou3lu4;

    public Double getP_lei3ji4huan4shou3lu4() { return this.p_lei3ji4huan4shou3lu4;}
    public void setP_lei3ji4huan4shou3lu4(Double v) { this.p_lei3ji4huan4shou3lu4 = v;}

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
    * name: 阶段涨幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("阶段涨幅")
    
    
    private Double p_jie1duan4zhang3fu2;

    public Double getP_jie1duan4zhang3fu2() { return this.p_jie1duan4zhang3fu2;}
    public void setP_jie1duan4zhang3fu2(Double v) { this.p_jie1duan4zhang3fu2 = v;}

    /**
    * name: 量价齐升天数
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("量价齐升天数")
    
    
    private Integer p_liang4jia4qi2sheng1tian1shu4;

    public Integer getP_liang4jia4qi2sheng1tian1shu4() { return this.p_liang4jia4qi2sheng1tian1shu4;}
    public void setP_liang4jia4qi2sheng1tian1shu4(Integer v) { this.p_liang4jia4qi2sheng1tian1shu4 = v;}

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
    * name: 最新价
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("最新价")
    
    
    private Double p_zui4xin1jia4;

    public Double getP_zui4xin1jia4() { return this.p_zui4xin1jia4;}
    public void setP_zui4xin1jia4(Double v) { this.p_zui4xin1jia4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}