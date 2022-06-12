
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.dc;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: dc
* 接口: crypto_bitcoin_cme
* 目标地址: https://datacenter.jin10.com/reportType/dc_cme_btc_report
* 描述: 获取芝加哥商业交易所-比特币成交量报告
* 限量: 单次返回指定交易日的比特币成交量报告数据
*/
public class crypto_bitcoin_cmeResponse extends AkShareRequestAndResponse {
    public crypto_bitcoin_cmeResponse(){
        setInterfaceName("crypto_bitcoin_cme");
    }

    public static crypto_bitcoin_cmeResponse of(


    Integer p_chang3nei4cheng2jiao1he2yue1,

    Integer p_chi2cang1bian4hua4,

    String p_shang1pin3,

    Integer p_chang3wai4cheng2jiao1he2yue1,

    Integer p_dian4zi5jiao1yi4he2yue1,

    Integer p_wei4ping2cang1he2yue1,

    String p_lei4xing2,

    Integer p_cheng2jiao1liang4,


    Map.Entry<String, String>... others){
    crypto_bitcoin_cmeResponse t = new crypto_bitcoin_cmeResponse();


    t.p_chang3nei4cheng2jiao1he2yue1 = p_chang3nei4cheng2jiao1he2yue1;

    t.p_chi2cang1bian4hua4 = p_chi2cang1bian4hua4;

    t.p_shang1pin3 = p_shang1pin3;

    t.p_chang3wai4cheng2jiao1he2yue1 = p_chang3wai4cheng2jiao1he2yue1;

    t.p_dian4zi5jiao1yi4he2yue1 = p_dian4zi5jiao1yi4he2yue1;

    t.p_wei4ping2cang1he2yue1 = p_wei4ping2cang1he2yue1;

    t.p_lei4xing2 = p_lei4xing2;

    t.p_cheng2jiao1liang4 = p_cheng2jiao1liang4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 场内成交合约
    * type: int64
    * desc: 
    * required: Y
    */
    @JsonProperty("场内成交合约")
    
    
    private Integer p_chang3nei4cheng2jiao1he2yue1;

    public Integer getP_chang3nei4cheng2jiao1he2yue1() { return this.p_chang3nei4cheng2jiao1he2yue1;}
    public void setP_chang3nei4cheng2jiao1he2yue1(Integer v) { this.p_chang3nei4cheng2jiao1he2yue1 = v;}

    /**
    * name: 持仓变化
    * type: int64
    * desc: 
    * required: Y
    */
    @JsonProperty("持仓变化")
    
    
    private Integer p_chi2cang1bian4hua4;

    public Integer getP_chi2cang1bian4hua4() { return this.p_chi2cang1bian4hua4;}
    public void setP_chi2cang1bian4hua4(Integer v) { this.p_chi2cang1bian4hua4 = v;}

    /**
    * name: 商品
    * type: object
    * desc: 
    * required: Y
    */
    @JsonProperty("商品")
    
    
    private String p_shang1pin3;

    public String getP_shang1pin3() { return this.p_shang1pin3;}
    public void setP_shang1pin3(String v) { this.p_shang1pin3 = v;}

    /**
    * name: 场外成交合约
    * type: int64
    * desc: 
    * required: Y
    */
    @JsonProperty("场外成交合约")
    
    
    private Integer p_chang3wai4cheng2jiao1he2yue1;

    public Integer getP_chang3wai4cheng2jiao1he2yue1() { return this.p_chang3wai4cheng2jiao1he2yue1;}
    public void setP_chang3wai4cheng2jiao1he2yue1(Integer v) { this.p_chang3wai4cheng2jiao1he2yue1 = v;}

    /**
    * name: 电子交易合约
    * type: int64
    * desc: 
    * required: Y
    */
    @JsonProperty("电子交易合约")
    
    
    private Integer p_dian4zi5jiao1yi4he2yue1;

    public Integer getP_dian4zi5jiao1yi4he2yue1() { return this.p_dian4zi5jiao1yi4he2yue1;}
    public void setP_dian4zi5jiao1yi4he2yue1(Integer v) { this.p_dian4zi5jiao1yi4he2yue1 = v;}

    /**
    * name: 未平仓合约
    * type: int64
    * desc: 
    * required: Y
    */
    @JsonProperty("未平仓合约")
    
    
    private Integer p_wei4ping2cang1he2yue1;

    public Integer getP_wei4ping2cang1he2yue1() { return this.p_wei4ping2cang1he2yue1;}
    public void setP_wei4ping2cang1he2yue1(Integer v) { this.p_wei4ping2cang1he2yue1 = v;}

    /**
    * name: 类型
    * type: object
    * desc: 
    * required: Y
    */
    @JsonProperty("类型")
    
    
    private String p_lei4xing2;

    public String getP_lei4xing2() { return this.p_lei4xing2;}
    public void setP_lei4xing2(String v) { this.p_lei4xing2 = v;}

    /**
    * name: 成交量
    * type: int64
    * desc: 
    * required: Y
    */
    @JsonProperty("成交量")
    
    
    private Integer p_cheng2jiao1liang4;

    public Integer getP_cheng2jiao1liang4() { return this.p_cheng2jiao1liang4;}
    public void setP_cheng2jiao1liang4(Integer v) { this.p_cheng2jiao1liang4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
