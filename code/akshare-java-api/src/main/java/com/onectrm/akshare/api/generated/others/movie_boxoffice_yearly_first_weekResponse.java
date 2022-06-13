
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
    * 接口: movie_boxoffice_yearly_first_week
    * 目标地址: https://www.endata.com.cn/BoxOffice/BO/Year/firstWeek.html
    * 描述: 指定日期所在年度的年度首周票房数据
    * 限量: 指定日期所在年度的年度首周票房数据, 只能获取最近年度的数据
    */
    public class movie_boxoffice_yearly_first_weekResponse extends AkShareRequestAndResponse {
    public movie_boxoffice_yearly_first_weekResponse(){
    setInterfaceName("movie_boxoffice_yearly_first_week");
    }

    public static movie_boxoffice_yearly_first_weekResponse of(


    Double p_pai2xu4,

    Double p_ying3pian4ming2cheng1,

    Double p_lei4xing2,

    Double p_shou3zhou1piao4fang2,

    Double p_zhan4zong3piao4fang2bi3zhong4,

    Double p_chang3jun1ren2ci4,

    Double p_guo2jia1ji2di4qu1,

    Double p_shang4ying4ri4qi1,

    Double p_shou3zhou1tian1shu4,


    Map.Entry
    <String
    , String>... others){
    movie_boxoffice_yearly_first_weekResponse t = new movie_boxoffice_yearly_first_weekResponse();


    t.p_pai2xu4 = p_pai2xu4;

    t.p_ying3pian4ming2cheng1 = p_ying3pian4ming2cheng1;

    t.p_lei4xing2 = p_lei4xing2;

    t.p_shou3zhou1piao4fang2 = p_shou3zhou1piao4fang2;

    t.p_zhan4zong3piao4fang2bi3zhong4 = p_zhan4zong3piao4fang2bi3zhong4;

    t.p_chang3jun1ren2ci4 = p_chang3jun1ren2ci4;

    t.p_guo2jia1ji2di4qu1 = p_guo2jia1ji2di4qu1;

    t.p_shang4ying4ri4qi1 = p_shang4ying4ri4qi1;

    t.p_shou3zhou1tian1shu4 = p_shou3zhou1tian1shu4;


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
    * name: 类型
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("类型")
    
    
    private Double p_lei4xing2;

    public Double getP_lei4xing2() { return this.p_lei4xing2;}
    public void setP_lei4xing2(Double v) { this.p_lei4xing2 = v;}

    /**
    * name: 首周票房
    * type: float
    * desc: 注意单位: 万
    * required: Y
    */
    @JsonProperty("首周票房")
    
    
    private Double p_shou3zhou1piao4fang2;

    public Double getP_shou3zhou1piao4fang2() { return this.p_shou3zhou1piao4fang2;}
    public void setP_shou3zhou1piao4fang2(Double v) { this.p_shou3zhou1piao4fang2 = v;}

    /**
    * name: 占总票房比重
    * type: float
    * desc: 注意单位: %
    * required: Y
    */
    @JsonProperty("占总票房比重")
    
    
    private Double p_zhan4zong3piao4fang2bi3zhong4;

    public Double getP_zhan4zong3piao4fang2bi3zhong4() { return this.p_zhan4zong3piao4fang2bi3zhong4;}
    public void setP_zhan4zong3piao4fang2bi3zhong4(Double v) { this.p_zhan4zong3piao4fang2bi3zhong4 = v;}

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
    * name: 国家及地区
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("国家及地区")
    
    
    private Double p_guo2jia1ji2di4qu1;

    public Double getP_guo2jia1ji2di4qu1() { return this.p_guo2jia1ji2di4qu1;}
    public void setP_guo2jia1ji2di4qu1(Double v) { this.p_guo2jia1ji2di4qu1 = v;}

    /**
    * name: 上映日期
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("上映日期")
    
    
    private Double p_shang4ying4ri4qi1;

    public Double getP_shang4ying4ri4qi1() { return this.p_shang4ying4ri4qi1;}
    public void setP_shang4ying4ri4qi1(Double v) { this.p_shang4ying4ri4qi1 = v;}

    /**
    * name: 首周天数
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("首周天数")
    
    
    private Double p_shou3zhou1tian1shu4;

    public Double getP_shou3zhou1tian1shu4() { return this.p_shou3zhou1tian1shu4;}
    public void setP_shou3zhou1tian1shu4(Double v) { this.p_shou3zhou1tian1shu4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
