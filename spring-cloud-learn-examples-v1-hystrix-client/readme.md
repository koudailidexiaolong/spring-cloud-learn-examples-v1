#### hystrix 服务容错保护客户端服务

##### spring-cloud-learn-examples-v1-hystrix-client



配置信息

pom.xml

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-hystrix</artifactId>
</dependency>

<!-- 引入eureka -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-eureka</artifactId>
</dependency>

```

application.properties

```properties
spring.application.name=spring-cloud-learn-examples-v1-hystrix-client

#端口
server.port=18081

#设置是否启用安全
management.security.enabled=false

spring.devtools.restart.enabled=false
#设置服务器信息

info.app.encoding=@project.build.sourceEncoding@
info.app.java.source=@java.version@
info.app.java.target=@java.version@
## eureka 注册地址
eureka.client.service-url.defaultZone=http://192.168.10.27:8761/eureka
## 是否显示真实IP地址
eureka.instance.prefer-ip-address=true
## eureka 注册显示名称
eureka.instance.instance-id=${spring.application.name}:${server.port}
## 启用eurka客户端服务
eureka.client.enabled=true
## 注册到eurka服务
eureka.client.register-with-eureka=true

management.metrics.binders.hystrix.enabled=true
hystrix.metrics.enabled=true
hystrix.shareSecurityContext=false

```



依赖服务：

###### 第一步启动：spring-cloud-learn-examples-v1-hystrix

###### 第二步启动：spring-cloud-learn-examples-v1-hystrix-client

​	使用多个端口模拟多个服务

服务展示地址：

http://192.168.10.27:18082/test 、http://192.168.10.27:18081/test



