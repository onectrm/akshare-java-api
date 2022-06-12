
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: fund_public
* 接口: fund_manager
* 目标地址: http://fund.eastmoney.com/manager/default.html
* 描述: 天天基金网-基金数据-基金经理大全
* 限量: 单次返回所有基金经理数据
*/
public class fund_managerRequest extends AkShareRequestAndResponse {
    public fund_managerRequest(){
        setInterfaceName("fund_manager");
    }

    public static fund_managerRequest of(


    String p_adjust,


    Map.Entry<String, String>... others){
    fund_managerRequest t = new fund_managerRequest();


    t.p_adjust = p_adjust;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: adjust
    * type: str
    * desc: 默认 adjust=&#39;0&#39;, 返回目标地址相同格式; adjust=&#39;1&#39;, 返回根据 `现任基金` 打散后的数据
    * required: 
    */
    @JsonProperty("adjust")
    
    
    private String p_adjust;

    public String getP_adjust() { return this.p_adjust;}
    public void setP_adjust(String v) { this.p_adjust = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}