
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
* 接口: stock_circulate_stock_holder
* 目标地址: https://vip.stock.finance.sina.com.cn/corp/go.php/vCI_CirculateStockHolder/stockid/600000.phtml
* 描述: 新浪财经-股东股本-流通股东
* 限量: 单次获取流通股东数据
*/
public class stock_circulate_stock_holderResponse extends AkShareRequestAndResponse {
    public stock_circulate_stock_holderResponse(){
        setInterfaceName("stock_circulate_stock_holder");
    }

    public static stock_circulate_stock_holderResponse of(


    String p_gu3dong1ming2cheng1,

    Double p_zhan4liu2tong1gu3bi3li4,

    Double p_chi2gu3shu4liang4gu3,

    LocalDate p_gong1gao4ri4qi1,

    String p_gu3ben3xing4zhi4,

    String p_bian1hao4,

    LocalDate p_jie2zhi3ri4qi1,


    Map.Entry<String, String>... others){
    stock_circulate_stock_holderResponse t = new stock_circulate_stock_holderResponse();


    t.p_gu3dong1ming2cheng1 = p_gu3dong1ming2cheng1;

    t.p_zhan4liu2tong1gu3bi3li4 = p_zhan4liu2tong1gu3bi3li4;

    t.p_chi2gu3shu4liang4gu3 = p_chi2gu3shu4liang4gu3;

    t.p_gong1gao4ri4qi1 = p_gong1gao4ri4qi1;

    t.p_gu3ben3xing4zhi4 = p_gu3ben3xing4zhi4;

    t.p_bian1hao4 = p_bian1hao4;

    t.p_jie2zhi3ri4qi1 = p_jie2zhi3ri4qi1;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 股东名称
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("股东名称")
    
    
    private String p_gu3dong1ming2cheng1;

    public String getP_gu3dong1ming2cheng1() { return this.p_gu3dong1ming2cheng1;}
    public void setP_gu3dong1ming2cheng1(String v) { this.p_gu3dong1ming2cheng1 = v;}

    /**
    * name: 占流通股比例(%)
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("占流通股比例(%)")
    
    
    private Double p_zhan4liu2tong1gu3bi3li4;

    public Double getP_zhan4liu2tong1gu3bi3li4() { return this.p_zhan4liu2tong1gu3bi3li4;}
    public void setP_zhan4liu2tong1gu3bi3li4(Double v) { this.p_zhan4liu2tong1gu3bi3li4 = v;}

    /**
    * name: 持股数量(股)
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("持股数量(股)")
    
    
    private Double p_chi2gu3shu4liang4gu3;

    public Double getP_chi2gu3shu4liang4gu3() { return this.p_chi2gu3shu4liang4gu3;}
    public void setP_chi2gu3shu4liang4gu3(Double v) { this.p_chi2gu3shu4liang4gu3 = v;}

    /**
    * name: 公告日期
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("公告日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_gong1gao4ri4qi1;

    public LocalDate getP_gong1gao4ri4qi1() { return this.p_gong1gao4ri4qi1;}
    public void setP_gong1gao4ri4qi1(LocalDate v) { this.p_gong1gao4ri4qi1 = v;}

    /**
    * name: 股本性质
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("股本性质")
    
    
    private String p_gu3ben3xing4zhi4;

    public String getP_gu3ben3xing4zhi4() { return this.p_gu3ben3xing4zhi4;}
    public void setP_gu3ben3xing4zhi4(String v) { this.p_gu3ben3xing4zhi4 = v;}

    /**
    * name: 编号
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("编号")
    
    
    private String p_bian1hao4;

    public String getP_bian1hao4() { return this.p_bian1hao4;}
    public void setP_bian1hao4(String v) { this.p_bian1hao4 = v;}

    /**
    * name: 截止日期
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("截止日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_jie2zhi3ri4qi1;

    public LocalDate getP_jie2zhi3ri4qi1() { return this.p_jie2zhi3ri4qi1;}
    public void setP_jie2zhi3ri4qi1(LocalDate v) { this.p_jie2zhi3ri4qi1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}