#### 依赖项目

##### spring-cloud-learn-examples-v1-ribbon-server 

##### 	负载方法提供者 提供多个服务端



通过修改端口号来模拟多个服务

配置信息：

application.properties

```properties
spring.application.name=spring-cloud-learn-examples-v1-ribbon-server-18881

#端口
server.port=18881

#设置是否启用安全
management.security.enabled=false

spring.devtools.restart.enabled=false

#设置服务器信息

info.app.encoding=@project.build.sourceEncoding@
info.app.java.source=@java.version@
info.app.java.target=@java.version@

# 是否将本机服务注册
eureka.instance.hostname=192.168.10.27
# eureka 服务器名称 Get the name of the application to be registered with eureka
eureka.instance.appname=${spring.application.name}
eureka.instance.instance-id=${spring.application.name}
# 是否注册到 eureka 服务
eureka.instance.prefer-ip-address=true
# 带有密码的 服务端
#eureka.client.service-url.defaultZone=http://julong:julong@192.168.10.27:8761/eureka
# 无密码校验的服务端地址
eureka.client.service-url.defaultZone=http://192.168.10.27:8761/eureka
eureka.client.fetch-registry=true
#启用eurka客户端服务
eureka.client.enabled=true
# 注册到eurka服务
eureka.client.register-with-eureka=true
eureka.client.healthcheck.enabled=true
```



启动多个实例 通过修改端口号实现 实例名称：

```txt
SPRING-CLOUD-LEARN-EXAMPLES-V1-RIBBON-SERVER-18881

SPRING-CLOUD-LEARN-EXAMPLES-V1-RIBBON-SERVER-18882

SPRING-CLOUD-LEARN-EXAMPLES-V1-RIBBON-SERVER-18883
```









