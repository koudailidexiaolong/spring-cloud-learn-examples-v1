#### 依赖项目

##### `spring-cloud-learn-examples-v1-sleuth-client`  sleuth 日志追踪服务端

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
    <artifactId>spring-cloud-sleuth-zipkin</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-sleuth</artifactId>
</dependency>		
```



application.properties

```properties
spring.application.name=spring-cloud-learn-examples-v1-sleuth-client

#端口
server.port=18181

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


#zipkin 配置 启用日志追踪配置
spring.zipkin.service.name=${spring.application.name}
# 日志追踪地址
spring.zipkin.base-url=http://192.168.10.27:18080/
## 抽样比例
spring.sleuth.sampler.percentage=1.0
spring.zipkin.sender.type=web
```



服务依赖

###### 第一步启动：spring-cloud-learn-examples-v1-eureka

​			访问地址：http://192.168.10.27:8761/

###### 第二步启动：spring-cloud-learn-examples-v1-sleuth-client

​			访问地址：http://192.168.10.27:18181/user/1

