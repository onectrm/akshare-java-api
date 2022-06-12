
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
* 接口: stock_profit_forecast
* 目标地址: http://data.eastmoney.com/report/profitforecast.jshtml
* 描述: 东方财富网-数据中心-研究报告-盈利预测
* 限量: 单次返回所有历史数据
*/
public class stock_profit_forecastRequest extends AkShareRequestAndResponse {
    public stock_profit_forecastRequest(){
        setInterfaceName("stock_profit_forecast");
    }

    public static stock_profit_forecastRequest of(



    Map.Entry<String, String>... others){
    stock_profit_forecastRequest t = new stock_profit_forecastRequest();



        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }




    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
