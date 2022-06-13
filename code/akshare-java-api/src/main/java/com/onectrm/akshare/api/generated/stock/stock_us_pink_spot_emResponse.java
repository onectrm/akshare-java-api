
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
    * 接口: stock_us_pink_spot_em
    * 目标地址: http://quote.eastmoney.com/center/gridlist.html#us_pinksheet
    * 描述: 美股粉单市场的实时行情数据
    * 限量: 单次返回指定所有粉单市场的行情数据
    */
    public class stock_us_pink_spot_emResponse extends AkShareRequestAndResponse {
    public stock_us_pink_spot_emResponse(){
    setInterfaceName("stock_us_pink_spot_em");
    }

    public static stock_us_pink_spot_emResponse of(


    String p_xu4hao4,

    String p_ming2cheng1,

    String p_zui4xin1jia4,

    String p_zhang3die1e2,

    String p_zhang3die1fu2,

    String p_kai1pan2jia4,

    String p_zui4gao1jia4,

    String p_zui4di1jia4,

    String p_zuo2shou1jia4,

    String p_zong3shi4zhi2,

    String p_shi4ying2lu4,

    String p_dai4ma3,


    Map.Entry
    <String
    , String>... others){
    stock_us_pink_spot_emResponse t = new stock_us_pink_spot_emResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_ming2cheng1 = p_ming2cheng1;

    t.p_zui4xin1jia4 = p_zui4xin1jia4;

    t.p_zhang3die1e2 = p_zhang3die1e2;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_kai1pan2jia4 = p_kai1pan2jia4;

    t.p_zui4gao1jia4 = p_zui4gao1jia4;

    t.p_zui4di1jia4 = p_zui4di1jia4;

    t.p_zuo2shou1jia4 = p_zuo2shou1jia4;

    t.p_zong3shi4zhi2 = p_zong3shi4zhi2;

    t.p_shi4ying2lu4 = p_shi4ying2lu4;

    t.p_dai4ma3 = p_dai4ma3;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 序号
    * type: int32
    * desc: 
    * required: 
    */
    @JsonProperty("序号")
    
    
    private String p_xu4hao4;

    public String getP_xu4hao4() { return this.p_xu4hao4;}
    public void setP_xu4hao4(String v) { this.p_xu4hao4 = v;}

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
    * name: 最新价
    * type: object
    * desc: 注意单位: 美元
    * required: 
    */
    @JsonProperty("最新价")
    
    
    private String p_zui4xin1jia4;

    public String getP_zui4xin1jia4() { return this.p_zui4xin1jia4;}
    public void setP_zui4xin1jia4(String v) { this.p_zui4xin1jia4 = v;}

    /**
    * name: 涨跌额
    * type: object
    * desc: 注意单位: 美元
    * required: 
    */
    @JsonProperty("涨跌额")
    
    
    private String p_zhang3die1e2;

    public String getP_zhang3die1e2() { return this.p_zhang3die1e2;}
    public void setP_zhang3die1e2(String v) { this.p_zhang3die1e2 = v;}

    /**
    * name: 涨跌幅
    * type: object
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("涨跌幅")
    
    
    private String p_zhang3die1fu2;

    public String getP_zhang3die1fu2() { return this.p_zhang3die1fu2;}
    public void setP_zhang3die1fu2(String v) { this.p_zhang3die1fu2 = v;}

    /**
    * name: 开盘价
    * type: object
    * desc: 注意单位: 美元
    * required: 
    */
    @JsonProperty("开盘价")
    
    
    private String p_kai1pan2jia4;

    public String getP_kai1pan2jia4() { return this.p_kai1pan2jia4;}
    public void setP_kai1pan2jia4(String v) { this.p_kai1pan2jia4 = v;}

    /**
    * name: 最高价
    * type: object
    * desc: 注意单位: 美元
    * required: 
    */
    @JsonProperty("最高价")
    
    
    private String p_zui4gao1jia4;

    public String getP_zui4gao1jia4() { return this.p_zui4gao1jia4;}
    public void setP_zui4gao1jia4(String v) { this.p_zui4gao1jia4 = v;}

    /**
    * name: 最低价
    * type: object
    * desc: 注意单位: 美元
    * required: 
    */
    @JsonProperty("最低价")
    
    
    private String p_zui4di1jia4;

    public String getP_zui4di1jia4() { return this.p_zui4di1jia4;}
    public void setP_zui4di1jia4(String v) { this.p_zui4di1jia4 = v;}

    /**
    * name: 昨收价
    * type: object
    * desc: 注意单位: 美元
    * required: 
    */
    @JsonProperty("昨收价")
    
    
    private String p_zuo2shou1jia4;

    public String getP_zuo2shou1jia4() { return this.p_zuo2shou1jia4;}
    public void setP_zuo2shou1jia4(String v) { this.p_zuo2shou1jia4 = v;}

    /**
    * name: 总市值
    * type: object
    * desc: 注意单位: 美元
    * required: 
    */
    @JsonProperty("总市值")
    
    
    private String p_zong3shi4zhi2;

    public String getP_zong3shi4zhi2() { return this.p_zong3shi4zhi2;}
    public void setP_zong3shi4zhi2(String v) { this.p_zong3shi4zhi2 = v;}

    /**
    * name: 市盈率
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("市盈率")
    
    
    private String p_shi4ying2lu4;

    public String getP_shi4ying2lu4() { return this.p_shi4ying2lu4;}
    public void setP_shi4ying2lu4(String v) { this.p_shi4ying2lu4 = v;}

    /**
    * name: 代码
    * type: object
    * desc: 注意: 用来获取历史数据的代码
    * required: 
    */
    @JsonProperty("代码")
    
    
    private String p_dai4ma3;

    public String getP_dai4ma3() { return this.p_dai4ma3;}
    public void setP_dai4ma3(String v) { this.p_dai4ma3 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
