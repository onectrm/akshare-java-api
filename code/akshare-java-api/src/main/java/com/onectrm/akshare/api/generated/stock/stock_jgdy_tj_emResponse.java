
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
* 接口: stock_jgdy_tj_em
* 目标地址: http://data.eastmoney.com/jgdy/tj.html
* 描述: 东方财富网-数据中心-特色数据-机构调研-机构调研统计
* 限量: 单次返回所有历史数据
*/
public class stock_jgdy_tj_emResponse extends AkShareRequestAndResponse {
    public stock_jgdy_tj_emResponse(){
        setInterfaceName("stock_jgdy_tj_em");
    }

    public static stock_jgdy_tj_emResponse of(


    String p_jie1dai4ren2yuan2,

    Integer p_xu4hao4,

    Integer p_jie1dai4ji1gou4shu4liang4,

    LocalDate p_gong1gao4ri4qi1,

    String p_ming2cheng1,

    Double p_zhang3die1fu2,

    String p_jie1dai4fang1shi4,

    LocalDate p_jie1dai4ri4qi1,

    Double p_zui4xin1jia4,

    String p_dai4ma3,

    String p_jie1dai4di4dian3,


    Map.Entry<String, String>... others){
    stock_jgdy_tj_emResponse t = new stock_jgdy_tj_emResponse();


    t.p_jie1dai4ren2yuan2 = p_jie1dai4ren2yuan2;

    t.p_xu4hao4 = p_xu4hao4;

    t.p_jie1dai4ji1gou4shu4liang4 = p_jie1dai4ji1gou4shu4liang4;

    t.p_gong1gao4ri4qi1 = p_gong1gao4ri4qi1;

    t.p_ming2cheng1 = p_ming2cheng1;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_jie1dai4fang1shi4 = p_jie1dai4fang1shi4;

    t.p_jie1dai4ri4qi1 = p_jie1dai4ri4qi1;

    t.p_zui4xin1jia4 = p_zui4xin1jia4;

    t.p_dai4ma3 = p_dai4ma3;

    t.p_jie1dai4di4dian3 = p_jie1dai4di4dian3;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 接待人员
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("接待人员")
    
    
    private String p_jie1dai4ren2yuan2;

    public String getP_jie1dai4ren2yuan2() { return this.p_jie1dai4ren2yuan2;}
    public void setP_jie1dai4ren2yuan2(String v) { this.p_jie1dai4ren2yuan2 = v;}

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
    * name: 接待机构数量
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("接待机构数量")
    
    
    private Integer p_jie1dai4ji1gou4shu4liang4;

    public Integer getP_jie1dai4ji1gou4shu4liang4() { return this.p_jie1dai4ji1gou4shu4liang4;}
    public void setP_jie1dai4ji1gou4shu4liang4(Integer v) { this.p_jie1dai4ji1gou4shu4liang4 = v;}

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
    * name: 接待方式
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("接待方式")
    
    
    private String p_jie1dai4fang1shi4;

    public String getP_jie1dai4fang1shi4() { return this.p_jie1dai4fang1shi4;}
    public void setP_jie1dai4fang1shi4(String v) { this.p_jie1dai4fang1shi4 = v;}

    /**
    * name: 接待日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("接待日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_jie1dai4ri4qi1;

    public LocalDate getP_jie1dai4ri4qi1() { return this.p_jie1dai4ri4qi1;}
    public void setP_jie1dai4ri4qi1(LocalDate v) { this.p_jie1dai4ri4qi1 = v;}

    /**
    * name: 最新价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("最新价")
    
    
    private Double p_zui4xin1jia4;

    public Double getP_zui4xin1jia4() { return this.p_zui4xin1jia4;}
    public void setP_zui4xin1jia4(Double v) { this.p_zui4xin1jia4 = v;}

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
    * name: 接待地点
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("接待地点")
    
    
    private String p_jie1dai4di4dian3;

    public String getP_jie1dai4di4dian3() { return this.p_jie1dai4di4dian3;}
    public void setP_jie1dai4di4dian3(String v) { this.p_jie1dai4di4dian3 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
