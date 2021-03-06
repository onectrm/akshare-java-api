
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
    * 接口: macro_china_fx_gold
    * 目标地址: http://data.eastmoney.com/cjsj/hjwh.html
    * 描述: 获取中国外汇和黄金储备, 数据区间从 200801 至今, 月度数据
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_fx_goldResponse extends AkShareRequestAndResponse {
    public macro_china_fx_goldResponse(){
    setInterfaceName("macro_china_fx_gold");
    }

    public static macro_china_fx_goldResponse of(


    String p_yue4fen4,

    String p_guo2jia1wai4hui4chu3bei4shu4zhi2,

    String p_guo2jia1wai4hui4chu3bei4tong2bi3,

    String p_guo2jia1wai4hui4chu3bei4huan2bi3,

    String p_huang2jin1chu3bei4shu4zhi2,

    String p_huang2jin1chu3bei4tong2bi3,

    String p_huang2jin1chu3bei4huan2bi3,


    Map.Entry
    <String
    , String>... others){
    macro_china_fx_goldResponse t = new macro_china_fx_goldResponse();


    t.p_yue4fen4 = p_yue4fen4;

    t.p_guo2jia1wai4hui4chu3bei4shu4zhi2 = p_guo2jia1wai4hui4chu3bei4shu4zhi2;

    t.p_guo2jia1wai4hui4chu3bei4tong2bi3 = p_guo2jia1wai4hui4chu3bei4tong2bi3;

    t.p_guo2jia1wai4hui4chu3bei4huan2bi3 = p_guo2jia1wai4hui4chu3bei4huan2bi3;

    t.p_huang2jin1chu3bei4shu4zhi2 = p_huang2jin1chu3bei4shu4zhi2;

    t.p_huang2jin1chu3bei4tong2bi3 = p_huang2jin1chu3bei4tong2bi3;

    t.p_huang2jin1chu3bei4huan2bi3 = p_huang2jin1chu3bei4huan2bi3;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 月份
    * type: str
    * desc: 年度和月份
    * required: Y
    */
    @JsonProperty("月份")
    
    
    private String p_yue4fen4;

    public String getP_yue4fen4() { return this.p_yue4fen4;}
    public void setP_yue4fen4(String v) { this.p_yue4fen4 = v;}

    /**
    * name: 国家外汇储备-数值
    * type: str
    * desc: 注意单位: 亿美元
    * required: Y
    */
    @JsonProperty("国家外汇储备-数值")
    
    
    private String p_guo2jia1wai4hui4chu3bei4shu4zhi2;

    public String getP_guo2jia1wai4hui4chu3bei4shu4zhi2() { return this.p_guo2jia1wai4hui4chu3bei4shu4zhi2;}
    public void setP_guo2jia1wai4hui4chu3bei4shu4zhi2(String v) { this.p_guo2jia1wai4hui4chu3bei4shu4zhi2 = v;}

    /**
    * name: 国家外汇储备-同比
    * type: str
    * desc: 注意单位: 亿美元
    * required: Y
    */
    @JsonProperty("国家外汇储备-同比")
    
    
    private String p_guo2jia1wai4hui4chu3bei4tong2bi3;

    public String getP_guo2jia1wai4hui4chu3bei4tong2bi3() { return this.p_guo2jia1wai4hui4chu3bei4tong2bi3;}
    public void setP_guo2jia1wai4hui4chu3bei4tong2bi3(String v) { this.p_guo2jia1wai4hui4chu3bei4tong2bi3 = v;}

    /**
    * name: 国家外汇储备-环比
    * type: str
    * desc: 注意单位: 亿美元
    * required: Y
    */
    @JsonProperty("国家外汇储备-环比")
    
    
    private String p_guo2jia1wai4hui4chu3bei4huan2bi3;

    public String getP_guo2jia1wai4hui4chu3bei4huan2bi3() { return this.p_guo2jia1wai4hui4chu3bei4huan2bi3;}
    public void setP_guo2jia1wai4hui4chu3bei4huan2bi3(String v) { this.p_guo2jia1wai4hui4chu3bei4huan2bi3 = v;}

    /**
    * name: 黄金储备-数值
    * type: str
    * desc: 注意单位: 万盎司
    * required: Y
    */
    @JsonProperty("黄金储备-数值")
    
    
    private String p_huang2jin1chu3bei4shu4zhi2;

    public String getP_huang2jin1chu3bei4shu4zhi2() { return this.p_huang2jin1chu3bei4shu4zhi2;}
    public void setP_huang2jin1chu3bei4shu4zhi2(String v) { this.p_huang2jin1chu3bei4shu4zhi2 = v;}

    /**
    * name: 黄金储备-同比
    * type: str
    * desc: 注意单位: 万盎司
    * required: Y
    */
    @JsonProperty("黄金储备-同比")
    
    
    private String p_huang2jin1chu3bei4tong2bi3;

    public String getP_huang2jin1chu3bei4tong2bi3() { return this.p_huang2jin1chu3bei4tong2bi3;}
    public void setP_huang2jin1chu3bei4tong2bi3(String v) { this.p_huang2jin1chu3bei4tong2bi3 = v;}

    /**
    * name: 黄金储备-环比
    * type: str
    * desc: 注意单位: 万盎司
    * required: Y
    */
    @JsonProperty("黄金储备-环比")
    
    
    private String p_huang2jin1chu3bei4huan2bi3;

    public String getP_huang2jin1chu3bei4huan2bi3() { return this.p_huang2jin1chu3bei4huan2bi3;}
    public void setP_huang2jin1chu3bei4huan2bi3(String v) { this.p_huang2jin1chu3bei4huan2bi3 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
