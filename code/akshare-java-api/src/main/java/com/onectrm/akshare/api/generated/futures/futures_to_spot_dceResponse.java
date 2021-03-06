
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
    * 接口: futures_to_spot_dce
    * 目标地址: http://www.dce.com.cn/dalianshangpin/xqsj/tjsj26/jgtj/qzxcx/index.html
    * 描述: 提供大连商品交易所-期转现统计数据
    * 限量: 单次返回指定交易日的期转现统计数据
    */
    public class futures_to_spot_dceResponse extends AkShareRequestAndResponse {
    public futures_to_spot_dceResponse(){
    setInterfaceName("futures_to_spot_dce");
    }

    public static futures_to_spot_dceResponse of(


    String p_he2yue1dai4ma3,

    LocalDate p_qi1zhuan3xian4fa1sheng1ri4qi1,

    String p_qi1zhuan3xian4shu4liang4,


    Map.Entry
    <String
    , String>... others){
    futures_to_spot_dceResponse t = new futures_to_spot_dceResponse();


    t.p_he2yue1dai4ma3 = p_he2yue1dai4ma3;

    t.p_qi1zhuan3xian4fa1sheng1ri4qi1 = p_qi1zhuan3xian4fa1sheng1ri4qi1;

    t.p_qi1zhuan3xian4shu4liang4 = p_qi1zhuan3xian4shu4liang4;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 合约代码
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("合约代码")
    
    
    private String p_he2yue1dai4ma3;

    public String getP_he2yue1dai4ma3() { return this.p_he2yue1dai4ma3;}
    public void setP_he2yue1dai4ma3(String v) { this.p_he2yue1dai4ma3 = v;}

    /**
    * name: 期转现发生日期
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("期转现发生日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_qi1zhuan3xian4fa1sheng1ri4qi1;

    public LocalDate getP_qi1zhuan3xian4fa1sheng1ri4qi1() { return this.p_qi1zhuan3xian4fa1sheng1ri4qi1;}
    public void setP_qi1zhuan3xian4fa1sheng1ri4qi1(LocalDate v) { this.p_qi1zhuan3xian4fa1sheng1ri4qi1 = v;}

    /**
    * name: 期转现数量
    * type: str
    * desc: 注意单位: 手
    * required: Y
    */
    @JsonProperty("期转现数量")
    
    
    private String p_qi1zhuan3xian4shu4liang4;

    public String getP_qi1zhuan3xian4shu4liang4() { return this.p_qi1zhuan3xian4shu4liang4;}
    public void setP_qi1zhuan3xian4shu4liang4(String v) { this.p_qi1zhuan3xian4shu4liang4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
