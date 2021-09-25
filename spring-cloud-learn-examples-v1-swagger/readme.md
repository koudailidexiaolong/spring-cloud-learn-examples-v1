#### 依赖项目

##### `spring-cloud-learn-examples-v1-swagger`

访问方法：http://192.168.10.27:18091/swagger-ui.html

```java
//配置扫描路径
.apis(RequestHandlerSelectors.basePackage("com.julong.action"))
// 配置扫描任何类
.apis(RequestHandlerSelectors.any())
```





