
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
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
* 接口: macro_china_cpi
* 目标地址: http://data.eastmoney.com/cjsj/cpi.html
* 描述: 中国居民消费价格指数, 数据区间从 200801 至今, 月度数据
* 限量: 单次返回所有历史数据
*/
public class macro_china_cpiResponse extends AkShareRequestAndResponse {
    public macro_china_cpiResponse(){
        setInterfaceName("macro_china_cpi");
    }

    public static macro_china_cpiResponse of(


    Double p_quan2guo2huan2bi3zeng1zhang3,

    Double p_quan2guo2dang1yue4,

    Double p_nong2cun1tong2bi3zeng1zhang3,

    Double p_cheng2shi4huan2bi3zeng1zhang3,

    Double p_cheng2shi4lei3ji4,

    Double p_quan2guo2lei3ji4,

    String p_yue4fen4,

    Double p_cheng2shi4dang1yue4,

    Double p_cheng2shi4tong2bi3zeng1zhang3,

    Double p_quan2guo2tong2bi3zeng1zhang3,

    Double p_nong2cun1dang1yue4,

    Double p_nong2cun1lei3ji4,

    Double p_nong2cun1huan2bi3zeng1zhang3,


    Map.Entry<String, String>... others){
    macro_china_cpiResponse t = new macro_china_cpiResponse();


    t.p_quan2guo2huan2bi3zeng1zhang3 = p_quan2guo2huan2bi3zeng1zhang3;

    t.p_quan2guo2dang1yue4 = p_quan2guo2dang1yue4;

    t.p_nong2cun1tong2bi3zeng1zhang3 = p_nong2cun1tong2bi3zeng1zhang3;

    t.p_cheng2shi4huan2bi3zeng1zhang3 = p_cheng2shi4huan2bi3zeng1zhang3;

    t.p_cheng2shi4lei3ji4 = p_cheng2shi4lei3ji4;

    t.p_quan2guo2lei3ji4 = p_quan2guo2lei3ji4;

    t.p_yue4fen4 = p_yue4fen4;

    t.p_cheng2shi4dang1yue4 = p_cheng2shi4dang1yue4;

    t.p_cheng2shi4tong2bi3zeng1zhang3 = p_cheng2shi4tong2bi3zeng1zhang3;

    t.p_quan2guo2tong2bi3zeng1zhang3 = p_quan2guo2tong2bi3zeng1zhang3;

    t.p_nong2cun1dang1yue4 = p_nong2cun1dang1yue4;

    t.p_nong2cun1lei3ji4 = p_nong2cun1lei3ji4;

    t.p_nong2cun1huan2bi3zeng1zhang3 = p_nong2cun1huan2bi3zeng1zhang3;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 全国-环比增长
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("全国-环比增长")
    
    
    private Double p_quan2guo2huan2bi3zeng1zhang3;

    public Double getP_quan2guo2huan2bi3zeng1zhang3() { return this.p_quan2guo2huan2bi3zeng1zhang3;}
    public void setP_quan2guo2huan2bi3zeng1zhang3(Double v) { this.p_quan2guo2huan2bi3zeng1zhang3 = v;}

    /**
    * name: 全国-当月
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("全国-当月")
    
    
    private Double p_quan2guo2dang1yue4;

    public Double getP_quan2guo2dang1yue4() { return this.p_quan2guo2dang1yue4;}
    public void setP_quan2guo2dang1yue4(Double v) { this.p_quan2guo2dang1yue4 = v;}

    /**
    * name: 农村-同比增长
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("农村-同比增长")
    
    
    private Double p_nong2cun1tong2bi3zeng1zhang3;

    public Double getP_nong2cun1tong2bi3zeng1zhang3() { return this.p_nong2cun1tong2bi3zeng1zhang3;}
    public void setP_nong2cun1tong2bi3zeng1zhang3(Double v) { this.p_nong2cun1tong2bi3zeng1zhang3 = v;}

    /**
    * name: 城市-环比增长
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("城市-环比增长")
    
    
    private Double p_cheng2shi4huan2bi3zeng1zhang3;

    public Double getP_cheng2shi4huan2bi3zeng1zhang3() { return this.p_cheng2shi4huan2bi3zeng1zhang3;}
    public void setP_cheng2shi4huan2bi3zeng1zhang3(Double v) { this.p_cheng2shi4huan2bi3zeng1zhang3 = v;}

    /**
    * name: 城市-累计
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("城市-累计")
    
    
    private Double p_cheng2shi4lei3ji4;

    public Double getP_cheng2shi4lei3ji4() { return this.p_cheng2shi4lei3ji4;}
    public void setP_cheng2shi4lei3ji4(Double v) { this.p_cheng2shi4lei3ji4 = v;}

    /**
    * name: 全国-累计
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("全国-累计")
    
    
    private Double p_quan2guo2lei3ji4;

    public Double getP_quan2guo2lei3ji4() { return this.p_quan2guo2lei3ji4;}
    public void setP_quan2guo2lei3ji4(Double v) { this.p_quan2guo2lei3ji4 = v;}

    /**
    * name: 月份
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("月份")
    
    
    private String p_yue4fen4;

    public String getP_yue4fen4() { return this.p_yue4fen4;}
    public void setP_yue4fen4(String v) { this.p_yue4fen4 = v;}

    /**
    * name: 城市-当月
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("城市-当月")
    
    
    private Double p_cheng2shi4dang1yue4;

    public Double getP_cheng2shi4dang1yue4() { return this.p_cheng2shi4dang1yue4;}
    public void setP_cheng2shi4dang1yue4(Double v) { this.p_cheng2shi4dang1yue4 = v;}

    /**
    * name: 城市-同比增长
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("城市-同比增长")
    
    
    private Double p_cheng2shi4tong2bi3zeng1zhang3;

    public Double getP_cheng2shi4tong2bi3zeng1zhang3() { return this.p_cheng2shi4tong2bi3zeng1zhang3;}
    public void setP_cheng2shi4tong2bi3zeng1zhang3(Double v) { this.p_cheng2shi4tong2bi3zeng1zhang3 = v;}

    /**
    * name: 全国-同比增长
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("全国-同比增长")
    
    
    private Double p_quan2guo2tong2bi3zeng1zhang3;

    public Double getP_quan2guo2tong2bi3zeng1zhang3() { return this.p_quan2guo2tong2bi3zeng1zhang3;}
    public void setP_quan2guo2tong2bi3zeng1zhang3(Double v) { this.p_quan2guo2tong2bi3zeng1zhang3 = v;}

    /**
    * name: 农村-当月
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("农村-当月")
    
    
    private Double p_nong2cun1dang1yue4;

    public Double getP_nong2cun1dang1yue4() { return this.p_nong2cun1dang1yue4;}
    public void setP_nong2cun1dang1yue4(Double v) { this.p_nong2cun1dang1yue4 = v;}

    /**
    * name: 农村-累计
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("农村-累计")
    
    
    private Double p_nong2cun1lei3ji4;

    public Double getP_nong2cun1lei3ji4() { return this.p_nong2cun1lei3ji4;}
    public void setP_nong2cun1lei3ji4(Double v) { this.p_nong2cun1lei3ji4 = v;}

    /**
    * name: 农村-环比增长
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("农村-环比增长")
    
    
    private Double p_nong2cun1huan2bi3zeng1zhang3;

    public Double getP_nong2cun1huan2bi3zeng1zhang3() { return this.p_nong2cun1huan2bi3zeng1zhang3;}
    public void setP_nong2cun1huan2bi3zeng1zhang3(Double v) { this.p_nong2cun1huan2bi3zeng1zhang3 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
