#### 日志追踪信息管理界面

##### spring-cloud-learn-examples-v1-sleuth-zipkin-stream



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
    <artifactId>spring-cloud-sleuth-zipkin-stream</artifactId>
</dependency>
<dependency>
    <groupId>io.zipkin.java</groupId>
    <artifactId>zipkin-autoconfigure-ui</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-stream-rabbit</artifactId>
</dependency>
		
```

application.properties

```properties
spring.application.name=spring-cloud-learn-examples-v1-sleuth-zipkin-stream

#端口
server.port=18080

#设置是否启用安全
management.security.enabled=false

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
eureka.instance.instance-id=${spring.application.name}
## 显示真实IP
eureka.instance.prefer-ip-address=true


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

###### 第三步启动：spring-cloud-learn-examples-v1-sleuth-zipkin-stream

​		访问页面：http://192.168.10.27:18080/zipkin

