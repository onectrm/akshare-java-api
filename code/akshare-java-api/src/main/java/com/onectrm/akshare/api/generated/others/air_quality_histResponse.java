
    /*generated by AKShare JAVA API Generator Mon Jun 13 13:48:50 CST 2022*/
    package com.onectrm.akshare.api.generated.others;

    import com.onectrm.akshare.api.JacksonDateDeserializer;
    import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
    import com.onectrm.akshare.api.AkShareRequestAndResponse;
    import com.fasterxml.jackson.annotation.*;
    import com.fasterxml.jackson.databind.annotation.*;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.*;

    /**
    * 分类: others
    * 接口: air_quality_hist
    * 目标地址: https://www.zq12369.com/
    * 描述: 指定城市和数据频率下并且在指定时间段内的空气质量数据
    * 限量: 单次返回所有的数据, 在提取一小时频率数据时请注意时间跨度不宜过长, 提取日频率数据的早年数据请分段提取
    */
    public class air_quality_histResponse extends AkShareRequestAndResponse {
    public air_quality_histResponse(){
    setInterfaceName("air_quality_hist");
    }

    public static air_quality_histResponse of(


    LocalDateTime p_time,

    String p_aqi,

    Double p_pm25,

    String p_pm10,

    Double p_co,

    String p_no2,

    String p_o3,

    String p_so2,

    String p_complexindex,

    String p_rank,

    String p_primarypollutant,

    String p_temp,

    String p_humi,

    String p_windlevel,

    String p_winddirection,

    String p_weather,


    Map.Entry
    <String
    , String>... others){
    air_quality_histResponse t = new air_quality_histResponse();


    t.p_time = p_time;

    t.p_aqi = p_aqi;

    t.p_pm25 = p_pm25;

    t.p_pm10 = p_pm10;

    t.p_co = p_co;

    t.p_no2 = p_no2;

    t.p_o3 = p_o3;

    t.p_so2 = p_so2;

    t.p_complexindex = p_complexindex;

    t.p_rank = p_rank;

    t.p_primarypollutant = p_primarypollutant;

    t.p_temp = p_temp;

    t.p_humi = p_humi;

    t.p_windlevel = p_windlevel;

    t.p_winddirection = p_winddirection;

    t.p_weather = p_weather;


    for (Map.Entry
    <String
    , String> o : others) {
    t.other.put(o.getKey(), o.getValue());
    }

    return t;
    }



    /**
    * name: time
    * type: object
    * desc: 日期时间索引
    * required: 
    */
    @JsonProperty("time")
    
    @JsonDeserialize(using =
        JacksonDateTimeDeserializer.class)
    
    private LocalDateTime p_time;

    public LocalDateTime getP_time() { return this.p_time;}
    public void setP_time(LocalDateTime v) { this.p_time = v;}

    /**
    * name: aqi
    * type: object
    * desc: AQI
    * required: 
    */
    @JsonProperty("aqi")
    
    
    private String p_aqi;

    public String getP_aqi() { return this.p_aqi;}
    public void setP_aqi(String v) { this.p_aqi = v;}

    /**
    * name: pm2_5
    * type: float64
    * desc: PM2.5
    * required: 
    */
    @JsonProperty("pm2_5")
    
    
    private Double p_pm25;

    public Double getP_pm25() { return this.p_pm25;}
    public void setP_pm25(Double v) { this.p_pm25 = v;}

    /**
    * name: pm10
    * type: object
    * desc: PM10
    * required: 
    */
    @JsonProperty("pm10")
    
    
    private String p_pm10;

    public String getP_pm10() { return this.p_pm10;}
    public void setP_pm10(String v) { this.p_pm10 = v;}

    /**
    * name: co
    * type: float64
    * desc: CO
    * required: 
    */
    @JsonProperty("co")
    
    
    private Double p_co;

    public Double getP_co() { return this.p_co;}
    public void setP_co(Double v) { this.p_co = v;}

    /**
    * name: no2
    * type: object
    * desc: NO2
    * required: 
    */
    @JsonProperty("no2")
    
    
    private String p_no2;

    public String getP_no2() { return this.p_no2;}
    public void setP_no2(String v) { this.p_no2 = v;}

    /**
    * name: o3
    * type: object
    * desc: O3
    * required: 
    */
    @JsonProperty("o3")
    
    
    private String p_o3;

    public String getP_o3() { return this.p_o3;}
    public void setP_o3(String v) { this.p_o3 = v;}

    /**
    * name: so2
    * type: object
    * desc: SO2
    * required: 
    */
    @JsonProperty("so2")
    
    
    private String p_so2;

    public String getP_so2() { return this.p_so2;}
    public void setP_so2(String v) { this.p_so2 = v;}

    /**
    * name: complexindex
    * type: object
    * desc: 综合指数
    * required: 
    */
    @JsonProperty("complexindex")
    
    
    private String p_complexindex;

    public String getP_complexindex() { return this.p_complexindex;}
    public void setP_complexindex(String v) { this.p_complexindex = v;}

    /**
    * name: rank
    * type: object
    * desc: 排名
    * required: 
    */
    @JsonProperty("rank")
    
    
    private String p_rank;

    public String getP_rank() { return this.p_rank;}
    public void setP_rank(String v) { this.p_rank = v;}

    /**
    * name: primary_pollutant
    * type: object
    * desc: 主要污染物
    * required: 
    */
    @JsonProperty("primary_pollutant")
    
    
    private String p_primarypollutant;

    public String getP_primarypollutant() { return this.p_primarypollutant;}
    public void setP_primarypollutant(String v) { this.p_primarypollutant = v;}

    /**
    * name: temp
    * type: object
    * desc: 温度
    * required: 
    */
    @JsonProperty("temp")
    
    
    private String p_temp;

    public String getP_temp() { return this.p_temp;}
    public void setP_temp(String v) { this.p_temp = v;}

    /**
    * name: humi
    * type: object
    * desc: 湿度
    * required: 
    */
    @JsonProperty("humi")
    
    
    private String p_humi;

    public String getP_humi() { return this.p_humi;}
    public void setP_humi(String v) { this.p_humi = v;}

    /**
    * name: windlevel
    * type: object
    * desc: 风级
    * required: 
    */
    @JsonProperty("windlevel")
    
    
    private String p_windlevel;

    public String getP_windlevel() { return this.p_windlevel;}
    public void setP_windlevel(String v) { this.p_windlevel = v;}

    /**
    * name: winddirection
    * type: object
    * desc: 风向
    * required: 
    */
    @JsonProperty("winddirection")
    
    
    private String p_winddirection;

    public String getP_winddirection() { return this.p_winddirection;}
    public void setP_winddirection(String v) { this.p_winddirection = v;}

    /**
    * name: weather
    * type: object
    * desc: 天气
    * required: 
    */
    @JsonProperty("weather")
    
    
    private String p_weather;

    public String getP_weather() { return this.p_weather;}
    public void setP_weather(String v) { this.p_weather = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map
    <String
    ,String> other = new HashMap();
    public Map
    <String
    ,String> getOther(){ return other; }
    }
