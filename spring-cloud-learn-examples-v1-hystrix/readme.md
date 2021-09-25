#### hystrix服务容错保护 eureka 服务治理服务模块

##### spring-cloud-learn-examples-v1-hystrix

pom.xml

```xml
<!-- 引入eureka -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-eureka-server</artifactId>
</dependency>
```



application.properties

```properties
spring.application.name=spring-cloud-learn-examples-v1-eureka-server

#端口
server.port=8761

#设置是否启用安全
management.security.enabled=false

#设置服务器信息
info.app.encoding=@project.build.sourceEncoding@
info.app.java.source=@java.version@
info.app.java.target=@java.version@

# 是否将本机服务注册
eureka.client.fetch-registry=false
eureka.client.register-with-eureka=false
# 启用密码验证
security.basic.enabled=false
#security.user.name=julong
#security.user.password=julong
# 是否启用自我保护模式 默认为:true
eureka.server.enable-self-preservation=true
# 启用心跳检测
eureka.client.healthcheck.enabled=true

eureka.instance.appname=${spring.application.name}
eureka.instance.hostname=192.168.10.27
eureka.instance.instance-id=${spring.application.name}

```



访问方式：http://192.168.10.27:8761/

