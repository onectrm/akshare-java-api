# AKShare Java API

AKShare是基于python的开源财经数据接口。本项目旨在提供[AKShare](https://www.akshare.xyz/introduction.html) Java API方便Java端集成。

## 原理
API通过调用[AKTools, AKShare的HTTP REST接口](https://www.akshare.xyz/deploy_http.html)来获取所有数据

其中com.onectrm.akshare.api.generated package下的所Request/Response类都是由另一工具生产，详情参加[AKShare Java API Generator](https://github.com/onectrm/akshare-java-api-generator)

## 编译方法
本库为boot starter，直接使用maven install即可编译成JAR并安装在本地

## 使用方法
我们将采用获取A股股票列表作为例子。

_前置条件：需要先自行在后台启动REST服务aktools, 详情参加官网(https://www.akshare.xyz/deploy_http.html)_


##### [AKShare 股票列表-A股 接口](https://www.akshare.xyz/data/stock/stock.html#id185)
```
接口: stock_info_a_code_name

目标地址: 沪深京三个交易所

描述: 沪深京 A 股股票代码和股票简称数据

限量: 单次获取所有 A 股股票代码和简称数据

详细信息，点击[AKShare官网文档](https://www.akshare.xyz/data/stock/stock.html#id185)
```

1. Maven Install 安装本库到本地Repo
2. 创建一个SpringBoot程序，并在POM里面引用本库
```xml
<dependency>
  <groupId>com.onectrm.akshare</groupId>
  <artifactId>akshare-api-boot-starter</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```
3. 在application.properties里设置base url
```
onectrm.akshare.api.base-url=http://127.0.0.1:8080/api/public/
```
4. 注入AkShareApiService
```java
@Autowired
private AkShareApiService akShareService;
```
5. 调用相应api
```java
var result = akShareService.getList(stock_info_a_code_nameRequest.of(), stock_info_a_code_nameResponse.class);
```

## AkShareApiService使用说明
AkShareApiService只有两个公共函数, get和getList，传入参数均为Request以及Response的类型。通过调用这两个函数，可以调用AKShare HTTP服务所有功能。

Request和Response均为工具生产，详情参加[AKShare Java API Generator](https://github.com/onectrm/akshare-java-api-generator)

XXXRequest里面包含了所有需要传递给AKShare HTTP REST服务的参数，可以使用of函数来构建

XXXResponse里面包含了REST返回的数据

## Request和Response
* 命名规则: 
*AKShare原始接口名+Request/Response*， 例如[AKShare 股票列表-A股 接口](https://www.akshare.xyz/data/stock/stock.html#id185)
```java
class stock_zh_a_histRequest
class stock_zh_a_histResponse
```

* Field名字规则: 

由于AKShare文档中变量名有的为中文，所以，对应生成的java field就用了标注全拼。

另外，加了前缀p_, 这个是为了避免生成不合规的Java变量名 


## 说明
因为request和response都为自动生成。自动生成是通过分析AKShare markdown文档，所以有地方不够精确，甚至可能会有错误。所以，大家如果遇到错误，可以参照akshare文档自动修正代码。我们也会一边使用，一边修正。


