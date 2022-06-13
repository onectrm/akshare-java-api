
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
    * 接口: macro_china_shrzgm
    * 目标地址: http://data.mofcom.gov.cn/gnmy/shrzgm.shtml
    * 描述: 商务数据中心-国内贸易-社会融资规模增量统计, 数据区间从 201501-至今
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_shrzgmResponse extends AkShareRequestAndResponse {
    public macro_china_shrzgmResponse(){
    setInterfaceName("macro_china_shrzgm");
    }

    public static macro_china_shrzgmResponse of(


    String p_yue4fen4,

    Double p_she4hui4rong2zi1gui1mo2zeng1liang4,

    Double p_qi2zhong1ren2min2bi4dai4kuan3,

    Double p_qi2zhong1wei3tuo1dai4kuan3wai4bi4dai4kuan3,

    Double p_qi2zhong1wei3tuo1dai4kuan3,

    Double p_qi2zhong1xin4tuo1dai4kuan3,

    Double p_qi2zhong1wei4tie1xian4yin2xing2cheng2dui4hui4piao4,

    Double p_qi2zhong1qi3ye4zhai4quan4,

    Double p_qi2zhong1fei1jin1rong2qi3ye4jing4nei4gu3piao4rong2zi1,


    Map.Entry
    <String
    , String>... others){
    macro_china_shrzgmResponse t = new macro_china_shrzgmResponse();


    t.p_yue4fen4 = p_yue4fen4;

    t.p_she4hui4rong2zi1gui1mo2zeng1liang4 = p_she4hui4rong2zi1gui1mo2zeng1liang4;

    t.p_qi2zhong1ren2min2bi4dai4kuan3 = p_qi2zhong1ren2min2bi4dai4kuan3;

    t.p_qi2zhong1wei3tuo1dai4kuan3wai4bi4dai4kuan3 = p_qi2zhong1wei3tuo1dai4kuan3wai4bi4dai4kuan3;

    t.p_qi2zhong1wei3tuo1dai4kuan3 = p_qi2zhong1wei3tuo1dai4kuan3;

    t.p_qi2zhong1xin4tuo1dai4kuan3 = p_qi2zhong1xin4tuo1dai4kuan3;

    t.p_qi2zhong1wei4tie1xian4yin2xing2cheng2dui4hui4piao4 = p_qi2zhong1wei4tie1xian4yin2xing2cheng2dui4hui4piao4;

    t.p_qi2zhong1qi3ye4zhai4quan4 = p_qi2zhong1qi3ye4zhai4quan4;

    t.p_qi2zhong1fei1jin1rong2qi3ye4jing4nei4gu3piao4rong2zi1 = p_qi2zhong1fei1jin1rong2qi3ye4jing4nei4gu3piao4rong2zi1;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 月份
    * type: object
    * desc: 年月
    * required: 
    */
    @JsonProperty("月份")
    
    
    private String p_yue4fen4;

    public String getP_yue4fen4() { return this.p_yue4fen4;}
    public void setP_yue4fen4(String v) { this.p_yue4fen4 = v;}

    /**
    * name: 社会融资规模增量
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("社会融资规模增量")
    
    
    private Double p_she4hui4rong2zi1gui1mo2zeng1liang4;

    public Double getP_she4hui4rong2zi1gui1mo2zeng1liang4() { return this.p_she4hui4rong2zi1gui1mo2zeng1liang4;}
    public void setP_she4hui4rong2zi1gui1mo2zeng1liang4(Double v) { this.p_she4hui4rong2zi1gui1mo2zeng1liang4 = v;}

    /**
    * name: 其中-人民币贷款
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("其中-人民币贷款")
    
    
    private Double p_qi2zhong1ren2min2bi4dai4kuan3;

    public Double getP_qi2zhong1ren2min2bi4dai4kuan3() { return this.p_qi2zhong1ren2min2bi4dai4kuan3;}
    public void setP_qi2zhong1ren2min2bi4dai4kuan3(Double v) { this.p_qi2zhong1ren2min2bi4dai4kuan3 = v;}

    /**
    * name: 其中-委托贷款外币贷款
    * type: float64
    * desc: 注意单位: 折合人民币, 亿元
    * required: 
    */
    @JsonProperty("其中-委托贷款外币贷款")
    
    
    private Double p_qi2zhong1wei3tuo1dai4kuan3wai4bi4dai4kuan3;

    public Double getP_qi2zhong1wei3tuo1dai4kuan3wai4bi4dai4kuan3() { return this.p_qi2zhong1wei3tuo1dai4kuan3wai4bi4dai4kuan3;}
    public void setP_qi2zhong1wei3tuo1dai4kuan3wai4bi4dai4kuan3(Double v) { this.p_qi2zhong1wei3tuo1dai4kuan3wai4bi4dai4kuan3 = v;}

    /**
    * name: 其中-委托贷款
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("其中-委托贷款")
    
    
    private Double p_qi2zhong1wei3tuo1dai4kuan3;

    public Double getP_qi2zhong1wei3tuo1dai4kuan3() { return this.p_qi2zhong1wei3tuo1dai4kuan3;}
    public void setP_qi2zhong1wei3tuo1dai4kuan3(Double v) { this.p_qi2zhong1wei3tuo1dai4kuan3 = v;}

    /**
    * name: 其中-信托贷款
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("其中-信托贷款")
    
    
    private Double p_qi2zhong1xin4tuo1dai4kuan3;

    public Double getP_qi2zhong1xin4tuo1dai4kuan3() { return this.p_qi2zhong1xin4tuo1dai4kuan3;}
    public void setP_qi2zhong1xin4tuo1dai4kuan3(Double v) { this.p_qi2zhong1xin4tuo1dai4kuan3 = v;}

    /**
    * name: 其中-未贴现银行承兑汇票
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("其中-未贴现银行承兑汇票")
    
    
    private Double p_qi2zhong1wei4tie1xian4yin2xing2cheng2dui4hui4piao4;

    public Double getP_qi2zhong1wei4tie1xian4yin2xing2cheng2dui4hui4piao4() { return this.p_qi2zhong1wei4tie1xian4yin2xing2cheng2dui4hui4piao4;}
    public void setP_qi2zhong1wei4tie1xian4yin2xing2cheng2dui4hui4piao4(Double v) { this.p_qi2zhong1wei4tie1xian4yin2xing2cheng2dui4hui4piao4 = v;}

    /**
    * name: 其中-企业债券
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("其中-企业债券")
    
    
    private Double p_qi2zhong1qi3ye4zhai4quan4;

    public Double getP_qi2zhong1qi3ye4zhai4quan4() { return this.p_qi2zhong1qi3ye4zhai4quan4;}
    public void setP_qi2zhong1qi3ye4zhai4quan4(Double v) { this.p_qi2zhong1qi3ye4zhai4quan4 = v;}

    /**
    * name: 其中-非金融企业境内股票融资
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("其中-非金融企业境内股票融资")
    
    
    private Double p_qi2zhong1fei1jin1rong2qi3ye4jing4nei4gu3piao4rong2zi1;

    public Double getP_qi2zhong1fei1jin1rong2qi3ye4jing4nei4gu3piao4rong2zi1() { return this.p_qi2zhong1fei1jin1rong2qi3ye4jing4nei4gu3piao4rong2zi1;}
    public void setP_qi2zhong1fei1jin1rong2qi3ye4jing4nei4gu3piao4rong2zi1(Double v) { this.p_qi2zhong1fei1jin1rong2qi3ye4jing4nei4gu3piao4rong2zi1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
