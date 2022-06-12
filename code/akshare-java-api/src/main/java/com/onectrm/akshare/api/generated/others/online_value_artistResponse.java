
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:02 CST 2022*/
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
* 接口: online_value_artist
* 目标地址: https://www.endata.com.cn/Marketing/Artist/business.html
* 描述: 艺恩-艺人-艺人流量价值
* 限量: 返回当前的艺人流量价值数据
*/
public class online_value_artistResponse extends AkShareRequestAndResponse {
    public online_value_artistResponse(){
        setInterfaceName("online_value_artist");
    }

    public static online_value_artistResponse of(


    Double p_dai4huo4li4,

    Double p_guan1zhu4re4du4,

    Integer p_pai2ming2,

    LocalDate p_tong3ji4ri4qi1,

    Double p_liu2liang4jia4zhi2,

    Double p_zhuan1ye4re4du4,

    Double p_yu4ce4re4du4,

    String p_yi4ren2,


    Map.Entry<String, String>... others){
    online_value_artistResponse t = new online_value_artistResponse();


    t.p_dai4huo4li4 = p_dai4huo4li4;

    t.p_guan1zhu4re4du4 = p_guan1zhu4re4du4;

    t.p_pai2ming2 = p_pai2ming2;

    t.p_tong3ji4ri4qi1 = p_tong3ji4ri4qi1;

    t.p_liu2liang4jia4zhi2 = p_liu2liang4jia4zhi2;

    t.p_zhuan1ye4re4du4 = p_zhuan1ye4re4du4;

    t.p_yu4ce4re4du4 = p_yu4ce4re4du4;

    t.p_yi4ren2 = p_yi4ren2;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 带货力
    * type: float64
    * desc: 带货力的数值代表艺人的带货号召力，包括艺人的铁杆粉丝规模，超话粉丝规模。
    * required: 
    */
    @JsonProperty("带货力")
    
    
    private Double p_dai4huo4li4;

    public Double getP_dai4huo4li4() { return this.p_dai4huo4li4;}
    public void setP_dai4huo4li4(Double v) { this.p_dai4huo4li4 = v;}

    /**
    * name: 关注热度
    * type: float64
    * desc: 艺人关注热度主要表现艺人网络中的舆情声量，参与计算的指标维度包括百度搜索指数，百度新闻数量，今日头条新闻数，微博转发量，微博评论量，微博点赞量，微博粉丝数量，贴吧关注数量，微博话题数量。
    * required: 
    */
    @JsonProperty("关注热度")
    
    
    private Double p_guan1zhu4re4du4;

    public Double getP_guan1zhu4re4du4() { return this.p_guan1zhu4re4du4;}
    public void setP_guan1zhu4re4du4(Double v) { this.p_guan1zhu4re4du4 = v;}

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
    * name: 统计日期
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("统计日期")
    @JsonDeserialize(using = JacksonDateDeserializer.class) 
    
    private LocalDate p_tong3ji4ri4qi1;

    public LocalDate getP_tong3ji4ri4qi1() { return this.p_tong3ji4ri4qi1;}
    public void setP_tong3ji4ri4qi1(LocalDate v) { this.p_tong3ji4ri4qi1 = v;}

    /**
    * name: 流量价值
    * type: float64
    * desc: 流量价值由专业度，关注度，预测热度，带货力加权汇总计算后得出，分值范围0~100，在商业价值的基础上增加了明星近期热度及带货力的权重。
    * required: 
    */
    @JsonProperty("流量价值")
    
    
    private Double p_liu2liang4jia4zhi2;

    public Double getP_liu2liang4jia4zhi2() { return this.p_liu2liang4jia4zhi2;}
    public void setP_liu2liang4jia4zhi2(Double v) { this.p_liu2liang4jia4zhi2 = v;}

    /**
    * name: 专业热度
    * type: float64
    * desc: 艺人专业热度主要表现艺人历史作品及品牌代言的效果情况，参与计算的指标维度包括历史主演电影票房表现，历史主演视频节目播映热度，电影作品豆瓣评分，作品相关微博内容评论正负向，历史代言品牌数量，品牌热度，艺人获奖数量。
    * required: 
    */
    @JsonProperty("专业热度")
    
    
    private Double p_zhuan1ye4re4du4;

    public Double getP_zhuan1ye4re4du4() { return this.p_zhuan1ye4re4du4;}
    public void setP_zhuan1ye4re4du4(Double v) { this.p_zhuan1ye4re4du4 = v;}

    /**
    * name: 预测热度
    * type: float64
    * desc: 预测热度的数值反映明星的未来发展潜力，包括粉丝增长规模，作品口碑以及未来作品预测。
    * required: 
    */
    @JsonProperty("预测热度")
    
    
    private Double p_yu4ce4re4du4;

    public Double getP_yu4ce4re4du4() { return this.p_yu4ce4re4du4;}
    public void setP_yu4ce4re4du4(Double v) { this.p_yu4ce4re4du4 = v;}

    /**
    * name: 艺人
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("艺人")
    
    
    private String p_yi4ren2;

    public String getP_yi4ren2() { return this.p_yi4ren2;}
    public void setP_yi4ren2(String v) { this.p_yi4ren2 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}
