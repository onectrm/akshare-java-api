
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.event;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: event
* 接口: covid_19_csse_global_recovered
* 目标地址: https://github.com/CSSEGISandData/COVID-19
* 描述: 获取全球治愈数据所有历史数据, 如本地无法读取数据，请参考 **[答疑专栏]** 问题 12 修改本地 host 后获取
* 限量: 单次返回所有历史数据，每日更新
*/
public class covid_19_csse_global_recoveredRequest extends AkShareRequestAndResponse {
    public covid_19_csse_global_recoveredRequest(){
        setInterfaceName("covid_19_csse_global_recovered");
    }

    public static covid_19_csse_global_recoveredRequest of(



    Map.Entry<String, String>... others){
    covid_19_csse_global_recoveredRequest t = new covid_19_csse_global_recoveredRequest();



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
