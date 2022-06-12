
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: index
* 接口: index_ii_cx
* 目标地址: https://s.ccxe.com.cn/indices/dei
* 描述: 财新指数-产业指数
* 限量: 该接口返回所有历史数据
*/
public class index_ii_cxRequest extends AkShareRequestAndResponse {
    public index_ii_cxRequest(){
        setInterfaceName("index_ii_cx");
    }

    public static index_ii_cxRequest of(



    Map.Entry<String, String>... others){
    index_ii_cxRequest t = new index_ii_cxRequest();



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
