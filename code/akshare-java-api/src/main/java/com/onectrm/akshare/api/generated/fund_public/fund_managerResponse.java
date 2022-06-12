
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: fund_public
* 接口: fund_manager
* 目标地址: http://fund.eastmoney.com/manager/default.html
* 描述: 天天基金网-基金数据-基金经理大全
* 限量: 单次返回所有基金经理数据
*/
public class fund_managerResponse extends AkShareRequestAndResponse {
    public fund_managerResponse(){
        setInterfaceName("fund_manager");
    }

    public static fund_managerResponse of(


    Integer p_lei3ji4cong2ye4shi2jian1,

    Double p_xian4ren4ji1jin1zui4jia1hui2bao4,

    String p_xu4hao4,

    String p_xian4ren4ji1jin1,

    String p_xing4ming2,

    String p_suo3shu3gong1si1,

    Double p_xian4ren4ji1jin1zi1chan3zong3gui1mo2,


    Map.Entry<String, String>... others){
    fund_managerResponse t = new fund_managerResponse();


    t.p_lei3ji4cong2ye4shi2jian1 = p_lei3ji4cong2ye4shi2jian1;

    t.p_xian4ren4ji1jin1zui4jia1hui2bao4 = p_xian4ren4ji1jin1zui4jia1hui2bao4;

    t.p_xu4hao4 = p_xu4hao4;

    t.p_xian4ren4ji1jin1 = p_xian4ren4ji1jin1;

    t.p_xing4ming2 = p_xing4ming2;

    t.p_suo3shu3gong1si1 = p_suo3shu3gong1si1;

    t.p_xian4ren4ji1jin1zi1chan3zong3gui1mo2 = p_xian4ren4ji1jin1zi1chan3zong3gui1mo2;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 累计从业时间
    * type: int64
    * desc: 注意单位: 天
    * required: 
    */
    @JsonProperty("累计从业时间")
    
    
    private Integer p_lei3ji4cong2ye4shi2jian1;

    public Integer getP_lei3ji4cong2ye4shi2jian1() { return this.p_lei3ji4cong2ye4shi2jian1;}
    public void setP_lei3ji4cong2ye4shi2jian1(Integer v) { this.p_lei3ji4cong2ye4shi2jian1 = v;}

    /**
    * name: 现任基金最佳回报
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("现任基金最佳回报")
    
    
    private Double p_xian4ren4ji1jin1zui4jia1hui2bao4;

    public Double getP_xian4ren4ji1jin1zui4jia1hui2bao4() { return this.p_xian4ren4ji1jin1zui4jia1hui2bao4;}
    public void setP_xian4ren4ji1jin1zui4jia1hui2bao4(Double v) { this.p_xian4ren4ji1jin1zui4jia1hui2bao4 = v;}

    /**
    * name: 序号
    * type: int32
    * desc: 
    * required: 
    */
    @JsonProperty("序号")
    
    
    private String p_xu4hao4;

    public String getP_xu4hao4() { return this.p_xu4hao4;}
    public void setP_xu4hao4(String v) { this.p_xu4hao4 = v;}

    /**
    * name: 现任基金
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("现任基金")
    
    
    private String p_xian4ren4ji1jin1;

    public String getP_xian4ren4ji1jin1() { return this.p_xian4ren4ji1jin1;}
    public void setP_xian4ren4ji1jin1(String v) { this.p_xian4ren4ji1jin1 = v;}

    /**
    * name: 姓名
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("姓名")
    
    
    private String p_xing4ming2;

    public String getP_xing4ming2() { return this.p_xing4ming2;}
    public void setP_xing4ming2(String v) { this.p_xing4ming2 = v;}

    /**
    * name: 所属公司
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("所属公司")
    
    
    private String p_suo3shu3gong1si1;

    public String getP_suo3shu3gong1si1() { return this.p_suo3shu3gong1si1;}
    public void setP_suo3shu3gong1si1(String v) { this.p_suo3shu3gong1si1 = v;}

    /**
    * name: 现任基金资产总规模
    * type: float64
    * desc: 注意单位: 亿元
    * required: 
    */
    @JsonProperty("现任基金资产总规模")
    
    
    private Double p_xian4ren4ji1jin1zi1chan3zong3gui1mo2;

    public Double getP_xian4ren4ji1jin1zi1chan3zong3gui1mo2() { return this.p_xian4ren4ji1jin1zi1chan3zong3gui1mo2;}
    public void setP_xian4ren4ji1jin1zi1chan3zong3gui1mo2(Double v) { this.p_xian4ren4ji1jin1zi1chan3zong3gui1mo2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
