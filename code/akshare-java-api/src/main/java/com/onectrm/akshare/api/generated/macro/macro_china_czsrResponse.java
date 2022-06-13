
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
    * 接口: macro_china_czsr
    * 目标地址: http://data.eastmoney.com/cjsj/czsr.html
    * 描述: 获取中国财政收入, 数据区间从 200801 至今, 月度数据
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_czsrResponse extends AkShareRequestAndResponse {
    public macro_china_czsrResponse(){
    setInterfaceName("macro_china_czsr");
    }

    public static macro_china_czsrResponse of(


    String p_yue4fen4,

    String p_dang1yue4,

    String p_dang1yue4tong2bi3zeng1zhang3,

    String p_dang1yue4huan2bi3zeng1zhang3,

    String p_lei3ji4,

    String p_lei3ji4tong2bi3zeng1zhang3,


    Map.Entry
    <String
    , String>... others){
    macro_china_czsrResponse t = new macro_china_czsrResponse();


    t.p_yue4fen4 = p_yue4fen4;

    t.p_dang1yue4 = p_dang1yue4;

    t.p_dang1yue4tong2bi3zeng1zhang3 = p_dang1yue4tong2bi3zeng1zhang3;

    t.p_dang1yue4huan2bi3zeng1zhang3 = p_dang1yue4huan2bi3zeng1zhang3;

    t.p_lei3ji4 = p_lei3ji4;

    t.p_lei3ji4tong2bi3zeng1zhang3 = p_lei3ji4tong2bi3zeng1zhang3;


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
    * desc: 
    * required: Y
    */
    @JsonProperty("月份")
    
    
    private String p_yue4fen4;

    public String getP_yue4fen4() { return this.p_yue4fen4;}
    public void setP_yue4fen4(String v) { this.p_yue4fen4 = v;}

    /**
    * name: 当月
    * type: str
    * desc: 注意单位: 亿元
    * required: Y
    */
    @JsonProperty("当月")
    
    
    private String p_dang1yue4;

    public String getP_dang1yue4() { return this.p_dang1yue4;}
    public void setP_dang1yue4(String v) { this.p_dang1yue4 = v;}

    /**
    * name: 当月-同比增长
    * type: str
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("当月-同比增长")
    
    
    private String p_dang1yue4tong2bi3zeng1zhang3;

    public String getP_dang1yue4tong2bi3zeng1zhang3() { return this.p_dang1yue4tong2bi3zeng1zhang3;}
    public void setP_dang1yue4tong2bi3zeng1zhang3(String v) { this.p_dang1yue4tong2bi3zeng1zhang3 = v;}

    /**
    * name: 当月-环比增长
    * type: str
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("当月-环比增长")
    
    
    private String p_dang1yue4huan2bi3zeng1zhang3;

    public String getP_dang1yue4huan2bi3zeng1zhang3() { return this.p_dang1yue4huan2bi3zeng1zhang3;}
    public void setP_dang1yue4huan2bi3zeng1zhang3(String v) { this.p_dang1yue4huan2bi3zeng1zhang3 = v;}

    /**
    * name: 累计
    * type: str
    * desc: 注意单位: 亿美元
    * required: Y
    */
    @JsonProperty("累计")
    
    
    private String p_lei3ji4;

    public String getP_lei3ji4() { return this.p_lei3ji4;}
    public void setP_lei3ji4(String v) { this.p_lei3ji4 = v;}

    /**
    * name: 累计-同比增长
    * type: str
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("累计-同比增长")
    
    
    private String p_lei3ji4tong2bi3zeng1zhang3;

    public String getP_lei3ji4tong2bi3zeng1zhang3() { return this.p_lei3ji4tong2bi3zeng1zhang3;}
    public void setP_lei3ji4tong2bi3zeng1zhang3(String v) { this.p_lei3ji4tong2bi3zeng1zhang3 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
