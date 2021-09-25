#### 日志追踪服务端 使用消息中间件

##### spring-cloud-learn-examples-v1-sleuth-stream-client 



配置信息

pom.xml

```xml
<!-- 引入eureka -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-eureka</artifactId>
</dependency>
<!-- 日志跟踪 -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-sleuth</artifactId>
</dependency>	
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-sleuth-stream</artifactId>
</dependency>	
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-stream-rabbit</artifactId>
</dependency>
		
```

application.properties

```properties
spring.application.name=spring-cloud-learn-examples-v1-sleuth-stream-client

#端口
server.port=18181

#设置是否启用安全
management.security.enabled=false

spring.devtools.restart.enabled=false

#设置服务器信息
info.app.encoding=@project.build.sourceEncoding@
info.app.java.source=@java.version@
info.app.java.target=@java.version@


## 启用eureka 客户端
eureka.client.enabled=true
## 启用客户端注册
eureka.client.fetch-registry=true
eureka.client.register-with-eureka=true
## 启用心跳检测
eureka.client.healthcheck.enabled=true
## eureka 服务地址
eureka.client.service-url.defaultZone=http://192.168.10.27:8761/eureka/
## 服务名称
eureka.instance.appname=${spring.application.name}
eureka.instance.hostname=192.168.10.27
## 在eureka 中显示的服务名称
eureka.instance.instance-id=${spring.application.name}-${server.port}
## 显示真实IP
eureka.instance.prefer-ip-address=true

#zipkin 配置 启用日志追踪配置
spring.zipkin.service.name=${spring.application.name}
spring.sleuth.sampler.percentage=1.0
## 启用日志追踪
spring.sleuth.enabled=true
## 启用日志追踪以工作流的方式
spring.sleuth.stream.enabled=true


## rabbitmq 配置
spring.rabbitmq.host=192.168.10.222
spring.rabbitmq.port=5672
spring.rabbitmq.username=admin
spring.rabbitmq.password=admin


```



#### 依赖服务启动

###### 第一步启动：spring-cloud-learn-examples-v1-eureka

​		访问地址：http://192.168.10.27:8761/

###### 第二步启动：spring-cloud-learn-examples-v1-sleuth-stream-client

​		通过修改端口号模拟多个服务

​		访问页面：http://192.168.10.27:18182/user/2、http://192.168.10.27:18181/user/1





