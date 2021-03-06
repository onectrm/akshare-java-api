
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:50 CST 2022*/
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
    * 接口: macro_china_national_tax_receipts
    * 目标地址: http://data.eastmoney.com/cjsj/nationaltaxreceipts.aspx
    * 描述: 中国全国税收收入数据, 数据区间从 2005 一季度-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_national_tax_receiptsResponse extends AkShareRequestAndResponse {
    public macro_china_national_tax_receiptsResponse(){
    setInterfaceName("macro_china_national_tax_receipts");
    }

    public static macro_china_national_tax_receiptsResponse of(


    LocalDate p_ji4du4,

    Double p_shui4shou1shou1ru4he2ji4,

    Double p_jiao4shang4nian2tong2qi1,

    Double p_ji4du4huan2bi3,


    Map.Entry
    <String
    , String>... others){
    macro_china_national_tax_receiptsResponse t = new macro_china_national_tax_receiptsResponse();


    t.p_ji4du4 = p_ji4du4;

    t.p_shui4shou1shou1ru4he2ji4 = p_shui4shou1shou1ru4he2ji4;

    t.p_jiao4shang4nian2tong2qi1 = p_jiao4shang4nian2tong2qi1;

    t.p_ji4du4huan2bi3 = p_ji4du4huan2bi3;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 季度
    * type: object
    * desc: 日期
    * required: 
    */
    @JsonProperty("季度")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_ji4du4;

    public LocalDate getP_ji4du4() { return this.p_ji4du4;}
    public void setP_ji4du4(LocalDate v) { this.p_ji4du4 = v;}

    /**
    * name: 税收收入合计
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("税收收入合计")
    
    
    private Double p_shui4shou1shou1ru4he2ji4;

    public Double getP_shui4shou1shou1ru4he2ji4() { return this.p_shui4shou1shou1ru4he2ji4;}
    public void setP_shui4shou1shou1ru4he2ji4(Double v) { this.p_shui4shou1shou1ru4he2ji4 = v;}

    /**
    * name: 较上年同期
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("较上年同期")
    
    
    private Double p_jiao4shang4nian2tong2qi1;

    public Double getP_jiao4shang4nian2tong2qi1() { return this.p_jiao4shang4nian2tong2qi1;}
    public void setP_jiao4shang4nian2tong2qi1(Double v) { this.p_jiao4shang4nian2tong2qi1 = v;}

    /**
    * name: 季度环比
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("季度环比")
    
    
    private Double p_ji4du4huan2bi3;

    public Double getP_ji4du4huan2bi3() { return this.p_ji4du4huan2bi3;}
    public void setP_ji4du4huan2bi3(Double v) { this.p_ji4du4huan2bi3 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
