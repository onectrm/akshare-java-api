
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
* 接口: macro_uk_halifax_monthly
* 目标地址: http://data.eastmoney.com/cjsj/foreign_4_0.html
* 描述: 东方财富-经济数据-英国-Halifax 房价指数月率
* 限量: 单次返回所有历史数据
*/
public class macro_uk_halifax_monthlyRequest extends AkShareRequestAndResponse {
    public macro_uk_halifax_monthlyRequest(){
        setInterfaceName("macro_uk_halifax_monthly");
    }

    public static macro_uk_halifax_monthlyRequest of(


    String p_wu2,


    Map.Entry<String, String>... others){
    macro_uk_halifax_monthlyRequest t = new macro_uk_halifax_monthlyRequest();


    t.p_wu2 = p_wu2;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 无
    * type: 无
    * desc: 无
    * required: 
    */
    @JsonProperty("无")
    
    
    private String p_wu2;

    public String getP_wu2() { return this.p_wu2;}
    public void setP_wu2(String v) { this.p_wu2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
