
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
    * 接口: futures_inventory_99
    * 目标地址: http://www.99qh.com/d/store.aspx
    * 描述: 99 期货网-大宗商品库存数据; 周频率
    * 限量: 单次返回指定 exchange 和指定 symbol 的具体品种的交割仓库的仓单周报数据
    */
    public class futures_inventory_99Response extends AkShareRequestAndResponse {
    public futures_inventory_99Response(){
    setInterfaceName("futures_inventory_99");
    }

    public static futures_inventory_99Response of(


    LocalDate p_ri4qi1,

    Double p_ku4cun2,

    Double p_zeng1jian3,


    Map.Entry
    <String
    , String>... others){
    futures_inventory_99Response t = new futures_inventory_99Response();


    t.p_ri4qi1 = p_ri4qi1;

    t.p_ku4cun2 = p_ku4cun2;

    t.p_zeng1jian3 = p_zeng1jian3;


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
    * desc: 日期
    * required: 
    */
    @JsonProperty("日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_ri4qi1;

    public LocalDate getP_ri4qi1() { return this.p_ri4qi1;}
    public void setP_ri4qi1(LocalDate v) { this.p_ri4qi1 = v;}

    /**
    * name: 库存
    * type: float64
    * desc: 库存数据(对应图片左边的Y轴)
    * required: 
    */
    @JsonProperty("库存")
    
    
    private Double p_ku4cun2;

    public Double getP_ku4cun2() { return this.p_ku4cun2;}
    public void setP_ku4cun2(Double v) { this.p_ku4cun2 = v;}

    /**
    * name: 增减
    * type: float64
    * desc: 相对前一个交易日的增减
    * required: 
    */
    @JsonProperty("增减")
    
    
    private Double p_zeng1jian3;

    public Double getP_zeng1jian3() { return this.p_zeng1jian3;}
    public void setP_zeng1jian3(Double v) { this.p_zeng1jian3 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
