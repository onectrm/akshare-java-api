
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:02 CST 2022*/
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
* 接口: stock_xgsglb_em
* 目标地址: http://data.eastmoney.com/xg/xg/default_2.html
* 描述: 东方财富网-数据中心-新股数据-新股申购-新股申购与中签查询
* 限量: 单次获取指定 market 的新股申购与中签查询数据
*/
public class stock_xgsglb_emResponse extends AkShareRequestAndResponse {
    public stock_xgsglb_emResponse(){
        setInterfaceName("stock_xgsglb_em");
    }

    public static stock_xgsglb_emResponse of(


    Integer p_shen1gou4shang4xian4,

    Double p_pei4shou4dui4xiang4bao4jia4jia1shu4,

    Double p_fa1xing2zong3shu4,

    Double p_mei3zhong1yi1qian1huo4li4,

    String p_shen1gou4dai4ma3,

    Double p_shou3ri4shou1pan2jia4,

    LocalDate p_shang4shi4ri4qi1,

    String p_gu3piao4jian3cheng1,

    String p_gu3piao4dai4ma3,

    Double p_zui4xin1jia4,

    Double p_xun2jia4lei3ji4bao4jia4bei4shu4,

    Double p_zhang3fu2,

    Double p_fa1xing2jia4ge2,

    String p_lian2xu4yi1zi4ban3shu4liang4,

    Double p_fa1xing2shi4ying2lu4,

    String p_zhong1qian1hao4gong1bu4ri4,

    LocalDate p_zhong1qian1jiao3kuan3ri4qi1,

    Integer p_wang3shang4fa1xing2,

    Double p_ding3ge2shen1gou4xu1pei4shi4zhi2,

    Double p_xing2ye4shi4ying2lu4,

    LocalDate p_shen1gou4ri4qi1,

    Double p_zhong1qian1lu4,


    Map.Entry<String, String>... others){
    stock_xgsglb_emResponse t = new stock_xgsglb_emResponse();


    t.p_shen1gou4shang4xian4 = p_shen1gou4shang4xian4;

    t.p_pei4shou4dui4xiang4bao4jia4jia1shu4 = p_pei4shou4dui4xiang4bao4jia4jia1shu4;

    t.p_fa1xing2zong3shu4 = p_fa1xing2zong3shu4;

    t.p_mei3zhong1yi1qian1huo4li4 = p_mei3zhong1yi1qian1huo4li4;

    t.p_shen1gou4dai4ma3 = p_shen1gou4dai4ma3;

    t.p_shou3ri4shou1pan2jia4 = p_shou3ri4shou1pan2jia4;

    t.p_shang4shi4ri4qi1 = p_shang4shi4ri4qi1;

    t.p_gu3piao4jian3cheng1 = p_gu3piao4jian3cheng1;

    t.p_gu3piao4dai4ma3 = p_gu3piao4dai4ma3;

    t.p_zui4xin1jia4 = p_zui4xin1jia4;

    t.p_xun2jia4lei3ji4bao4jia4bei4shu4 = p_xun2jia4lei3ji4bao4jia4bei4shu4;

    t.p_zhang3fu2 = p_zhang3fu2;

    t.p_fa1xing2jia4ge2 = p_fa1xing2jia4ge2;

    t.p_lian2xu4yi1zi4ban3shu4liang4 = p_lian2xu4yi1zi4ban3shu4liang4;

    t.p_fa1xing2shi4ying2lu4 = p_fa1xing2shi4ying2lu4;

    t.p_zhong1qian1hao4gong1bu4ri4 = p_zhong1qian1hao4gong1bu4ri4;

    t.p_zhong1qian1jiao3kuan3ri4qi1 = p_zhong1qian1jiao3kuan3ri4qi1;

    t.p_wang3shang4fa1xing2 = p_wang3shang4fa1xing2;

    t.p_ding3ge2shen1gou4xu1pei4shi4zhi2 = p_ding3ge2shen1gou4xu1pei4shi4zhi2;

    t.p_xing2ye4shi4ying2lu4 = p_xing2ye4shi4ying2lu4;

    t.p_shen1gou4ri4qi1 = p_shen1gou4ri4qi1;

    t.p_zhong1qian1lu4 = p_zhong1qian1lu4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 申购上限
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("申购上限")
    
    
    private Integer p_shen1gou4shang4xian4;

    public Integer getP_shen1gou4shang4xian4() { return this.p_shen1gou4shang4xian4;}
    public void setP_shen1gou4shang4xian4(Integer v) { this.p_shen1gou4shang4xian4 = v;}

    /**
    * name: 配售对象报价家数
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("配售对象报价家数")
    
    
    private Double p_pei4shou4dui4xiang4bao4jia4jia1shu4;

    public Double getP_pei4shou4dui4xiang4bao4jia4jia1shu4() { return this.p_pei4shou4dui4xiang4bao4jia4jia1shu4;}
    public void setP_pei4shou4dui4xiang4bao4jia4jia1shu4(Double v) { this.p_pei4shou4dui4xiang4bao4jia4jia1shu4 = v;}

    /**
    * name: 发行总数
    * type: float64
    * desc: 注意单位: 股
    * required: 
    */
    @JsonProperty("发行总数")
    
    
    private Double p_fa1xing2zong3shu4;

    public Double getP_fa1xing2zong3shu4() { return this.p_fa1xing2zong3shu4;}
    public void setP_fa1xing2zong3shu4(Double v) { this.p_fa1xing2zong3shu4 = v;}

    /**
    * name: 每中一签获利
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("每中一签获利")
    
    
    private Double p_mei3zhong1yi1qian1huo4li4;

    public Double getP_mei3zhong1yi1qian1huo4li4() { return this.p_mei3zhong1yi1qian1huo4li4;}
    public void setP_mei3zhong1yi1qian1huo4li4(Double v) { this.p_mei3zhong1yi1qian1huo4li4 = v;}

    /**
    * name: 申购代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("申购代码")
    
    
    private String p_shen1gou4dai4ma3;

    public String getP_shen1gou4dai4ma3() { return this.p_shen1gou4dai4ma3;}
    public void setP_shen1gou4dai4ma3(String v) { this.p_shen1gou4dai4ma3 = v;}

    /**
    * name: 首日收盘价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("首日收盘价")
    
    
    private Double p_shou3ri4shou1pan2jia4;

    public Double getP_shou3ri4shou1pan2jia4() { return this.p_shou3ri4shou1pan2jia4;}
    public void setP_shou3ri4shou1pan2jia4(Double v) { this.p_shou3ri4shou1pan2jia4 = v;}

    /**
    * name: 上市日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("上市日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_shang4shi4ri4qi1;

    public LocalDate getP_shang4shi4ri4qi1() { return this.p_shang4shi4ri4qi1;}
    public void setP_shang4shi4ri4qi1(LocalDate v) { this.p_shang4shi4ri4qi1 = v;}

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
    * name: 询价累计报价倍数
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("询价累计报价倍数")
    
    
    private Double p_xun2jia4lei3ji4bao4jia4bei4shu4;

    public Double getP_xun2jia4lei3ji4bao4jia4bei4shu4() { return this.p_xun2jia4lei3ji4bao4jia4bei4shu4;}
    public void setP_xun2jia4lei3ji4bao4jia4bei4shu4(Double v) { this.p_xun2jia4lei3ji4bao4jia4bei4shu4 = v;}

    /**
    * name: 涨幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("涨幅")
    
    
    private Double p_zhang3fu2;

    public Double getP_zhang3fu2() { return this.p_zhang3fu2;}
    public void setP_zhang3fu2(Double v) { this.p_zhang3fu2 = v;}

    /**
    * name: 发行价格
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("发行价格")
    
    
    private Double p_fa1xing2jia4ge2;

    public Double getP_fa1xing2jia4ge2() { return this.p_fa1xing2jia4ge2;}
    public void setP_fa1xing2jia4ge2(Double v) { this.p_fa1xing2jia4ge2 = v;}

    /**
    * name: 连续一字板数量
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("连续一字板数量")
    
    
    private String p_lian2xu4yi1zi4ban3shu4liang4;

    public String getP_lian2xu4yi1zi4ban3shu4liang4() { return this.p_lian2xu4yi1zi4ban3shu4liang4;}
    public void setP_lian2xu4yi1zi4ban3shu4liang4(String v) { this.p_lian2xu4yi1zi4ban3shu4liang4 = v;}

    /**
    * name: 发行市盈率
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("发行市盈率")
    
    
    private Double p_fa1xing2shi4ying2lu4;

    public Double getP_fa1xing2shi4ying2lu4() { return this.p_fa1xing2shi4ying2lu4;}
    public void setP_fa1xing2shi4ying2lu4(Double v) { this.p_fa1xing2shi4ying2lu4 = v;}

    /**
    * name: 中签号公布日
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("中签号公布日")
    
    
    private String p_zhong1qian1hao4gong1bu4ri4;

    public String getP_zhong1qian1hao4gong1bu4ri4() { return this.p_zhong1qian1hao4gong1bu4ri4;}
    public void setP_zhong1qian1hao4gong1bu4ri4(String v) { this.p_zhong1qian1hao4gong1bu4ri4 = v;}

    /**
    * name: 中签缴款日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("中签缴款日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_zhong1qian1jiao3kuan3ri4qi1;

    public LocalDate getP_zhong1qian1jiao3kuan3ri4qi1() { return this.p_zhong1qian1jiao3kuan3ri4qi1;}
    public void setP_zhong1qian1jiao3kuan3ri4qi1(LocalDate v) { this.p_zhong1qian1jiao3kuan3ri4qi1 = v;}

    /**
    * name: 网上发行
    * type: int64
    * desc: 注意单位: 股
    * required: 
    */
    @JsonProperty("网上发行")
    
    
    private Integer p_wang3shang4fa1xing2;

    public Integer getP_wang3shang4fa1xing2() { return this.p_wang3shang4fa1xing2;}
    public void setP_wang3shang4fa1xing2(Integer v) { this.p_wang3shang4fa1xing2 = v;}

    /**
    * name: 顶格申购需配市值
    * type: float64
    * desc: 注意单位: 股
    * required: 
    */
    @JsonProperty("顶格申购需配市值")
    
    
    private Double p_ding3ge2shen1gou4xu1pei4shi4zhi2;

    public Double getP_ding3ge2shen1gou4xu1pei4shi4zhi2() { return this.p_ding3ge2shen1gou4xu1pei4shi4zhi2;}
    public void setP_ding3ge2shen1gou4xu1pei4shi4zhi2(Double v) { this.p_ding3ge2shen1gou4xu1pei4shi4zhi2 = v;}

    /**
    * name: 行业市盈率
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("行业市盈率")
    
    
    private Double p_xing2ye4shi4ying2lu4;

    public Double getP_xing2ye4shi4ying2lu4() { return this.p_xing2ye4shi4ying2lu4;}
    public void setP_xing2ye4shi4ying2lu4(Double v) { this.p_xing2ye4shi4ying2lu4 = v;}

    /**
    * name: 申购日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("申购日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_shen1gou4ri4qi1;

    public LocalDate getP_shen1gou4ri4qi1() { return this.p_shen1gou4ri4qi1;}
    public void setP_shen1gou4ri4qi1(LocalDate v) { this.p_shen1gou4ri4qi1 = v;}

    /**
    * name: 中签率
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("中签率")
    
    
    private Double p_zhong1qian1lu4;

    public Double getP_zhong1qian1lu4() { return this.p_zhong1qian1lu4;}
    public void setP_zhong1qian1lu4(Double v) { this.p_zhong1qian1lu4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
