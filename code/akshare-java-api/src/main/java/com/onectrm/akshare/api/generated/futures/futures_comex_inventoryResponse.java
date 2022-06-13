
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
    * 接口: futures_comex_inventory
    * 目标地址: http://data.eastmoney.com/pmetal/comex/by.html
    * 描述: 东方财富网-数据中心-COMEX 库存的日数据
    * 限量: 单次返回指定 symbol 的所有历史数据
    */
    public class futures_comex_inventoryResponse extends AkShareRequestAndResponse {
    public futures_comex_inventoryResponse(){
    setInterfaceName("futures_comex_inventory");
    }

    public static futures_comex_inventoryResponse of(


    Integer p_xu4hao4,

    LocalDate p_ri4qi1,

    Double p_COMEXhuang2jin1ku4cun2liang41,

    String p_COMEXhuang2jin1ku4cun2liang42,


    Map.Entry
    <String
    , String>... others){
    futures_comex_inventoryResponse t = new futures_comex_inventoryResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_ri4qi1 = p_ri4qi1;

    t.p_COMEXhuang2jin1ku4cun2liang41 = p_COMEXhuang2jin1ku4cun2liang41;

    t.p_COMEXhuang2jin1ku4cun2liang42 = p_COMEXhuang2jin1ku4cun2liang42;


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
    * name: COMEX黄金库存量_1
    * type: float64
    * desc: 注意单位: 盎司
    * required: 
    */
    @JsonProperty("COMEX黄金库存量_1")
    
    
    private Double p_COMEXhuang2jin1ku4cun2liang41;

    public Double getP_COMEXhuang2jin1ku4cun2liang41() { return this.p_COMEXhuang2jin1ku4cun2liang41;}
    public void setP_COMEXhuang2jin1ku4cun2liang41(Double v) { this.p_COMEXhuang2jin1ku4cun2liang41 = v;}

    /**
    * name: COMEX黄金库存量_2
    * type: object
    * desc: 注意单位: 吨
    * required: 
    */
    @JsonProperty("COMEX黄金库存量_2")
    
    
    private String p_COMEXhuang2jin1ku4cun2liang42;

    public String getP_COMEXhuang2jin1ku4cun2liang42() { return this.p_COMEXhuang2jin1ku4cun2liang42;}
    public void setP_COMEXhuang2jin1ku4cun2liang42(String v) { this.p_COMEXhuang2jin1ku4cun2liang42 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
