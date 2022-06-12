
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
* 接口: stock_average_position_legu
* 目标地址: https://www.legulegu.com/stockdata/averageposition
* 描述: 乐咕乐股网-调查平均持仓数据; 该数据近期未更新
* 限量: 单次返回所有平均持仓数据
*/
public class stock_average_position_leguResponse extends AkShareRequestAndResponse {
    public stock_average_position_leguResponse(){
        setInterfaceName("stock_average_position_legu");
    }

    public static stock_average_position_leguResponse of(


    Integer p_2039,

    Integer p_8099,

    LocalDate p_ri4qi1,

    Double p_shang4zheng4zhi3shu4,

    Integer p_6079,

    Integer p_ping2jun1chi2cang1,

    Integer p_man3cang1rong2zi1,

    Integer p_4059,

    Integer p_019,


    Map.Entry<String, String>... others){
    stock_average_position_leguResponse t = new stock_average_position_leguResponse();


    t.p_2039 = p_2039;

    t.p_8099 = p_8099;

    t.p_ri4qi1 = p_ri4qi1;

    t.p_shang4zheng4zhi3shu4 = p_shang4zheng4zhi3shu4;

    t.p_6079 = p_6079;

    t.p_ping2jun1chi2cang1 = p_ping2jun1chi2cang1;

    t.p_man3cang1rong2zi1 = p_man3cang1rong2zi1;

    t.p_4059 = p_4059;

    t.p_019 = p_019;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 20%~39%
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("20%~39%")
    
    
    private Integer p_2039;

    public Integer getP_2039() { return this.p_2039;}
    public void setP_2039(Integer v) { this.p_2039 = v;}

    /**
    * name: 80%~99%
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("80%~99%")
    
    
    private Integer p_8099;

    public Integer getP_8099() { return this.p_8099;}
    public void setP_8099(Integer v) { this.p_8099 = v;}

    /**
    * name: 日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_ri4qi1;

    public LocalDate getP_ri4qi1() { return this.p_ri4qi1;}
    public void setP_ri4qi1(LocalDate v) { this.p_ri4qi1 = v;}

    /**
    * name: 上证指数
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("上证指数")
    
    
    private Double p_shang4zheng4zhi3shu4;

    public Double getP_shang4zheng4zhi3shu4() { return this.p_shang4zheng4zhi3shu4;}
    public void setP_shang4zheng4zhi3shu4(Double v) { this.p_shang4zheng4zhi3shu4 = v;}

    /**
    * name: 60%~79%
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("60%~79%")
    
    
    private Integer p_6079;

    public Integer getP_6079() { return this.p_6079;}
    public void setP_6079(Integer v) { this.p_6079 = v;}

    /**
    * name: 平均持仓
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("平均持仓")
    
    
    private Integer p_ping2jun1chi2cang1;

    public Integer getP_ping2jun1chi2cang1() { return this.p_ping2jun1chi2cang1;}
    public void setP_ping2jun1chi2cang1(Integer v) { this.p_ping2jun1chi2cang1 = v;}

    /**
    * name: 满仓+融资
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("满仓+融资")
    
    
    private Integer p_man3cang1rong2zi1;

    public Integer getP_man3cang1rong2zi1() { return this.p_man3cang1rong2zi1;}
    public void setP_man3cang1rong2zi1(Integer v) { this.p_man3cang1rong2zi1 = v;}

    /**
    * name: 40%~59%
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("40%~59%")
    
    
    private Integer p_4059;

    public Integer getP_4059() { return this.p_4059;}
    public void setP_4059(Integer v) { this.p_4059 = v;}

    /**
    * name: 0%~19%
    * type: int64
    * desc: 
    * required: 
    */
    @JsonProperty("0%~19%")
    
    
    private Integer p_019;

    public Integer getP_019() { return this.p_019;}
    public void setP_019(Integer v) { this.p_019 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
