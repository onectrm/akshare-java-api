
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
    * 接口: stock_fhps_em
    * 目标地址: http://data.eastmoney.com/yjfp/
    * 描述: 东方财富-数据中心-年报季报-分红配送
    * 限量: 单次获取指定日期的分红配送数据
    */
    public class stock_fhps_emResponse extends AkShareRequestAndResponse {
    public stock_fhps_emResponse(){
    setInterfaceName("stock_fhps_em");
    }

    public static stock_fhps_emResponse of(


    String p_dai4ma3,

    String p_ming2cheng1,

    Double p_song4zhuan3gu3fen4song4zhuan3zong3bi3li4,

    Double p_song4zhuan3gu3fen4song4zhuan3bi3li4,

    Double p_song4zhuan3gu3fen4zhuan3gu3bi3li4,

    Double p_xian4jin1fen1hong2xian4jin1fen1hong2bi3li4,

    Double p_xian4jin1fen1hong2gu3xi1lu4,

    Double p_mei3gu3shou1yi4,

    Double p_mei3gu3jing4zi1chan3,

    Double p_mei3gu3gong1ji1jin1,

    Double p_mei3gu3wei4fen1pei4li4run4,

    Double p_jing4li4run4tong2bi3zeng1zhang3,

    Integer p_zong3gu3ben3,

    String p_yu4an4gong1gao4ri4,

    String p_gu3quan2deng1ji4ri4,

    String p_chu2quan2chu2xi1ri4,

    String p_fang1an4jin4du4,

    LocalDate p_zui4xin1gong1gao4ri4qi1,


    Map.Entry
    <String
    , String>... others){
    stock_fhps_emResponse t = new stock_fhps_emResponse();


    t.p_dai4ma3 = p_dai4ma3;

    t.p_ming2cheng1 = p_ming2cheng1;

    t.p_song4zhuan3gu3fen4song4zhuan3zong3bi3li4 = p_song4zhuan3gu3fen4song4zhuan3zong3bi3li4;

    t.p_song4zhuan3gu3fen4song4zhuan3bi3li4 = p_song4zhuan3gu3fen4song4zhuan3bi3li4;

    t.p_song4zhuan3gu3fen4zhuan3gu3bi3li4 = p_song4zhuan3gu3fen4zhuan3gu3bi3li4;

    t.p_xian4jin1fen1hong2xian4jin1fen1hong2bi3li4 = p_xian4jin1fen1hong2xian4jin1fen1hong2bi3li4;

    t.p_xian4jin1fen1hong2gu3xi1lu4 = p_xian4jin1fen1hong2gu3xi1lu4;

    t.p_mei3gu3shou1yi4 = p_mei3gu3shou1yi4;

    t.p_mei3gu3jing4zi1chan3 = p_mei3gu3jing4zi1chan3;

    t.p_mei3gu3gong1ji1jin1 = p_mei3gu3gong1ji1jin1;

    t.p_mei3gu3wei4fen1pei4li4run4 = p_mei3gu3wei4fen1pei4li4run4;

    t.p_jing4li4run4tong2bi3zeng1zhang3 = p_jing4li4run4tong2bi3zeng1zhang3;

    t.p_zong3gu3ben3 = p_zong3gu3ben3;

    t.p_yu4an4gong1gao4ri4 = p_yu4an4gong1gao4ri4;

    t.p_gu3quan2deng1ji4ri4 = p_gu3quan2deng1ji4ri4;

    t.p_chu2quan2chu2xi1ri4 = p_chu2quan2chu2xi1ri4;

    t.p_fang1an4jin4du4 = p_fang1an4jin4du4;

    t.p_zui4xin1gong1gao4ri4qi1 = p_zui4xin1gong1gao4ri4qi1;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("代码")
    
    
    private String p_dai4ma3;

    public String getP_dai4ma3() { return this.p_dai4ma3;}
    public void setP_dai4ma3(String v) { this.p_dai4ma3 = v;}

    /**
    * name: 名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("名称")
    
    
    private String p_ming2cheng1;

    public String getP_ming2cheng1() { return this.p_ming2cheng1;}
    public void setP_ming2cheng1(String v) { this.p_ming2cheng1 = v;}

    /**
    * name: 送转股份-送转总比例
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("送转股份-送转总比例")
    
    
    private Double p_song4zhuan3gu3fen4song4zhuan3zong3bi3li4;

    public Double getP_song4zhuan3gu3fen4song4zhuan3zong3bi3li4() { return this.p_song4zhuan3gu3fen4song4zhuan3zong3bi3li4;}
    public void setP_song4zhuan3gu3fen4song4zhuan3zong3bi3li4(Double v) { this.p_song4zhuan3gu3fen4song4zhuan3zong3bi3li4 = v;}

    /**
    * name: 送转股份-送转比例
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("送转股份-送转比例")
    
    
    private Double p_song4zhuan3gu3fen4song4zhuan3bi3li4;

    public Double getP_song4zhuan3gu3fen4song4zhuan3bi3li4() { return this.p_song4zhuan3gu3fen4song4zhuan3bi3li4;}
    public void setP_song4zhuan3gu3fen4song4zhuan3bi3li4(Double v) { this.p_song4zhuan3gu3fen4song4zhuan3bi3li4 = v;}

    /**
    * name: 送转股份-转股比例
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("送转股份-转股比例")
    
    
    private Double p_song4zhuan3gu3fen4zhuan3gu3bi3li4;

    public Double getP_song4zhuan3gu3fen4zhuan3gu3bi3li4() { return this.p_song4zhuan3gu3fen4zhuan3gu3bi3li4;}
    public void setP_song4zhuan3gu3fen4zhuan3gu3bi3li4(Double v) { this.p_song4zhuan3gu3fen4zhuan3gu3bi3li4 = v;}

    /**
    * name: 现金分红-现金分红比例
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("现金分红-现金分红比例")
    
    
    private Double p_xian4jin1fen1hong2xian4jin1fen1hong2bi3li4;

    public Double getP_xian4jin1fen1hong2xian4jin1fen1hong2bi3li4() { return this.p_xian4jin1fen1hong2xian4jin1fen1hong2bi3li4;}
    public void setP_xian4jin1fen1hong2xian4jin1fen1hong2bi3li4(Double v) { this.p_xian4jin1fen1hong2xian4jin1fen1hong2bi3li4 = v;}

    /**
    * name: 现金分红-股息率
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("现金分红-股息率")
    
    
    private Double p_xian4jin1fen1hong2gu3xi1lu4;

    public Double getP_xian4jin1fen1hong2gu3xi1lu4() { return this.p_xian4jin1fen1hong2gu3xi1lu4;}
    public void setP_xian4jin1fen1hong2gu3xi1lu4(Double v) { this.p_xian4jin1fen1hong2gu3xi1lu4 = v;}

    /**
    * name: 每股收益
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("每股收益")
    
    
    private Double p_mei3gu3shou1yi4;

    public Double getP_mei3gu3shou1yi4() { return this.p_mei3gu3shou1yi4;}
    public void setP_mei3gu3shou1yi4(Double v) { this.p_mei3gu3shou1yi4 = v;}

    /**
    * name: 每股净资产
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("每股净资产")
    
    
    private Double p_mei3gu3jing4zi1chan3;

    public Double getP_mei3gu3jing4zi1chan3() { return this.p_mei3gu3jing4zi1chan3;}
    public void setP_mei3gu3jing4zi1chan3(Double v) { this.p_mei3gu3jing4zi1chan3 = v;}

    /**
    * name: 每股公积金
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("每股公积金")
    
    
    private Double p_mei3gu3gong1ji1jin1;

    public Double getP_mei3gu3gong1ji1jin1() { return this.p_mei3gu3gong1ji1jin1;}
    public void setP_mei3gu3gong1ji1jin1(Double v) { this.p_mei3gu3gong1ji1jin1 = v;}

    /**
    * name: 每股未分配利润
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("每股未分配利润")
    
    
    private Double p_mei3gu3wei4fen1pei4li4run4;

    public Double getP_mei3gu3wei4fen1pei4li4run4() { return this.p_mei3gu3wei4fen1pei4li4run4;}
    public void setP_mei3gu3wei4fen1pei4li4run4(Double v) { this.p_mei3gu3wei4fen1pei4li4run4 = v;}

    /**
    * name: 净利润同比增长
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("净利润同比增长")
    
    
    private Double p_jing4li4run4tong2bi3zeng1zhang3;

    public Double getP_jing4li4run4tong2bi3zeng1zhang3() { return this.p_jing4li4run4tong2bi3zeng1zhang3;}
    public void setP_jing4li4run4tong2bi3zeng1zhang3(Double v) { this.p_jing4li4run4tong2bi3zeng1zhang3 = v;}

    /**
    * name: 总股本
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("总股本")
    
    
    private Integer p_zong3gu3ben3;

    public Integer getP_zong3gu3ben3() { return this.p_zong3gu3ben3;}
    public void setP_zong3gu3ben3(Integer v) { this.p_zong3gu3ben3 = v;}

    /**
    * name: 预案公告日
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("预案公告日")
    
    
    private String p_yu4an4gong1gao4ri4;

    public String getP_yu4an4gong1gao4ri4() { return this.p_yu4an4gong1gao4ri4;}
    public void setP_yu4an4gong1gao4ri4(String v) { this.p_yu4an4gong1gao4ri4 = v;}

    /**
    * name: 股权登记日
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股权登记日")
    
    
    private String p_gu3quan2deng1ji4ri4;

    public String getP_gu3quan2deng1ji4ri4() { return this.p_gu3quan2deng1ji4ri4;}
    public void setP_gu3quan2deng1ji4ri4(String v) { this.p_gu3quan2deng1ji4ri4 = v;}

    /**
    * name: 除权除息日
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("除权除息日")
    
    
    private String p_chu2quan2chu2xi1ri4;

    public String getP_chu2quan2chu2xi1ri4() { return this.p_chu2quan2chu2xi1ri4;}
    public void setP_chu2quan2chu2xi1ri4(String v) { this.p_chu2quan2chu2xi1ri4 = v;}

    /**
    * name: 方案进度
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("方案进度")
    
    
    private String p_fang1an4jin4du4;

    public String getP_fang1an4jin4du4() { return this.p_fang1an4jin4du4;}
    public void setP_fang1an4jin4du4(String v) { this.p_fang1an4jin4du4 = v;}

    /**
    * name: 最新公告日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("最新公告日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_zui4xin1gong1gao4ri4qi1;

    public LocalDate getP_zui4xin1gong1gao4ri4qi1() { return this.p_zui4xin1gong1gao4ri4qi1;}
    public void setP_zui4xin1gong1gao4ri4qi1(LocalDate v) { this.p_zui4xin1gong1gao4ri4qi1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
