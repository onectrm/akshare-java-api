
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
* 接口: macro_china_foreign_exchange_gold
* 目标地址: http://finance.sina.com.cn/mac/#fininfo-5-0-31-2
* 描述: 国家统计局-央行黄金和外汇储备, 比东财接口数据时间长
* 限量: 单次返回所有历史数据
*/
public class macro_china_foreign_exchange_goldResponse extends AkShareRequestAndResponse {
    public macro_china_foreign_exchange_goldResponse(){
        setInterfaceName("macro_china_foreign_exchange_gold");
    }

    public static macro_china_foreign_exchange_goldResponse of(


    String p_huang2jin1chu3bei4,

    String p_guo2jia1wai4hui4chu3bei4,

    LocalDateTime p_tong3ji4shi2jian1,


    Map.Entry<String, String>... others){
    macro_china_foreign_exchange_goldResponse t = new macro_china_foreign_exchange_goldResponse();


    t.p_huang2jin1chu3bei4 = p_huang2jin1chu3bei4;

    t.p_guo2jia1wai4hui4chu3bei4 = p_guo2jia1wai4hui4chu3bei4;

    t.p_tong3ji4shi2jian1 = p_tong3ji4shi2jian1;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 黄金储备
    * type: str
    * desc: 注意单位: 万盎司
    * required: Y
    */
    @JsonProperty("黄金储备")
    
    
    private String p_huang2jin1chu3bei4;

    public String getP_huang2jin1chu3bei4() { return this.p_huang2jin1chu3bei4;}
    public void setP_huang2jin1chu3bei4(String v) { this.p_huang2jin1chu3bei4 = v;}

    /**
    * name: 国家外汇储备
    * type: str
    * desc: 注意单位: 亿美元
    * required: Y
    */
    @JsonProperty("国家外汇储备")
    
    
    private String p_guo2jia1wai4hui4chu3bei4;

    public String getP_guo2jia1wai4hui4chu3bei4() { return this.p_guo2jia1wai4hui4chu3bei4;}
    public void setP_guo2jia1wai4hui4chu3bei4(String v) { this.p_guo2jia1wai4hui4chu3bei4 = v;}

    /**
    * name: 统计时间
    * type: str
    * desc: 年月
    * required: Y
    */
    @JsonProperty("统计时间")
    
    @JsonDeserialize(using = JacksonDateTimeDeserializer.class) 
    private LocalDateTime p_tong3ji4shi2jian1;

    public LocalDateTime getP_tong3ji4shi2jian1() { return this.p_tong3ji4shi2jian1;}
    public void setP_tong3ji4shi2jian1(LocalDateTime v) { this.p_tong3ji4shi2jian1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
