#### 依赖项目

##### `spring-cloud-learn-examples-v1-sleuth-client`  sleuth 日志追踪服务端

配置信息

```properties
#zipkin 配置 启用日志追踪配置
spring.zipkin.service.name=spring-cloud-learn-examples-v1-sleuth-client
# 日志追踪地址
spring.zipkin.base-url=http://192.168.10.27:18080/
spring.sleuth.sampler.percentage=1.0
spring.zipkin.sender.type=web
```





