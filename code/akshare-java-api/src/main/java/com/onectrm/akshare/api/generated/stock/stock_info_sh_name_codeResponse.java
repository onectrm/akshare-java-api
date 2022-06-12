
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
* 接口: stock_info_sh_name_code
* 目标地址: 上海证券交易所
* 描述: 上海证券交易所股票代码和简称数据
* 限量: 单次获取所有上海证券交易所股票代码和简称数据
*/
public class stock_info_sh_name_codeResponse extends AkShareRequestAndResponse {
    public stock_info_sh_name_codeResponse(){
        setInterfaceName("stock_info_sh_name_code");
    }

    public static stock_info_sh_name_codeResponse of(


    String p_jian3cheng1,

    LocalDate p_shang4shi4ri4qi1,

    String p_gong1si1jian3cheng1,

    String p_gong1si1dai4ma3,

    String p_dai4ma3,


    Map.Entry<String, String>... others){
    stock_info_sh_name_codeResponse t = new stock_info_sh_name_codeResponse();


    t.p_jian3cheng1 = p_jian3cheng1;

    t.p_shang4shi4ri4qi1 = p_shang4shi4ri4qi1;

    t.p_gong1si1jian3cheng1 = p_gong1si1jian3cheng1;

    t.p_gong1si1dai4ma3 = p_gong1si1dai4ma3;

    t.p_dai4ma3 = p_dai4ma3;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("简称")
    
    
    private String p_jian3cheng1;

    public String getP_jian3cheng1() { return this.p_jian3cheng1;}
    public void setP_jian3cheng1(String v) { this.p_jian3cheng1 = v;}

    /**
    * name: 上市日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("上市日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_shang4shi4ri4qi1;

    public LocalDate getP_shang4shi4ri4qi1() { return this.p_shang4shi4ri4qi1;}
    public void setP_shang4shi4ri4qi1(LocalDate v) { this.p_shang4shi4ri4qi1 = v;}

    /**
    * name: 公司简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("公司简称")
    
    
    private String p_gong1si1jian3cheng1;

    public String getP_gong1si1jian3cheng1() { return this.p_gong1si1jian3cheng1;}
    public void setP_gong1si1jian3cheng1(String v) { this.p_gong1si1jian3cheng1 = v;}

    /**
    * name: 公司代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("公司代码")
    
    
    private String p_gong1si1dai4ma3;

    public String getP_gong1si1dai4ma3() { return this.p_gong1si1dai4ma3;}
    public void setP_gong1si1dai4ma3(String v) { this.p_gong1si1dai4ma3 = v;}

    /**
    * name: 代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("代码")
    
    
    private String p_dai4ma3;

    public String getP_dai4ma3() { return this.p_dai4ma3;}
    public void setP_dai4ma3(String v) { this.p_dai4ma3 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
