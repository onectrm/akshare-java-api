
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:02 CST 2022*/
package com.onectrm.akshare.api.generated.macro;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: macro
* 接口: macro_china_retail_price_index
* 目标地址: http://finance.sina.com.cn/mac/#price-12-0-31-1
* 描述: 国家统计局-商品零售价格指数
* 限量: 单次返回所有历史数据
*/
public class macro_china_retail_price_indexResponse extends AkShareRequestAndResponse {
    public macro_china_retail_price_indexResponse(){
        setInterfaceName("macro_china_retail_price_index");
    }

    public static macro_china_retail_price_indexResponse of(


    String p_tong3ji4yue4fen4,

    Double p_ling2shou4shang1pin3jia4ge2zhi3shu4,

    String p_ju1min2xiao1fei4xiang4mu4,


    Map.Entry<String, String>... others){
    macro_china_retail_price_indexResponse t = new macro_china_retail_price_indexResponse();


    t.p_tong3ji4yue4fen4 = p_tong3ji4yue4fen4;

    t.p_ling2shou4shang1pin3jia4ge2zhi3shu4 = p_ling2shou4shang1pin3jia4ge2zhi3shu4;

    t.p_ju1min2xiao1fei4xiang4mu4 = p_ju1min2xiao1fei4xiang4mu4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 统计月份
    * type: str
    * desc: 年月
    * required: Y
    */
    @JsonProperty("统计月份")
    
    
    private String p_tong3ji4yue4fen4;

    public String getP_tong3ji4yue4fen4() { return this.p_tong3ji4yue4fen4;}
    public void setP_tong3ji4yue4fen4(String v) { this.p_tong3ji4yue4fen4 = v;}

    /**
    * name: 零售商品价格指数
    * type: float
    * desc: 
    * required: Y
    */
    @JsonProperty("零售商品价格指数")
    
    
    private Double p_ling2shou4shang1pin3jia4ge2zhi3shu4;

    public Double getP_ling2shou4shang1pin3jia4ge2zhi3shu4() { return this.p_ling2shou4shang1pin3jia4ge2zhi3shu4;}
    public void setP_ling2shou4shang1pin3jia4ge2zhi3shu4(Double v) { this.p_ling2shou4shang1pin3jia4ge2zhi3shu4 = v;}

    /**
    * name: 居民消费项目
    * type: str
    * desc: 
    * required: Y
    */
    @JsonProperty("居民消费项目")
    
    
    private String p_ju1min2xiao1fei4xiang4mu4;

    public String getP_ju1min2xiao1fei4xiang4mu4() { return this.p_ju1min2xiao1fei4xiang4mu4;}
    public void setP_ju1min2xiao1fei4xiang4mu4(String v) { this.p_ju1min2xiao1fei4xiang4mu4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
