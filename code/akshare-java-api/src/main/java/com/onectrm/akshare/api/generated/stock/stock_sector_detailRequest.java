
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
* 接口: stock_sector_detail
* 目标地址: http://finance.sina.com.cn/stock/sl/#area_1
* 描述: 新浪行业-板块行情-成份详情, 由于新浪网页提供的统计数据有误, 部分行业数量大于统计数
* 限量: 单次获取指定的新浪行业-板块行情-成份详情
*/
public class stock_sector_detailRequest extends AkShareRequestAndResponse {
    public stock_sector_detailRequest(){
        setInterfaceName("stock_sector_detail");
    }

    public static stock_sector_detailRequest of(


    String p_sector,


    Map.Entry<String, String>... others){
    stock_sector_detailRequest t = new stock_sector_detailRequest();


    t.p_sector = p_sector;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: sector
    * type: str
    * desc: sector=&quot;hangye_ZL01&quot;; 通过 **ak.stock_sector_spot** 返回数据的 label 字段选择 sector
    * required: 
    */
    @JsonProperty("sector")
    
    
    private String p_sector;

    public String getP_sector() { return this.p_sector;}
    public void setP_sector(String v) { this.p_sector = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}