
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
* 接口: amac_securities_info
* 目标地址: http://gs.amac.org.cn/amac-infodisc/res/pof/securities/index.html
* 描述: 获取中国证券投资基金业协会-信息公示-基金产品公示-证券公司集合资管产品公示
* 限量: 单次返回当前时刻所有历史数据
*/
public class amac_securities_infoResponse extends AkShareRequestAndResponse {
    public amac_securities_infoResponse(){
        setInterfaceName("amac_securities_info");
    }

    public static amac_securities_infoResponse of(


    Double p_tuo1guan3ren2ming2cheng1,

    Double p_guan3li3ren2ming2cheng1,

    Double p_tou2zi1lei4xing2,

    Double p_bei4an4ri4qi1,

    Double p_yun4zuo4zhuang4tai4,

    String p_chan3pin3ming2cheng1,

    Double p_dao4qi1shi2jian1,

    Double p_cheng2li4ri4qi1,

    Double p_chan3pin3bian1ma3,

    Double p_shi4fou3fen1ji2,


    Map.Entry<String, String>... others){
    amac_securities_infoResponse t = new amac_securities_infoResponse();


    t.p_tuo1guan3ren2ming2cheng1 = p_tuo1guan3ren2ming2cheng1;

    t.p_guan3li3ren2ming2cheng1 = p_guan3li3ren2ming2cheng1;

    t.p_tou2zi1lei4xing2 = p_tou2zi1lei4xing2;

    t.p_bei4an4ri4qi1 = p_bei4an4ri4qi1;

    t.p_yun4zuo4zhuang4tai4 = p_yun4zuo4zhuang4tai4;

    t.p_chan3pin3ming2cheng1 = p_chan3pin3ming2cheng1;

    t.p_dao4qi1shi2jian1 = p_dao4qi1shi2jian1;

    t.p_cheng2li4ri4qi1 = p_cheng2li4ri4qi1;

    t.p_chan3pin3bian1ma3 = p_chan3pin3bian1ma3;

    t.p_shi4fou3fen1ji2 = p_shi4fou3fen1ji2;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 托管人名称
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("托管人名称")
    
    
    private Double p_tuo1guan3ren2ming2cheng1;

    public Double getP_tuo1guan3ren2ming2cheng1() { return this.p_tuo1guan3ren2ming2cheng1;}
    public void setP_tuo1guan3ren2ming2cheng1(Double v) { this.p_tuo1guan3ren2ming2cheng1 = v;}

    /**
    * name: 管理人名称
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("管理人名称")
    
    
    private Double p_guan3li3ren2ming2cheng1;

    public Double getP_guan3li3ren2ming2cheng1() { return this.p_guan3li3ren2ming2cheng1;}
    public void setP_guan3li3ren2ming2cheng1(Double v) { this.p_guan3li3ren2ming2cheng1 = v;}

    /**
    * name: 投资类型
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("投资类型")
    
    
    private Double p_tou2zi1lei4xing2;

    public Double getP_tou2zi1lei4xing2() { return this.p_tou2zi1lei4xing2;}
    public void setP_tou2zi1lei4xing2(Double v) { this.p_tou2zi1lei4xing2 = v;}

    /**
    * name: 备案日期
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("备案日期")
    
    
    private Double p_bei4an4ri4qi1;

    public Double getP_bei4an4ri4qi1() { return this.p_bei4an4ri4qi1;}
    public void setP_bei4an4ri4qi1(Double v) { this.p_bei4an4ri4qi1 = v;}

    /**
    * name: 运作状态
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("运作状态")
    
    
    private Double p_yun4zuo4zhuang4tai4;

    public Double getP_yun4zuo4zhuang4tai4() { return this.p_yun4zuo4zhuang4tai4;}
    public void setP_yun4zuo4zhuang4tai4(Double v) { this.p_yun4zuo4zhuang4tai4 = v;}

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
    * name: 到期时间
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("到期时间")
    
    
    private Double p_dao4qi1shi2jian1;

    public Double getP_dao4qi1shi2jian1() { return this.p_dao4qi1shi2jian1;}
    public void setP_dao4qi1shi2jian1(Double v) { this.p_dao4qi1shi2jian1 = v;}

    /**
    * name: 成立日期
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("成立日期")
    
    
    private Double p_cheng2li4ri4qi1;

    public Double getP_cheng2li4ri4qi1() { return this.p_cheng2li4ri4qi1;}
    public void setP_cheng2li4ri4qi1(Double v) { this.p_cheng2li4ri4qi1 = v;}

    /**
    * name: 产品编码
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("产品编码")
    
    
    private Double p_chan3pin3bian1ma3;

    public Double getP_chan3pin3bian1ma3() { return this.p_chan3pin3bian1ma3;}
    public void setP_chan3pin3bian1ma3(Double v) { this.p_chan3pin3bian1ma3 = v;}

    /**
    * name: 是否分级
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("是否分级")
    
    
    private Double p_shi4fou3fen1ji2;

    public Double getP_shi4fou3fen1ji2() { return this.p_shi4fou3fen1ji2;}
    public void setP_shi4fou3fen1ji2(Double v) { this.p_shi4fou3fen1ji2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}