
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.bond;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: bond
    * 接口: bond_china_close_return
    * 目标地址: http://www.chinamoney.com.cn/chinese/bkcurvclosedyhis/?bondType=CYCC000&amp;reference=1
    * 描述: 收盘收益率曲线历史数据, 该接口只能获取近 3 个月的数据，且每次获取的数据不超过 1 个月
    * 限量: 返回所有交易日的数据
    */
    public class bond_china_close_returnResponse extends AkShareRequestAndResponse {
    public bond_china_close_returnResponse(){
    setInterfaceName("bond_china_close_return");
    }

    public static bond_china_close_returnResponse of(


    LocalDate p_ri4qi1,

    Double p_zhong1guo2guo2zhai4shou1yi4lu42nian2,

    Double p_zhong1guo2guo2zhai4shou1yi4lu45nian2,

    Double p_zhong1guo2guo2zhai4shou1yi4lu410nian2,

    Double p_zhong1guo2guo2zhai4shou1yi4lu430nian2,

    Double p_zhong1guo2guo2zhai4shou1yi4lu410nian22nian2,

    Double p_zhong1guo2GDPnian2zeng1lu4,

    Double p_mei3guo2guo2zhai4shou1yi4lu42nian2,

    Double p_mei3guo2guo2zhai4shou1yi4lu45nian2,

    Double p_mei3guo2guo2zhai4shou1yi4lu410nian2,

    Double p_mei3guo2guo2zhai4shou1yi4lu430nian2,

    Double p_mei3guo2guo2zhai4shou1yi4lu410nian22nian2,

    Double p_mei3guo2GDPnian2zeng1lu4,


    Map.Entry
    <String
    , String>... others){
    bond_china_close_returnResponse t = new bond_china_close_returnResponse();


    t.p_ri4qi1 = p_ri4qi1;

    t.p_zhong1guo2guo2zhai4shou1yi4lu42nian2 = p_zhong1guo2guo2zhai4shou1yi4lu42nian2;

    t.p_zhong1guo2guo2zhai4shou1yi4lu45nian2 = p_zhong1guo2guo2zhai4shou1yi4lu45nian2;

    t.p_zhong1guo2guo2zhai4shou1yi4lu410nian2 = p_zhong1guo2guo2zhai4shou1yi4lu410nian2;

    t.p_zhong1guo2guo2zhai4shou1yi4lu430nian2 = p_zhong1guo2guo2zhai4shou1yi4lu430nian2;

    t.p_zhong1guo2guo2zhai4shou1yi4lu410nian22nian2 = p_zhong1guo2guo2zhai4shou1yi4lu410nian22nian2;

    t.p_zhong1guo2GDPnian2zeng1lu4 = p_zhong1guo2GDPnian2zeng1lu4;

    t.p_mei3guo2guo2zhai4shou1yi4lu42nian2 = p_mei3guo2guo2zhai4shou1yi4lu42nian2;

    t.p_mei3guo2guo2zhai4shou1yi4lu45nian2 = p_mei3guo2guo2zhai4shou1yi4lu45nian2;

    t.p_mei3guo2guo2zhai4shou1yi4lu410nian2 = p_mei3guo2guo2zhai4shou1yi4lu410nian2;

    t.p_mei3guo2guo2zhai4shou1yi4lu430nian2 = p_mei3guo2guo2zhai4shou1yi4lu430nian2;

    t.p_mei3guo2guo2zhai4shou1yi4lu410nian22nian2 = p_mei3guo2guo2zhai4shou1yi4lu410nian22nian2;

    t.p_mei3guo2GDPnian2zeng1lu4 = p_mei3guo2GDPnian2zeng1lu4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_ri4qi1;

    public LocalDate getP_ri4qi1() { return this.p_ri4qi1;}
    public void setP_ri4qi1(LocalDate v) { this.p_ri4qi1 = v;}

    /**
    * name: 中国国债收益率2年
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("中国国债收益率2年")
    
    
    private Double p_zhong1guo2guo2zhai4shou1yi4lu42nian2;

    public Double getP_zhong1guo2guo2zhai4shou1yi4lu42nian2() { return this.p_zhong1guo2guo2zhai4shou1yi4lu42nian2;}
    public void setP_zhong1guo2guo2zhai4shou1yi4lu42nian2(Double v) { this.p_zhong1guo2guo2zhai4shou1yi4lu42nian2 = v;}

    /**
    * name: 中国国债收益率5年
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("中国国债收益率5年")
    
    
    private Double p_zhong1guo2guo2zhai4shou1yi4lu45nian2;

    public Double getP_zhong1guo2guo2zhai4shou1yi4lu45nian2() { return this.p_zhong1guo2guo2zhai4shou1yi4lu45nian2;}
    public void setP_zhong1guo2guo2zhai4shou1yi4lu45nian2(Double v) { this.p_zhong1guo2guo2zhai4shou1yi4lu45nian2 = v;}

    /**
    * name: 中国国债收益率10年
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("中国国债收益率10年")
    
    
    private Double p_zhong1guo2guo2zhai4shou1yi4lu410nian2;

    public Double getP_zhong1guo2guo2zhai4shou1yi4lu410nian2() { return this.p_zhong1guo2guo2zhai4shou1yi4lu410nian2;}
    public void setP_zhong1guo2guo2zhai4shou1yi4lu410nian2(Double v) { this.p_zhong1guo2guo2zhai4shou1yi4lu410nian2 = v;}

    /**
    * name: 中国国债收益率30年
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("中国国债收益率30年")
    
    
    private Double p_zhong1guo2guo2zhai4shou1yi4lu430nian2;

    public Double getP_zhong1guo2guo2zhai4shou1yi4lu430nian2() { return this.p_zhong1guo2guo2zhai4shou1yi4lu430nian2;}
    public void setP_zhong1guo2guo2zhai4shou1yi4lu430nian2(Double v) { this.p_zhong1guo2guo2zhai4shou1yi4lu430nian2 = v;}

    /**
    * name: 中国国债收益率10年-2年
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("中国国债收益率10年-2年")
    
    
    private Double p_zhong1guo2guo2zhai4shou1yi4lu410nian22nian2;

    public Double getP_zhong1guo2guo2zhai4shou1yi4lu410nian22nian2() { return this.p_zhong1guo2guo2zhai4shou1yi4lu410nian22nian2;}
    public void setP_zhong1guo2guo2zhai4shou1yi4lu410nian22nian2(Double v) { this.p_zhong1guo2guo2zhai4shou1yi4lu410nian22nian2 = v;}

    /**
    * name: 中国GDP年增率
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("中国GDP年增率")
    
    
    private Double p_zhong1guo2GDPnian2zeng1lu4;

    public Double getP_zhong1guo2GDPnian2zeng1lu4() { return this.p_zhong1guo2GDPnian2zeng1lu4;}
    public void setP_zhong1guo2GDPnian2zeng1lu4(Double v) { this.p_zhong1guo2GDPnian2zeng1lu4 = v;}

    /**
    * name: 美国国债收益率2年
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("美国国债收益率2年")
    
    
    private Double p_mei3guo2guo2zhai4shou1yi4lu42nian2;

    public Double getP_mei3guo2guo2zhai4shou1yi4lu42nian2() { return this.p_mei3guo2guo2zhai4shou1yi4lu42nian2;}
    public void setP_mei3guo2guo2zhai4shou1yi4lu42nian2(Double v) { this.p_mei3guo2guo2zhai4shou1yi4lu42nian2 = v;}

    /**
    * name: 美国国债收益率5年
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("美国国债收益率5年")
    
    
    private Double p_mei3guo2guo2zhai4shou1yi4lu45nian2;

    public Double getP_mei3guo2guo2zhai4shou1yi4lu45nian2() { return this.p_mei3guo2guo2zhai4shou1yi4lu45nian2;}
    public void setP_mei3guo2guo2zhai4shou1yi4lu45nian2(Double v) { this.p_mei3guo2guo2zhai4shou1yi4lu45nian2 = v;}

    /**
    * name: 美国国债收益率10年
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("美国国债收益率10年")
    
    
    private Double p_mei3guo2guo2zhai4shou1yi4lu410nian2;

    public Double getP_mei3guo2guo2zhai4shou1yi4lu410nian2() { return this.p_mei3guo2guo2zhai4shou1yi4lu410nian2;}
    public void setP_mei3guo2guo2zhai4shou1yi4lu410nian2(Double v) { this.p_mei3guo2guo2zhai4shou1yi4lu410nian2 = v;}

    /**
    * name: 美国国债收益率30年
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("美国国债收益率30年")
    
    
    private Double p_mei3guo2guo2zhai4shou1yi4lu430nian2;

    public Double getP_mei3guo2guo2zhai4shou1yi4lu430nian2() { return this.p_mei3guo2guo2zhai4shou1yi4lu430nian2;}
    public void setP_mei3guo2guo2zhai4shou1yi4lu430nian2(Double v) { this.p_mei3guo2guo2zhai4shou1yi4lu430nian2 = v;}

    /**
    * name: 美国国债收益率10年-2年
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("美国国债收益率10年-2年")
    
    
    private Double p_mei3guo2guo2zhai4shou1yi4lu410nian22nian2;

    public Double getP_mei3guo2guo2zhai4shou1yi4lu410nian22nian2() { return this.p_mei3guo2guo2zhai4shou1yi4lu410nian22nian2;}
    public void setP_mei3guo2guo2zhai4shou1yi4lu410nian22nian2(Double v) { this.p_mei3guo2guo2zhai4shou1yi4lu410nian22nian2 = v;}

    /**
    * name: 美国GDP年增率
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("美国GDP年增率")
    
    
    private Double p_mei3guo2GDPnian2zeng1lu4;

    public Double getP_mei3guo2GDPnian2zeng1lu4() { return this.p_mei3guo2GDPnian2zeng1lu4;}
    public void setP_mei3guo2GDPnian2zeng1lu4(Double v) { this.p_mei3guo2GDPnian2zeng1lu4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
