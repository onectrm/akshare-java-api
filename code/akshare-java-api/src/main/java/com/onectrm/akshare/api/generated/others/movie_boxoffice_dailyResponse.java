
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:50 CST 2022*/
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: others
    * 接口: movie_boxoffice_daily
    * 目标地址: https://www.endata.com.cn/BoxOffice/BO/Day/index.html
    * 描述: 指定日期的电影票房数据, 每日 10:30, 12:30更新日票房，16:30 同时补充前 7 日票房
    * 限量: 只能指定最近的日期
    */
    public class movie_boxoffice_dailyResponse extends AkShareRequestAndResponse {
    public movie_boxoffice_dailyResponse(){
    setInterfaceName("movie_boxoffice_daily");
    }

    public static movie_boxoffice_dailyResponse of(


    Double p_pai2xu4,

    Double p_ying3pian4ming2cheng1,

    Double p_dan1ri4piao4fang2,

    Double p_huan2bi3bian4hua4,

    Double p_lei3ji4piao4fang2,

    Double p_ping2jun1piao4jia4,

    Double p_chang3jun1ren2ci4,

    Double p_kou3bei1zhi3shu4,

    Double p_shang4ying4tian1shu4,


    Map.Entry
    <String
    , String>... others){
    movie_boxoffice_dailyResponse t = new movie_boxoffice_dailyResponse();


    t.p_pai2xu4 = p_pai2xu4;

    t.p_ying3pian4ming2cheng1 = p_ying3pian4ming2cheng1;

    t.p_dan1ri4piao4fang2 = p_dan1ri4piao4fang2;

    t.p_huan2bi3bian4hua4 = p_huan2bi3bian4hua4;

    t.p_lei3ji4piao4fang2 = p_lei3ji4piao4fang2;

    t.p_ping2jun1piao4jia4 = p_ping2jun1piao4jia4;

    t.p_chang3jun1ren2ci4 = p_chang3jun1ren2ci4;

    t.p_kou3bei1zhi3shu4 = p_kou3bei1zhi3shu4;

    t.p_shang4ying4tian1shu4 = p_shang4ying4tian1shu4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 排序
    * type: float
    * desc: 票房排名
    * required: Y
    */
    @JsonProperty("排序")
    
    
    private Double p_pai2xu4;

    public Double getP_pai2xu4() { return this.p_pai2xu4;}
    public void setP_pai2xu4(Double v) { this.p_pai2xu4 = v;}

    /**
    * name: 影片名称
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("影片名称")
    
    
    private Double p_ying3pian4ming2cheng1;

    public Double getP_ying3pian4ming2cheng1() { return this.p_ying3pian4ming2cheng1;}
    public void setP_ying3pian4ming2cheng1(Double v) { this.p_ying3pian4ming2cheng1 = v;}

    /**
    * name: 单日票房
    * type: float
    * desc: 注意单位: 万
    * required: Y
    */
    @JsonProperty("单日票房")
    
    
    private Double p_dan1ri4piao4fang2;

    public Double getP_dan1ri4piao4fang2() { return this.p_dan1ri4piao4fang2;}
    public void setP_dan1ri4piao4fang2(Double v) { this.p_dan1ri4piao4fang2 = v;}

    /**
    * name: 环比变化
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("环比变化")
    
    
    private Double p_huan2bi3bian4hua4;

    public Double getP_huan2bi3bian4hua4() { return this.p_huan2bi3bian4hua4;}
    public void setP_huan2bi3bian4hua4(Double v) { this.p_huan2bi3bian4hua4 = v;}

    /**
    * name: 累计票房
    * type: float
    * desc: 注意单位: 万
    * required: Y
    */
    @JsonProperty("累计票房")
    
    
    private Double p_lei3ji4piao4fang2;

    public Double getP_lei3ji4piao4fang2() { return this.p_lei3ji4piao4fang2;}
    public void setP_lei3ji4piao4fang2(Double v) { this.p_lei3ji4piao4fang2 = v;}

    /**
    * name: 平均票价
    * type: float
    * desc: 注意单位: 元
    * required: Y
    */
    @JsonProperty("平均票价")
    
    
    private Double p_ping2jun1piao4jia4;

    public Double getP_ping2jun1piao4jia4() { return this.p_ping2jun1piao4jia4;}
    public void setP_ping2jun1piao4jia4(Double v) { this.p_ping2jun1piao4jia4 = v;}

    /**
    * name: 场均人次
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("场均人次")
    
    
    private Double p_chang3jun1ren2ci4;

    public Double getP_chang3jun1ren2ci4() { return this.p_chang3jun1ren2ci4;}
    public void setP_chang3jun1ren2ci4(Double v) { this.p_chang3jun1ren2ci4 = v;}

    /**
    * name: 口碑指数
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("口碑指数")
    
    
    private Double p_kou3bei1zhi3shu4;

    public Double getP_kou3bei1zhi3shu4() { return this.p_kou3bei1zhi3shu4;}
    public void setP_kou3bei1zhi3shu4(Double v) { this.p_kou3bei1zhi3shu4 = v;}

    /**
    * name: 上映天数
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("上映天数")
    
    
    private Double p_shang4ying4tian1shu4;

    public Double getP_shang4ying4tian1shu4() { return this.p_shang4ying4tian1shu4;}
    public void setP_shang4ying4tian1shu4(Double v) { this.p_shang4ying4tian1shu4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
