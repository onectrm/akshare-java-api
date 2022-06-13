
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.fund_public;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: fund_public
    * 接口: fund_financial_fund_daily_em
    * 目标地址: http://fund.eastmoney.com/lcjj.html#1_1__0__ljjz,desc_1_os1
    * 描述: 东方财富网-天天基金网-基金数据-理财型基金-实时数据, 此接口数据每个交易日 **16:00～23:00** 更新
    * 限量: 该接口由于目标网站未更新数据，暂时不能返回数据
    */
    public class fund_financial_fund_daily_emResponse extends AkShareRequestAndResponse {
    public fund_financial_fund_daily_emResponse(){
    setInterfaceName("fund_financial_fund_daily_em");
    }

    public static fund_financial_fund_daily_emResponse of(


    Integer p_xu4hao4,

    String p_ji1jin1dai4ma3,

    String p_ji1jin1jian3cheng1,

    Double p_shang4yi1qi1nian2hua4shou1yi4lu4,

    Double p_dang1qian2jiao1yi4ri4wan4fen4shou1yi4,

    Double p_dang1qian2jiao1yi4ri47ri4nian2hua2,

    Double p_qian2yi1ge4jiao1yi4ri4wan4fen4shou1yi4,

    Double p_qian2yi1ge4jiao1yi4ri47ri4nian2hua2,

    Double p_feng1bi4qi1,

    String p_shen1gou4zhuang4tai4,


    Map.Entry
    <String
    , String>... others){
    fund_financial_fund_daily_emResponse t = new fund_financial_fund_daily_emResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_ji1jin1dai4ma3 = p_ji1jin1dai4ma3;

    t.p_ji1jin1jian3cheng1 = p_ji1jin1jian3cheng1;

    t.p_shang4yi1qi1nian2hua4shou1yi4lu4 = p_shang4yi1qi1nian2hua4shou1yi4lu4;

    t.p_dang1qian2jiao1yi4ri4wan4fen4shou1yi4 = p_dang1qian2jiao1yi4ri4wan4fen4shou1yi4;

    t.p_dang1qian2jiao1yi4ri47ri4nian2hua2 = p_dang1qian2jiao1yi4ri47ri4nian2hua2;

    t.p_qian2yi1ge4jiao1yi4ri4wan4fen4shou1yi4 = p_qian2yi1ge4jiao1yi4ri4wan4fen4shou1yi4;

    t.p_qian2yi1ge4jiao1yi4ri47ri4nian2hua2 = p_qian2yi1ge4jiao1yi4ri47ri4nian2hua2;

    t.p_feng1bi4qi1 = p_feng1bi4qi1;

    t.p_shen1gou4zhuang4tai4 = p_shen1gou4zhuang4tai4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 序号
    * type: int
    * desc: 
    * required: 
    */
    @JsonProperty("序号")
    
    
    private Integer p_xu4hao4;

    public Integer getP_xu4hao4() { return this.p_xu4hao4;}
    public void setP_xu4hao4(Integer v) { this.p_xu4hao4 = v;}

    /**
    * name: 基金代码
    * type: str
    * desc: 
    * required: 
    */
    @JsonProperty("基金代码")
    
    
    private String p_ji1jin1dai4ma3;

    public String getP_ji1jin1dai4ma3() { return this.p_ji1jin1dai4ma3;}
    public void setP_ji1jin1dai4ma3(String v) { this.p_ji1jin1dai4ma3 = v;}

    /**
    * name: 基金简称
    * type: str
    * desc: 
    * required: 
    */
    @JsonProperty("基金简称")
    
    
    private String p_ji1jin1jian3cheng1;

    public String getP_ji1jin1jian3cheng1() { return this.p_ji1jin1jian3cheng1;}
    public void setP_ji1jin1jian3cheng1(String v) { this.p_ji1jin1jian3cheng1 = v;}

    /**
    * name: 上一期年化收益率
    * type: float
    * desc: 
    * required: 
    */
    @JsonProperty("上一期年化收益率")
    
    
    private Double p_shang4yi1qi1nian2hua4shou1yi4lu4;

    public Double getP_shang4yi1qi1nian2hua4shou1yi4lu4() { return this.p_shang4yi1qi1nian2hua4shou1yi4lu4;}
    public void setP_shang4yi1qi1nian2hua4shou1yi4lu4(Double v) { this.p_shang4yi1qi1nian2hua4shou1yi4lu4 = v;}

    /**
    * name: 当前交易日-万份收益
    * type: float
    * desc: 
    * required: 
    */
    @JsonProperty("当前交易日-万份收益")
    
    
    private Double p_dang1qian2jiao1yi4ri4wan4fen4shou1yi4;

    public Double getP_dang1qian2jiao1yi4ri4wan4fen4shou1yi4() { return this.p_dang1qian2jiao1yi4ri4wan4fen4shou1yi4;}
    public void setP_dang1qian2jiao1yi4ri4wan4fen4shou1yi4(Double v) { this.p_dang1qian2jiao1yi4ri4wan4fen4shou1yi4 = v;}

    /**
    * name: 当前交易日-7日年华
    * type: float
    * desc: 
    * required: 
    */
    @JsonProperty("当前交易日-7日年华")
    
    
    private Double p_dang1qian2jiao1yi4ri47ri4nian2hua2;

    public Double getP_dang1qian2jiao1yi4ri47ri4nian2hua2() { return this.p_dang1qian2jiao1yi4ri47ri4nian2hua2;}
    public void setP_dang1qian2jiao1yi4ri47ri4nian2hua2(Double v) { this.p_dang1qian2jiao1yi4ri47ri4nian2hua2 = v;}

    /**
    * name: 前一个交易日-万份收益
    * type: float
    * desc: 
    * required: 
    */
    @JsonProperty("前一个交易日-万份收益")
    
    
    private Double p_qian2yi1ge4jiao1yi4ri4wan4fen4shou1yi4;

    public Double getP_qian2yi1ge4jiao1yi4ri4wan4fen4shou1yi4() { return this.p_qian2yi1ge4jiao1yi4ri4wan4fen4shou1yi4;}
    public void setP_qian2yi1ge4jiao1yi4ri4wan4fen4shou1yi4(Double v) { this.p_qian2yi1ge4jiao1yi4ri4wan4fen4shou1yi4 = v;}

    /**
    * name: 前一个交易日-7日年华
    * type: float
    * desc: 
    * required: 
    */
    @JsonProperty("前一个交易日-7日年华")
    
    
    private Double p_qian2yi1ge4jiao1yi4ri47ri4nian2hua2;

    public Double getP_qian2yi1ge4jiao1yi4ri47ri4nian2hua2() { return this.p_qian2yi1ge4jiao1yi4ri47ri4nian2hua2;}
    public void setP_qian2yi1ge4jiao1yi4ri47ri4nian2hua2(Double v) { this.p_qian2yi1ge4jiao1yi4ri47ri4nian2hua2 = v;}

    /**
    * name: 封闭期
    * type: float
    * desc: 
    * required: 
    */
    @JsonProperty("封闭期")
    
    
    private Double p_feng1bi4qi1;

    public Double getP_feng1bi4qi1() { return this.p_feng1bi4qi1;}
    public void setP_feng1bi4qi1(Double v) { this.p_feng1bi4qi1 = v;}

    /**
    * name: 申购状态
    * type: str
    * desc: 
    * required: 
    */
    @JsonProperty("申购状态")
    
    
    private String p_shen1gou4zhuang4tai4;

    public String getP_shen1gou4zhuang4tai4() { return this.p_shen1gou4zhuang4tai4;}
    public void setP_shen1gou4zhuang4tai4(String v) { this.p_shen1gou4zhuang4tai4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
