
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
* 接口: macro_usa_cftc_nc_holding
* 目标地址: https://datacenter.jin10.com/reportType/dc_cftc_nc_report
* 描述: 获取美国商品期货交易委员会CFTC外汇类非商业持仓报告, 数据区间从 19830107-至今
* 限量: 单次返回所有历史数据
*/
public class macro_usa_cftc_nc_holdingResponse extends AkShareRequestAndResponse {
    public macro_usa_cftc_nc_holdingResponse(){
        setInterfaceName("macro_usa_cftc_nc_holding");
    }

    public static macro_usa_cftc_nc_holdingResponse of(


    String p_bu4tong2pin3zhong3de5duo1tou2cang1wei4kong1tou2cang1wei4he2jing4cang1wei4,


    Map.Entry<String, String>... others){
    macro_usa_cftc_nc_holdingResponse t = new macro_usa_cftc_nc_holdingResponse();


    t.p_bu4tong2pin3zhong3de5duo1tou2cang1wei4kong1tou2cang1wei4he2jing4cang1wei4 = p_bu4tong2pin3zhong3de5duo1tou2cang1wei4kong1tou2cang1wei4he2jing4cang1wei4;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 
    * type: 
    * desc: 不同品种的多头仓位、空头仓位和净仓位
    * required: 
    */
    @JsonProperty("")
    
    
    private String p_bu4tong2pin3zhong3de5duo1tou2cang1wei4kong1tou2cang1wei4he2jing4cang1wei4;

    public String getP_bu4tong2pin3zhong3de5duo1tou2cang1wei4kong1tou2cang1wei4he2jing4cang1wei4() { return this.p_bu4tong2pin3zhong3de5duo1tou2cang1wei4kong1tou2cang1wei4he2jing4cang1wei4;}
    public void setP_bu4tong2pin3zhong3de5duo1tou2cang1wei4kong1tou2cang1wei4he2jing4cang1wei4(String v) { this.p_bu4tong2pin3zhong3de5duo1tou2cang1wei4kong1tou2cang1wei4he2jing4cang1wei4 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
