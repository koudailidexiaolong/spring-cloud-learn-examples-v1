#### 依赖项目

##### spring-cloud-learn-examples-v1-feign-server  声明式服务调用服务端



pom.xml

```xml
通过eureka 进行服务管理
<!-- 引入eureka -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-eureka</artifactId>
</dependency>
```



application.properties

```properties
spring.application.name=spring-cloud-learn-examples-v1-feign-server

#端口
server.port=18881

#设置是否启用安全
management.security.enabled=false

#设置服务器信息

info.app.encoding=@project.build.sourceEncoding@
info.app.java.source=@java.version@
info.app.java.target=@java.version@

# 是否将本机服务注册
eureka.instance.hostname=192.168.10.27
# eureka 服务器名称 Get the name of the application to be registered with eureka
eureka.instance.appname=${spring.application.name}
# 是否注册到 eureka 服务
eureka.instance.prefer-ip-address=true
# 带有密码的 服务端
#eureka.client.service-url.defaultZone=http://julong:julong@192.168.10.27:8761/eureka
# 无密码校验的服务端地址
eureka.client.service-url.defaultZone=http://192.168.10.27:8761/eureka

#启用eurka客户端服务
eureka.client.enabled=true
# 注册到eurka服务
eureka.client.register-with-eureka=true
eureka.client.fetch-registry=true

```



依赖服务：

###### spring-cloud-learn-examples-v1-feign



