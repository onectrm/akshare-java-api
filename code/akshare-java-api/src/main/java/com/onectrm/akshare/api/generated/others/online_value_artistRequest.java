
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:02 CST 2022*/
package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: others
* 接口: online_value_artist
* 目标地址: https://www.endata.com.cn/Marketing/Artist/business.html
* 描述: 艺恩-艺人-艺人流量价值
* 限量: 返回当前的艺人流量价值数据
*/
public class online_value_artistRequest extends AkShareRequestAndResponse {
    public online_value_artistRequest(){
        setInterfaceName("online_value_artist");
    }

    public static online_value_artistRequest of(



    Map.Entry<String, String>... others){
    online_value_artistRequest t = new online_value_artistRequest();



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
