
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
* 接口: stock_zt_pool_previous_em
* 目标地址: http://quote.eastmoney.com/ztb/detail#type=zrzt
* 描述: 东方财富网-行情中心-涨停板行情-昨日涨停股池
* 限量: 单次返回所有昨日涨停股池数据
*/
public class stock_zt_pool_previous_emResponse extends AkShareRequestAndResponse {
    public stock_zt_pool_previous_emResponse(){
        setInterfaceName("stock_zt_pool_previous_em");
    }

    public static stock_zt_pool_previous_emResponse of(


    Double p_zhang3su4,

    Integer p_zuo2ri4lian2ban3shu4,

    Double p_zong3shi4zhi2,

    String p_suo3shu3xing2ye4,

    String p_xu4hao4,

    Integer p_zuo2ri4feng1ban3shi2jian1,

    String p_ming2cheng1,

    Double p_huan4shou3lu4,

    Integer p_zui4xin1jia4,

    Double p_zhen4fu2,

    Double p_liu2tong1shi4zhi2,

    Integer p_cheng2jiao1e2,

    String p_zhang3ting2tong3ji4,

    Double p_zhang3die1fu2,

    Integer p_zhang3ting2jia4,

    String p_dai4ma3,


    Map.Entry<String, String>... others){
    stock_zt_pool_previous_emResponse t = new stock_zt_pool_previous_emResponse();


    t.p_zhang3su4 = p_zhang3su4;

    t.p_zuo2ri4lian2ban3shu4 = p_zuo2ri4lian2ban3shu4;

    t.p_zong3shi4zhi2 = p_zong3shi4zhi2;

    t.p_suo3shu3xing2ye4 = p_suo3shu3xing2ye4;

    t.p_xu4hao4 = p_xu4hao4;

    t.p_zuo2ri4feng1ban3shi2jian1 = p_zuo2ri4feng1ban3shi2jian1;

    t.p_ming2cheng1 = p_ming2cheng1;

    t.p_huan4shou3lu4 = p_huan4shou3lu4;

    t.p_zui4xin1jia4 = p_zui4xin1jia4;

    t.p_zhen4fu2 = p_zhen4fu2;

    t.p_liu2tong1shi4zhi2 = p_liu2tong1shi4zhi2;

    t.p_cheng2jiao1e2 = p_cheng2jiao1e2;

    t.p_zhang3ting2tong3ji4 = p_zhang3ting2tong3ji4;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_zhang3ting2jia4 = p_zhang3ting2jia4;

    t.p_dai4ma3 = p_dai4ma3;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 涨速
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("涨速")
    
    
    private Double p_zhang3su4;

    public Double getP_zhang3su4() { return this.p_zhang3su4;}
    public void setP_zhang3su4(Double v) { this.p_zhang3su4 = v;}

    /**
    * name: 昨日连板数
    * type: int64
    * desc: 注意格式: 1 为首板
    * required: 
    */
    @JsonProperty("昨日连板数")
    
    
    private Integer p_zuo2ri4lian2ban3shu4;

    public Integer getP_zuo2ri4lian2ban3shu4() { return this.p_zuo2ri4lian2ban3shu4;}
    public void setP_zuo2ri4lian2ban3shu4(Integer v) { this.p_zuo2ri4lian2ban3shu4 = v;}

    /**
    * name: 总市值
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("总市值")
    
    
    private Double p_zong3shi4zhi2;

    public Double getP_zong3shi4zhi2() { return this.p_zong3shi4zhi2;}
    public void setP_zong3shi4zhi2(Double v) { this.p_zong3shi4zhi2 = v;}

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
    * type: int32
    * desc: 
    * required: 
    */
    @JsonProperty("序号")
    
    
    private String p_xu4hao4;

    public String getP_xu4hao4() { return this.p_xu4hao4;}
    public void setP_xu4hao4(String v) { this.p_xu4hao4 = v;}

    /**
    * name: 昨日封板时间
    * type: int64
    * desc: 注意格式: 09:25:00
    * required: 
    */
    @JsonProperty("昨日封板时间")
    
    
    private Integer p_zuo2ri4feng1ban3shi2jian1;

    public Integer getP_zuo2ri4feng1ban3shi2jian1() { return this.p_zuo2ri4feng1ban3shi2jian1;}
    public void setP_zuo2ri4feng1ban3shi2jian1(Integer v) { this.p_zuo2ri4feng1ban3shi2jian1 = v;}

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
    * name: 最新价
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("最新价")
    
    
    private Integer p_zui4xin1jia4;

    public Integer getP_zui4xin1jia4() { return this.p_zui4xin1jia4;}
    public void setP_zui4xin1jia4(Integer v) { this.p_zui4xin1jia4 = v;}

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
    * name: 流通市值
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("流通市值")
    
    
    private Double p_liu2tong1shi4zhi2;

    public Double getP_liu2tong1shi4zhi2() { return this.p_liu2tong1shi4zhi2;}
    public void setP_liu2tong1shi4zhi2(Double v) { this.p_liu2tong1shi4zhi2 = v;}

    /**
    * name: 成交额
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("成交额")
    
    
    private Integer p_cheng2jiao1e2;

    public Integer getP_cheng2jiao1e2() { return this.p_cheng2jiao1e2;}
    public void setP_cheng2jiao1e2(Integer v) { this.p_cheng2jiao1e2 = v;}

    /**
    * name: 涨停统计
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("涨停统计")
    
    
    private String p_zhang3ting2tong3ji4;

    public String getP_zhang3ting2tong3ji4() { return this.p_zhang3ting2tong3ji4;}
    public void setP_zhang3ting2tong3ji4(String v) { this.p_zhang3ting2tong3ji4 = v;}

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
    * name: 涨停价
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("涨停价")
    
    
    private Integer p_zhang3ting2jia4;

    public Integer getP_zhang3ting2jia4() { return this.p_zhang3ting2jia4;}
    public void setP_zhang3ting2jia4(Integer v) { this.p_zhang3ting2jia4 = v;}

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


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
