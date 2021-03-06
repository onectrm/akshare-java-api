
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
    * 接口: stock_dzjy_hygtj
    * 目标地址: http://data.eastmoney.com/dzjy/dzjy_hygtj.aspx
    * 描述: 东方财富网-数据中心-大宗交易-活跃 A 股统计
    * 限量: 单次返回所有历史数据
    */
    public class stock_dzjy_hygtjResponse extends AkShareRequestAndResponse {
    public stock_dzjy_hygtjResponse(){
    setInterfaceName("stock_dzjy_hygtj");
    }

    public static stock_dzjy_hygtjResponse of(


    Integer p_xu4hao4,

    String p_zheng4quan4dai4ma3,

    String p_zheng4quan4jian3cheng1,

    Double p_zui4xin1jia4,

    Double p_zhang3die1fu2,

    String p_zui4jin4shang4bang3ri4,

    Integer p_shang4bang3ci4shu4zong3ji4,

    Integer p_shang4bang3ci4shu4yi4jia4,

    Integer p_shang4bang3ci4shu4zhe2jia4,

    Double p_zong3cheng2jiao1e2,

    Double p_zhe2yi4lu4,

    Double p_cheng2jiao1zong3e2liu2tong1shi4zhi2,

    Double p_shang4bang3ri4hou4ping2jun1zhang3die1fu21ri4,

    Double p_shang4bang3ri4hou4ping2jun1zhang3die1fu25ri4,

    Double p_shang4bang3ri4hou4ping2jun1zhang3die1fu210ri4,

    Double p_shang4bang3ri4hou4ping2jun1zhang3die1fu220ri4,


    Map.Entry
    <String
    , String>... others){
    stock_dzjy_hygtjResponse t = new stock_dzjy_hygtjResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_zheng4quan4dai4ma3 = p_zheng4quan4dai4ma3;

    t.p_zheng4quan4jian3cheng1 = p_zheng4quan4jian3cheng1;

    t.p_zui4xin1jia4 = p_zui4xin1jia4;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_zui4jin4shang4bang3ri4 = p_zui4jin4shang4bang3ri4;

    t.p_shang4bang3ci4shu4zong3ji4 = p_shang4bang3ci4shu4zong3ji4;

    t.p_shang4bang3ci4shu4yi4jia4 = p_shang4bang3ci4shu4yi4jia4;

    t.p_shang4bang3ci4shu4zhe2jia4 = p_shang4bang3ci4shu4zhe2jia4;

    t.p_zong3cheng2jiao1e2 = p_zong3cheng2jiao1e2;

    t.p_zhe2yi4lu4 = p_zhe2yi4lu4;

    t.p_cheng2jiao1zong3e2liu2tong1shi4zhi2 = p_cheng2jiao1zong3e2liu2tong1shi4zhi2;

    t.p_shang4bang3ri4hou4ping2jun1zhang3die1fu21ri4 = p_shang4bang3ri4hou4ping2jun1zhang3die1fu21ri4;

    t.p_shang4bang3ri4hou4ping2jun1zhang3die1fu25ri4 = p_shang4bang3ri4hou4ping2jun1zhang3die1fu25ri4;

    t.p_shang4bang3ri4hou4ping2jun1zhang3die1fu210ri4 = p_shang4bang3ri4hou4ping2jun1zhang3die1fu210ri4;

    t.p_shang4bang3ri4hou4ping2jun1zhang3die1fu220ri4 = p_shang4bang3ri4hou4ping2jun1zhang3die1fu220ri4;


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
    * name: 证券代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("证券代码")
    
    
    private String p_zheng4quan4dai4ma3;

    public String getP_zheng4quan4dai4ma3() { return this.p_zheng4quan4dai4ma3;}
    public void setP_zheng4quan4dai4ma3(String v) { this.p_zheng4quan4dai4ma3 = v;}

    /**
    * name: 证券简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("证券简称")
    
    
    private String p_zheng4quan4jian3cheng1;

    public String getP_zheng4quan4jian3cheng1() { return this.p_zheng4quan4jian3cheng1;}
    public void setP_zheng4quan4jian3cheng1(String v) { this.p_zheng4quan4jian3cheng1 = v;}

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
    * name: 最近上榜日
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("最近上榜日")
    
    
    private String p_zui4jin4shang4bang3ri4;

    public String getP_zui4jin4shang4bang3ri4() { return this.p_zui4jin4shang4bang3ri4;}
    public void setP_zui4jin4shang4bang3ri4(String v) { this.p_zui4jin4shang4bang3ri4 = v;}

    /**
    * name: 上榜次数-总计
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("上榜次数-总计")
    
    
    private Integer p_shang4bang3ci4shu4zong3ji4;

    public Integer getP_shang4bang3ci4shu4zong3ji4() { return this.p_shang4bang3ci4shu4zong3ji4;}
    public void setP_shang4bang3ci4shu4zong3ji4(Integer v) { this.p_shang4bang3ci4shu4zong3ji4 = v;}

    /**
    * name: 上榜次数-溢价
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("上榜次数-溢价")
    
    
    private Integer p_shang4bang3ci4shu4yi4jia4;

    public Integer getP_shang4bang3ci4shu4yi4jia4() { return this.p_shang4bang3ci4shu4yi4jia4;}
    public void setP_shang4bang3ci4shu4yi4jia4(Integer v) { this.p_shang4bang3ci4shu4yi4jia4 = v;}

    /**
    * name: 上榜次数-折价
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("上榜次数-折价")
    
    
    private Integer p_shang4bang3ci4shu4zhe2jia4;

    public Integer getP_shang4bang3ci4shu4zhe2jia4() { return this.p_shang4bang3ci4shu4zhe2jia4;}
    public void setP_shang4bang3ci4shu4zhe2jia4(Integer v) { this.p_shang4bang3ci4shu4zhe2jia4 = v;}

    /**
    * name: 总成交额
    * type: float64
    * desc: 注意单位: 万元
    * required: 
    */
    @JsonProperty("总成交额")
    
    
    private Double p_zong3cheng2jiao1e2;

    public Double getP_zong3cheng2jiao1e2() { return this.p_zong3cheng2jiao1e2;}
    public void setP_zong3cheng2jiao1e2(Double v) { this.p_zong3cheng2jiao1e2 = v;}

    /**
    * name: 折溢率
    * type: float64
    * desc: 注意单位: 万元
    * required: 
    */
    @JsonProperty("折溢率")
    
    
    private Double p_zhe2yi4lu4;

    public Double getP_zhe2yi4lu4() { return this.p_zhe2yi4lu4;}
    public void setP_zhe2yi4lu4(Double v) { this.p_zhe2yi4lu4 = v;}

    /**
    * name: 成交总额/流通市值
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("成交总额/流通市值")
    
    
    private Double p_cheng2jiao1zong3e2liu2tong1shi4zhi2;

    public Double getP_cheng2jiao1zong3e2liu2tong1shi4zhi2() { return this.p_cheng2jiao1zong3e2liu2tong1shi4zhi2;}
    public void setP_cheng2jiao1zong3e2liu2tong1shi4zhi2(Double v) { this.p_cheng2jiao1zong3e2liu2tong1shi4zhi2 = v;}

    /**
    * name: 上榜日后平均涨跌幅-1日
    * type: float64
    * desc: 注意符号: %
    * required: 
    */
    @JsonProperty("上榜日后平均涨跌幅-1日")
    
    
    private Double p_shang4bang3ri4hou4ping2jun1zhang3die1fu21ri4;

    public Double getP_shang4bang3ri4hou4ping2jun1zhang3die1fu21ri4() { return this.p_shang4bang3ri4hou4ping2jun1zhang3die1fu21ri4;}
    public void setP_shang4bang3ri4hou4ping2jun1zhang3die1fu21ri4(Double v) { this.p_shang4bang3ri4hou4ping2jun1zhang3die1fu21ri4 = v;}

    /**
    * name: 上榜日后平均涨跌幅-5日
    * type: float64
    * desc: 注意符号: %
    * required: 
    */
    @JsonProperty("上榜日后平均涨跌幅-5日")
    
    
    private Double p_shang4bang3ri4hou4ping2jun1zhang3die1fu25ri4;

    public Double getP_shang4bang3ri4hou4ping2jun1zhang3die1fu25ri4() { return this.p_shang4bang3ri4hou4ping2jun1zhang3die1fu25ri4;}
    public void setP_shang4bang3ri4hou4ping2jun1zhang3die1fu25ri4(Double v) { this.p_shang4bang3ri4hou4ping2jun1zhang3die1fu25ri4 = v;}

    /**
    * name: 上榜日后平均涨跌幅-10日
    * type: float64
    * desc: 注意符号: %
    * required: 
    */
    @JsonProperty("上榜日后平均涨跌幅-10日")
    
    
    private Double p_shang4bang3ri4hou4ping2jun1zhang3die1fu210ri4;

    public Double getP_shang4bang3ri4hou4ping2jun1zhang3die1fu210ri4() { return this.p_shang4bang3ri4hou4ping2jun1zhang3die1fu210ri4;}
    public void setP_shang4bang3ri4hou4ping2jun1zhang3die1fu210ri4(Double v) { this.p_shang4bang3ri4hou4ping2jun1zhang3die1fu210ri4 = v;}

    /**
    * name: 上榜日后平均涨跌幅-20日
    * type: float64
    * desc: 注意符号: %
    * required: 
    */
    @JsonProperty("上榜日后平均涨跌幅-20日")
    
    
    private Double p_shang4bang3ri4hou4ping2jun1zhang3die1fu220ri4;

    public Double getP_shang4bang3ri4hou4ping2jun1zhang3die1fu220ri4() { return this.p_shang4bang3ri4hou4ping2jun1zhang3die1fu220ri4;}
    public void setP_shang4bang3ri4hou4ping2jun1zhang3die1fu220ri4(Double v) { this.p_shang4bang3ri4hou4ping2jun1zhang3die1fu220ri4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
