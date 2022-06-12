
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
* 接口: stock_zh_a_spot_em
* 目标地址: http://quote.eastmoney.com/center/gridlist.html#hs_a_board
* 描述: 东方财富网-沪深京 A 股-实时行情数据
* 限量: 单次返回所有沪深京 A 股上市公司的实时行情数据
*/
public class stock_zh_a_spot_emRequest extends AkShareRequestAndResponse {
    public stock_zh_a_spot_emRequest(){
        setInterfaceName("stock_zh_a_spot_em");
    }

    public static stock_zh_a_spot_emRequest of(



    Map.Entry<String, String>... others){
    stock_zh_a_spot_emRequest t = new stock_zh_a_spot_emRequest();



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