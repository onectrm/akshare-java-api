
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
* 接口: stock_a_below_net_asset_statistics
* 目标地址: https://www.legulegu.com/stockdata/below-net-asset-statistics
* 描述: 乐咕乐股-A 股破净股统计数据
* 限量: 单次获取所有历史数据
*/
public class stock_a_below_net_asset_statisticsResponse extends AkShareRequestAndResponse {
    public stock_a_below_net_asset_statisticsResponse(){
        setInterfaceName("stock_a_below_net_asset_statistics");
    }

    public static stock_a_below_net_asset_statisticsResponse of(


    Double p_totalcompany,

    LocalDate p_date,

    Double p_belownetassetratio,

    Double p_belownetasset,


    Map.Entry<String, String>... others){
    stock_a_below_net_asset_statisticsResponse t = new stock_a_below_net_asset_statisticsResponse();


    t.p_totalcompany = p_totalcompany;

    t.p_date = p_date;

    t.p_belownetassetratio = p_belownetassetratio;

    t.p_belownetasset = p_belownetasset;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: total_company
    * type: float64
    * desc: 总公司数
    * required: 
    */
    @JsonProperty("total_company")
    
    
    private Double p_totalcompany;

    public Double getP_totalcompany() { return this.p_totalcompany;}
    public void setP_totalcompany(Double v) { this.p_totalcompany = v;}

    /**
    * name: date
    * type: object
    * desc: 交易日
    * required: 
    */
    @JsonProperty("date")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}

    /**
    * name: below_net_asset_ratio
    * type: float64
    * desc: 破净股比率
    * required: 
    */
    @JsonProperty("below_net_asset_ratio")
    
    
    private Double p_belownetassetratio;

    public Double getP_belownetassetratio() { return this.p_belownetassetratio;}
    public void setP_belownetassetratio(Double v) { this.p_belownetassetratio = v;}

    /**
    * name: below_net_asset
    * type: float64
    * desc: 破净股家数
    * required: 
    */
    @JsonProperty("below_net_asset")
    
    
    private Double p_belownetasset;

    public Double getP_belownetasset() { return this.p_belownetasset;}
    public void setP_belownetasset(Double v) { this.p_belownetasset = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}