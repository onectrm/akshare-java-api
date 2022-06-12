
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
* 接口: stock_board_concept_name_em
* 目标地址: http://quote.eastmoney.com/center/boardlist.html#concept_board
* 描述: 东方财富-沪深板块-概念板块
* 限量: 单次返回当前时刻所有概念板块数据
*/
public class stock_board_concept_name_emResponse extends AkShareRequestAndResponse {
    public stock_board_concept_name_emResponse(){
        setInterfaceName("stock_board_concept_name_em");
    }

    public static stock_board_concept_name_emResponse of(


    Double p_zhang3die1e2,

    String p_ban3kuai4dai4ma3,

    Integer p_zong3shi4zhi2,

    String p_ling3zhang3gu3piao4,

    Integer p_shang4zhang3jia1shu4,

    Integer p_pai2ming2,

    Integer p_xia4die1jia1shu4,

    Double p_huan4shou3lu4,

    Double p_zhang3die1fu2,

    Double p_zui4xin1jia4,

    String p_ban3kuai4ming2cheng1,

    Double p_ling3zhang3gu3piao4zhang3die1fu2,


    Map.Entry<String, String>... others){
    stock_board_concept_name_emResponse t = new stock_board_concept_name_emResponse();


    t.p_zhang3die1e2 = p_zhang3die1e2;

    t.p_ban3kuai4dai4ma3 = p_ban3kuai4dai4ma3;

    t.p_zong3shi4zhi2 = p_zong3shi4zhi2;

    t.p_ling3zhang3gu3piao4 = p_ling3zhang3gu3piao4;

    t.p_shang4zhang3jia1shu4 = p_shang4zhang3jia1shu4;

    t.p_pai2ming2 = p_pai2ming2;

    t.p_xia4die1jia1shu4 = p_xia4die1jia1shu4;

    t.p_huan4shou3lu4 = p_huan4shou3lu4;

    t.p_zhang3die1fu2 = p_zhang3die1fu2;

    t.p_zui4xin1jia4 = p_zui4xin1jia4;

    t.p_ban3kuai4ming2cheng1 = p_ban3kuai4ming2cheng1;

    t.p_ling3zhang3gu3piao4zhang3die1fu2 = p_ling3zhang3gu3piao4zhang3die1fu2;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



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
    * name: 板块代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("板块代码")
    
    
    private String p_ban3kuai4dai4ma3;

    public String getP_ban3kuai4dai4ma3() { return this.p_ban3kuai4dai4ma3;}
    public void setP_ban3kuai4dai4ma3(String v) { this.p_ban3kuai4dai4ma3 = v;}

    /**
    * name: 总市值
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("总市值")
    
    
    private Integer p_zong3shi4zhi2;

    public Integer getP_zong3shi4zhi2() { return this.p_zong3shi4zhi2;}
    public void setP_zong3shi4zhi2(Integer v) { this.p_zong3shi4zhi2 = v;}

    /**
    * name: 领涨股票
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("领涨股票")
    
    
    private String p_ling3zhang3gu3piao4;

    public String getP_ling3zhang3gu3piao4() { return this.p_ling3zhang3gu3piao4;}
    public void setP_ling3zhang3gu3piao4(String v) { this.p_ling3zhang3gu3piao4 = v;}

    /**
    * name: 上涨家数
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("上涨家数")
    
    
    private Integer p_shang4zhang3jia1shu4;

    public Integer getP_shang4zhang3jia1shu4() { return this.p_shang4zhang3jia1shu4;}
    public void setP_shang4zhang3jia1shu4(Integer v) { this.p_shang4zhang3jia1shu4 = v;}

    /**
    * name: 排名
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("排名")
    
    
    private Integer p_pai2ming2;

    public Integer getP_pai2ming2() { return this.p_pai2ming2;}
    public void setP_pai2ming2(Integer v) { this.p_pai2ming2 = v;}

    /**
    * name: 下跌家数
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("下跌家数")
    
    
    private Integer p_xia4die1jia1shu4;

    public Integer getP_xia4die1jia1shu4() { return this.p_xia4die1jia1shu4;}
    public void setP_xia4die1jia1shu4(Integer v) { this.p_xia4die1jia1shu4 = v;}

    /**
    * name: 换手率
    * type: float64
    * desc: 注意单位：%
    * required: 
    */
    @JsonProperty("换手率")
    
    
    private Double p_huan4shou3lu4;

    public Double getP_huan4shou3lu4() { return this.p_huan4shou3lu4;}
    public void setP_huan4shou3lu4(Double v) { this.p_huan4shou3lu4 = v;}

    /**
    * name: 涨跌幅
    * type: float64
    * desc: 注意单位：%
    * required: 
    */
    @JsonProperty("涨跌幅")
    
    
    private Double p_zhang3die1fu2;

    public Double getP_zhang3die1fu2() { return this.p_zhang3die1fu2;}
    public void setP_zhang3die1fu2(Double v) { this.p_zhang3die1fu2 = v;}

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
    * name: 板块名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("板块名称")
    
    
    private String p_ban3kuai4ming2cheng1;

    public String getP_ban3kuai4ming2cheng1() { return this.p_ban3kuai4ming2cheng1;}
    public void setP_ban3kuai4ming2cheng1(String v) { this.p_ban3kuai4ming2cheng1 = v;}

    /**
    * name: 领涨股票-涨跌幅
    * type: float64
    * desc: 注意单位：%
    * required: 
    */
    @JsonProperty("领涨股票-涨跌幅")
    
    
    private Double p_ling3zhang3gu3piao4zhang3die1fu2;

    public Double getP_ling3zhang3gu3piao4zhang3die1fu2() { return this.p_ling3zhang3gu3piao4zhang3die1fu2;}
    public void setP_ling3zhang3gu3piao4zhang3die1fu2(Double v) { this.p_ling3zhang3gu3piao4zhang3die1fu2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
