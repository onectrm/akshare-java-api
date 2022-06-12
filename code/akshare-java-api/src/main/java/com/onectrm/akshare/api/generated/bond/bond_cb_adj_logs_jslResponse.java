
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: bond
* 接口: bond_cb_adj_logs_jsl
* 目标地址: https://app.jisilu.cn/data/cbnew/#cb; 点击带红色星号的转股价会弹出转股价调整记录
* 描述: 集思录-单个可转债的转股价格-调整记录
* 限量: 返回当前时刻该可转债的所有转股价格调整记录
*/
public class bond_cb_adj_logs_jslResponse extends AkShareRequestAndResponse {
    public bond_cb_adj_logs_jslResponse(){
        setInterfaceName("bond_cb_adj_logs_jsl");
    }

    public static bond_cb_adj_logs_jslResponse of(


    String p_zhuan3zhai4ming2cheng1,

    Double p_xia4xiu1hou4zhuan3gu3jia4,

    LocalDate p_xin1zhuan3gu3jia4sheng1xiao4ri4qi1,

    String p_gu3dong1da4hui4ri4,

    Double p_xia4xiu1qian2zhuan3gu3jia4,

    Double p_xia4xiu1di3jia4,


    Map.Entry<String, String>... others){
    bond_cb_adj_logs_jslResponse t = new bond_cb_adj_logs_jslResponse();


    t.p_zhuan3zhai4ming2cheng1 = p_zhuan3zhai4ming2cheng1;

    t.p_xia4xiu1hou4zhuan3gu3jia4 = p_xia4xiu1hou4zhuan3gu3jia4;

    t.p_xin1zhuan3gu3jia4sheng1xiao4ri4qi1 = p_xin1zhuan3gu3jia4sheng1xiao4ri4qi1;

    t.p_gu3dong1da4hui4ri4 = p_gu3dong1da4hui4ri4;

    t.p_xia4xiu1qian2zhuan3gu3jia4 = p_xia4xiu1qian2zhuan3gu3jia4;

    t.p_xia4xiu1di3jia4 = p_xia4xiu1di3jia4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 转债名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("转债名称")
    
    
    private String p_zhuan3zhai4ming2cheng1;

    public String getP_zhuan3zhai4ming2cheng1() { return this.p_zhuan3zhai4ming2cheng1;}
    public void setP_zhuan3zhai4ming2cheng1(String v) { this.p_zhuan3zhai4ming2cheng1 = v;}

    /**
    * name: 下修后转股价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("下修后转股价")
    
    
    private Double p_xia4xiu1hou4zhuan3gu3jia4;

    public Double getP_xia4xiu1hou4zhuan3gu3jia4() { return this.p_xia4xiu1hou4zhuan3gu3jia4;}
    public void setP_xia4xiu1hou4zhuan3gu3jia4(Double v) { this.p_xia4xiu1hou4zhuan3gu3jia4 = v;}

    /**
    * name: 新转股价生效日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("新转股价生效日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_xin1zhuan3gu3jia4sheng1xiao4ri4qi1;

    public LocalDate getP_xin1zhuan3gu3jia4sheng1xiao4ri4qi1() { return this.p_xin1zhuan3gu3jia4sheng1xiao4ri4qi1;}
    public void setP_xin1zhuan3gu3jia4sheng1xiao4ri4qi1(LocalDate v) { this.p_xin1zhuan3gu3jia4sheng1xiao4ri4qi1 = v;}

    /**
    * name: 股东大会日
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股东大会日")
    
    
    private String p_gu3dong1da4hui4ri4;

    public String getP_gu3dong1da4hui4ri4() { return this.p_gu3dong1da4hui4ri4;}
    public void setP_gu3dong1da4hui4ri4(String v) { this.p_gu3dong1da4hui4ri4 = v;}

    /**
    * name: 下修前转股价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("下修前转股价")
    
    
    private Double p_xia4xiu1qian2zhuan3gu3jia4;

    public Double getP_xia4xiu1qian2zhuan3gu3jia4() { return this.p_xia4xiu1qian2zhuan3gu3jia4;}
    public void setP_xia4xiu1qian2zhuan3gu3jia4(Double v) { this.p_xia4xiu1qian2zhuan3gu3jia4 = v;}

    /**
    * name: 下修底价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("下修底价")
    
    
    private Double p_xia4xiu1di3jia4;

    public Double getP_xia4xiu1di3jia4() { return this.p_xia4xiu1di3jia4;}
    public void setP_xia4xiu1di3jia4(Double v) { this.p_xia4xiu1di3jia4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
