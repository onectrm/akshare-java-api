
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
    * 接口: stock_profit_sheet_by_yearly_em
    * 目标地址: https://emweb.securities.eastmoney.com/PC_HSF10/NewFinanceAnalysis/Index?type=web&amp;code=sh600519#lrb-0
    * 描述: 东方财富-股票-财务分析-利润表-按年度
    * 限量: 单次获取指定 symbol 的利润表-按年度数据
    */
    public class stock_profit_sheet_by_yearly_emResponse extends AkShareRequestAndResponse {
    public stock_profit_sheet_by_yearly_emResponse(){
    setInterfaceName("stock_profit_sheet_by_yearly_em");
    }

    public static stock_profit_sheet_by_yearly_emResponse of(


    String p_203xiang4bu4zhu2yi1lie4chu1,


    Map.Entry
    <String
    , String>... others){
    stock_profit_sheet_by_yearly_emResponse t = new stock_profit_sheet_by_yearly_emResponse();


    t.p_203xiang4bu4zhu2yi1lie4chu1 = p_203xiang4bu4zhu2yi1lie4chu1;


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
    * desc: 203 项，不逐一列出
    * required: 
    */
    @JsonProperty("")
    
    
    private String p_203xiang4bu4zhu2yi1lie4chu1;

    public String getP_203xiang4bu4zhu2yi1lie4chu1() { return this.p_203xiang4bu4zhu2yi1lie4chu1;}
    public void setP_203xiang4bu4zhu2yi1lie4chu1(String v) { this.p_203xiang4bu4zhu2yi1lie4chu1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
