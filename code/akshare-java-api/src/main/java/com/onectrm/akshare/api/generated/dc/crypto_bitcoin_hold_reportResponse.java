
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
* 接口: crypto_bitcoin_hold_report
* 目标地址: https://datacenter.jin10.com/dc_report?name=bitcoint
* 描述: 获取比特币持仓报告
* 限量: 单次返回当前时点的比特币持仓报告数据
*/
public class crypto_bitcoin_hold_reportResponse extends AkShareRequestAndResponse {
    public crypto_bitcoin_hold_reportResponse(){
        setInterfaceName("crypto_bitcoin_hold_report");
    }

    public static crypto_bitcoin_hold_reportResponse of(


    Double p_bi3te4bi4zhan4shi4zhi2bi3zhong4,

    Double p_chi2cang1zhan4bi3,

    LocalDate p_cha2xun2ri4qi1,

    String p_gong1si1ming2cheng1zhong1wen2,

    String p_dang1ri4chi2cang1shi4zhi2,

    String p_gong1gao4lian4jie1,

    String p_chi2cang1cheng2ben3,

    String p_chi2cang1liang4,

    String p_fen1lei4,

    Double p_guo2jia1di4qu1,

    LocalDateTime p_dai4ma3,

    Double p_gong1si1ming2cheng1ying1wen2,

    String p_shi4zhi2,

    String p_bei4shu4,


    Map.Entry<String, String>... others){
    crypto_bitcoin_hold_reportResponse t = new crypto_bitcoin_hold_reportResponse();


    t.p_bi3te4bi4zhan4shi4zhi2bi3zhong4 = p_bi3te4bi4zhan4shi4zhi2bi3zhong4;

    t.p_chi2cang1zhan4bi3 = p_chi2cang1zhan4bi3;

    t.p_cha2xun2ri4qi1 = p_cha2xun2ri4qi1;

    t.p_gong1si1ming2cheng1zhong1wen2 = p_gong1si1ming2cheng1zhong1wen2;

    t.p_dang1ri4chi2cang1shi4zhi2 = p_dang1ri4chi2cang1shi4zhi2;

    t.p_gong1gao4lian4jie1 = p_gong1gao4lian4jie1;

    t.p_chi2cang1cheng2ben3 = p_chi2cang1cheng2ben3;

    t.p_chi2cang1liang4 = p_chi2cang1liang4;

    t.p_fen1lei4 = p_fen1lei4;

    t.p_guo2jia1di4qu1 = p_guo2jia1di4qu1;

    t.p_dai4ma3 = p_dai4ma3;

    t.p_gong1si1ming2cheng1ying1wen2 = p_gong1si1ming2cheng1ying1wen2;

    t.p_shi4zhi2 = p_shi4zhi2;

    t.p_bei4shu4 = p_bei4shu4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 比特币占市值比重
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("比特币占市值比重")
    
    
    private Double p_bi3te4bi4zhan4shi4zhi2bi3zhong4;

    public Double getP_bi3te4bi4zhan4shi4zhi2bi3zhong4() { return this.p_bi3te4bi4zhan4shi4zhi2bi3zhong4;}
    public void setP_bi3te4bi4zhan4shi4zhi2bi3zhong4(Double v) { this.p_bi3te4bi4zhan4shi4zhi2bi3zhong4 = v;}

    /**
    * name: 持仓占比
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("持仓占比")
    
    
    private Double p_chi2cang1zhan4bi3;

    public Double getP_chi2cang1zhan4bi3() { return this.p_chi2cang1zhan4bi3;}
    public void setP_chi2cang1zhan4bi3(Double v) { this.p_chi2cang1zhan4bi3 = v;}

    /**
    * name: 查询日期
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("查询日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_cha2xun2ri4qi1;

    public LocalDate getP_cha2xun2ri4qi1() { return this.p_cha2xun2ri4qi1;}
    public void setP_cha2xun2ri4qi1(LocalDate v) { this.p_cha2xun2ri4qi1 = v;}

    /**
    * name: 公司名称-中文
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("公司名称-中文")
    
    
    private String p_gong1si1ming2cheng1zhong1wen2;

    public String getP_gong1si1ming2cheng1zhong1wen2() { return this.p_gong1si1ming2cheng1zhong1wen2;}
    public void setP_gong1si1ming2cheng1zhong1wen2(String v) { this.p_gong1si1ming2cheng1zhong1wen2 = v;}

    /**
    * name: 当日持仓市值
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("当日持仓市值")
    
    
    private String p_dang1ri4chi2cang1shi4zhi2;

    public String getP_dang1ri4chi2cang1shi4zhi2() { return this.p_dang1ri4chi2cang1shi4zhi2;}
    public void setP_dang1ri4chi2cang1shi4zhi2(String v) { this.p_dang1ri4chi2cang1shi4zhi2 = v;}

    /**
    * name: 公告链接
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("公告链接")
    
    
    private String p_gong1gao4lian4jie1;

    public String getP_gong1gao4lian4jie1() { return this.p_gong1gao4lian4jie1;}
    public void setP_gong1gao4lian4jie1(String v) { this.p_gong1gao4lian4jie1 = v;}

    /**
    * name: 持仓成本
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("持仓成本")
    
    
    private String p_chi2cang1cheng2ben3;

    public String getP_chi2cang1cheng2ben3() { return this.p_chi2cang1cheng2ben3;}
    public void setP_chi2cang1cheng2ben3(String v) { this.p_chi2cang1cheng2ben3 = v;}

    /**
    * name: 持仓量
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("持仓量")
    
    
    private String p_chi2cang1liang4;

    public String getP_chi2cang1liang4() { return this.p_chi2cang1liang4;}
    public void setP_chi2cang1liang4(String v) { this.p_chi2cang1liang4 = v;}

    /**
    * name: 分类
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("分类")
    
    
    private String p_fen1lei4;

    public String getP_fen1lei4() { return this.p_fen1lei4;}
    public void setP_fen1lei4(String v) { this.p_fen1lei4 = v;}

    /**
    * name: 国家/地区
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("国家/地区")
    
    
    private Double p_guo2jia1di4qu1;

    public Double getP_guo2jia1di4qu1() { return this.p_guo2jia1di4qu1;}
    public void setP_guo2jia1di4qu1(Double v) { this.p_guo2jia1di4qu1 = v;}

    /**
    * name: 代码
    * type: str
    * desc: 日期时间-索引
    * required: Y
    */
    @JsonProperty("代码")
    
    @JsonDeserialize(using = JacksonDateTimeDeserializer.class) 
    private LocalDateTime p_dai4ma3;

    public LocalDateTime getP_dai4ma3() { return this.p_dai4ma3;}
    public void setP_dai4ma3(LocalDateTime v) { this.p_dai4ma3 = v;}

    /**
    * name: 公司名称-英文
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("公司名称-英文")
    
    
    private Double p_gong1si1ming2cheng1ying1wen2;

    public Double getP_gong1si1ming2cheng1ying1wen2() { return this.p_gong1si1ming2cheng1ying1wen2;}
    public void setP_gong1si1ming2cheng1ying1wen2(Double v) { this.p_gong1si1ming2cheng1ying1wen2 = v;}

    /**
    * name: 市值
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("市值")
    
    
    private String p_shi4zhi2;

    public String getP_shi4zhi2() { return this.p_shi4zhi2;}
    public void setP_shi4zhi2(String v) { this.p_shi4zhi2 = v;}

    /**
    * name: 倍数
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("倍数")
    
    
    private String p_bei4shu4;

    public String getP_bei4shu4() { return this.p_bei4shu4;}
    public void setP_bei4shu4(String v) { this.p_bei4shu4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
