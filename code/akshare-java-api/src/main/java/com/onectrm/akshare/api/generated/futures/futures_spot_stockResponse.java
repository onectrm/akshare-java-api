
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:49 CST 2022*/
    package com.onectrm.akshare.api.generated.futures;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: futures
    * 接口: futures_spot_stock
    * 目标地址: http://data.eastmoney.com/ifdata/xhgp.html
    * 描述: 东方财富网-数据中心-现货与股票
    * 限量: 单次返回指定 indicator 的所有数据
    */
    public class futures_spot_stockResponse extends AkShareRequestAndResponse {
    public futures_spot_stockResponse(){
    setInterfaceName("futures_spot_stock");
    }

    public static futures_spot_stockResponse of(


    String p_shang1pin3ming2cheng1,

    Double p_jin45yue4,

    Double p_jin44yue4,

    Double p_jin43yue4,

    Double p_jin42yue4,

    Double p_jin41yue4,

    Double p_zui4xin1jia4,

    Double p_jin4ban4nian2zhang3die1fu2,

    String p_sheng1chan3shang1,

    String p_xia4you2yong4hu4,


    Map.Entry
    <String
    , String>... others){
    futures_spot_stockResponse t = new futures_spot_stockResponse();


    t.p_shang1pin3ming2cheng1 = p_shang1pin3ming2cheng1;

    t.p_jin45yue4 = p_jin45yue4;

    t.p_jin44yue4 = p_jin44yue4;

    t.p_jin43yue4 = p_jin43yue4;

    t.p_jin42yue4 = p_jin42yue4;

    t.p_jin41yue4 = p_jin41yue4;

    t.p_zui4xin1jia4 = p_zui4xin1jia4;

    t.p_jin4ban4nian2zhang3die1fu2 = p_jin4ban4nian2zhang3die1fu2;

    t.p_sheng1chan3shang1 = p_sheng1chan3shang1;

    t.p_xia4you2yong4hu4 = p_xia4you2yong4hu4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 商品名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("商品名称")
    
    
    private String p_shang1pin3ming2cheng1;

    public String getP_shang1pin3ming2cheng1() { return this.p_shang1pin3ming2cheng1;}
    public void setP_shang1pin3ming2cheng1(String v) { this.p_shang1pin3ming2cheng1 = v;}

    /**
    * name: 近5月
    * type: float64
    * desc: 注意: 具体的日期
    * required: 
    */
    @JsonProperty("近5月")
    
    
    private Double p_jin45yue4;

    public Double getP_jin45yue4() { return this.p_jin45yue4;}
    public void setP_jin45yue4(Double v) { this.p_jin45yue4 = v;}

    /**
    * name: 近4月
    * type: float64
    * desc: 注意: 具体的日期
    * required: 
    */
    @JsonProperty("近4月")
    
    
    private Double p_jin44yue4;

    public Double getP_jin44yue4() { return this.p_jin44yue4;}
    public void setP_jin44yue4(Double v) { this.p_jin44yue4 = v;}

    /**
    * name: 近3月
    * type: float64
    * desc: 注意: 具体的日期
    * required: 
    */
    @JsonProperty("近3月")
    
    
    private Double p_jin43yue4;

    public Double getP_jin43yue4() { return this.p_jin43yue4;}
    public void setP_jin43yue4(Double v) { this.p_jin43yue4 = v;}

    /**
    * name: 近2月
    * type: float64
    * desc: 注意: 具体的日期
    * required: 
    */
    @JsonProperty("近2月")
    
    
    private Double p_jin42yue4;

    public Double getP_jin42yue4() { return this.p_jin42yue4;}
    public void setP_jin42yue4(Double v) { this.p_jin42yue4 = v;}

    /**
    * name: 近1月
    * type: float64
    * desc: 注意: 具体的日期
    * required: 
    */
    @JsonProperty("近1月")
    
    
    private Double p_jin41yue4;

    public Double getP_jin41yue4() { return this.p_jin41yue4;}
    public void setP_jin41yue4(Double v) { this.p_jin41yue4 = v;}

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
    * name: 近半年涨跌幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("近半年涨跌幅")
    
    
    private Double p_jin4ban4nian2zhang3die1fu2;

    public Double getP_jin4ban4nian2zhang3die1fu2() { return this.p_jin4ban4nian2zhang3die1fu2;}
    public void setP_jin4ban4nian2zhang3die1fu2(Double v) { this.p_jin4ban4nian2zhang3die1fu2 = v;}

    /**
    * name: 生产商
    * type: object
    * desc: 注意: 字符串组成
    * required: 
    */
    @JsonProperty("生产商")
    
    
    private String p_sheng1chan3shang1;

    public String getP_sheng1chan3shang1() { return this.p_sheng1chan3shang1;}
    public void setP_sheng1chan3shang1(String v) { this.p_sheng1chan3shang1 = v;}

    /**
    * name: 下游用户
    * type: object
    * desc: 注意: 字符串组成
    * required: 
    */
    @JsonProperty("下游用户")
    
    
    private String p_xia4you2yong4hu4;

    public String getP_xia4you2yong4hu4() { return this.p_xia4you2yong4hu4;}
    public void setP_xia4you2yong4hu4(String v) { this.p_xia4you2yong4hu4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
