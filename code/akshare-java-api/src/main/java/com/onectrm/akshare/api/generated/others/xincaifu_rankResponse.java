
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:02 CST 2022*/
package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: others
* 接口: xincaifu_rank
* 目标地址: http://www.xcf.cn/zhuanti/ztzz/hdzt1/500frb/index.html
* 描述: 获取新财富 500 富豪榜, 从 2003 年至今
* 限量: 单次返回指定年份的富豪榜数据
*/
public class xincaifu_rankResponse extends AkShareRequestAndResponse {
    public xincaifu_rankResponse(){
        setInterfaceName("xincaifu_rank");
    }

    public static xincaifu_rankResponse of(


    Double p_cai2fu4,

    String p_xiang1guan1xing2ye4,

    String p_gong1si1zong3bu4,

    Integer p_nian2fen4,

    String p_xing4bie2,

    Integer p_pai2ming2,

    String p_xing4ming2,

    String p_nian2ling2,

    String p_zhu3yao4gong1si1,


    Map.Entry<String, String>... others){
    xincaifu_rankResponse t = new xincaifu_rankResponse();


    t.p_cai2fu4 = p_cai2fu4;

    t.p_xiang1guan1xing2ye4 = p_xiang1guan1xing2ye4;

    t.p_gong1si1zong3bu4 = p_gong1si1zong3bu4;

    t.p_nian2fen4 = p_nian2fen4;

    t.p_xing4bie2 = p_xing4bie2;

    t.p_pai2ming2 = p_pai2ming2;

    t.p_xing4ming2 = p_xing4ming2;

    t.p_nian2ling2 = p_nian2ling2;

    t.p_zhu3yao4gong1si1 = p_zhu3yao4gong1si1;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 财富
    * type: float
    * desc: 注意单位: 亿元
    * required: Y
    */
    @JsonProperty("财富")
    
    
    private Double p_cai2fu4;

    public Double getP_cai2fu4() { return this.p_cai2fu4;}
    public void setP_cai2fu4(Double v) { this.p_cai2fu4 = v;}

    /**
    * name: 相关行业
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("相关行业")
    
    
    private String p_xiang1guan1xing2ye4;

    public String getP_xiang1guan1xing2ye4() { return this.p_xiang1guan1xing2ye4;}
    public void setP_xiang1guan1xing2ye4(String v) { this.p_xiang1guan1xing2ye4 = v;}

    /**
    * name: 公司总部
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("公司总部")
    
    
    private String p_gong1si1zong3bu4;

    public String getP_gong1si1zong3bu4() { return this.p_gong1si1zong3bu4;}
    public void setP_gong1si1zong3bu4(String v) { this.p_gong1si1zong3bu4 = v;}

    /**
    * name: 年份
    * type: int
    * desc: 
    * required: Y
    */
    @JsonProperty("年份")
    
    
    private Integer p_nian2fen4;

    public Integer getP_nian2fen4() { return this.p_nian2fen4;}
    public void setP_nian2fen4(Integer v) { this.p_nian2fen4 = v;}

    /**
    * name: 性别
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("性别")
    
    
    private String p_xing4bie2;

    public String getP_xing4bie2() { return this.p_xing4bie2;}
    public void setP_xing4bie2(String v) { this.p_xing4bie2 = v;}

    /**
    * name: 排名
    * type: int
    * desc: 
    * required: Y
    */
    @JsonProperty("排名")
    
    
    private Integer p_pai2ming2;

    public Integer getP_pai2ming2() { return this.p_pai2ming2;}
    public void setP_pai2ming2(Integer v) { this.p_pai2ming2 = v;}

    /**
    * name: 姓名
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("姓名")
    
    
    private String p_xing4ming2;

    public String getP_xing4ming2() { return this.p_xing4ming2;}
    public void setP_xing4ming2(String v) { this.p_xing4ming2 = v;}

    /**
    * name: 年龄
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("年龄")
    
    
    private String p_nian2ling2;

    public String getP_nian2ling2() { return this.p_nian2ling2;}
    public void setP_nian2ling2(String v) { this.p_nian2ling2 = v;}

    /**
    * name: 主要公司
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("主要公司")
    
    
    private String p_zhu3yao4gong1si1;

    public String getP_zhu3yao4gong1si1() { return this.p_zhu3yao4gong1si1;}
    public void setP_zhu3yao4gong1si1(String v) { this.p_zhu3yao4gong1si1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}