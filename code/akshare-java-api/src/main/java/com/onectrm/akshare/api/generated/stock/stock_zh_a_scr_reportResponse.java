
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
* 接口: stock_zh_a_scr_report
* 目标地址: http://stockdata.stock.hexun.com/zrbg/Plate.aspx?date=2010-12-31#
* 描述: 和讯财经-企业社会责任数据; 年度更新
* 限量: 单次返回指定 year 和 need_page 的数据
*/
public class stock_zh_a_scr_reportResponse extends AkShareRequestAndResponse {
    public stock_zh_a_scr_reportResponse(){
        setInterfaceName("stock_zh_a_scr_report");
    }

    public static stock_zh_a_scr_reportResponse of(


    Double p_gu3dong1ze2ren4,

    String p_deng3ji2,

    String p_gu3piao4ming2cheng1,

    Double p_huan2jing4ze2ren4,

    Double p_gong1ying1shang1ke4hu4he2xiao1fei4zhe3quan2yi4ze2ren4,

    Integer p_xu4hao4,

    Double p_she4hui4ze2ren4,

    String p_gu3piao4dai4ma3,

    Double p_zong3de2fen1,

    Double p_yuan2gong1ze2ren4,


    Map.Entry<String, String>... others){
    stock_zh_a_scr_reportResponse t = new stock_zh_a_scr_reportResponse();


    t.p_gu3dong1ze2ren4 = p_gu3dong1ze2ren4;

    t.p_deng3ji2 = p_deng3ji2;

    t.p_gu3piao4ming2cheng1 = p_gu3piao4ming2cheng1;

    t.p_huan2jing4ze2ren4 = p_huan2jing4ze2ren4;

    t.p_gong1ying1shang1ke4hu4he2xiao1fei4zhe3quan2yi4ze2ren4 = p_gong1ying1shang1ke4hu4he2xiao1fei4zhe3quan2yi4ze2ren4;

    t.p_xu4hao4 = p_xu4hao4;

    t.p_she4hui4ze2ren4 = p_she4hui4ze2ren4;

    t.p_gu3piao4dai4ma3 = p_gu3piao4dai4ma3;

    t.p_zong3de2fen1 = p_zong3de2fen1;

    t.p_yuan2gong1ze2ren4 = p_yuan2gong1ze2ren4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 股东责任
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("股东责任")
    
    
    private Double p_gu3dong1ze2ren4;

    public Double getP_gu3dong1ze2ren4() { return this.p_gu3dong1ze2ren4;}
    public void setP_gu3dong1ze2ren4(Double v) { this.p_gu3dong1ze2ren4 = v;}

    /**
    * name: 等级
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("等级")
    
    
    private String p_deng3ji2;

    public String getP_deng3ji2() { return this.p_deng3ji2;}
    public void setP_deng3ji2(String v) { this.p_deng3ji2 = v;}

    /**
    * name: 股票名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股票名称")
    
    
    private String p_gu3piao4ming2cheng1;

    public String getP_gu3piao4ming2cheng1() { return this.p_gu3piao4ming2cheng1;}
    public void setP_gu3piao4ming2cheng1(String v) { this.p_gu3piao4ming2cheng1 = v;}

    /**
    * name: 环境责任
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("环境责任")
    
    
    private Double p_huan2jing4ze2ren4;

    public Double getP_huan2jing4ze2ren4() { return this.p_huan2jing4ze2ren4;}
    public void setP_huan2jing4ze2ren4(Double v) { this.p_huan2jing4ze2ren4 = v;}

    /**
    * name: 供应商、客户和消费者权益责任
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("供应商、客户和消费者权益责任")
    
    
    private Double p_gong1ying1shang1ke4hu4he2xiao1fei4zhe3quan2yi4ze2ren4;

    public Double getP_gong1ying1shang1ke4hu4he2xiao1fei4zhe3quan2yi4ze2ren4() { return this.p_gong1ying1shang1ke4hu4he2xiao1fei4zhe3quan2yi4ze2ren4;}
    public void setP_gong1ying1shang1ke4hu4he2xiao1fei4zhe3quan2yi4ze2ren4(Double v) { this.p_gong1ying1shang1ke4hu4he2xiao1fei4zhe3quan2yi4ze2ren4 = v;}

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
    * name: 社会责任
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("社会责任")
    
    
    private Double p_she4hui4ze2ren4;

    public Double getP_she4hui4ze2ren4() { return this.p_she4hui4ze2ren4;}
    public void setP_she4hui4ze2ren4(Double v) { this.p_she4hui4ze2ren4 = v;}

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
    * name: 总得分
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("总得分")
    
    
    private Double p_zong3de2fen1;

    public Double getP_zong3de2fen1() { return this.p_zong3de2fen1;}
    public void setP_zong3de2fen1(Double v) { this.p_zong3de2fen1 = v;}

    /**
    * name: 员工责任
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("员工责任")
    
    
    private Double p_yuan2gong1ze2ren4;

    public Double getP_yuan2gong1ze2ren4() { return this.p_yuan2gong1ze2ren4;}
    public void setP_yuan2gong1ze2ren4(Double v) { this.p_yuan2gong1ze2ren4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
