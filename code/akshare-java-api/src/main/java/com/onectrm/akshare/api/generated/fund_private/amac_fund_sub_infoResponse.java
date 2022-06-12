
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.fund_private;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: fund_private
* 接口: amac_fund_sub_info
* 目标地址: http://gs.amac.org.cn/amac-infodisc/res/pof/subfund/index.html
* 描述: 获取中国证券投资基金业协会-信息公示-基金产品公示-证券公司私募投资基金
* 限量: 单次返回当前时刻所有历史数据
*/
public class amac_fund_sub_infoResponse extends AkShareRequestAndResponse {
    public amac_fund_sub_infoResponse(){
        setInterfaceName("amac_fund_sub_info");
    }

    public static amac_fund_sub_infoResponse of(


    String p_tuo1guan3ren2ming2cheng1,

    LocalDate p_bei4an4ri4qi1,

    String p_chan3pin3ming2cheng1,

    String p_si1mu4ji1jin1guan3li3ren2ming2cheng1,

    LocalDate p_cheng2li4ri4qi1,

    String p_chan3pin3bian1ma3,


    Map.Entry<String, String>... others){
    amac_fund_sub_infoResponse t = new amac_fund_sub_infoResponse();


    t.p_tuo1guan3ren2ming2cheng1 = p_tuo1guan3ren2ming2cheng1;

    t.p_bei4an4ri4qi1 = p_bei4an4ri4qi1;

    t.p_chan3pin3ming2cheng1 = p_chan3pin3ming2cheng1;

    t.p_si1mu4ji1jin1guan3li3ren2ming2cheng1 = p_si1mu4ji1jin1guan3li3ren2ming2cheng1;

    t.p_cheng2li4ri4qi1 = p_cheng2li4ri4qi1;

    t.p_chan3pin3bian1ma3 = p_chan3pin3bian1ma3;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 托管人名称
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("托管人名称")
    
    
    private String p_tuo1guan3ren2ming2cheng1;

    public String getP_tuo1guan3ren2ming2cheng1() { return this.p_tuo1guan3ren2ming2cheng1;}
    public void setP_tuo1guan3ren2ming2cheng1(String v) { this.p_tuo1guan3ren2ming2cheng1 = v;}

    /**
    * name: 备案日期
    * type: datetime.date
    * desc: 
    * required: Y
    */
    @JsonProperty("备案日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_bei4an4ri4qi1;

    public LocalDate getP_bei4an4ri4qi1() { return this.p_bei4an4ri4qi1;}
    public void setP_bei4an4ri4qi1(LocalDate v) { this.p_bei4an4ri4qi1 = v;}

    /**
    * name: 产品名称
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("产品名称")
    
    
    private String p_chan3pin3ming2cheng1;

    public String getP_chan3pin3ming2cheng1() { return this.p_chan3pin3ming2cheng1;}
    public void setP_chan3pin3ming2cheng1(String v) { this.p_chan3pin3ming2cheng1 = v;}

    /**
    * name: 私募基金管理人名称
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("私募基金管理人名称")
    
    
    private String p_si1mu4ji1jin1guan3li3ren2ming2cheng1;

    public String getP_si1mu4ji1jin1guan3li3ren2ming2cheng1() { return this.p_si1mu4ji1jin1guan3li3ren2ming2cheng1;}
    public void setP_si1mu4ji1jin1guan3li3ren2ming2cheng1(String v) { this.p_si1mu4ji1jin1guan3li3ren2ming2cheng1 = v;}

    /**
    * name: 成立日期
    * type: datetime.date
    * desc: 
    * required: Y
    */
    @JsonProperty("成立日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_cheng2li4ri4qi1;

    public LocalDate getP_cheng2li4ri4qi1() { return this.p_cheng2li4ri4qi1;}
    public void setP_cheng2li4ri4qi1(LocalDate v) { this.p_cheng2li4ri4qi1 = v;}

    /**
    * name: 产品编码
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("产品编码")
    
    
    private String p_chan3pin3bian1ma3;

    public String getP_chan3pin3bian1ma3() { return this.p_chan3pin3bian1ma3;}
    public void setP_chan3pin3bian1ma3(String v) { this.p_chan3pin3bian1ma3 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
