
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:02 CST 2022*/
package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: option
* 接口: option_sse_list_sina
* 目标地址: https://stock.finance.sina.com.cn/futures/view/optionsCffexDP.php
* 描述: 获取期权-上交所-50ETF-合约到期月份列表
* 限量: 单次返回指定品种的到期月份列表
*/
public class option_sse_list_sinaResponse extends AkShareRequestAndResponse {
    public option_sse_list_sinaResponse(){
        setInterfaceName("option_sse_list_sina");
    }

    public static option_sse_list_sinaResponse of(



    Map.Entry<String, String>... others){
    option_sse_list_sinaResponse t = new option_sse_list_sinaResponse();



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