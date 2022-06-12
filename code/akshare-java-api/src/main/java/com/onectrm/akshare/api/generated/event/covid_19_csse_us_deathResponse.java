
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.event;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: event
* 接口: covid_19_csse_us_death
* 目标地址: https://github.com/CSSEGISandData/COVID-19
* 描述: 获取美国死亡数据所有历史数据, 如本地无法读取数据，请参考 **[答疑专栏]** 问题 12 修改本地 host 后获取
* 限量: 单次返回所有历史数据，每日更新
*/
public class covid_19_csse_us_deathResponse extends AkShareRequestAndResponse {
    public covid_19_csse_us_deathResponse(){
        setInterfaceName("covid_19_csse_us_death");
    }

    public static covid_19_csse_us_deathResponse of(


    String p_CountryRegion,

    Double p_LatandLong,

    String p_ProvinceState,

    Double p_Datefields,


    Map.Entry<String, String>... others){
    covid_19_csse_us_deathResponse t = new covid_19_csse_us_deathResponse();


    t.p_CountryRegion = p_CountryRegion;

    t.p_LatandLong = p_LatandLong;

    t.p_ProvinceState = p_ProvinceState;

    t.p_Datefields = p_Datefields;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: Country/Region
    * type: str
    * desc: country/region name conforming to WHO (will be updated).
    * required: Y
    */
    @JsonProperty("Country/Region")
    
    
    private String p_CountryRegion;

    public String getP_CountryRegion() { return this.p_CountryRegion;}
    public void setP_CountryRegion(String v) { this.p_CountryRegion = v;}

    /**
    * name: Lat and Long
    * type: float
    * desc: a coordinates reference for the user.
    * required: Y
    */
    @JsonProperty("Lat and Long")
    
    
    private Double p_LatandLong;

    public Double getP_LatandLong() { return this.p_LatandLong;}
    public void setP_LatandLong(Double v) { this.p_LatandLong = v;}

    /**
    * name: Province/State
    * type: str
    * desc: Province/State: China - province name; US/Canada/Australia/ - city name, state/province name; Others - name of the event (e.g., &quot;Diamond Princess&quot; cruise ship); other countries - blank.
    * required: Y
    */
    @JsonProperty("Province/State")
    
    
    private String p_ProvinceState;

    public String getP_ProvinceState() { return this.p_ProvinceState;}
    public void setP_ProvinceState(String v) { this.p_ProvinceState = v;}

    /**
    * name: Date fields
    * type: float
    * desc: M/DD/YYYY (UTC), the same data as MM-DD-YYYY.csv file.
    * required: Y
    */
    @JsonProperty("Date fields")
    
    
    private Double p_Datefields;

    public Double getP_Datefields() { return this.p_Datefields;}
    public void setP_Datefields(Double v) { this.p_Datefields = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
