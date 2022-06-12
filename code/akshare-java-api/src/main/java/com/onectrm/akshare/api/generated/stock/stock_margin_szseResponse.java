
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
* 接口: stock_margin_szse
* 目标地址: http://www.szse.cn/disclosure/margin/margin/index.html
* 描述: 深圳证券交易所-融资融券数据-融资融券汇总数据
* 限量: 单次返回指定时间内的所有历史数据
*/
public class stock_margin_szseResponse extends AkShareRequestAndResponse {
    public stock_margin_szseResponse(){
        setInterfaceName("stock_margin_szse");
    }

    public static stock_margin_szseResponse of(


    Double p_rong2quan4yu2e2,

    Double p_rong2zi1mai3ru4e2,

    Double p_rong2quan4yu2liang4,

    Double p_rong2zi1rong2quan4yu2e2,

    Double p_rong2zi1yu2e2,

    Double p_rong2quan4mai4chu1liang4,


    Map.Entry<String, String>... others){
    stock_margin_szseResponse t = new stock_margin_szseResponse();


    t.p_rong2quan4yu2e2 = p_rong2quan4yu2e2;

    t.p_rong2zi1mai3ru4e2 = p_rong2zi1mai3ru4e2;

    t.p_rong2quan4yu2liang4 = p_rong2quan4yu2liang4;

    t.p_rong2zi1rong2quan4yu2e2 = p_rong2zi1rong2quan4yu2e2;

    t.p_rong2zi1yu2e2 = p_rong2zi1yu2e2;

    t.p_rong2quan4mai4chu1liang4 = p_rong2quan4mai4chu1liang4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 融券余额
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("融券余额")
    
    
    private Double p_rong2quan4yu2e2;

    public Double getP_rong2quan4yu2e2() { return this.p_rong2quan4yu2e2;}
    public void setP_rong2quan4yu2e2(Double v) { this.p_rong2quan4yu2e2 = v;}

    /**
    * name: 融资买入额
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("融资买入额")
    
    
    private Double p_rong2zi1mai3ru4e2;

    public Double getP_rong2zi1mai3ru4e2() { return this.p_rong2zi1mai3ru4e2;}
    public void setP_rong2zi1mai3ru4e2(Double v) { this.p_rong2zi1mai3ru4e2 = v;}

    /**
    * name: 融券余量
    * type: float64
    * desc: 注意单位: 亿股/亿份
    * required: 
    */
    @JsonProperty("融券余量")
    
    
    private Double p_rong2quan4yu2liang4;

    public Double getP_rong2quan4yu2liang4() { return this.p_rong2quan4yu2liang4;}
    public void setP_rong2quan4yu2liang4(Double v) { this.p_rong2quan4yu2liang4 = v;}

    /**
    * name: 融资融券余额
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("融资融券余额")
    
    
    private Double p_rong2zi1rong2quan4yu2e2;

    public Double getP_rong2zi1rong2quan4yu2e2() { return this.p_rong2zi1rong2quan4yu2e2;}
    public void setP_rong2zi1rong2quan4yu2e2(Double v) { this.p_rong2zi1rong2quan4yu2e2 = v;}

    /**
    * name: 融资余额
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("融资余额")
    
    
    private Double p_rong2zi1yu2e2;

    public Double getP_rong2zi1yu2e2() { return this.p_rong2zi1yu2e2;}
    public void setP_rong2zi1yu2e2(Double v) { this.p_rong2zi1yu2e2 = v;}

    /**
    * name: 融券卖出量
    * type: float64
    * desc: 注意单位: 亿股/亿份
    * required: 
    */
    @JsonProperty("融券卖出量")
    
    
    private Double p_rong2quan4mai4chu1liang4;

    public Double getP_rong2quan4mai4chu1liang4() { return this.p_rong2quan4mai4chu1liang4;}
    public void setP_rong2quan4mai4chu1liang4(Double v) { this.p_rong2quan4mai4chu1liang4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}