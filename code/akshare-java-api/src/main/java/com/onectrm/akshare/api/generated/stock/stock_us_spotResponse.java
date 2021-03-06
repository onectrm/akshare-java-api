
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
    * 接口: stock_us_spot
    * 目标地址: http://finance.sina.com.cn/stock/usstock/sector.shtml
    * 描述: 新浪财经-美股; 获取的数据有 15 分钟延迟; 建议使用 ak.stock_us_spot_em() 来获取数据
    * 限量: 单次返回美股所有上市公司的实时行情数据
    */
    public class stock_us_spotResponse extends AkShareRequestAndResponse {
    public stock_us_spotResponse(){
    setInterfaceName("stock_us_spot");
    }

    public static stock_us_spotResponse of(


    String p_xin1lang4mo4ren4,


    Map.Entry
    <String
    , String>... others){
    stock_us_spotResponse t = new stock_us_spotResponse();


    t.p_xin1lang4mo4ren4 = p_xin1lang4mo4ren4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 
    * type: 
    * desc: 新浪默认
    * required: 
    */
    @JsonProperty("")
    
    
    private String p_xin1lang4mo4ren4;

    public String getP_xin1lang4mo4ren4() { return this.p_xin1lang4mo4ren4;}
    public void setP_xin1lang4mo4ren4(String v) { this.p_xin1lang4mo4ren4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
