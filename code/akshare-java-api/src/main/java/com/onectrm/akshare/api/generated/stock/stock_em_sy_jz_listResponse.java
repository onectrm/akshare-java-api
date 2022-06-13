
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:50 CST 2022*/
    package com.onectrm.akshare.api.generated.stock;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: stock
    * 接口: stock_em_sy_jz_list
    * 目标地址: http://data.eastmoney.com/sy/jzlist.html
    * 描述: 获取东方财富网-数据中心-特色数据-商誉-个股商誉减值明细
    * 限量: 单次所有历史数据, 由于数据量比较大需要等待一定时间
    */
    public class stock_em_sy_jz_listResponse extends AkShareRequestAndResponse {
    public stock_em_sy_jz_listResponse(){
    setInterfaceName("stock_em_sy_jz_list");
    }

    public static stock_em_sy_jz_listResponse of(


    String p_gu3piao4dai4ma3,

    Double p_gu3piao4jian3cheng1,

    Double p_shang1yu4yuan2,

    Double p_shang1yu4jian3zhi2yuan2,

    Double p_shang1yu4jian3zhi2zhan4jing4zi1chan3bi3li4,

    Double p_jing4li4run4yuan2,

    Double p_shang1yu4jian3zhi2zhan4jing4li4run4bi3li4,

    Double p_gong1gao4ri4qi1,


    Map.Entry
    <String
    , String>... others){
    stock_em_sy_jz_listResponse t = new stock_em_sy_jz_listResponse();


    t.p_gu3piao4dai4ma3 = p_gu3piao4dai4ma3;

    t.p_gu3piao4jian3cheng1 = p_gu3piao4jian3cheng1;

    t.p_shang1yu4yuan2 = p_shang1yu4yuan2;

    t.p_shang1yu4jian3zhi2yuan2 = p_shang1yu4jian3zhi2yuan2;

    t.p_shang1yu4jian3zhi2zhan4jing4zi1chan3bi3li4 = p_shang1yu4jian3zhi2zhan4jing4zi1chan3bi3li4;

    t.p_jing4li4run4yuan2 = p_jing4li4run4yuan2;

    t.p_shang1yu4jian3zhi2zhan4jing4li4run4bi3li4 = p_shang1yu4jian3zhi2zhan4jing4li4run4bi3li4;

    t.p_gong1gao4ri4qi1 = p_gong1gao4ri4qi1;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 股票代码
    * type: datetime.date
    * desc: 
    * required: Y
    */
    @JsonProperty("股票代码")
    
    
    private String p_gu3piao4dai4ma3;

    public String getP_gu3piao4dai4ma3() { return this.p_gu3piao4dai4ma3;}
    public void setP_gu3piao4dai4ma3(String v) { this.p_gu3piao4dai4ma3 = v;}

    /**
    * name: 股票简称
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("股票简称")
    
    
    private Double p_gu3piao4jian3cheng1;

    public Double getP_gu3piao4jian3cheng1() { return this.p_gu3piao4jian3cheng1;}
    public void setP_gu3piao4jian3cheng1(Double v) { this.p_gu3piao4jian3cheng1 = v;}

    /**
    * name: 商誉(元)
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("商誉(元)")
    
    
    private Double p_shang1yu4yuan2;

    public Double getP_shang1yu4yuan2() { return this.p_shang1yu4yuan2;}
    public void setP_shang1yu4yuan2(Double v) { this.p_shang1yu4yuan2 = v;}

    /**
    * name: 商誉减值(元)
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("商誉减值(元)")
    
    
    private Double p_shang1yu4jian3zhi2yuan2;

    public Double getP_shang1yu4jian3zhi2yuan2() { return this.p_shang1yu4jian3zhi2yuan2;}
    public void setP_shang1yu4jian3zhi2yuan2(Double v) { this.p_shang1yu4jian3zhi2yuan2 = v;}

    /**
    * name: 商誉减值占净资产比例(%)
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("商誉减值占净资产比例(%)")
    
    
    private Double p_shang1yu4jian3zhi2zhan4jing4zi1chan3bi3li4;

    public Double getP_shang1yu4jian3zhi2zhan4jing4zi1chan3bi3li4() { return this.p_shang1yu4jian3zhi2zhan4jing4zi1chan3bi3li4;}
    public void setP_shang1yu4jian3zhi2zhan4jing4zi1chan3bi3li4(Double v) { this.p_shang1yu4jian3zhi2zhan4jing4zi1chan3bi3li4 = v;}

    /**
    * name: 净利润(元)
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("净利润(元)")
    
    
    private Double p_jing4li4run4yuan2;

    public Double getP_jing4li4run4yuan2() { return this.p_jing4li4run4yuan2;}
    public void setP_jing4li4run4yuan2(Double v) { this.p_jing4li4run4yuan2 = v;}

    /**
    * name: 商誉减值占净利润比例(%)
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("商誉减值占净利润比例(%)")
    
    
    private Double p_shang1yu4jian3zhi2zhan4jing4li4run4bi3li4;

    public Double getP_shang1yu4jian3zhi2zhan4jing4li4run4bi3li4() { return this.p_shang1yu4jian3zhi2zhan4jing4li4run4bi3li4;}
    public void setP_shang1yu4jian3zhi2zhan4jing4li4run4bi3li4(Double v) { this.p_shang1yu4jian3zhi2zhan4jing4li4run4bi3li4 = v;}

    /**
    * name: 公告日期
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("公告日期")
    
    
    private Double p_gong1gao4ri4qi1;

    public Double getP_gong1gao4ri4qi1() { return this.p_gong1gao4ri4qi1;}
    public void setP_gong1gao4ri4qi1(Double v) { this.p_gong1gao4ri4qi1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
