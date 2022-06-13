
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: fund_public
    * 接口: fund_new_found_em
    * 目标地址: http://fund.eastmoney.com/data/xinfound.html
    * 描述: 天天基金网-基金数据-新发基金
    * 限量: 单次返回所有新发基金数据
    */
    public class fund_new_found_emResponse extends AkShareRequestAndResponse {
    public fund_new_found_emResponse(){
    setInterfaceName("fund_new_found_em");
    }

    public static fund_new_found_emResponse of(


    String p_ji1jin1dai4ma3,

    String p_ji1jin1jian3cheng1,

    String p_fa1xing2gong1si1,

    String p_ji1jin1lei4xing2,

    String p_ji2zhong1ren4gou4qi1,

    Double p_mu4ji2fen4e2,

    LocalDate p_cheng2li4ri4qi1,

    Double p_cheng2li4lai2zhang3fu2,

    String p_ji1jin1jing1li3,

    String p_shen1gou4zhuang4tai4,

    Double p_you1hui4fei4lu4,


    Map.Entry
    <String
    , String>... others){
    fund_new_found_emResponse t = new fund_new_found_emResponse();


    t.p_ji1jin1dai4ma3 = p_ji1jin1dai4ma3;

    t.p_ji1jin1jian3cheng1 = p_ji1jin1jian3cheng1;

    t.p_fa1xing2gong1si1 = p_fa1xing2gong1si1;

    t.p_ji1jin1lei4xing2 = p_ji1jin1lei4xing2;

    t.p_ji2zhong1ren4gou4qi1 = p_ji2zhong1ren4gou4qi1;

    t.p_mu4ji2fen4e2 = p_mu4ji2fen4e2;

    t.p_cheng2li4ri4qi1 = p_cheng2li4ri4qi1;

    t.p_cheng2li4lai2zhang3fu2 = p_cheng2li4lai2zhang3fu2;

    t.p_ji1jin1jing1li3 = p_ji1jin1jing1li3;

    t.p_shen1gou4zhuang4tai4 = p_shen1gou4zhuang4tai4;

    t.p_you1hui4fei4lu4 = p_you1hui4fei4lu4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 基金代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("基金代码")
    
    
    private String p_ji1jin1dai4ma3;

    public String getP_ji1jin1dai4ma3() { return this.p_ji1jin1dai4ma3;}
    public void setP_ji1jin1dai4ma3(String v) { this.p_ji1jin1dai4ma3 = v;}

    /**
    * name: 基金简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("基金简称")
    
    
    private String p_ji1jin1jian3cheng1;

    public String getP_ji1jin1jian3cheng1() { return this.p_ji1jin1jian3cheng1;}
    public void setP_ji1jin1jian3cheng1(String v) { this.p_ji1jin1jian3cheng1 = v;}

    /**
    * name: 发行公司
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("发行公司")
    
    
    private String p_fa1xing2gong1si1;

    public String getP_fa1xing2gong1si1() { return this.p_fa1xing2gong1si1;}
    public void setP_fa1xing2gong1si1(String v) { this.p_fa1xing2gong1si1 = v;}

    /**
    * name: 基金类型
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("基金类型")
    
    
    private String p_ji1jin1lei4xing2;

    public String getP_ji1jin1lei4xing2() { return this.p_ji1jin1lei4xing2;}
    public void setP_ji1jin1lei4xing2(String v) { this.p_ji1jin1lei4xing2 = v;}

    /**
    * name: 集中认购期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("集中认购期")
    
    
    private String p_ji2zhong1ren4gou4qi1;

    public String getP_ji2zhong1ren4gou4qi1() { return this.p_ji2zhong1ren4gou4qi1;}
    public void setP_ji2zhong1ren4gou4qi1(String v) { this.p_ji2zhong1ren4gou4qi1 = v;}

    /**
    * name: 募集份额
    * type: float64
    * desc: 注意单位: 亿份
    * required: 
    */
    @JsonProperty("募集份额")
    
    
    private Double p_mu4ji2fen4e2;

    public Double getP_mu4ji2fen4e2() { return this.p_mu4ji2fen4e2;}
    public void setP_mu4ji2fen4e2(Double v) { this.p_mu4ji2fen4e2 = v;}

    /**
    * name: 成立日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("成立日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_cheng2li4ri4qi1;

    public LocalDate getP_cheng2li4ri4qi1() { return this.p_cheng2li4ri4qi1;}
    public void setP_cheng2li4ri4qi1(LocalDate v) { this.p_cheng2li4ri4qi1 = v;}

    /**
    * name: 成立来涨幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("成立来涨幅")
    
    
    private Double p_cheng2li4lai2zhang3fu2;

    public Double getP_cheng2li4lai2zhang3fu2() { return this.p_cheng2li4lai2zhang3fu2;}
    public void setP_cheng2li4lai2zhang3fu2(Double v) { this.p_cheng2li4lai2zhang3fu2 = v;}

    /**
    * name: 基金经理
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("基金经理")
    
    
    private String p_ji1jin1jing1li3;

    public String getP_ji1jin1jing1li3() { return this.p_ji1jin1jing1li3;}
    public void setP_ji1jin1jing1li3(String v) { this.p_ji1jin1jing1li3 = v;}

    /**
    * name: 申购状态
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("申购状态")
    
    
    private String p_shen1gou4zhuang4tai4;

    public String getP_shen1gou4zhuang4tai4() { return this.p_shen1gou4zhuang4tai4;}
    public void setP_shen1gou4zhuang4tai4(String v) { this.p_shen1gou4zhuang4tai4 = v;}

    /**
    * name: 优惠费率
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("优惠费率")
    
    
    private Double p_you1hui4fei4lu4;

    public Double getP_you1hui4fei4lu4() { return this.p_you1hui4fei4lu4;}
    public void setP_you1hui4fei4lu4(Double v) { this.p_you1hui4fei4lu4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
