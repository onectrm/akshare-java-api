
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
* 接口: stock_sse_deal_daily
* 目标地址: http://www.sse.com.cn/market/stockdata/overview/day/
* 描述: 上海证券交易所-数据-股票数据-成交概况-股票成交概况-每日股票情况
* 限量: 单次返回指定日期的每日概况数据, 当前交易日数据需要在收盘后获取; 注意在 20211227（包含）之后输出格式变化
*/
public class stock_sse_deal_dailyResponse extends AkShareRequestAndResponse {
    public stock_sse_deal_dailyResponse(){
        setInterfaceName("stock_sse_deal_daily");
    }

    public static stock_sse_deal_dailyResponse of(


    String p_dan1ri4qing2kuang4,

    Double p_ke1chuang4ban3,

    Double p_zhu3ban3B,

    Double p_zhu3ban3A,

    Double p_gu3piao4,

    Double p_gu3piao4hui2gou4,


    Map.Entry<String, String>... others){
    stock_sse_deal_dailyResponse t = new stock_sse_deal_dailyResponse();


    t.p_dan1ri4qing2kuang4 = p_dan1ri4qing2kuang4;

    t.p_ke1chuang4ban3 = p_ke1chuang4ban3;

    t.p_zhu3ban3B = p_zhu3ban3B;

    t.p_zhu3ban3A = p_zhu3ban3A;

    t.p_gu3piao4 = p_gu3piao4;

    t.p_gu3piao4hui2gou4 = p_gu3piao4hui2gou4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 单日情况
    * type: object
    * desc: 包含了网页所有字段
    * required: 
    */
    @JsonProperty("单日情况")
    
    
    private String p_dan1ri4qing2kuang4;

    public String getP_dan1ri4qing2kuang4() { return this.p_dan1ri4qing2kuang4;}
    public void setP_dan1ri4qing2kuang4(String v) { this.p_dan1ri4qing2kuang4 = v;}

    /**
    * name: 科创板
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("科创板")
    
    
    private Double p_ke1chuang4ban3;

    public Double getP_ke1chuang4ban3() { return this.p_ke1chuang4ban3;}
    public void setP_ke1chuang4ban3(Double v) { this.p_ke1chuang4ban3 = v;}

    /**
    * name: 主板B
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("主板B")
    
    
    private Double p_zhu3ban3B;

    public Double getP_zhu3ban3B() { return this.p_zhu3ban3B;}
    public void setP_zhu3ban3B(Double v) { this.p_zhu3ban3B = v;}

    /**
    * name: 主板A
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("主板A")
    
    
    private Double p_zhu3ban3A;

    public Double getP_zhu3ban3A() { return this.p_zhu3ban3A;}
    public void setP_zhu3ban3A(Double v) { this.p_zhu3ban3A = v;}

    /**
    * name: 股票
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("股票")
    
    
    private Double p_gu3piao4;

    public Double getP_gu3piao4() { return this.p_gu3piao4;}
    public void setP_gu3piao4(Double v) { this.p_gu3piao4 = v;}

    /**
    * name: 股票回购
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("股票回购")
    
    
    private Double p_gu3piao4hui2gou4;

    public Double getP_gu3piao4hui2gou4() { return this.p_gu3piao4hui2gou4;}
    public void setP_gu3piao4hui2gou4(Double v) { this.p_gu3piao4hui2gou4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}