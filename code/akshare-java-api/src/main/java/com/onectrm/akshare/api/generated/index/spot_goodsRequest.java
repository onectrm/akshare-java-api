
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: index
* 接口: spot_goods
* 目标地址: http://finance.sina.com.cn/futuremarket/spotprice.shtml#titlePos_0
* 描述: 新浪财经-商品现货价格指数
* 限量: 返回指定 symbol 的数据
*/
public class spot_goodsRequest extends AkShareRequestAndResponse {
    public spot_goodsRequest(){
        setInterfaceName("spot_goods");
    }

    public static spot_goodsRequest of(


    String p_symbol,


    Map.Entry<String, String>... others){
    spot_goodsRequest t = new spot_goodsRequest();


    t.p_symbol = p_symbol;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: symbol
    * type: str
    * desc: symbol=&quot;composite&quot;; choice of {&quot;composite&quot;, &quot;shanghai-rotterdam&quot;, &quot;rotterdam-shanghai&quot;, &quot;shanghai-los angeles&quot;, &quot;los angeles-shanghai&quot;, &quot;shanghai-genoa&quot;, &quot;new york-rotterdam&quot;, &quot;rotterdam-new york&quot;}
    * required: 
    */
    @JsonProperty("symbol")
    
    
    private String p_symbol;

    public String getP_symbol() { return this.p_symbol;}
    public void setP_symbol(String v) { this.p_symbol = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}