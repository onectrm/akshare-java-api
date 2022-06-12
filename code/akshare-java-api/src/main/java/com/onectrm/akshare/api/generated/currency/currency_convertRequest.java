
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
public class currency_convertRequest extends AkShareRequestAndResponse {
    public currency_convertRequest(){
        setInterfaceName("currency_convert");
    }

    public static currency_convertRequest of(


    String p_apikey,

    String p_base,

    String p_amount,

    String p_to,


    Map.Entry<String, String>... others){
    currency_convertRequest t = new currency_convertRequest();


    t.p_apikey = p_apikey;

    t.p_base = p_base;

    t.p_amount = p_amount;

    t.p_to = p_to;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: api_key
    * type: str
    * desc: api_key=&quot;Please put your api key here&quot;; you can register [currencyscoop](https://currencyscoop.com/), [Gmail](http://mail.google.com/) well be better
    * required: Y
    */
    @JsonProperty("api_key")
    
    
    private String p_apikey;

    public String getP_apikey() { return this.p_apikey;}
    public void setP_apikey(String v) { this.p_apikey = v;}

    /**
    * name: base
    * type: str
    * desc: base=&quot;USD&quot;; 基础货币
    * required: Y
    */
    @JsonProperty("base")
    
    
    private String p_base;

    public String getP_base() { return this.p_base;}
    public void setP_base(String v) { this.p_base = v;}

    /**
    * name: amount
    * type: str
    * desc: amount=&quot;10000&quot;; 转换量
    * required: Y
    */
    @JsonProperty("amount")
    
    
    private String p_amount;

    public String getP_amount() { return this.p_amount;}
    public void setP_amount(String v) { this.p_amount = v;}

    /**
    * name: to
    * type: str
    * desc: to=&quot;CNY&quot;; 需要转换到的货币
    * required: Y
    */
    @JsonProperty("to")
    
    
    private String p_to;

    public String getP_to() { return this.p_to;}
    public void setP_to(String v) { this.p_to = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}