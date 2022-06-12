
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: bond
* 接口: bond_repo_zh_tick
* 目标地址: http://stockhtm.finance.qq.com/sstock/ggcx/131802.shtml
* 描述: 债券-质押式回购-实时行情-成交明细; 该接口暂不可用
* 限量: 单次返回所有指定日期的成交明细数据
*/
public class bond_repo_zh_tickRequest extends AkShareRequestAndResponse {
    public bond_repo_zh_tickRequest(){
        setInterfaceName("bond_repo_zh_tick");
    }

    public static bond_repo_zh_tickRequest of(


    String p_code,

    LocalDate p_tradedate,


    Map.Entry<String, String>... others){
    bond_repo_zh_tickRequest t = new bond_repo_zh_tickRequest();


    t.p_code = p_code;

    t.p_tradedate = p_tradedate;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: code
    * type: str
    * desc: code=&quot;sz131802&quot;; 指定质押式回购
    * required: 
    */
    @JsonProperty("code")
    
    
    private String p_code;

    public String getP_code() { return this.p_code;}
    public void setP_code(String v) { this.p_code = v;}

    /**
    * name: trade_date
    * type: str
    * desc: trade_date=&quot;20210120&quot;; 指定日期
    * required: 
    */
    @JsonProperty("trade_date")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_tradedate;

    public LocalDate getP_tradedate() { return this.p_tradedate;}
    public void setP_tradedate(LocalDate v) { this.p_tradedate = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}