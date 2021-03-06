
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
    * 接口: fund_report_asset_allocation_cninfo
    * 目标地址: http://webapi.cninfo.com.cn/#/thematicStatistics
    * 描述: 巨潮资讯-数据中心-专题统计-基金报表-基金资产配置
    * 限量: 返回所有基金资产配置数据
    */
    public class fund_report_asset_allocation_cninfoResponse extends AkShareRequestAndResponse {
    public fund_report_asset_allocation_cninfoResponse(){
    setInterfaceName("fund_report_asset_allocation_cninfo");
    }

    public static fund_report_asset_allocation_cninfoResponse of(


    String p_bao4gao4qi1,

    String p_ji1jin1fu4gai4jia1shu4,

    String p_gu3piao4quan2yi4lei4zhan4jing4zi1chan3bi3li4,

    String p_zhai4quan4gu4ding4shou1yi4lei4zhan4jing4zi1chan3bi3li4,

    String p_xian4jin1huo4bi4lei4zhan4jing4zi1chan3bi3li4,

    String p_ji1jin1shi4chang3jing4zi1chan3gui1mo2,


    Map.Entry
    <String
    , String>... others){
    fund_report_asset_allocation_cninfoResponse t = new fund_report_asset_allocation_cninfoResponse();


    t.p_bao4gao4qi1 = p_bao4gao4qi1;

    t.p_ji1jin1fu4gai4jia1shu4 = p_ji1jin1fu4gai4jia1shu4;

    t.p_gu3piao4quan2yi4lei4zhan4jing4zi1chan3bi3li4 = p_gu3piao4quan2yi4lei4zhan4jing4zi1chan3bi3li4;

    t.p_zhai4quan4gu4ding4shou1yi4lei4zhan4jing4zi1chan3bi3li4 = p_zhai4quan4gu4ding4shou1yi4lei4zhan4jing4zi1chan3bi3li4;

    t.p_xian4jin1huo4bi4lei4zhan4jing4zi1chan3bi3li4 = p_xian4jin1huo4bi4lei4zhan4jing4zi1chan3bi3li4;

    t.p_ji1jin1shi4chang3jing4zi1chan3gui1mo2 = p_ji1jin1shi4chang3jing4zi1chan3gui1mo2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 报告期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("报告期")
    
    
    private String p_bao4gao4qi1;

    public String getP_bao4gao4qi1() { return this.p_bao4gao4qi1;}
    public void setP_bao4gao4qi1(String v) { this.p_bao4gao4qi1 = v;}

    /**
    * name: 基金覆盖家数
    * type: object
    * desc: 注意单位: 只
    * required: 
    */
    @JsonProperty("基金覆盖家数")
    
    
    private String p_ji1jin1fu4gai4jia1shu4;

    public String getP_ji1jin1fu4gai4jia1shu4() { return this.p_ji1jin1fu4gai4jia1shu4;}
    public void setP_ji1jin1fu4gai4jia1shu4(String v) { this.p_ji1jin1fu4gai4jia1shu4 = v;}

    /**
    * name: 股票权益类占净资产比例
    * type: object
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("股票权益类占净资产比例")
    
    
    private String p_gu3piao4quan2yi4lei4zhan4jing4zi1chan3bi3li4;

    public String getP_gu3piao4quan2yi4lei4zhan4jing4zi1chan3bi3li4() { return this.p_gu3piao4quan2yi4lei4zhan4jing4zi1chan3bi3li4;}
    public void setP_gu3piao4quan2yi4lei4zhan4jing4zi1chan3bi3li4(String v) { this.p_gu3piao4quan2yi4lei4zhan4jing4zi1chan3bi3li4 = v;}

    /**
    * name: 债券固定收益类占净资产比例
    * type: object
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("债券固定收益类占净资产比例")
    
    
    private String p_zhai4quan4gu4ding4shou1yi4lei4zhan4jing4zi1chan3bi3li4;

    public String getP_zhai4quan4gu4ding4shou1yi4lei4zhan4jing4zi1chan3bi3li4() { return this.p_zhai4quan4gu4ding4shou1yi4lei4zhan4jing4zi1chan3bi3li4;}
    public void setP_zhai4quan4gu4ding4shou1yi4lei4zhan4jing4zi1chan3bi3li4(String v) { this.p_zhai4quan4gu4ding4shou1yi4lei4zhan4jing4zi1chan3bi3li4 = v;}

    /**
    * name: 现金货币类占净资产比例
    * type: object
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("现金货币类占净资产比例")
    
    
    private String p_xian4jin1huo4bi4lei4zhan4jing4zi1chan3bi3li4;

    public String getP_xian4jin1huo4bi4lei4zhan4jing4zi1chan3bi3li4() { return this.p_xian4jin1huo4bi4lei4zhan4jing4zi1chan3bi3li4;}
    public void setP_xian4jin1huo4bi4lei4zhan4jing4zi1chan3bi3li4(String v) { this.p_xian4jin1huo4bi4lei4zhan4jing4zi1chan3bi3li4 = v;}

    /**
    * name: 基金市场净资产规模
    * type: object
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("基金市场净资产规模")
    
    
    private String p_ji1jin1shi4chang3jing4zi1chan3gui1mo2;

    public String getP_ji1jin1shi4chang3jing4zi1chan3gui1mo2() { return this.p_ji1jin1shi4chang3jing4zi1chan3gui1mo2;}
    public void setP_ji1jin1shi4chang3jing4zi1chan3gui1mo2(String v) { this.p_ji1jin1shi4chang3jing4zi1chan3gui1mo2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
