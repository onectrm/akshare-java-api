
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
    * 接口: macro_china_reserve_requirement_ratio
    * 目标地址: https://data.eastmoney.com/cjsj/ckzbj.html
    * 描述: 国家统计局-存款准备金率
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_reserve_requirement_ratioResponse extends AkShareRequestAndResponse {
    public macro_china_reserve_requirement_ratioResponse(){
    setInterfaceName("macro_china_reserve_requirement_ratio");
    }

    public static macro_china_reserve_requirement_ratioResponse of(


    String p_yue4fen4,

    Double p_da4xing2jin1rong2ji1gou4diao4zheng3hou4,

    Double p_zhong1xiao3jin1rong2ji1gou4diao4zheng3hou4,


    Map.Entry
    <String
    , String>... others){
    macro_china_reserve_requirement_ratioResponse t = new macro_china_reserve_requirement_ratioResponse();


    t.p_yue4fen4 = p_yue4fen4;

    t.p_da4xing2jin1rong2ji1gou4diao4zheng3hou4 = p_da4xing2jin1rong2ji1gou4diao4zheng3hou4;

    t.p_zhong1xiao3jin1rong2ji1gou4diao4zheng3hou4 = p_zhong1xiao3jin1rong2ji1gou4diao4zheng3hou4;


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
    * desc: XXXX年X月
    * required: 
    */
    @JsonProperty("月份")
    
    
    private String p_yue4fen4;

    public String getP_yue4fen4() { return this.p_yue4fen4;}
    public void setP_yue4fen4(String v) { this.p_yue4fen4 = v;}

    /**
    * name: 大型金融机构-调整后
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("大型金融机构-调整后")
    
    
    private Double p_da4xing2jin1rong2ji1gou4diao4zheng3hou4;

    public Double getP_da4xing2jin1rong2ji1gou4diao4zheng3hou4() { return this.p_da4xing2jin1rong2ji1gou4diao4zheng3hou4;}
    public void setP_da4xing2jin1rong2ji1gou4diao4zheng3hou4(Double v) { this.p_da4xing2jin1rong2ji1gou4diao4zheng3hou4 = v;}

    /**
    * name: 中小金融机构-调整后
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("中小金融机构-调整后")
    
    
    private Double p_zhong1xiao3jin1rong2ji1gou4diao4zheng3hou4;

    public Double getP_zhong1xiao3jin1rong2ji1gou4diao4zheng3hou4() { return this.p_zhong1xiao3jin1rong2ji1gou4diao4zheng3hou4;}
    public void setP_zhong1xiao3jin1rong2ji1gou4diao4zheng3hou4(Double v) { this.p_zhong1xiao3jin1rong2ji1gou4diao4zheng3hou4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
