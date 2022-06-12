
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
* 接口: stock_hot_rank_detail_realtime_em
* 目标地址: http://guba.eastmoney.com/rank/stock?code=000665
* 描述: 东方财富个股人气榜-实时变动
* 限量: 单次返回指定 symbol 的股票近期历史数据
*/
public class stock_hot_rank_detail_realtime_emResponse extends AkShareRequestAndResponse {
    public stock_hot_rank_detail_realtime_emResponse(){
        setInterfaceName("stock_hot_rank_detail_realtime_em");
    }

    public static stock_hot_rank_detail_realtime_emResponse of(


    LocalDateTime p_shi2jian1,

    Integer p_pai2ming2,


    Map.Entry<String, String>... others){
    stock_hot_rank_detail_realtime_emResponse t = new stock_hot_rank_detail_realtime_emResponse();


    t.p_shi2jian1 = p_shi2jian1;

    t.p_pai2ming2 = p_pai2ming2;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 时间
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("时间")
    
    @JsonDeserialize(using = JacksonDateTimeDeserializer.class) 
    private LocalDateTime p_shi2jian1;

    public LocalDateTime getP_shi2jian1() { return this.p_shi2jian1;}
    public void setP_shi2jian1(LocalDateTime v) { this.p_shi2jian1 = v;}

    /**
    * name: 排名
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("排名")
    
    
    private Integer p_pai2ming2;

    public Integer getP_pai2ming2() { return this.p_pai2ming2;}
    public void setP_pai2ming2(Integer v) { this.p_pai2ming2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}