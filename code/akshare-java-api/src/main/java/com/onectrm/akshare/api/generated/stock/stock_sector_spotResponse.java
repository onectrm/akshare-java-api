
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
* 接口: stock_sector_spot
* 目标地址: http://finance.sina.com.cn/stock/sl/
* 描述: 新浪行业-板块行情
* 限量: 单次获取指定的板块行情实时数据
*/
public class stock_sector_spotResponse extends AkShareRequestAndResponse {
    public stock_sector_spotResponse(){
        setInterfaceName("stock_sector_spot");
    }

    public static stock_sector_spotResponse of(


    String p_gu3piao4ming2cheng1,

    Integer p_zong3cheng2jiao1e2,

    String p_gu3piao4dai4ma3,

    String p_ban3kuai4,

    String p_label,

    Double p_zhang3die1e2,

    Double p_ping2jun1jia4ge2,

    Integer p_zong3cheng2jiao1liang4,

    Double p_zhang3die1fu2,

    Double p_ge4gu3zhang3die1fu2,

    Double p_ge4gu3dang1qian2jia4,

    Double p_ge4gu3zhang3die1e2,

    Integer p_gong1si1jia1shu4,


    Map.Entry<String, String>... others){
    stock_sector_spotResponse t = new stock_sector_spotResponse();


    t.p_gu3piao4ming2cheng1 = p_gu3piao4ming2cheng1;

    t.p_zong3cheng2jiao1e2 = p_zong3cheng2jiao1e2;

    t.p_gu3piao4dai4ma3 = p_gu3piao4dai4ma3;

    t.p_ban3kuai4 = p_ban3kuai4;

    t.p_label = p_label;

    t.p_zhang3die1e2 = p_zhang3die1e2;

    t.p_ping2jun1jia4ge2 = p_ping2jun1jia4ge2;

    t.p_zong3cheng2jiao1liang4 = p_zong3cheng2jiao1liang4;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_ge4gu3zhang3die1fu2 = p_ge4gu3zhang3die1fu2;

    t.p_ge4gu3dang1qian2jia4 = p_ge4gu3dang1qian2jia4;

    t.p_ge4gu3zhang3die1e2 = p_ge4gu3zhang3die1e2;

    t.p_gong1si1jia1shu4 = p_gong1si1jia1shu4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 股票名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("股票名称")
    
    
    private String p_gu3piao4ming2cheng1;

    public String getP_gu3piao4ming2cheng1() { return this.p_gu3piao4ming2cheng1;}
    public void setP_gu3piao4ming2cheng1(String v) { this.p_gu3piao4ming2cheng1 = v;}

    /**
    * name: 总成交额
    * type: int64
    * desc: 注意单位: 万元
    * required: 
    */
    @JsonProperty("总成交额")
    
    
    private Integer p_zong3cheng2jiao1e2;

    public Integer getP_zong3cheng2jiao1e2() { return this.p_zong3cheng2jiao1e2;}
    public void setP_zong3cheng2jiao1e2(Integer v) { this.p_zong3cheng2jiao1e2 = v;}

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
    * name: 板块
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("板块")
    
    
    private String p_ban3kuai4;

    public String getP_ban3kuai4() { return this.p_ban3kuai4;}
    public void setP_ban3kuai4(String v) { this.p_ban3kuai4 = v;}

    /**
    * name: label
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("label")
    
    
    private String p_label;

    public String getP_label() { return this.p_label;}
    public void setP_label(String v) { this.p_label = v;}

    /**
    * name: 涨跌额
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("涨跌额")
    
    
    private Double p_zhang3die1e2;

    public Double getP_zhang3die1e2() { return this.p_zhang3die1e2;}
    public void setP_zhang3die1e2(Double v) { this.p_zhang3die1e2 = v;}

    /**
    * name: 平均价格
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("平均价格")
    
    
    private Double p_ping2jun1jia4ge2;

    public Double getP_ping2jun1jia4ge2() { return this.p_ping2jun1jia4ge2;}
    public void setP_ping2jun1jia4ge2(Double v) { this.p_ping2jun1jia4ge2 = v;}

    /**
    * name: 总成交量
    * type: int64
    * desc: 注意单位: 手
    * required: 
    */
    @JsonProperty("总成交量")
    
    
    private Integer p_zong3cheng2jiao1liang4;

    public Integer getP_zong3cheng2jiao1liang4() { return this.p_zong3cheng2jiao1liang4;}
    public void setP_zong3cheng2jiao1liang4(Integer v) { this.p_zong3cheng2jiao1liang4 = v;}

    /**
    * name: 涨跌幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("涨跌幅")
    
    
    private Double p_zhang3die1fu2;

    public Double getP_zhang3die1fu2() { return this.p_zhang3die1fu2;}
    public void setP_zhang3die1fu2(Double v) { this.p_zhang3die1fu2 = v;}

    /**
    * name: 个股-涨跌幅
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("个股-涨跌幅")
    
    
    private Double p_ge4gu3zhang3die1fu2;

    public Double getP_ge4gu3zhang3die1fu2() { return this.p_ge4gu3zhang3die1fu2;}
    public void setP_ge4gu3zhang3die1fu2(Double v) { this.p_ge4gu3zhang3die1fu2 = v;}

    /**
    * name: 个股-当前价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("个股-当前价")
    
    
    private Double p_ge4gu3dang1qian2jia4;

    public Double getP_ge4gu3dang1qian2jia4() { return this.p_ge4gu3dang1qian2jia4;}
    public void setP_ge4gu3dang1qian2jia4(Double v) { this.p_ge4gu3dang1qian2jia4 = v;}

    /**
    * name: 个股-涨跌额
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("个股-涨跌额")
    
    
    private Double p_ge4gu3zhang3die1e2;

    public Double getP_ge4gu3zhang3die1e2() { return this.p_ge4gu3zhang3die1e2;}
    public void setP_ge4gu3zhang3die1e2(Double v) { this.p_ge4gu3zhang3die1e2 = v;}

    /**
    * name: 公司家数
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("公司家数")
    
    
    private Integer p_gong1si1jia1shu4;

    public Integer getP_gong1si1jia1shu4() { return this.p_gong1si1jia1shu4;}
    public void setP_gong1si1jia1shu4(Integer v) { this.p_gong1si1jia1shu4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}