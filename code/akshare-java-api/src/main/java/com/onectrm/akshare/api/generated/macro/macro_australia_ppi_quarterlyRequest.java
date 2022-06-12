
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
* 接口: macro_australia_ppi_quarterly
* 目标地址: http://data.eastmoney.com/cjsj/foreign_5_3.html
* 描述: 东方财富-经济数据-澳大利亚-生产者物价指数季率
* 限量: 单次返回所有历史数据
*/
public class macro_australia_ppi_quarterlyRequest extends AkShareRequestAndResponse {
    public macro_australia_ppi_quarterlyRequest(){
        setInterfaceName("macro_australia_ppi_quarterly");
    }

    public static macro_australia_ppi_quarterlyRequest of(



    Map.Entry<String, String>... others){
    macro_australia_ppi_quarterlyRequest t = new macro_australia_ppi_quarterlyRequest();



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
