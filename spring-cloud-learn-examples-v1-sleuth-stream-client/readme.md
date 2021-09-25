#### 依赖项目

##### spring-cloud-learn-examples-v1-sleuth-stream-client 日志追踪服务端 使用消息中间件

rabbitmq  配置信息

```properties
#zipkin 配置 启用日志追踪配置
spring.zipkin.service.name=spring-cloud-learn-examples-v1-sleuth-stream-client
spring.sleuth.sampler.percentage=1.0

## rabbitmq 配置
spring.rabbitmq.host=192.168.10.222
spring.rabbitmq.port=5672
spring.rabbitmq.username=admin
spring.rabbitmq.password=admin

```





