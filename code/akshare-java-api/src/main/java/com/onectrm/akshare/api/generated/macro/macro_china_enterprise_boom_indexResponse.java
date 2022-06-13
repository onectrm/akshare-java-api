
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
    * 接口: macro_china_enterprise_boom_index
    * 目标地址: http://data.eastmoney.com/cjsj/qyjqzs.html
    * 描述: 获取中国企业景气及企业家信心指数数据, 数据区间从 2005 一季度-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_enterprise_boom_indexResponse extends AkShareRequestAndResponse {
    public macro_china_enterprise_boom_indexResponse(){
    setInterfaceName("macro_china_enterprise_boom_index");
    }

    public static macro_china_enterprise_boom_indexResponse of(


    LocalDate p_ji4du4,

    Double p_qi3ye4jing3qi4zhi3shu4zhi3shu4,

    Double p_qi3ye4jing3qi4zhi3shu4tong2bi3,

    Double p_qi3ye4jing3qi4zhi3shu4huan2bi3,

    Double p_qi3ye4jia1xin4xin1zhi3shu4zhi3shu4,

    Double p_qi3ye4jia1xin4xin1zhi3shu4tong2bi3,

    Double p_qi3ye4jia1xin4xin1zhi3shu4huan2bi3,


    Map.Entry
    <String
    , String>... others){
    macro_china_enterprise_boom_indexResponse t = new macro_china_enterprise_boom_indexResponse();


    t.p_ji4du4 = p_ji4du4;

    t.p_qi3ye4jing3qi4zhi3shu4zhi3shu4 = p_qi3ye4jing3qi4zhi3shu4zhi3shu4;

    t.p_qi3ye4jing3qi4zhi3shu4tong2bi3 = p_qi3ye4jing3qi4zhi3shu4tong2bi3;

    t.p_qi3ye4jing3qi4zhi3shu4huan2bi3 = p_qi3ye4jing3qi4zhi3shu4huan2bi3;

    t.p_qi3ye4jia1xin4xin1zhi3shu4zhi3shu4 = p_qi3ye4jia1xin4xin1zhi3shu4zhi3shu4;

    t.p_qi3ye4jia1xin4xin1zhi3shu4tong2bi3 = p_qi3ye4jia1xin4xin1zhi3shu4tong2bi3;

    t.p_qi3ye4jia1xin4xin1zhi3shu4huan2bi3 = p_qi3ye4jia1xin4xin1zhi3shu4huan2bi3;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 季度
    * type: str
    * desc: 日期
    * required: Y
    */
    @JsonProperty("季度")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_ji4du4;

    public LocalDate getP_ji4du4() { return this.p_ji4du4;}
    public void setP_ji4du4(LocalDate v) { this.p_ji4du4 = v;}

    /**
    * name: 企业景气指数-指数
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("企业景气指数-指数")
    
    
    private Double p_qi3ye4jing3qi4zhi3shu4zhi3shu4;

    public Double getP_qi3ye4jing3qi4zhi3shu4zhi3shu4() { return this.p_qi3ye4jing3qi4zhi3shu4zhi3shu4;}
    public void setP_qi3ye4jing3qi4zhi3shu4zhi3shu4(Double v) { this.p_qi3ye4jing3qi4zhi3shu4zhi3shu4 = v;}

    /**
    * name: 企业景气指数-同比
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("企业景气指数-同比")
    
    
    private Double p_qi3ye4jing3qi4zhi3shu4tong2bi3;

    public Double getP_qi3ye4jing3qi4zhi3shu4tong2bi3() { return this.p_qi3ye4jing3qi4zhi3shu4tong2bi3;}
    public void setP_qi3ye4jing3qi4zhi3shu4tong2bi3(Double v) { this.p_qi3ye4jing3qi4zhi3shu4tong2bi3 = v;}

    /**
    * name: 企业景气指数-环比
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("企业景气指数-环比")
    
    
    private Double p_qi3ye4jing3qi4zhi3shu4huan2bi3;

    public Double getP_qi3ye4jing3qi4zhi3shu4huan2bi3() { return this.p_qi3ye4jing3qi4zhi3shu4huan2bi3;}
    public void setP_qi3ye4jing3qi4zhi3shu4huan2bi3(Double v) { this.p_qi3ye4jing3qi4zhi3shu4huan2bi3 = v;}

    /**
    * name: 企业家信心指数-指数
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("企业家信心指数-指数")
    
    
    private Double p_qi3ye4jia1xin4xin1zhi3shu4zhi3shu4;

    public Double getP_qi3ye4jia1xin4xin1zhi3shu4zhi3shu4() { return this.p_qi3ye4jia1xin4xin1zhi3shu4zhi3shu4;}
    public void setP_qi3ye4jia1xin4xin1zhi3shu4zhi3shu4(Double v) { this.p_qi3ye4jia1xin4xin1zhi3shu4zhi3shu4 = v;}

    /**
    * name: 企业家信心指数-同比
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("企业家信心指数-同比")
    
    
    private Double p_qi3ye4jia1xin4xin1zhi3shu4tong2bi3;

    public Double getP_qi3ye4jia1xin4xin1zhi3shu4tong2bi3() { return this.p_qi3ye4jia1xin4xin1zhi3shu4tong2bi3;}
    public void setP_qi3ye4jia1xin4xin1zhi3shu4tong2bi3(Double v) { this.p_qi3ye4jia1xin4xin1zhi3shu4tong2bi3 = v;}

    /**
    * name: 企业家信心指数-环比
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("企业家信心指数-环比")
    
    
    private Double p_qi3ye4jia1xin4xin1zhi3shu4huan2bi3;

    public Double getP_qi3ye4jia1xin4xin1zhi3shu4huan2bi3() { return this.p_qi3ye4jia1xin4xin1zhi3shu4huan2bi3;}
    public void setP_qi3ye4jia1xin4xin1zhi3shu4huan2bi3(Double v) { this.p_qi3ye4jia1xin4xin1zhi3shu4huan2bi3 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
