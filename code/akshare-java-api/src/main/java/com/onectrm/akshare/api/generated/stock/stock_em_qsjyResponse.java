
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
* 接口: stock_em_qsjy
* 目标地址: http://data.eastmoney.com/other/qsjy.html
* 描述: 东方财富网-数据中心-特色数据-券商业绩月报
* 限量: 单次获取所有数据, 数据从 20100601-至今, 月频率
*/
public class stock_em_qsjyResponse extends AkShareRequestAndResponse {
    public stock_em_qsjyResponse(){
        setInterfaceName("stock_em_qsjy");
    }

    public static stock_em_qsjyResponse of(


    Double p_dang1yue4ying2ye4shou1ru4huan2bi3zeng1zhang3,

    Double p_dang1nian2lei3ji4ying2ye4shou1ru4lei3ji4ying2ye4shou1ru4,

    String p_jian3cheng1,

    String p_dang1yue4ying2ye4shou1ru4ying2ye4shou1ru4,

    Double p_dang1nian2lei3ji4ying2ye4shou1ru4tong2bi3zeng1zhang3,

    LocalDate p_kai1shi3ri4qi1,

    String p_dang1yue4jing4li4run4tong2bi3zeng1zhang3,

    Double p_dang1nian2lei3ji4jing4li4run4tong2bi3zeng1zhang3,

    Double p_jing4zi1chan3jing4zi1chan3,

    String p_dang1yue4jing4li4run4huan2bi3zeng1zhang3,

    String p_dang1yue4jing4li4run4jing4li4run4,

    Double p_dang1yue4ying2ye4shou1ru4tong2bi3zeng1zhang3,

    LocalDate p_jie2shu4ri4qi1,

    Double p_jing4zi1chan3tong2bi3zeng1zhang3,

    String p_dang1nian2lei3ji4jing4li4run4lei3ji4jing4li4run4,

    String p_dai4ma3,


    Map.Entry<String, String>... others){
    stock_em_qsjyResponse t = new stock_em_qsjyResponse();


    t.p_dang1yue4ying2ye4shou1ru4huan2bi3zeng1zhang3 = p_dang1yue4ying2ye4shou1ru4huan2bi3zeng1zhang3;

    t.p_dang1nian2lei3ji4ying2ye4shou1ru4lei3ji4ying2ye4shou1ru4 = p_dang1nian2lei3ji4ying2ye4shou1ru4lei3ji4ying2ye4shou1ru4;

    t.p_jian3cheng1 = p_jian3cheng1;

    t.p_dang1yue4ying2ye4shou1ru4ying2ye4shou1ru4 = p_dang1yue4ying2ye4shou1ru4ying2ye4shou1ru4;

    t.p_dang1nian2lei3ji4ying2ye4shou1ru4tong2bi3zeng1zhang3 = p_dang1nian2lei3ji4ying2ye4shou1ru4tong2bi3zeng1zhang3;

    t.p_kai1shi3ri4qi1 = p_kai1shi3ri4qi1;

    t.p_dang1yue4jing4li4run4tong2bi3zeng1zhang3 = p_dang1yue4jing4li4run4tong2bi3zeng1zhang3;

    t.p_dang1nian2lei3ji4jing4li4run4tong2bi3zeng1zhang3 = p_dang1nian2lei3ji4jing4li4run4tong2bi3zeng1zhang3;

    t.p_jing4zi1chan3jing4zi1chan3 = p_jing4zi1chan3jing4zi1chan3;

    t.p_dang1yue4jing4li4run4huan2bi3zeng1zhang3 = p_dang1yue4jing4li4run4huan2bi3zeng1zhang3;

    t.p_dang1yue4jing4li4run4jing4li4run4 = p_dang1yue4jing4li4run4jing4li4run4;

    t.p_dang1yue4ying2ye4shou1ru4tong2bi3zeng1zhang3 = p_dang1yue4ying2ye4shou1ru4tong2bi3zeng1zhang3;

    t.p_jie2shu4ri4qi1 = p_jie2shu4ri4qi1;

    t.p_jing4zi1chan3tong2bi3zeng1zhang3 = p_jing4zi1chan3tong2bi3zeng1zhang3;

    t.p_dang1nian2lei3ji4jing4li4run4lei3ji4jing4li4run4 = p_dang1nian2lei3ji4jing4li4run4lei3ji4jing4li4run4;

    t.p_dai4ma3 = p_dai4ma3;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 当月营业收入_环比增长
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("当月营业收入_环比增长")
    
    
    private Double p_dang1yue4ying2ye4shou1ru4huan2bi3zeng1zhang3;

    public Double getP_dang1yue4ying2ye4shou1ru4huan2bi3zeng1zhang3() { return this.p_dang1yue4ying2ye4shou1ru4huan2bi3zeng1zhang3;}
    public void setP_dang1yue4ying2ye4shou1ru4huan2bi3zeng1zhang3(Double v) { this.p_dang1yue4ying2ye4shou1ru4huan2bi3zeng1zhang3 = v;}

    /**
    * name: 当年累计营业收入_累计营业收入
    * type: float
    * desc: 注意单位: 万元
    * required: Y
    */
    @JsonProperty("当年累计营业收入_累计营业收入")
    
    
    private Double p_dang1nian2lei3ji4ying2ye4shou1ru4lei3ji4ying2ye4shou1ru4;

    public Double getP_dang1nian2lei3ji4ying2ye4shou1ru4lei3ji4ying2ye4shou1ru4() { return this.p_dang1nian2lei3ji4ying2ye4shou1ru4lei3ji4ying2ye4shou1ru4;}
    public void setP_dang1nian2lei3ji4ying2ye4shou1ru4lei3ji4ying2ye4shou1ru4(Double v) { this.p_dang1nian2lei3ji4ying2ye4shou1ru4lei3ji4ying2ye4shou1ru4 = v;}

    /**
    * name: 简称
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("简称")
    
    
    private String p_jian3cheng1;

    public String getP_jian3cheng1() { return this.p_jian3cheng1;}
    public void setP_jian3cheng1(String v) { this.p_jian3cheng1 = v;}

    /**
    * name: 当月营业收入_营业收入
    * type: str
    * desc: 注意单位: 万元
    * required: Y
    */
    @JsonProperty("当月营业收入_营业收入")
    
    
    private String p_dang1yue4ying2ye4shou1ru4ying2ye4shou1ru4;

    public String getP_dang1yue4ying2ye4shou1ru4ying2ye4shou1ru4() { return this.p_dang1yue4ying2ye4shou1ru4ying2ye4shou1ru4;}
    public void setP_dang1yue4ying2ye4shou1ru4ying2ye4shou1ru4(String v) { this.p_dang1yue4ying2ye4shou1ru4ying2ye4shou1ru4 = v;}

    /**
    * name: 当年累计营业收入_同比增长
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("当年累计营业收入_同比增长")
    
    
    private Double p_dang1nian2lei3ji4ying2ye4shou1ru4tong2bi3zeng1zhang3;

    public Double getP_dang1nian2lei3ji4ying2ye4shou1ru4tong2bi3zeng1zhang3() { return this.p_dang1nian2lei3ji4ying2ye4shou1ru4tong2bi3zeng1zhang3;}
    public void setP_dang1nian2lei3ji4ying2ye4shou1ru4tong2bi3zeng1zhang3(Double v) { this.p_dang1nian2lei3ji4ying2ye4shou1ru4tong2bi3zeng1zhang3 = v;}

    /**
    * name: 开始日期
    * type: datetime
    * desc: 
    * required: Y
    */
    @JsonProperty("开始日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_kai1shi3ri4qi1;

    public LocalDate getP_kai1shi3ri4qi1() { return this.p_kai1shi3ri4qi1;}
    public void setP_kai1shi3ri4qi1(LocalDate v) { this.p_kai1shi3ri4qi1 = v;}

    /**
    * name: 当月净利润_同比增长
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("当月净利润_同比增长")
    
    
    private String p_dang1yue4jing4li4run4tong2bi3zeng1zhang3;

    public String getP_dang1yue4jing4li4run4tong2bi3zeng1zhang3() { return this.p_dang1yue4jing4li4run4tong2bi3zeng1zhang3;}
    public void setP_dang1yue4jing4li4run4tong2bi3zeng1zhang3(String v) { this.p_dang1yue4jing4li4run4tong2bi3zeng1zhang3 = v;}

    /**
    * name: 当年累计净利润_同比增长
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("当年累计净利润_同比增长")
    
    
    private Double p_dang1nian2lei3ji4jing4li4run4tong2bi3zeng1zhang3;

    public Double getP_dang1nian2lei3ji4jing4li4run4tong2bi3zeng1zhang3() { return this.p_dang1nian2lei3ji4jing4li4run4tong2bi3zeng1zhang3;}
    public void setP_dang1nian2lei3ji4jing4li4run4tong2bi3zeng1zhang3(Double v) { this.p_dang1nian2lei3ji4jing4li4run4tong2bi3zeng1zhang3 = v;}

    /**
    * name: 净资产_净资产
    * type: float
    * desc: 注意单位: 万元
    * required: Y
    */
    @JsonProperty("净资产_净资产")
    
    
    private Double p_jing4zi1chan3jing4zi1chan3;

    public Double getP_jing4zi1chan3jing4zi1chan3() { return this.p_jing4zi1chan3jing4zi1chan3;}
    public void setP_jing4zi1chan3jing4zi1chan3(Double v) { this.p_jing4zi1chan3jing4zi1chan3 = v;}

    /**
    * name: 当月净利润_环比增长
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("当月净利润_环比增长")
    
    
    private String p_dang1yue4jing4li4run4huan2bi3zeng1zhang3;

    public String getP_dang1yue4jing4li4run4huan2bi3zeng1zhang3() { return this.p_dang1yue4jing4li4run4huan2bi3zeng1zhang3;}
    public void setP_dang1yue4jing4li4run4huan2bi3zeng1zhang3(String v) { this.p_dang1yue4jing4li4run4huan2bi3zeng1zhang3 = v;}

    /**
    * name: 当月净利润_净利润
    * type: str
    * desc: 注意单位: 万元
    * required: Y
    */
    @JsonProperty("当月净利润_净利润")
    
    
    private String p_dang1yue4jing4li4run4jing4li4run4;

    public String getP_dang1yue4jing4li4run4jing4li4run4() { return this.p_dang1yue4jing4li4run4jing4li4run4;}
    public void setP_dang1yue4jing4li4run4jing4li4run4(String v) { this.p_dang1yue4jing4li4run4jing4li4run4 = v;}

    /**
    * name: 当月营业收入_同比增长
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("当月营业收入_同比增长")
    
    
    private Double p_dang1yue4ying2ye4shou1ru4tong2bi3zeng1zhang3;

    public Double getP_dang1yue4ying2ye4shou1ru4tong2bi3zeng1zhang3() { return this.p_dang1yue4ying2ye4shou1ru4tong2bi3zeng1zhang3;}
    public void setP_dang1yue4ying2ye4shou1ru4tong2bi3zeng1zhang3(Double v) { this.p_dang1yue4ying2ye4shou1ru4tong2bi3zeng1zhang3 = v;}

    /**
    * name: 结束日期
    * type: datetime
    * desc: 
    * required: Y
    */
    @JsonProperty("结束日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_jie2shu4ri4qi1;

    public LocalDate getP_jie2shu4ri4qi1() { return this.p_jie2shu4ri4qi1;}
    public void setP_jie2shu4ri4qi1(LocalDate v) { this.p_jie2shu4ri4qi1 = v;}

    /**
    * name: 净资产_同比增长
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("净资产_同比增长")
    
    
    private Double p_jing4zi1chan3tong2bi3zeng1zhang3;

    public Double getP_jing4zi1chan3tong2bi3zeng1zhang3() { return this.p_jing4zi1chan3tong2bi3zeng1zhang3;}
    public void setP_jing4zi1chan3tong2bi3zeng1zhang3(Double v) { this.p_jing4zi1chan3tong2bi3zeng1zhang3 = v;}

    /**
    * name: 当年累计净利润_累计净利润
    * type: str
    * desc: 注意单位: 万元
    * required: Y
    */
    @JsonProperty("当年累计净利润_累计净利润")
    
    
    private String p_dang1nian2lei3ji4jing4li4run4lei3ji4jing4li4run4;

    public String getP_dang1nian2lei3ji4jing4li4run4lei3ji4jing4li4run4() { return this.p_dang1nian2lei3ji4jing4li4run4lei3ji4jing4li4run4;}
    public void setP_dang1nian2lei3ji4jing4li4run4lei3ji4jing4li4run4(String v) { this.p_dang1nian2lei3ji4jing4li4run4lei3ji4jing4li4run4 = v;}

    /**
    * name: 代码
    * type: str
    * desc: 
    * required: Y
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
