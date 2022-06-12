
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:02 CST 2022*/
package com.onectrm.akshare.api.generated.macro;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: macro
* 接口: macro_usa_durable_goods_orders
* 目标地址: https://datacenter.jin10.com/reportType/dc_usa_durable_goods_orders
* 描述: 获取美国耐用品订单月率报告, 数据区间从20080227-至今
* 限量: 单次返回所有历史数据
*/
public class macro_usa_durable_goods_ordersRequest extends AkShareRequestAndResponse {
    public macro_usa_durable_goods_ordersRequest(){
        setInterfaceName("macro_usa_durable_goods_orders");
    }

    public static macro_usa_durable_goods_ordersRequest of(


    String p_wu2,


    Map.Entry<String, String>... others){
    macro_usa_durable_goods_ordersRequest t = new macro_usa_durable_goods_ordersRequest();


    t.p_wu2 = p_wu2;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 无
    * type: 无
    * desc: 无
    * required: 无
    */
    @JsonProperty("无")
    
    
    private String p_wu2;

    public String getP_wu2() { return this.p_wu2;}
    public void setP_wu2(String v) { this.p_wu2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
