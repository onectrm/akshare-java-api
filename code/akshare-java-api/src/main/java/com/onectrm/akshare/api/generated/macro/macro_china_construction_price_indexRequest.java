
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
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
* 接口: macro_china_construction_price_index
* 目标地址: https://data.eastmoney.com/cjsj/hyzs_list_EMI00237146.html
* 描述: 建材价格指数数据, 数据区间从 20100615-至今
* 限量: 单次返回所有历史数据
*/
public class macro_china_construction_price_indexRequest extends AkShareRequestAndResponse {
    public macro_china_construction_price_indexRequest(){
        setInterfaceName("macro_china_construction_price_index");
    }

    public static macro_china_construction_price_indexRequest of(



    Map.Entry<String, String>... others){
    macro_china_construction_price_indexRequest t = new macro_china_construction_price_indexRequest();



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
