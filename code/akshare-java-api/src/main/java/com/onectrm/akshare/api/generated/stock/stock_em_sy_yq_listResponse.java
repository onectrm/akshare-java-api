
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
    * 接口: stock_em_sy_yq_list
    * 目标地址: http://data.eastmoney.com/sy/yqlist.html
    * 描述: 获取东方财富网-数据中心-特色数据-商誉-商誉减值预期明细
    * 限量: 单次所有历史数据, 由于数据量比较大需要等待一定时间
    */
    public class stock_em_sy_yq_listResponse extends AkShareRequestAndResponse {
    public stock_em_sy_yq_listResponse(){
    setInterfaceName("stock_em_sy_yq_list");
    }

    public static stock_em_sy_yq_listResponse of(


    String p_gu3piao4dai4ma3,

    Double p_gong1si1ming2cheng1,

    Double p_zui4xin1yi1qi1shang1yu4yuan2,

    Double p_gong1gao4ri4qi1,

    Double p_yu4ji4jing4li4run4yuan2xia4xian4,

    Double p_yu4ji4jing4li4run4yuan2shang4xian4,

    Double p_ye4ji4bian4dong4fu2du4shang4xian4,

    Double p_ye4ji4bian4dong4fu2du4xia4xian4,

    Double p_yu4gao4nei4rong2,

    Double p_ye4ji4bian4dong4yuan2yin1,

    Double p_shang4nian2du4tong2qi1jing4li4run4yuan2,

    Double p_shang4nian2shang1yu4,

    LocalDate p_shang1yu4bao4gao4ri4qi1,


    Map.Entry
    <String
    , String>... others){
    stock_em_sy_yq_listResponse t = new stock_em_sy_yq_listResponse();


    t.p_gu3piao4dai4ma3 = p_gu3piao4dai4ma3;

    t.p_gong1si1ming2cheng1 = p_gong1si1ming2cheng1;

    t.p_zui4xin1yi1qi1shang1yu4yuan2 = p_zui4xin1yi1qi1shang1yu4yuan2;

    t.p_gong1gao4ri4qi1 = p_gong1gao4ri4qi1;

    t.p_yu4ji4jing4li4run4yuan2xia4xian4 = p_yu4ji4jing4li4run4yuan2xia4xian4;

    t.p_yu4ji4jing4li4run4yuan2shang4xian4 = p_yu4ji4jing4li4run4yuan2shang4xian4;

    t.p_ye4ji4bian4dong4fu2du4shang4xian4 = p_ye4ji4bian4dong4fu2du4shang4xian4;

    t.p_ye4ji4bian4dong4fu2du4xia4xian4 = p_ye4ji4bian4dong4fu2du4xia4xian4;

    t.p_yu4gao4nei4rong2 = p_yu4gao4nei4rong2;

    t.p_ye4ji4bian4dong4yuan2yin1 = p_ye4ji4bian4dong4yuan2yin1;

    t.p_shang4nian2du4tong2qi1jing4li4run4yuan2 = p_shang4nian2du4tong2qi1jing4li4run4yuan2;

    t.p_shang4nian2shang1yu4 = p_shang4nian2shang1yu4;

    t.p_shang1yu4bao4gao4ri4qi1 = p_shang1yu4bao4gao4ri4qi1;


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
    * name: 公司名称
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("公司名称")
    
    
    private Double p_gong1si1ming2cheng1;

    public Double getP_gong1si1ming2cheng1() { return this.p_gong1si1ming2cheng1;}
    public void setP_gong1si1ming2cheng1(Double v) { this.p_gong1si1ming2cheng1 = v;}

    /**
    * name: 最新一期商誉(元)
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("最新一期商誉(元)")
    
    
    private Double p_zui4xin1yi1qi1shang1yu4yuan2;

    public Double getP_zui4xin1yi1qi1shang1yu4yuan2() { return this.p_zui4xin1yi1qi1shang1yu4yuan2;}
    public void setP_zui4xin1yi1qi1shang1yu4yuan2(Double v) { this.p_zui4xin1yi1qi1shang1yu4yuan2 = v;}

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

    /**
    * name: 预计净利润(元)-下限
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("预计净利润(元)-下限")
    
    
    private Double p_yu4ji4jing4li4run4yuan2xia4xian4;

    public Double getP_yu4ji4jing4li4run4yuan2xia4xian4() { return this.p_yu4ji4jing4li4run4yuan2xia4xian4;}
    public void setP_yu4ji4jing4li4run4yuan2xia4xian4(Double v) { this.p_yu4ji4jing4li4run4yuan2xia4xian4 = v;}

    /**
    * name: 预计净利润(元)-上限
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("预计净利润(元)-上限")
    
    
    private Double p_yu4ji4jing4li4run4yuan2shang4xian4;

    public Double getP_yu4ji4jing4li4run4yuan2shang4xian4() { return this.p_yu4ji4jing4li4run4yuan2shang4xian4;}
    public void setP_yu4ji4jing4li4run4yuan2shang4xian4(Double v) { this.p_yu4ji4jing4li4run4yuan2shang4xian4 = v;}

    /**
    * name: 业绩变动幅度-上限
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("业绩变动幅度-上限")
    
    
    private Double p_ye4ji4bian4dong4fu2du4shang4xian4;

    public Double getP_ye4ji4bian4dong4fu2du4shang4xian4() { return this.p_ye4ji4bian4dong4fu2du4shang4xian4;}
    public void setP_ye4ji4bian4dong4fu2du4shang4xian4(Double v) { this.p_ye4ji4bian4dong4fu2du4shang4xian4 = v;}

    /**
    * name: 业绩变动幅度-下限
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("业绩变动幅度-下限")
    
    
    private Double p_ye4ji4bian4dong4fu2du4xia4xian4;

    public Double getP_ye4ji4bian4dong4fu2du4xia4xian4() { return this.p_ye4ji4bian4dong4fu2du4xia4xian4;}
    public void setP_ye4ji4bian4dong4fu2du4xia4xian4(Double v) { this.p_ye4ji4bian4dong4fu2du4xia4xian4 = v;}

    /**
    * name: 预告内容
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("预告内容")
    
    
    private Double p_yu4gao4nei4rong2;

    public Double getP_yu4gao4nei4rong2() { return this.p_yu4gao4nei4rong2;}
    public void setP_yu4gao4nei4rong2(Double v) { this.p_yu4gao4nei4rong2 = v;}

    /**
    * name: 业绩变动原因
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("业绩变动原因")
    
    
    private Double p_ye4ji4bian4dong4yuan2yin1;

    public Double getP_ye4ji4bian4dong4yuan2yin1() { return this.p_ye4ji4bian4dong4yuan2yin1;}
    public void setP_ye4ji4bian4dong4yuan2yin1(Double v) { this.p_ye4ji4bian4dong4yuan2yin1 = v;}

    /**
    * name: 上年度同期净利润(元)
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("上年度同期净利润(元)")
    
    
    private Double p_shang4nian2du4tong2qi1jing4li4run4yuan2;

    public Double getP_shang4nian2du4tong2qi1jing4li4run4yuan2() { return this.p_shang4nian2du4tong2qi1jing4li4run4yuan2;}
    public void setP_shang4nian2du4tong2qi1jing4li4run4yuan2(Double v) { this.p_shang4nian2du4tong2qi1jing4li4run4yuan2 = v;}

    /**
    * name: 上年商誉
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("上年商誉")
    
    
    private Double p_shang4nian2shang1yu4;

    public Double getP_shang4nian2shang1yu4() { return this.p_shang4nian2shang1yu4;}
    public void setP_shang4nian2shang1yu4(Double v) { this.p_shang4nian2shang1yu4 = v;}

    /**
    * name: 商誉报告日期
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("商誉报告日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_shang1yu4bao4gao4ri4qi1;

    public LocalDate getP_shang1yu4bao4gao4ri4qi1() { return this.p_shang1yu4bao4gao4ri4qi1;}
    public void setP_shang1yu4bao4gao4ri4qi1(LocalDate v) { this.p_shang1yu4bao4gao4ri4qi1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
