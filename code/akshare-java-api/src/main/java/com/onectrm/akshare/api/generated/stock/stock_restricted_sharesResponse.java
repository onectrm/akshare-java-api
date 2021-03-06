
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:51 CST 2022*/
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
    * 接口: stock_restricted_shares
    * 目标地址: https://vip.stock.finance.sina.com.cn/q/go.php/vInvestConsult/kind/xsjj/index.phtml?symbol=sh600000
    * 描述: 获取新浪财经-发行分配-限售解禁
    * 限量: 单次获取限售解禁数据
    */
    public class stock_restricted_sharesResponse extends AkShareRequestAndResponse {
    public stock_restricted_sharesResponse(){
    setInterfaceName("stock_restricted_shares");
    }

    public static stock_restricted_sharesResponse of(


    String p_dai4ma3,

    String p_ming2cheng1,

    LocalDate p_jie3jin4ri4qi1,

    Double p_jie3jin4shu4liang4wan4gu3,

    Double p_jie3jin4gu3liu2tong1shi4zhi2yi4yuan2,

    Double p_shang4shi4pi1ci4,

    LocalDate p_gong1gao4ri4qi1,


    Map.Entry
    <String
    , String>... others){
    stock_restricted_sharesResponse t = new stock_restricted_sharesResponse();


    t.p_dai4ma3 = p_dai4ma3;

    t.p_ming2cheng1 = p_ming2cheng1;

    t.p_jie3jin4ri4qi1 = p_jie3jin4ri4qi1;

    t.p_jie3jin4shu4liang4wan4gu3 = p_jie3jin4shu4liang4wan4gu3;

    t.p_jie3jin4gu3liu2tong1shi4zhi2yi4yuan2 = p_jie3jin4gu3liu2tong1shi4zhi2yi4yuan2;

    t.p_shang4shi4pi1ci4 = p_shang4shi4pi1ci4;

    t.p_gong1gao4ri4qi1 = p_gong1gao4ri4qi1;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 代码
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("代码")
    
    
    private String p_dai4ma3;

    public String getP_dai4ma3() { return this.p_dai4ma3;}
    public void setP_dai4ma3(String v) { this.p_dai4ma3 = v;}

    /**
    * name: 名称
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("名称")
    
    
    private String p_ming2cheng1;

    public String getP_ming2cheng1() { return this.p_ming2cheng1;}
    public void setP_ming2cheng1(String v) { this.p_ming2cheng1 = v;}

    /**
    * name: 解禁日期
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("解禁日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_jie3jin4ri4qi1;

    public LocalDate getP_jie3jin4ri4qi1() { return this.p_jie3jin4ri4qi1;}
    public void setP_jie3jin4ri4qi1(LocalDate v) { this.p_jie3jin4ri4qi1 = v;}

    /**
    * name: 解禁数量(万股)
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("解禁数量(万股)")
    
    
    private Double p_jie3jin4shu4liang4wan4gu3;

    public Double getP_jie3jin4shu4liang4wan4gu3() { return this.p_jie3jin4shu4liang4wan4gu3;}
    public void setP_jie3jin4shu4liang4wan4gu3(Double v) { this.p_jie3jin4shu4liang4wan4gu3 = v;}

    /**
    * name: 解禁股流通市值(亿元)
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("解禁股流通市值(亿元)")
    
    
    private Double p_jie3jin4gu3liu2tong1shi4zhi2yi4yuan2;

    public Double getP_jie3jin4gu3liu2tong1shi4zhi2yi4yuan2() { return this.p_jie3jin4gu3liu2tong1shi4zhi2yi4yuan2;}
    public void setP_jie3jin4gu3liu2tong1shi4zhi2yi4yuan2(Double v) { this.p_jie3jin4gu3liu2tong1shi4zhi2yi4yuan2 = v;}

    /**
    * name: 上市批次
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("上市批次")
    
    
    private Double p_shang4shi4pi1ci4;

    public Double getP_shang4shi4pi1ci4() { return this.p_shang4shi4pi1ci4;}
    public void setP_shang4shi4pi1ci4(Double v) { this.p_shang4shi4pi1ci4 = v;}

    /**
    * name: 公告日期
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("公告日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_gong1gao4ri4qi1;

    public LocalDate getP_gong1gao4ri4qi1() { return this.p_gong1gao4ri4qi1;}
    public void setP_gong1gao4ri4qi1(LocalDate v) { this.p_gong1gao4ri4qi1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
