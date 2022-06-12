
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.currency;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: currency
* 接口: currency_convert
* 目标地址: https://currencyscoop.com/
* 描述: 获取指定货币对指定货币数量的转换后价格
* 限量: 单次返回指定货币对的转换后价格-免费账号每月限量访问 5000 次
*/
public class currency_convertResponse extends AkShareRequestAndResponse {
    public currency_convertResponse(){
        setInterfaceName("currency_convert");
    }

    public static currency_convertResponse of(


    String p_currencycode,

    String p_currencyname,

    Integer p_decimalunits,

    String p_countries,


    Map.Entry<String, String>... others){
    currency_convertResponse t = new currency_convertResponse();


    t.p_currencycode = p_currencycode;

    t.p_currencyname = p_currencyname;

    t.p_decimalunits = p_decimalunits;

    t.p_countries = p_countries;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: currency_code
    * type: str
    * desc: 货币代码
    * required: Y
    */
    @JsonProperty("currency_code")
    
    
    private String p_currencycode;

    public String getP_currencycode() { return this.p_currencycode;}
    public void setP_currencycode(String v) { this.p_currencycode = v;}

    /**
    * name: currency_name
    * type: str
    * desc: 货币名称
    * required: Y
    */
    @JsonProperty("currency_name")
    
    
    private String p_currencyname;

    public String getP_currencyname() { return this.p_currencyname;}
    public void setP_currencyname(String v) { this.p_currencyname = v;}

    /**
    * name: decimal_units
    * type: int
    * desc: 小数点位
    * required: Y
    */
    @JsonProperty("decimal_units")
    
    
    private Integer p_decimalunits;

    public Integer getP_decimalunits() { return this.p_decimalunits;}
    public void setP_decimalunits(Integer v) { this.p_decimalunits = v;}

    /**
    * name: countries
    * type: str
    * desc: 使用此货币的国家
    * required: Y
    */
    @JsonProperty("countries")
    
    
    private String p_countries;

    public String getP_countries() { return this.p_countries;}
    public void setP_countries(String v) { this.p_countries = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
