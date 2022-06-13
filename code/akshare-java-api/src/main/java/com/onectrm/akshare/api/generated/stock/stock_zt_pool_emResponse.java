
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
    * 接口: stock_zt_pool_em
    * 目标地址: http://quote.eastmoney.com/ztb/detail#type=ztgc
    * 描述: 东方财富网-行情中心-涨停板行情-涨停股池
    * 限量: 单次返回所有涨停股池数据
    */
    public class stock_zt_pool_emResponse extends AkShareRequestAndResponse {
    public stock_zt_pool_emResponse(){
    setInterfaceName("stock_zt_pool_em");
    }

    public static stock_zt_pool_emResponse of(


    Integer p_xu4hao4,

    String p_dai4ma3,

    String p_ming2cheng1,

    Double p_zhang3die1fu2,

    Double p_zui4xin1jia4,

    Integer p_cheng2jiao1e2,

    Double p_liu2tong1shi4zhi2,

    Double p_zong3shi4zhi2,

    Double p_huan4shou3lu4,

    Integer p_feng1ban3zi1jin1,

    LocalDateTime p_shou3ci4feng1ban3shi2jian1,

    LocalDateTime p_zui4hou4feng1ban3shi2jian1,

    Integer p_zha4ban3ci4shu4,

    String p_zhang3ting2tong3ji4,

    Integer p_lian2ban3shu4,

    String p_suo3shu3xing2ye4,


    Map.Entry
    <String
    , String>... others){
    stock_zt_pool_emResponse t = new stock_zt_pool_emResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_dai4ma3 = p_dai4ma3;

    t.p_ming2cheng1 = p_ming2cheng1;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_zui4xin1jia4 = p_zui4xin1jia4;

    t.p_cheng2jiao1e2 = p_cheng2jiao1e2;

    t.p_liu2tong1shi4zhi2 = p_liu2tong1shi4zhi2;

    t.p_zong3shi4zhi2 = p_zong3shi4zhi2;

    t.p_huan4shou3lu4 = p_huan4shou3lu4;

    t.p_feng1ban3zi1jin1 = p_feng1ban3zi1jin1;

    t.p_shou3ci4feng1ban3shi2jian1 = p_shou3ci4feng1ban3shi2jian1;

    t.p_zui4hou4feng1ban3shi2jian1 = p_zui4hou4feng1ban3shi2jian1;

    t.p_zha4ban3ci4shu4 = p_zha4ban3ci4shu4;

    t.p_zhang3ting2tong3ji4 = p_zhang3ting2tong3ji4;

    t.p_lian2ban3shu4 = p_lian2ban3shu4;

    t.p_suo3shu3xing2ye4 = p_suo3shu3xing2ye4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 序号
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("序号")
    
    
    private Integer p_xu4hao4;

    public Integer getP_xu4hao4() { return this.p_xu4hao4;}
    public void setP_xu4hao4(Integer v) { this.p_xu4hao4 = v;}

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
    * name: 涨跌幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("涨跌幅")
    
    
    private Double p_zhang3die1fu2;

    public Double getP_zhang3die1fu2() { return this.p_zhang3die1fu2;}
    public void setP_zhang3die1fu2(Double v) { this.p_zhang3die1fu2 = v;}

    /**
    * name: 最新价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("最新价")
    
    
    private Double p_zui4xin1jia4;

    public Double getP_zui4xin1jia4() { return this.p_zui4xin1jia4;}
    public void setP_zui4xin1jia4(Double v) { this.p_zui4xin1jia4 = v;}

    /**
    * name: 成交额
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("成交额")
    
    
    private Integer p_cheng2jiao1e2;

    public Integer getP_cheng2jiao1e2() { return this.p_cheng2jiao1e2;}
    public void setP_cheng2jiao1e2(Integer v) { this.p_cheng2jiao1e2 = v;}

    /**
    * name: 流通市值
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("流通市值")
    
    
    private Double p_liu2tong1shi4zhi2;

    public Double getP_liu2tong1shi4zhi2() { return this.p_liu2tong1shi4zhi2;}
    public void setP_liu2tong1shi4zhi2(Double v) { this.p_liu2tong1shi4zhi2 = v;}

    /**
    * name: 总市值
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("总市值")
    
    
    private Double p_zong3shi4zhi2;

    public Double getP_zong3shi4zhi2() { return this.p_zong3shi4zhi2;}
    public void setP_zong3shi4zhi2(Double v) { this.p_zong3shi4zhi2 = v;}

    /**
    * name: 换手率
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("换手率")
    
    
    private Double p_huan4shou3lu4;

    public Double getP_huan4shou3lu4() { return this.p_huan4shou3lu4;}
    public void setP_huan4shou3lu4(Double v) { this.p_huan4shou3lu4 = v;}

    /**
    * name: 封板资金
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("封板资金")
    
    
    private Integer p_feng1ban3zi1jin1;

    public Integer getP_feng1ban3zi1jin1() { return this.p_feng1ban3zi1jin1;}
    public void setP_feng1ban3zi1jin1(Integer v) { this.p_feng1ban3zi1jin1 = v;}

    /**
    * name: 首次封板时间
    * type: object
    * desc: 注意格式: 09:25:00
    * required: 
    */
    @JsonProperty("首次封板时间")
    
    @JsonDeserialize(using =
        JacksonDateTimeDeserializer.class)
    
    private LocalDateTime p_shou3ci4feng1ban3shi2jian1;

    public LocalDateTime getP_shou3ci4feng1ban3shi2jian1() { return this.p_shou3ci4feng1ban3shi2jian1;}
    public void setP_shou3ci4feng1ban3shi2jian1(LocalDateTime v) { this.p_shou3ci4feng1ban3shi2jian1 = v;}

    /**
    * name: 最后封板时间
    * type: object
    * desc: 注意格式: 09:25:00
    * required: 
    */
    @JsonProperty("最后封板时间")
    
    @JsonDeserialize(using =
        JacksonDateTimeDeserializer.class)
    
    private LocalDateTime p_zui4hou4feng1ban3shi2jian1;

    public LocalDateTime getP_zui4hou4feng1ban3shi2jian1() { return this.p_zui4hou4feng1ban3shi2jian1;}
    public void setP_zui4hou4feng1ban3shi2jian1(LocalDateTime v) { this.p_zui4hou4feng1ban3shi2jian1 = v;}

    /**
    * name: 炸板次数
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("炸板次数")
    
    
    private Integer p_zha4ban3ci4shu4;

    public Integer getP_zha4ban3ci4shu4() { return this.p_zha4ban3ci4shu4;}
    public void setP_zha4ban3ci4shu4(Integer v) { this.p_zha4ban3ci4shu4 = v;}

    /**
    * name: 涨停统计
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("涨停统计")
    
    
    private String p_zhang3ting2tong3ji4;

    public String getP_zhang3ting2tong3ji4() { return this.p_zhang3ting2tong3ji4;}
    public void setP_zhang3ting2tong3ji4(String v) { this.p_zhang3ting2tong3ji4 = v;}

    /**
    * name: 连板数
    * type: int64
    * desc: 注意格式: 1 为首板
    * required: 
    */
    @JsonProperty("连板数")
    
    
    private Integer p_lian2ban3shu4;

    public Integer getP_lian2ban3shu4() { return this.p_lian2ban3shu4;}
    public void setP_lian2ban3shu4(Integer v) { this.p_lian2ban3shu4 = v;}

    /**
    * name: 所属行业
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("所属行业")
    
    
    private String p_suo3shu3xing2ye4;

    public String getP_suo3shu3xing2ye4() { return this.p_suo3shu3xing2ye4;}
    public void setP_suo3shu3xing2ye4(String v) { this.p_suo3shu3xing2ye4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
