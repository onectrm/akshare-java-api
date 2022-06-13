
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
    * 接口: stock_yjkb_em
    * 目标地址: http://data.eastmoney.com/bbsj/202003/yjkb.html
    * 描述: 东方财富-数据中心-年报季报-业绩快报
    * 限量: 单次获取指定 date 的业绩快报数据
    */
    public class stock_yjkb_emResponse extends AkShareRequestAndResponse {
    public stock_yjkb_emResponse(){
    setInterfaceName("stock_yjkb_em");
    }

    public static stock_yjkb_emResponse of(


    String p_xu4hao4,

    String p_gu3piao4dai4ma3,

    String p_gu3piao4jian3cheng1,

    String p_mei3gu3shou1yi4,

    String p_ying2ye4shou1ru4ying2ye4shou1ru4,

    String p_ying2ye4shou1ru4qu4nian2tong2qi1,

    String p_ying2ye4shou1ru4tong2bi3zeng1zhang3,

    String p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3,

    String p_jing4li4run4jing4li4run4,

    String p_jing4li4run4qu4nian2tong2qi1,

    String p_jing4li4run4tong2bi3zeng1zhang3,

    String p_jing4li4run4ji4du4huan2bi3zeng1zhang3,

    String p_mei3gu3jing4zi1chan3,

    String p_jing4zi1chan3shou1yi4lu4,

    String p_suo3chu3xing2ye4,

    LocalDate p_gong1gao4ri4qi1,

    String p_shi4chang3ban3kuai4,

    String p_zheng4quan4lei4xing2,


    Map.Entry
    <String
    , String>... others){
    stock_yjkb_emResponse t = new stock_yjkb_emResponse();


    t.p_xu4hao4 = p_xu4hao4;

    t.p_gu3piao4dai4ma3 = p_gu3piao4dai4ma3;

    t.p_gu3piao4jian3cheng1 = p_gu3piao4jian3cheng1;

    t.p_mei3gu3shou1yi4 = p_mei3gu3shou1yi4;

    t.p_ying2ye4shou1ru4ying2ye4shou1ru4 = p_ying2ye4shou1ru4ying2ye4shou1ru4;

    t.p_ying2ye4shou1ru4qu4nian2tong2qi1 = p_ying2ye4shou1ru4qu4nian2tong2qi1;

    t.p_ying2ye4shou1ru4tong2bi3zeng1zhang3 = p_ying2ye4shou1ru4tong2bi3zeng1zhang3;

    t.p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3 = p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3;

    t.p_jing4li4run4jing4li4run4 = p_jing4li4run4jing4li4run4;

    t.p_jing4li4run4qu4nian2tong2qi1 = p_jing4li4run4qu4nian2tong2qi1;

    t.p_jing4li4run4tong2bi3zeng1zhang3 = p_jing4li4run4tong2bi3zeng1zhang3;

    t.p_jing4li4run4ji4du4huan2bi3zeng1zhang3 = p_jing4li4run4ji4du4huan2bi3zeng1zhang3;

    t.p_mei3gu3jing4zi1chan3 = p_mei3gu3jing4zi1chan3;

    t.p_jing4zi1chan3shou1yi4lu4 = p_jing4zi1chan3shou1yi4lu4;

    t.p_suo3chu3xing2ye4 = p_suo3chu3xing2ye4;

    t.p_gong1gao4ri4qi1 = p_gong1gao4ri4qi1;

    t.p_shi4chang3ban3kuai4 = p_shi4chang3ban3kuai4;

    t.p_zheng4quan4lei4xing2 = p_zheng4quan4lei4xing2;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: 序号
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("序号")
    
    
    private String p_xu4hao4;

    public String getP_xu4hao4() { return this.p_xu4hao4;}
    public void setP_xu4hao4(String v) { this.p_xu4hao4 = v;}

    /**
    * name: 股票代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股票代码")
    
    
    private String p_gu3piao4dai4ma3;

    public String getP_gu3piao4dai4ma3() { return this.p_gu3piao4dai4ma3;}
    public void setP_gu3piao4dai4ma3(String v) { this.p_gu3piao4dai4ma3 = v;}

    /**
    * name: 股票简称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股票简称")
    
    
    private String p_gu3piao4jian3cheng1;

    public String getP_gu3piao4jian3cheng1() { return this.p_gu3piao4jian3cheng1;}
    public void setP_gu3piao4jian3cheng1(String v) { this.p_gu3piao4jian3cheng1 = v;}

    /**
    * name: 每股收益
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("每股收益")
    
    
    private String p_mei3gu3shou1yi4;

    public String getP_mei3gu3shou1yi4() { return this.p_mei3gu3shou1yi4;}
    public void setP_mei3gu3shou1yi4(String v) { this.p_mei3gu3shou1yi4 = v;}

    /**
    * name: 营业收入-营业收入
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("营业收入-营业收入")
    
    
    private String p_ying2ye4shou1ru4ying2ye4shou1ru4;

    public String getP_ying2ye4shou1ru4ying2ye4shou1ru4() { return this.p_ying2ye4shou1ru4ying2ye4shou1ru4;}
    public void setP_ying2ye4shou1ru4ying2ye4shou1ru4(String v) { this.p_ying2ye4shou1ru4ying2ye4shou1ru4 = v;}

    /**
    * name: 营业收入-去年同期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("营业收入-去年同期")
    
    
    private String p_ying2ye4shou1ru4qu4nian2tong2qi1;

    public String getP_ying2ye4shou1ru4qu4nian2tong2qi1() { return this.p_ying2ye4shou1ru4qu4nian2tong2qi1;}
    public void setP_ying2ye4shou1ru4qu4nian2tong2qi1(String v) { this.p_ying2ye4shou1ru4qu4nian2tong2qi1 = v;}

    /**
    * name: 营业收入-同比增长
    * type: str
    * desc: 
    * required: 
    */
    @JsonProperty("营业收入-同比增长")
    
    
    private String p_ying2ye4shou1ru4tong2bi3zeng1zhang3;

    public String getP_ying2ye4shou1ru4tong2bi3zeng1zhang3() { return this.p_ying2ye4shou1ru4tong2bi3zeng1zhang3;}
    public void setP_ying2ye4shou1ru4tong2bi3zeng1zhang3(String v) { this.p_ying2ye4shou1ru4tong2bi3zeng1zhang3 = v;}

    /**
    * name: 营业收入-季度环比增长
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("营业收入-季度环比增长")
    
    
    private String p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3;

    public String getP_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3() { return this.p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3;}
    public void setP_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3(String v) { this.p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3 = v;}

    /**
    * name: 净利润-净利润
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("净利润-净利润")
    
    
    private String p_jing4li4run4jing4li4run4;

    public String getP_jing4li4run4jing4li4run4() { return this.p_jing4li4run4jing4li4run4;}
    public void setP_jing4li4run4jing4li4run4(String v) { this.p_jing4li4run4jing4li4run4 = v;}

    /**
    * name: 净利润-去年同期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("净利润-去年同期")
    
    
    private String p_jing4li4run4qu4nian2tong2qi1;

    public String getP_jing4li4run4qu4nian2tong2qi1() { return this.p_jing4li4run4qu4nian2tong2qi1;}
    public void setP_jing4li4run4qu4nian2tong2qi1(String v) { this.p_jing4li4run4qu4nian2tong2qi1 = v;}

    /**
    * name: 净利润-同比增长
    * type: str
    * desc: 
    * required: 
    */
    @JsonProperty("净利润-同比增长")
    
    
    private String p_jing4li4run4tong2bi3zeng1zhang3;

    public String getP_jing4li4run4tong2bi3zeng1zhang3() { return this.p_jing4li4run4tong2bi3zeng1zhang3;}
    public void setP_jing4li4run4tong2bi3zeng1zhang3(String v) { this.p_jing4li4run4tong2bi3zeng1zhang3 = v;}

    /**
    * name: 净利润-季度环比增长
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("净利润-季度环比增长")
    
    
    private String p_jing4li4run4ji4du4huan2bi3zeng1zhang3;

    public String getP_jing4li4run4ji4du4huan2bi3zeng1zhang3() { return this.p_jing4li4run4ji4du4huan2bi3zeng1zhang3;}
    public void setP_jing4li4run4ji4du4huan2bi3zeng1zhang3(String v) { this.p_jing4li4run4ji4du4huan2bi3zeng1zhang3 = v;}

    /**
    * name: 每股净资产
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("每股净资产")
    
    
    private String p_mei3gu3jing4zi1chan3;

    public String getP_mei3gu3jing4zi1chan3() { return this.p_mei3gu3jing4zi1chan3;}
    public void setP_mei3gu3jing4zi1chan3(String v) { this.p_mei3gu3jing4zi1chan3 = v;}

    /**
    * name: 净资产收益率
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("净资产收益率")
    
    
    private String p_jing4zi1chan3shou1yi4lu4;

    public String getP_jing4zi1chan3shou1yi4lu4() { return this.p_jing4zi1chan3shou1yi4lu4;}
    public void setP_jing4zi1chan3shou1yi4lu4(String v) { this.p_jing4zi1chan3shou1yi4lu4 = v;}

    /**
    * name: 所处行业
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("所处行业")
    
    
    private String p_suo3chu3xing2ye4;

    public String getP_suo3chu3xing2ye4() { return this.p_suo3chu3xing2ye4;}
    public void setP_suo3chu3xing2ye4(String v) { this.p_suo3chu3xing2ye4 = v;}

    /**
    * name: 公告日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("公告日期")
    @JsonDeserialize(using =
        JacksonDateDeserializer.class)
    
    
    private LocalDate p_gong1gao4ri4qi1;

    public LocalDate getP_gong1gao4ri4qi1() { return this.p_gong1gao4ri4qi1;}
    public void setP_gong1gao4ri4qi1(LocalDate v) { this.p_gong1gao4ri4qi1 = v;}

    /**
    * name: 市场板块
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("市场板块")
    
    
    private String p_shi4chang3ban3kuai4;

    public String getP_shi4chang3ban3kuai4() { return this.p_shi4chang3ban3kuai4;}
    public void setP_shi4chang3ban3kuai4(String v) { this.p_shi4chang3ban3kuai4 = v;}

    /**
    * name: 证券类型
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("证券类型")
    
    
    private String p_zheng4quan4lei4xing2;

    public String getP_zheng4quan4lei4xing2() { return this.p_zheng4quan4lei4xing2;}
    public void setP_zheng4quan4lei4xing2(String v) { this.p_zheng4quan4lei4xing2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
