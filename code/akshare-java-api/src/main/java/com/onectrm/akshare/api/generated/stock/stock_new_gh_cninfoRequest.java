
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
* 接口: stock_new_gh_cninfo
* 目标地址: http://webapi.cninfo.com.cn/#/xinguList
* 描述: 巨潮资讯-数据中心-新股数据-新股过会
* 限量: 单次获取近一年所有新股过会的数据
*/
public class stock_new_gh_cninfoRequest extends AkShareRequestAndResponse {
    public stock_new_gh_cninfoRequest(){
        setInterfaceName("stock_new_gh_cninfo");
    }

    public static stock_new_gh_cninfoRequest of(



    Map.Entry<String, String>... others){
    stock_new_gh_cninfoRequest t = new stock_new_gh_cninfoRequest();



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
