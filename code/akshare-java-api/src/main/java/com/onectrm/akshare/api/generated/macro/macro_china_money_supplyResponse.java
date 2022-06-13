
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
    * 接口: macro_china_money_supply
    * 目标地址: http://data.eastmoney.com/cjsj/hbgyl.html
    * 描述: 东方财富-经济数据-中国宏观-中国货币供应量; 数据区间从 200801 至今, 月度数据
    * 限量: 单次返回所有历史数据
    */
    public class macro_china_money_supplyResponse extends AkShareRequestAndResponse {
    public macro_china_money_supplyResponse(){
    setInterfaceName("macro_china_money_supply");
    }

    public static macro_china_money_supplyResponse of(


    String p_yue4fen4,

    Double p_huo4bi4he2zhun3huo4bi4M2shu4liang4yi4yuan2,

    Double p_huo4bi4he2zhun3huo4bi4M2tong2bi3zeng1zhang3,

    Double p_huo4bi4he2zhun3huo4bi4M2huan2bi3zeng1zhang3,

    Double p_huo4bi4M1shu4liang4yi4yuan2,

    Double p_huo4bi4M1tong2bi3zeng1zhang3,

    Double p_huo4bi4M1huan2bi3zeng1zhang3,

    Double p_liu2tong1zhong1de5xian4jin1M0shu4liang4yi4yuan2,

    Double p_liu2tong1zhong1de5xian4jin1M0tong2bi3zeng1zhang3,

    Double p_liu2tong1zhong1de5xian4jin1M0huan2bi3zeng1zhang3,


    Map.Entry
    <String
    , String>... others){
    macro_china_money_supplyResponse t = new macro_china_money_supplyResponse();


    t.p_yue4fen4 = p_yue4fen4;

    t.p_huo4bi4he2zhun3huo4bi4M2shu4liang4yi4yuan2 = p_huo4bi4he2zhun3huo4bi4M2shu4liang4yi4yuan2;

    t.p_huo4bi4he2zhun3huo4bi4M2tong2bi3zeng1zhang3 = p_huo4bi4he2zhun3huo4bi4M2tong2bi3zeng1zhang3;

    t.p_huo4bi4he2zhun3huo4bi4M2huan2bi3zeng1zhang3 = p_huo4bi4he2zhun3huo4bi4M2huan2bi3zeng1zhang3;

    t.p_huo4bi4M1shu4liang4yi4yuan2 = p_huo4bi4M1shu4liang4yi4yuan2;

    t.p_huo4bi4M1tong2bi3zeng1zhang3 = p_huo4bi4M1tong2bi3zeng1zhang3;

    t.p_huo4bi4M1huan2bi3zeng1zhang3 = p_huo4bi4M1huan2bi3zeng1zhang3;

    t.p_liu2tong1zhong1de5xian4jin1M0shu4liang4yi4yuan2 = p_liu2tong1zhong1de5xian4jin1M0shu4liang4yi4yuan2;

    t.p_liu2tong1zhong1de5xian4jin1M0tong2bi3zeng1zhang3 = p_liu2tong1zhong1de5xian4jin1M0tong2bi3zeng1zhang3;

    t.p_liu2tong1zhong1de5xian4jin1M0huan2bi3zeng1zhang3 = p_liu2tong1zhong1de5xian4jin1M0huan2bi3zeng1zhang3;


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
    * desc: 年度和月份
    * required: 
    */
    @JsonProperty("月份")
    
    
    private String p_yue4fen4;

    public String getP_yue4fen4() { return this.p_yue4fen4;}
    public void setP_yue4fen4(String v) { this.p_yue4fen4 = v;}

    /**
    * name: 货币和准货币(M2)数量(亿元)
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("货币和准货币(M2)数量(亿元)")
    
    
    private Double p_huo4bi4he2zhun3huo4bi4M2shu4liang4yi4yuan2;

    public Double getP_huo4bi4he2zhun3huo4bi4M2shu4liang4yi4yuan2() { return this.p_huo4bi4he2zhun3huo4bi4M2shu4liang4yi4yuan2;}
    public void setP_huo4bi4he2zhun3huo4bi4M2shu4liang4yi4yuan2(Double v) { this.p_huo4bi4he2zhun3huo4bi4M2shu4liang4yi4yuan2 = v;}

    /**
    * name: 货币和准货币(M2)同比增长
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("货币和准货币(M2)同比增长")
    
    
    private Double p_huo4bi4he2zhun3huo4bi4M2tong2bi3zeng1zhang3;

    public Double getP_huo4bi4he2zhun3huo4bi4M2tong2bi3zeng1zhang3() { return this.p_huo4bi4he2zhun3huo4bi4M2tong2bi3zeng1zhang3;}
    public void setP_huo4bi4he2zhun3huo4bi4M2tong2bi3zeng1zhang3(Double v) { this.p_huo4bi4he2zhun3huo4bi4M2tong2bi3zeng1zhang3 = v;}

    /**
    * name: 货币和准货币(M2)环比增长
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("货币和准货币(M2)环比增长")
    
    
    private Double p_huo4bi4he2zhun3huo4bi4M2huan2bi3zeng1zhang3;

    public Double getP_huo4bi4he2zhun3huo4bi4M2huan2bi3zeng1zhang3() { return this.p_huo4bi4he2zhun3huo4bi4M2huan2bi3zeng1zhang3;}
    public void setP_huo4bi4he2zhun3huo4bi4M2huan2bi3zeng1zhang3(Double v) { this.p_huo4bi4he2zhun3huo4bi4M2huan2bi3zeng1zhang3 = v;}

    /**
    * name: 货币(M1)数量(亿元)
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("货币(M1)数量(亿元)")
    
    
    private Double p_huo4bi4M1shu4liang4yi4yuan2;

    public Double getP_huo4bi4M1shu4liang4yi4yuan2() { return this.p_huo4bi4M1shu4liang4yi4yuan2;}
    public void setP_huo4bi4M1shu4liang4yi4yuan2(Double v) { this.p_huo4bi4M1shu4liang4yi4yuan2 = v;}

    /**
    * name: 货币(M1)同比增长
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("货币(M1)同比增长")
    
    
    private Double p_huo4bi4M1tong2bi3zeng1zhang3;

    public Double getP_huo4bi4M1tong2bi3zeng1zhang3() { return this.p_huo4bi4M1tong2bi3zeng1zhang3;}
    public void setP_huo4bi4M1tong2bi3zeng1zhang3(Double v) { this.p_huo4bi4M1tong2bi3zeng1zhang3 = v;}

    /**
    * name: 货币(M1)环比增长
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("货币(M1)环比增长")
    
    
    private Double p_huo4bi4M1huan2bi3zeng1zhang3;

    public Double getP_huo4bi4M1huan2bi3zeng1zhang3() { return this.p_huo4bi4M1huan2bi3zeng1zhang3;}
    public void setP_huo4bi4M1huan2bi3zeng1zhang3(Double v) { this.p_huo4bi4M1huan2bi3zeng1zhang3 = v;}

    /**
    * name: 流通中的现金(M0)数量(亿元)
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("流通中的现金(M0)数量(亿元)")
    
    
    private Double p_liu2tong1zhong1de5xian4jin1M0shu4liang4yi4yuan2;

    public Double getP_liu2tong1zhong1de5xian4jin1M0shu4liang4yi4yuan2() { return this.p_liu2tong1zhong1de5xian4jin1M0shu4liang4yi4yuan2;}
    public void setP_liu2tong1zhong1de5xian4jin1M0shu4liang4yi4yuan2(Double v) { this.p_liu2tong1zhong1de5xian4jin1M0shu4liang4yi4yuan2 = v;}

    /**
    * name: 流通中的现金(M0)同比增长
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("流通中的现金(M0)同比增长")
    
    
    private Double p_liu2tong1zhong1de5xian4jin1M0tong2bi3zeng1zhang3;

    public Double getP_liu2tong1zhong1de5xian4jin1M0tong2bi3zeng1zhang3() { return this.p_liu2tong1zhong1de5xian4jin1M0tong2bi3zeng1zhang3;}
    public void setP_liu2tong1zhong1de5xian4jin1M0tong2bi3zeng1zhang3(Double v) { this.p_liu2tong1zhong1de5xian4jin1M0tong2bi3zeng1zhang3 = v;}

    /**
    * name: 流通中的现金(M0)环比增长
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("流通中的现金(M0)环比增长")
    
    
    private Double p_liu2tong1zhong1de5xian4jin1M0huan2bi3zeng1zhang3;

    public Double getP_liu2tong1zhong1de5xian4jin1M0huan2bi3zeng1zhang3() { return this.p_liu2tong1zhong1de5xian4jin1M0huan2bi3zeng1zhang3;}
    public void setP_liu2tong1zhong1de5xian4jin1M0huan2bi3zeng1zhang3(Double v) { this.p_liu2tong1zhong1de5xian4jin1M0huan2bi3zeng1zhang3 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
