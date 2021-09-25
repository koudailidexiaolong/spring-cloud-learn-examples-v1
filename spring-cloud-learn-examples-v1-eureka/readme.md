#### 依赖项目

##### spring-cloud-learn-examples-v1-eureka 服务治理服务端



application.properties

```properties
# 是否将本机服务注册
eureka.client.fetch-registry=false
eureka.client.register-with-eureka=false
eureka.instance.appname=${spring.application.name}
eureka.instance.hostname=${spring.application.name}
## 服务唯一标识符
eureka.instance.instance-id=${eureka.instance.hostname}
## 是否显示真实IP地址
eureka.instance.prefer-ip-address=true
# 启用密码验证
security.basic.enabled=false
#security.user.name=julong
#security.user.password=julong
# 是否启用自我保护模式 默认为:true
eureka.server.enable-self-preservation=true
# 启用心跳检测
eureka.client.healthcheck.enabled=true
```



