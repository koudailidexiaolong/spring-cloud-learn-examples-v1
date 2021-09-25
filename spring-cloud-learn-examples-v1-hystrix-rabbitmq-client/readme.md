### 使用中间件 rabbitmq 进行收集

客户端

#### spring-cloud-learn-examples-v1-hystrix-rabbitmq-client

#### 配置信息

pom.xml

```xml
<!-- 引入hystrix rabbitmq -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-hystrix</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-archaius</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-netflix-hystrix-stream</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-stream-rabbit</artifactId>
</dependency>
```



application.properties

```properties
spring.application.name=spring-cloud-learn-examples-v1-hystrix-rabbitmq-client

#端口
server.port=18082

#设置是否启用安全
management.security.enabled=false

#设置服务器信息

info.app.encoding=@project.build.sourceEncoding@
info.app.java.source=@java.version@
info.app.java.target=@java.version@
## 服务注册地址
eureka.client.service-url.defaultZone=http://192.168.10.27:8761/eureka
eureka.instance.prefer-ip-address=true
eureka.instance.instance-id=${spring.application.name}-${server.port}
#启用eurka客户端服务
eureka.client.enabled=true
# 注册到eurka服务
eureka.client.register-with-eureka=true

## 启用容错通过消息流存储访问
hystrix.stream.queue.enabled=true

## rabbitmq配置地址
spring.rabbitmq.host=192.168.10.222
spring.rabbitmq.port=5672
spring.rabbitmq.username=admin
spring.rabbitmq.password=admin

```



#### 服务依赖关系

###### 第一步启动：spring-cloud-learn-examples-v1-hystrix

​			访问地址：http://192.168.10.27:8761/

###### 第二步启动：spring-cloud-learn-examples-v1-hystrix-rabbitmq-client

​			访问地址：http://192.168.10.27:18081/user/1 、http://192.168.10.27:18082/test

###### 第三步启动：spring-cloud-learn-examples-v1-hystrix-dashboard

​			访问地址：http://192.168.10.27:18091/hystrix

将下面地址输入到仪表盘控制台中可实现查询

http://192.168.10.27:18081/hystrix.stream  http://192.168.10.27:18082/hystrix.stream 

