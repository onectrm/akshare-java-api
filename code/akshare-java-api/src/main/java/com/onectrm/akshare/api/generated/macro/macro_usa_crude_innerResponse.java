
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
* 接口: macro_usa_crude_inner
* 目标地址: https://cdn.jin10.com/dc/reports/dc_usa_michigan_consumer_sentiment_all.js?v=1578576228
* 描述: 获取美国原油产量报告, 数据区间从19830107-至今, 每周三公布(美国节假日除外), 美国能源信息署(EIA)
* 限量: 单次返回所有历史数据
*/
public class macro_usa_crude_innerResponse extends AkShareRequestAndResponse {
    public macro_usa_crude_innerResponse(){
        setInterfaceName("macro_usa_crude_inner");
    }

    public static macro_usa_crude_innerResponse of(


    Double p_mei3guo2guo2nei4yuan2you2zong3liang4bian4hua4,

    LocalDate p_ri4qi1,

    Double p_mei3guo2guo2nei4yuan2you2zong3liang4chan3liang4,

    Double p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4chan3liang4,

    Double p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4bian4hua4,

    Double p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4chan3liang4,

    Double p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4bian4hua4,


    Map.Entry<String, String>... others){
    macro_usa_crude_innerResponse t = new macro_usa_crude_innerResponse();


    t.p_mei3guo2guo2nei4yuan2you2zong3liang4bian4hua4 = p_mei3guo2guo2nei4yuan2you2zong3liang4bian4hua4;

    t.p_ri4qi1 = p_ri4qi1;

    t.p_mei3guo2guo2nei4yuan2you2zong3liang4chan3liang4 = p_mei3guo2guo2nei4yuan2you2zong3liang4chan3liang4;

    t.p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4chan3liang4 = p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4chan3liang4;

    t.p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4bian4hua4 = p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4bian4hua4;

    t.p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4chan3liang4 = p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4chan3liang4;

    t.p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4bian4hua4 = p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4bian4hua4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 美国国内原油总量_变化
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("美国国内原油总量_变化")
    
    
    private Double p_mei3guo2guo2nei4yuan2you2zong3liang4bian4hua4;

    public Double getP_mei3guo2guo2nei4yuan2you2zong3liang4bian4hua4() { return this.p_mei3guo2guo2nei4yuan2you2zong3liang4bian4hua4;}
    public void setP_mei3guo2guo2nei4yuan2you2zong3liang4bian4hua4(Double v) { this.p_mei3guo2guo2nei4yuan2you2zong3liang4bian4hua4 = v;}

    /**
    * name: 日期
    * type: str
    * desc: 日期-索引
    * required: Y
    */
    @JsonProperty("日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_ri4qi1;

    public LocalDate getP_ri4qi1() { return this.p_ri4qi1;}
    public void setP_ri4qi1(LocalDate v) { this.p_ri4qi1 = v;}

    /**
    * name: 美国国内原油总量_产量
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("美国国内原油总量_产量")
    
    
    private Double p_mei3guo2guo2nei4yuan2you2zong3liang4chan3liang4;

    public Double getP_mei3guo2guo2nei4yuan2you2zong3liang4chan3liang4() { return this.p_mei3guo2guo2nei4yuan2you2zong3liang4chan3liang4;}
    public void setP_mei3guo2guo2nei4yuan2you2zong3liang4chan3liang4(Double v) { this.p_mei3guo2guo2nei4yuan2you2zong3liang4chan3liang4 = v;}

    /**
    * name: 美国本土48州原油产量_产量
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("美国本土48州原油产量_产量")
    
    
    private Double p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4chan3liang4;

    public Double getP_mei3guo2ben3tu348zhou1yuan2you2chan3liang4chan3liang4() { return this.p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4chan3liang4;}
    public void setP_mei3guo2ben3tu348zhou1yuan2you2chan3liang4chan3liang4(Double v) { this.p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4chan3liang4 = v;}

    /**
    * name: 美国本土48州原油产量_变化
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("美国本土48州原油产量_变化")
    
    
    private Double p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4bian4hua4;

    public Double getP_mei3guo2ben3tu348zhou1yuan2you2chan3liang4bian4hua4() { return this.p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4bian4hua4;}
    public void setP_mei3guo2ben3tu348zhou1yuan2you2chan3liang4bian4hua4(Double v) { this.p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4bian4hua4 = v;}

    /**
    * name: 美国阿拉斯加州原油产量_产量
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("美国阿拉斯加州原油产量_产量")
    
    
    private Double p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4chan3liang4;

    public Double getP_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4chan3liang4() { return this.p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4chan3liang4;}
    public void setP_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4chan3liang4(Double v) { this.p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4chan3liang4 = v;}

    /**
    * name: 美国阿拉斯加州原油产量_变化
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("美国阿拉斯加州原油产量_变化")
    
    
    private Double p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4bian4hua4;

    public Double getP_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4bian4hua4() { return this.p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4bian4hua4;}
    public void setP_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4bian4hua4(Double v) { this.p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4bian4hua4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
