
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: bond
* 接口: bond_treasure_issue_cninfo
* 目标地址: http://webapi.cninfo.com.cn/#/thematicStatistics
* 描述: 巨潮资讯-数据中心-专题统计-债券报表-债券发行-国债发行
* 限量: 
*/
public class bond_treasure_issue_cninfoResponse extends AkShareRequestAndResponse {
    public bond_treasure_issue_cninfoResponse(){
        setInterfaceName("bond_treasure_issue_cninfo");
    }

    public static bond_treasure_issue_cninfoResponse of(



    Map.Entry<String, String>... others){
    bond_treasure_issue_cninfoResponse t = new bond_treasure_issue_cninfoResponse();



        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }




    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
