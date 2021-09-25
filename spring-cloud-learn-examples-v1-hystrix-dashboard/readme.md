容错保护服务图形界面展示工具

#### spring-cloud-learn-examples-v1-hystrix-dashboard

##### 

配置信息

pom.xml

```xml

<!-- 图形界面 hystrix -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-hystrix-dashboard</artifactId>
</dependency>
```



application.properties

```properties
spring.application.name=spring-cloud-learn-examples-v1-hystrix-dashboard

#端口
server.port=18091

#设置是否启用安全
management.security.enabled=false

#设置服务器信息

info.app.encoding=@project.build.sourceEncoding@
info.app.java.source=@java.version@
info.app.java.target=@java.version@

#启用eurka客户端服务
eureka.client.enabled=true
eureka.client.service-url.defaultZone=http://192.168.10.27:8761/eureka
# 注册到eurka服务
eureka.client.register-with-eureka=true
eureka.client.fetch-registry=true
## 是否使用真实IP
eureka.instance.prefer-ip-address=true
eureka.instance.appname=${spring.application.name}
eureka.instance.instance-id=${spring.application.name}

```



依赖启动服务

###### 第一步启动：spring-cloud-learn-examples-v1-hystrix

###### 第二步启动：spring-cloud-learn-examples-v1-hystrix-client

​	使用多个端口模拟多个服务

服务展示地址：

http://192.168.10.27:18082/test 、http://192.168.10.27:18081/test

###### 第三步启动：spring-cloud-learn-examples-v1-hystrix-dashboard

​	Single Hystrix App: https://hystrix-app:port/hystrix.stream 

​	访问地址：http://192.168.10.27:18091/hystrix

​			数据展示服务地址：http://192.168.10.27:18081/hystrix.stream、 http://192.168.10.27:18082/hystrix.stream 

