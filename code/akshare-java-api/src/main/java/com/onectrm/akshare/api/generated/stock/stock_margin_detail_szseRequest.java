
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
* 接口: stock_margin_detail_szse
* 目标地址: http://www.szse.cn/disclosure/margin/margin/index.html
* 描述: 深证证券交易所-融资融券数据-融资融券交易明细数据
* 限量: 单次返回指定 date 的所有历史数据
*/
public class stock_margin_detail_szseRequest extends AkShareRequestAndResponse {
    public stock_margin_detail_szseRequest(){
        setInterfaceName("stock_margin_detail_szse");
    }

    public static stock_margin_detail_szseRequest of(


    LocalDate p_date,


    Map.Entry<String, String>... others){
    stock_margin_detail_szseRequest t = new stock_margin_detail_szseRequest();


    t.p_date = p_date;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: date
    * type: str
    * desc: date=&quot;20220118&quot;
    * required: 
    */
    @JsonProperty("date")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_date;

    public LocalDate getP_date() { return this.p_date;}
    public void setP_date(LocalDate v) { this.p_date = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
