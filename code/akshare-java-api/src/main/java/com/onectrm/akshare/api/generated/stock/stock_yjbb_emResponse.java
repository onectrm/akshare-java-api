
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
* 接口: stock_yjbb_em
* 目标地址: http://data.eastmoney.com/bbsj/202003/yjbb.html
* 描述: 东方财富-数据中心-年报季报-业绩报表
* 限量: 单次获取指定 date 的业绩报告数据
*/
public class stock_yjbb_emResponse extends AkShareRequestAndResponse {
    public stock_yjbb_emResponse(){
        setInterfaceName("stock_yjbb_em");
    }

    public static stock_yjbb_emResponse of(


    Double p_ying2ye4shou1ru4tong2bi3zeng1zhang3,

    Double p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3,

    String p_xu4hao4,

    Double p_mei3gu3jing1ying2xian4jin1liu2liang4,

    String p_gu3piao4jian3cheng1,

    Double p_ying2ye4shou1ru4ying2ye4shou1ru4,

    String p_gu3piao4dai4ma3,

    Double p_mei3gu3jing4zi1chan3,

    String p_suo3chu3xing2ye4,

    Double p_xiao1shou4mao2li4lu4,

    Double p_jing4zi1chan3shou1yi4lu4,

    Double p_jing4li4run4ji4du4huan2bi3zeng1zhang3,

    Double p_jing4li4run4jing4li4run4,

    LocalDate p_zui4xin1gong1gao4ri4qi1,

    Double p_mei3gu3shou1yi4,

    Double p_jing4li4run4tong2bi3zeng1zhang3,


    Map.Entry<String, String>... others){
    stock_yjbb_emResponse t = new stock_yjbb_emResponse();


    t.p_ying2ye4shou1ru4tong2bi3zeng1zhang3 = p_ying2ye4shou1ru4tong2bi3zeng1zhang3;

    t.p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3 = p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3;

    t.p_xu4hao4 = p_xu4hao4;

    t.p_mei3gu3jing1ying2xian4jin1liu2liang4 = p_mei3gu3jing1ying2xian4jin1liu2liang4;

    t.p_gu3piao4jian3cheng1 = p_gu3piao4jian3cheng1;

    t.p_ying2ye4shou1ru4ying2ye4shou1ru4 = p_ying2ye4shou1ru4ying2ye4shou1ru4;

    t.p_gu3piao4dai4ma3 = p_gu3piao4dai4ma3;

    t.p_mei3gu3jing4zi1chan3 = p_mei3gu3jing4zi1chan3;

    t.p_suo3chu3xing2ye4 = p_suo3chu3xing2ye4;

    t.p_xiao1shou4mao2li4lu4 = p_xiao1shou4mao2li4lu4;

    t.p_jing4zi1chan3shou1yi4lu4 = p_jing4zi1chan3shou1yi4lu4;

    t.p_jing4li4run4ji4du4huan2bi3zeng1zhang3 = p_jing4li4run4ji4du4huan2bi3zeng1zhang3;

    t.p_jing4li4run4jing4li4run4 = p_jing4li4run4jing4li4run4;

    t.p_zui4xin1gong1gao4ri4qi1 = p_zui4xin1gong1gao4ri4qi1;

    t.p_mei3gu3shou1yi4 = p_mei3gu3shou1yi4;

    t.p_jing4li4run4tong2bi3zeng1zhang3 = p_jing4li4run4tong2bi3zeng1zhang3;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 营业收入-同比增长
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("营业收入-同比增长")
    
    
    private Double p_ying2ye4shou1ru4tong2bi3zeng1zhang3;

    public Double getP_ying2ye4shou1ru4tong2bi3zeng1zhang3() { return this.p_ying2ye4shou1ru4tong2bi3zeng1zhang3;}
    public void setP_ying2ye4shou1ru4tong2bi3zeng1zhang3(Double v) { this.p_ying2ye4shou1ru4tong2bi3zeng1zhang3 = v;}

    /**
    * name: 营业收入-季度环比增长
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("营业收入-季度环比增长")
    
    
    private Double p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3;

    public Double getP_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3() { return this.p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3;}
    public void setP_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3(Double v) { this.p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3 = v;}

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
    * name: 每股经营现金流量
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("每股经营现金流量")
    
    
    private Double p_mei3gu3jing1ying2xian4jin1liu2liang4;

    public Double getP_mei3gu3jing1ying2xian4jin1liu2liang4() { return this.p_mei3gu3jing1ying2xian4jin1liu2liang4;}
    public void setP_mei3gu3jing1ying2xian4jin1liu2liang4(Double v) { this.p_mei3gu3jing1ying2xian4jin1liu2liang4 = v;}

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
    * name: 营业收入-营业收入
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("营业收入-营业收入")
    
    
    private Double p_ying2ye4shou1ru4ying2ye4shou1ru4;

    public Double getP_ying2ye4shou1ru4ying2ye4shou1ru4() { return this.p_ying2ye4shou1ru4ying2ye4shou1ru4;}
    public void setP_ying2ye4shou1ru4ying2ye4shou1ru4(Double v) { this.p_ying2ye4shou1ru4ying2ye4shou1ru4 = v;}

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
    * name: 每股净资产
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("每股净资产")
    
    
    private Double p_mei3gu3jing4zi1chan3;

    public Double getP_mei3gu3jing4zi1chan3() { return this.p_mei3gu3jing4zi1chan3;}
    public void setP_mei3gu3jing4zi1chan3(Double v) { this.p_mei3gu3jing4zi1chan3 = v;}

    /**
    * name: 所处行业
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("所处行业")
    
    
    private String p_suo3chu3xing2ye4;

    public String getP_suo3chu3xing2ye4() { return this.p_suo3chu3xing2ye4;}
    public void setP_suo3chu3xing2ye4(String v) { this.p_suo3chu3xing2ye4 = v;}

    /**
    * name: 销售毛利率
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("销售毛利率")
    
    
    private Double p_xiao1shou4mao2li4lu4;

    public Double getP_xiao1shou4mao2li4lu4() { return this.p_xiao1shou4mao2li4lu4;}
    public void setP_xiao1shou4mao2li4lu4(Double v) { this.p_xiao1shou4mao2li4lu4 = v;}

    /**
    * name: 净资产收益率
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("净资产收益率")
    
    
    private Double p_jing4zi1chan3shou1yi4lu4;

    public Double getP_jing4zi1chan3shou1yi4lu4() { return this.p_jing4zi1chan3shou1yi4lu4;}
    public void setP_jing4zi1chan3shou1yi4lu4(Double v) { this.p_jing4zi1chan3shou1yi4lu4 = v;}

    /**
    * name: 净利润-季度环比增长
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("净利润-季度环比增长")
    
    
    private Double p_jing4li4run4ji4du4huan2bi3zeng1zhang3;

    public Double getP_jing4li4run4ji4du4huan2bi3zeng1zhang3() { return this.p_jing4li4run4ji4du4huan2bi3zeng1zhang3;}
    public void setP_jing4li4run4ji4du4huan2bi3zeng1zhang3(Double v) { this.p_jing4li4run4ji4du4huan2bi3zeng1zhang3 = v;}

    /**
    * name: 净利润-净利润
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("净利润-净利润")
    
    
    private Double p_jing4li4run4jing4li4run4;

    public Double getP_jing4li4run4jing4li4run4() { return this.p_jing4li4run4jing4li4run4;}
    public void setP_jing4li4run4jing4li4run4(Double v) { this.p_jing4li4run4jing4li4run4 = v;}

    /**
    * name: 最新公告日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("最新公告日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_zui4xin1gong1gao4ri4qi1;

    public LocalDate getP_zui4xin1gong1gao4ri4qi1() { return this.p_zui4xin1gong1gao4ri4qi1;}
    public void setP_zui4xin1gong1gao4ri4qi1(LocalDate v) { this.p_zui4xin1gong1gao4ri4qi1 = v;}

    /**
    * name: 每股收益
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("每股收益")
    
    
    private Double p_mei3gu3shou1yi4;

    public Double getP_mei3gu3shou1yi4() { return this.p_mei3gu3shou1yi4;}
    public void setP_mei3gu3shou1yi4(Double v) { this.p_mei3gu3shou1yi4 = v;}

    /**
    * name: 净利润-同比增长
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("净利润-同比增长")
    
    
    private Double p_jing4li4run4tong2bi3zeng1zhang3;

    public Double getP_jing4li4run4tong2bi3zeng1zhang3() { return this.p_jing4li4run4tong2bi3zeng1zhang3;}
    public void setP_jing4li4run4tong2bi3zeng1zhang3(Double v) { this.p_jing4li4run4tong2bi3zeng1zhang3 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}