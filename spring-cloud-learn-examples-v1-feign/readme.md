#### 依赖项目

##### spring-cloud-learn-examples-v1-feign

声明式服务调用eureka 服务治理端

配置信息

```properties
spring.application.name=spring-cloud-learn-examples-v1-feign-server

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
## 默认地址
eureka.client.service-url.defaultZone=http://localhost:8761/eureka
# 启用密码验证
security.basic.enabled=false
#security.user.name=julong
#security.user.password=julong
# 是否启用自我保护模式 默认为:true
eureka.server.enable-self-preservation=true
# 启用心跳检测
eureka.client.healthcheck.enabled=true
## 服务名称
eureka.instance.appname=${spring.application.name}
eureka.instance.hostname=${spring.application.name}
eureka.instance.instance-id=${spring.application.name}
## 是否显示真实地址
eureka.instance.prefer-ip-address=true

```







