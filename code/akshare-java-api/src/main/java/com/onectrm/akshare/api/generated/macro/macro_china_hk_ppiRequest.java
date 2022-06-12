
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
* 接口: macro_china_hk_ppi
* 目标地址: https://data.eastmoney.com/cjsj/foreign_8_8.html
* 描述: 东方财富-经济数据一览-中国香港-香港制造业PPI年率
* 限量: 单次返回所有历史数据
*/
public class macro_china_hk_ppiRequest extends AkShareRequestAndResponse {
    public macro_china_hk_ppiRequest(){
        setInterfaceName("macro_china_hk_ppi");
    }

    public static macro_china_hk_ppiRequest of(



    Map.Entry<String, String>... others){
    macro_china_hk_ppiRequest t = new macro_china_hk_ppiRequest();



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
