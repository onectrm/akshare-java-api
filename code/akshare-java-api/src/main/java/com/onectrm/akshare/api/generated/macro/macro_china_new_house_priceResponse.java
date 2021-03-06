
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
    * 接口: macro_china_new_house_price
    * 目标地址: http://data.eastmoney.com/cjsj/newhouse.html
    * 描述: 获取中国新房价指数月度数据, 数据区间从 201101-至今
    * 限量: 单次返回所有历史数据, 目前该指数由上海和北京房价构成
    */
    public class macro_china_new_house_priceResponse extends AkShareRequestAndResponse {
    public macro_china_new_house_priceResponse(){
    setInterfaceName("macro_china_new_house_price");
    }

    public static macro_china_new_house_priceResponse of(


    LocalDate p_ri4qi1,

    String p_cheng2shi4,

    Double p_xin1jian4zhu4zhai2jia4ge2zhi3shu4huan2bi3,

    Double p_xin1jian4zhu4zhai2jia4ge2zhi3shu4tong2bi3,

    Double p_xin1jian4zhu4zhai2jia4ge2zhi3shu4ding4ji1,

    Double p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4huan2bi3,

    Double p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4tong2bi3,

    Double p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4ding4ji1,

    Double p_er4shou3zhu4zhai2jia4ge2zhi3shu4huan2bi3,

    Double p_er4shou3zhu4zhai2jia4ge2zhi3shu4tong2bi3,

    Double p_er4shou3zhu4zhai2jia4ge2zhi3shu4ding4ji1,


    Map.Entry
    <String
    , String>... others){
    macro_china_new_house_priceResponse t = new macro_china_new_house_priceResponse();


    t.p_ri4qi1 = p_ri4qi1;

    t.p_cheng2shi4 = p_cheng2shi4;

    t.p_xin1jian4zhu4zhai2jia4ge2zhi3shu4huan2bi3 = p_xin1jian4zhu4zhai2jia4ge2zhi3shu4huan2bi3;

    t.p_xin1jian4zhu4zhai2jia4ge2zhi3shu4tong2bi3 = p_xin1jian4zhu4zhai2jia4ge2zhi3shu4tong2bi3;

    t.p_xin1jian4zhu4zhai2jia4ge2zhi3shu4ding4ji1 = p_xin1jian4zhu4zhai2jia4ge2zhi3shu4ding4ji1;

    t.p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4huan2bi3 = p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4huan2bi3;

    t.p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4tong2bi3 = p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4tong2bi3;

    t.p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4ding4ji1 = p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4ding4ji1;

    t.p_er4shou3zhu4zhai2jia4ge2zhi3shu4huan2bi3 = p_er4shou3zhu4zhai2jia4ge2zhi3shu4huan2bi3;

    t.p_er4shou3zhu4zhai2jia4ge2zhi3shu4tong2bi3 = p_er4shou3zhu4zhai2jia4ge2zhi3shu4tong2bi3;

    t.p_er4shou3zhu4zhai2jia4ge2zhi3shu4ding4ji1 = p_er4shou3zhu4zhai2jia4ge2zhi3shu4ding4ji1;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 日期
    * type: str
    * desc: 日期
    * required: Y
    */
    @JsonProperty("日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_ri4qi1;

    public LocalDate getP_ri4qi1() { return this.p_ri4qi1;}
    public void setP_ri4qi1(LocalDate v) { this.p_ri4qi1 = v;}

    /**
    * name: 城市
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("城市")
    
    
    private String p_cheng2shi4;

    public String getP_cheng2shi4() { return this.p_cheng2shi4;}
    public void setP_cheng2shi4(String v) { this.p_cheng2shi4 = v;}

    /**
    * name: 新建住宅价格指数-环比
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("新建住宅价格指数-环比")
    
    
    private Double p_xin1jian4zhu4zhai2jia4ge2zhi3shu4huan2bi3;

    public Double getP_xin1jian4zhu4zhai2jia4ge2zhi3shu4huan2bi3() { return this.p_xin1jian4zhu4zhai2jia4ge2zhi3shu4huan2bi3;}
    public void setP_xin1jian4zhu4zhai2jia4ge2zhi3shu4huan2bi3(Double v) { this.p_xin1jian4zhu4zhai2jia4ge2zhi3shu4huan2bi3 = v;}

    /**
    * name: 新建住宅价格指数-同比
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("新建住宅价格指数-同比")
    
    
    private Double p_xin1jian4zhu4zhai2jia4ge2zhi3shu4tong2bi3;

    public Double getP_xin1jian4zhu4zhai2jia4ge2zhi3shu4tong2bi3() { return this.p_xin1jian4zhu4zhai2jia4ge2zhi3shu4tong2bi3;}
    public void setP_xin1jian4zhu4zhai2jia4ge2zhi3shu4tong2bi3(Double v) { this.p_xin1jian4zhu4zhai2jia4ge2zhi3shu4tong2bi3 = v;}

    /**
    * name: 新建住宅价格指数-定基
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("新建住宅价格指数-定基")
    
    
    private Double p_xin1jian4zhu4zhai2jia4ge2zhi3shu4ding4ji1;

    public Double getP_xin1jian4zhu4zhai2jia4ge2zhi3shu4ding4ji1() { return this.p_xin1jian4zhu4zhai2jia4ge2zhi3shu4ding4ji1;}
    public void setP_xin1jian4zhu4zhai2jia4ge2zhi3shu4ding4ji1(Double v) { this.p_xin1jian4zhu4zhai2jia4ge2zhi3shu4ding4ji1 = v;}

    /**
    * name: 新建商品住宅价格指数-环比
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("新建商品住宅价格指数-环比")
    
    
    private Double p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4huan2bi3;

    public Double getP_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4huan2bi3() { return this.p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4huan2bi3;}
    public void setP_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4huan2bi3(Double v) { this.p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4huan2bi3 = v;}

    /**
    * name: 新建商品住宅价格指数-同比
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("新建商品住宅价格指数-同比")
    
    
    private Double p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4tong2bi3;

    public Double getP_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4tong2bi3() { return this.p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4tong2bi3;}
    public void setP_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4tong2bi3(Double v) { this.p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4tong2bi3 = v;}

    /**
    * name: 新建商品住宅价格指数-定基
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("新建商品住宅价格指数-定基")
    
    
    private Double p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4ding4ji1;

    public Double getP_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4ding4ji1() { return this.p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4ding4ji1;}
    public void setP_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4ding4ji1(Double v) { this.p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4ding4ji1 = v;}

    /**
    * name: 二手住宅价格指数-环比
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("二手住宅价格指数-环比")
    
    
    private Double p_er4shou3zhu4zhai2jia4ge2zhi3shu4huan2bi3;

    public Double getP_er4shou3zhu4zhai2jia4ge2zhi3shu4huan2bi3() { return this.p_er4shou3zhu4zhai2jia4ge2zhi3shu4huan2bi3;}
    public void setP_er4shou3zhu4zhai2jia4ge2zhi3shu4huan2bi3(Double v) { this.p_er4shou3zhu4zhai2jia4ge2zhi3shu4huan2bi3 = v;}

    /**
    * name: 二手住宅价格指数-同比
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("二手住宅价格指数-同比")
    
    
    private Double p_er4shou3zhu4zhai2jia4ge2zhi3shu4tong2bi3;

    public Double getP_er4shou3zhu4zhai2jia4ge2zhi3shu4tong2bi3() { return this.p_er4shou3zhu4zhai2jia4ge2zhi3shu4tong2bi3;}
    public void setP_er4shou3zhu4zhai2jia4ge2zhi3shu4tong2bi3(Double v) { this.p_er4shou3zhu4zhai2jia4ge2zhi3shu4tong2bi3 = v;}

    /**
    * name: 二手住宅价格指数-定基
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("二手住宅价格指数-定基")
    
    
    private Double p_er4shou3zhu4zhai2jia4ge2zhi3shu4ding4ji1;

    public Double getP_er4shou3zhu4zhai2jia4ge2zhi3shu4ding4ji1() { return this.p_er4shou3zhu4zhai2jia4ge2zhi3shu4ding4ji1;}
    public void setP_er4shou3zhu4zhai2jia4ge2zhi3shu4ding4ji1(Double v) { this.p_er4shou3zhu4zhai2jia4ge2zhi3shu4ding4ji1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
