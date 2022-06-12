
/*generated by AKShare JAVA API Generator Sun Jun 12 15:42:01 CST 2022*/
package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.JacksonDateDeserializer;
import com.onectrm.akshare.api.JacksonDateTimeDeserializer;
import com.onectrm.akshare.api.AkShareRequestAndResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
* 分类: futures
* 接口: futures_comm_info
* 目标地址: http://www.9qihuo.com/qihuoshouxufei
* 描述: 九期网-期货手续费数据
* 限量: 单次返回指定 symbol 的所有数据
*/
public class futures_comm_infoResponse extends AkShareRequestAndResponse {
    public futures_comm_infoResponse(){
        setInterfaceName("futures_comm_info");
    }

    public static futures_comm_infoResponse of(


    String p_shou3xu4fei4biao1zhun3ping2jin1yuan2,

    String p_he2yue1ming2cheng1,

    Double p_shou3xu4fei4biao1zhun3ping2zuo2wan4fen1zhi1,

    Integer p_mei3tiao4mao2li4,

    Double p_xian4jia4,

    String p_jiao1yi4suo3ming2cheng1,

    Double p_bao3zheng4jin1mai3kai1,

    Double p_zhang3ting2ban3,

    String p_shou3xu4fei4biao1zhun3ping2zuo2yuan2,

    Double p_bao3zheng4jin1mei3shou3,

    Double p_shou3xu4fei4,

    Double p_shou3xu4fei4biao1zhun3ping2jin1wan4fen1zhi1,

    LocalDateTime p_shou3xu4fei4geng4xin1shi2jian1,

    Double p_die1ting2ban3,

    Double p_shou3xu4fei4biao1zhun3kai1cang1wan4fen1zhi1,

    String p_shou3xu4fei4biao1zhun3kai1cang1yuan2,

    Double p_mei3tiao4jing4li4,

    String p_he2yue1dai4ma3,

    String p_bei4zhu4,

    LocalDateTime p_jia4ge2geng4xin1shi2jian1,

    Double p_bao3zheng4jin1mai4kai1,


    Map.Entry<String, String>... others){
    futures_comm_infoResponse t = new futures_comm_infoResponse();


    t.p_shou3xu4fei4biao1zhun3ping2jin1yuan2 = p_shou3xu4fei4biao1zhun3ping2jin1yuan2;

    t.p_he2yue1ming2cheng1 = p_he2yue1ming2cheng1;

    t.p_shou3xu4fei4biao1zhun3ping2zuo2wan4fen1zhi1 = p_shou3xu4fei4biao1zhun3ping2zuo2wan4fen1zhi1;

    t.p_mei3tiao4mao2li4 = p_mei3tiao4mao2li4;

    t.p_xian4jia4 = p_xian4jia4;

    t.p_jiao1yi4suo3ming2cheng1 = p_jiao1yi4suo3ming2cheng1;

    t.p_bao3zheng4jin1mai3kai1 = p_bao3zheng4jin1mai3kai1;

    t.p_zhang3ting2ban3 = p_zhang3ting2ban3;

    t.p_shou3xu4fei4biao1zhun3ping2zuo2yuan2 = p_shou3xu4fei4biao1zhun3ping2zuo2yuan2;

    t.p_bao3zheng4jin1mei3shou3 = p_bao3zheng4jin1mei3shou3;

    t.p_shou3xu4fei4 = p_shou3xu4fei4;

    t.p_shou3xu4fei4biao1zhun3ping2jin1wan4fen1zhi1 = p_shou3xu4fei4biao1zhun3ping2jin1wan4fen1zhi1;

    t.p_shou3xu4fei4geng4xin1shi2jian1 = p_shou3xu4fei4geng4xin1shi2jian1;

    t.p_die1ting2ban3 = p_die1ting2ban3;

    t.p_shou3xu4fei4biao1zhun3kai1cang1wan4fen1zhi1 = p_shou3xu4fei4biao1zhun3kai1cang1wan4fen1zhi1;

    t.p_shou3xu4fei4biao1zhun3kai1cang1yuan2 = p_shou3xu4fei4biao1zhun3kai1cang1yuan2;

    t.p_mei3tiao4jing4li4 = p_mei3tiao4jing4li4;

    t.p_he2yue1dai4ma3 = p_he2yue1dai4ma3;

    t.p_bei4zhu4 = p_bei4zhu4;

    t.p_jia4ge2geng4xin1shi2jian1 = p_jia4ge2geng4xin1shi2jian1;

    t.p_bao3zheng4jin1mai4kai1 = p_bao3zheng4jin1mai4kai1;


        for (Map.Entry<String, String> o : others) {
            t.other.put(o.getKey(), o.getValue());
        }

        return t;
    }



    /**
    * name: 手续费标准-平今-元
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("手续费标准-平今-元")
    
    
    private String p_shou3xu4fei4biao1zhun3ping2jin1yuan2;

    public String getP_shou3xu4fei4biao1zhun3ping2jin1yuan2() { return this.p_shou3xu4fei4biao1zhun3ping2jin1yuan2;}
    public void setP_shou3xu4fei4biao1zhun3ping2jin1yuan2(String v) { this.p_shou3xu4fei4biao1zhun3ping2jin1yuan2 = v;}

    /**
    * name: 合约名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("合约名称")
    
    
    private String p_he2yue1ming2cheng1;

    public String getP_he2yue1ming2cheng1() { return this.p_he2yue1ming2cheng1;}
    public void setP_he2yue1ming2cheng1(String v) { this.p_he2yue1ming2cheng1 = v;}

    /**
    * name: 手续费标准-平昨-万分之
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("手续费标准-平昨-万分之")
    
    
    private Double p_shou3xu4fei4biao1zhun3ping2zuo2wan4fen1zhi1;

    public Double getP_shou3xu4fei4biao1zhun3ping2zuo2wan4fen1zhi1() { return this.p_shou3xu4fei4biao1zhun3ping2zuo2wan4fen1zhi1;}
    public void setP_shou3xu4fei4biao1zhun3ping2zuo2wan4fen1zhi1(Double v) { this.p_shou3xu4fei4biao1zhun3ping2zuo2wan4fen1zhi1 = v;}

    /**
    * name: 每跳毛利
    * type: int64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("每跳毛利")
    
    
    private Integer p_mei3tiao4mao2li4;

    public Integer getP_mei3tiao4mao2li4() { return this.p_mei3tiao4mao2li4;}
    public void setP_mei3tiao4mao2li4(Integer v) { this.p_mei3tiao4mao2li4 = v;}

    /**
    * name: 现价
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("现价")
    
    
    private Double p_xian4jia4;

    public Double getP_xian4jia4() { return this.p_xian4jia4;}
    public void setP_xian4jia4(Double v) { this.p_xian4jia4 = v;}

    /**
    * name: 交易所名称
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("交易所名称")
    
    
    private String p_jiao1yi4suo3ming2cheng1;

    public String getP_jiao1yi4suo3ming2cheng1() { return this.p_jiao1yi4suo3ming2cheng1;}
    public void setP_jiao1yi4suo3ming2cheng1(String v) { this.p_jiao1yi4suo3ming2cheng1 = v;}

    /**
    * name: 保证金-买开
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("保证金-买开")
    
    
    private Double p_bao3zheng4jin1mai3kai1;

    public Double getP_bao3zheng4jin1mai3kai1() { return this.p_bao3zheng4jin1mai3kai1;}
    public void setP_bao3zheng4jin1mai3kai1(Double v) { this.p_bao3zheng4jin1mai3kai1 = v;}

    /**
    * name: 涨停板
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("涨停板")
    
    
    private Double p_zhang3ting2ban3;

    public Double getP_zhang3ting2ban3() { return this.p_zhang3ting2ban3;}
    public void setP_zhang3ting2ban3(Double v) { this.p_zhang3ting2ban3 = v;}

    /**
    * name: 手续费标准-平昨-元
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("手续费标准-平昨-元")
    
    
    private String p_shou3xu4fei4biao1zhun3ping2zuo2yuan2;

    public String getP_shou3xu4fei4biao1zhun3ping2zuo2yuan2() { return this.p_shou3xu4fei4biao1zhun3ping2zuo2yuan2;}
    public void setP_shou3xu4fei4biao1zhun3ping2zuo2yuan2(String v) { this.p_shou3xu4fei4biao1zhun3ping2zuo2yuan2 = v;}

    /**
    * name: 保证金-每手
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("保证金-每手")
    
    
    private Double p_bao3zheng4jin1mei3shou3;

    public Double getP_bao3zheng4jin1mei3shou3() { return this.p_bao3zheng4jin1mei3shou3;}
    public void setP_bao3zheng4jin1mei3shou3(Double v) { this.p_bao3zheng4jin1mei3shou3 = v;}

    /**
    * name: 手续费
    * type: float64
    * desc: 注意: 开+平
    * required: 
    */
    @JsonProperty("手续费")
    
    
    private Double p_shou3xu4fei4;

    public Double getP_shou3xu4fei4() { return this.p_shou3xu4fei4;}
    public void setP_shou3xu4fei4(Double v) { this.p_shou3xu4fei4 = v;}

    /**
    * name: 手续费标准-平今-万分之
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("手续费标准-平今-万分之")
    
    
    private Double p_shou3xu4fei4biao1zhun3ping2jin1wan4fen1zhi1;

    public Double getP_shou3xu4fei4biao1zhun3ping2jin1wan4fen1zhi1() { return this.p_shou3xu4fei4biao1zhun3ping2jin1wan4fen1zhi1;}
    public void setP_shou3xu4fei4biao1zhun3ping2jin1wan4fen1zhi1(Double v) { this.p_shou3xu4fei4biao1zhun3ping2jin1wan4fen1zhi1 = v;}

    /**
    * name: 手续费更新时间
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("手续费更新时间")
    
    @JsonDeserialize(using = JacksonDateTimeDeserializer.class) 
    private LocalDateTime p_shou3xu4fei4geng4xin1shi2jian1;

    public LocalDateTime getP_shou3xu4fei4geng4xin1shi2jian1() { return this.p_shou3xu4fei4geng4xin1shi2jian1;}
    public void setP_shou3xu4fei4geng4xin1shi2jian1(LocalDateTime v) { this.p_shou3xu4fei4geng4xin1shi2jian1 = v;}

    /**
    * name: 跌停板
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("跌停板")
    
    
    private Double p_die1ting2ban3;

    public Double getP_die1ting2ban3() { return this.p_die1ting2ban3;}
    public void setP_die1ting2ban3(Double v) { this.p_die1ting2ban3 = v;}

    /**
    * name: 手续费标准-开仓-万分之
    * type: float64
    * desc: 
    * required: 
    */
    @JsonProperty("手续费标准-开仓-万分之")
    
    
    private Double p_shou3xu4fei4biao1zhun3kai1cang1wan4fen1zhi1;

    public Double getP_shou3xu4fei4biao1zhun3kai1cang1wan4fen1zhi1() { return this.p_shou3xu4fei4biao1zhun3kai1cang1wan4fen1zhi1;}
    public void setP_shou3xu4fei4biao1zhun3kai1cang1wan4fen1zhi1(Double v) { this.p_shou3xu4fei4biao1zhun3kai1cang1wan4fen1zhi1 = v;}

    /**
    * name: 手续费标准-开仓-元
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("手续费标准-开仓-元")
    
    
    private String p_shou3xu4fei4biao1zhun3kai1cang1yuan2;

    public String getP_shou3xu4fei4biao1zhun3kai1cang1yuan2() { return this.p_shou3xu4fei4biao1zhun3kai1cang1yuan2;}
    public void setP_shou3xu4fei4biao1zhun3kai1cang1yuan2(String v) { this.p_shou3xu4fei4biao1zhun3kai1cang1yuan2 = v;}

    /**
    * name: 每跳净利
    * type: float64
    * desc: 注意单位: 元
    * required: 
    */
    @JsonProperty("每跳净利")
    
    
    private Double p_mei3tiao4jing4li4;

    public Double getP_mei3tiao4jing4li4() { return this.p_mei3tiao4jing4li4;}
    public void setP_mei3tiao4jing4li4(Double v) { this.p_mei3tiao4jing4li4 = v;}

    /**
    * name: 合约代码
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("合约代码")
    
    
    private String p_he2yue1dai4ma3;

    public String getP_he2yue1dai4ma3() { return this.p_he2yue1dai4ma3;}
    public void setP_he2yue1dai4ma3(String v) { this.p_he2yue1dai4ma3 = v;}

    /**
    * name: 备注
    * type: object
    * desc: 是否主力合约
    * required: 
    */
    @JsonProperty("备注")
    
    
    private String p_bei4zhu4;

    public String getP_bei4zhu4() { return this.p_bei4zhu4;}
    public void setP_bei4zhu4(String v) { this.p_bei4zhu4 = v;}

    /**
    * name: 价格更新时间
    * type: object
    * desc: 
    * required: 
    */
    @JsonProperty("价格更新时间")
    
    @JsonDeserialize(using = JacksonDateTimeDeserializer.class) 
    private LocalDateTime p_jia4ge2geng4xin1shi2jian1;

    public LocalDateTime getP_jia4ge2geng4xin1shi2jian1() { return this.p_jia4ge2geng4xin1shi2jian1;}
    public void setP_jia4ge2geng4xin1shi2jian1(LocalDateTime v) { this.p_jia4ge2geng4xin1shi2jian1 = v;}

    /**
    * name: 保证金-卖开
    * type: float64
    * desc: 注意单位: %
    * required: 
    */
    @JsonProperty("保证金-卖开")
    
    
    private Double p_bao3zheng4jin1mai4kai1;

    public Double getP_bao3zheng4jin1mai4kai1() { return this.p_bao3zheng4jin1mai4kai1;}
    public void setP_bao3zheng4jin1mai4kai1(Double v) { this.p_bao3zheng4jin1mai4kai1 = v;}


    @JsonAnyGetter
    @JsonAnySetter
    private Map<String,String> other = new HashMap();
    public Map<String,String> getOther(){ return other; }
}