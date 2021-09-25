### 使用中间件 rabbitmq 进行收集 容错集中治理turbine 

客户端

#### spring-cloud-learn-examples-v1-hystrix-rabbitmq-turbine

#### 配置信息

pom.xml

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-stream-rabbit</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-turbine-stream</artifactId>
</dependency>
```

application.properties

```properties
spring.application.name=spring-cloud-learn-examples-v1-hystrix-rabbitmq-turbine

#端口
server.port=18761

#设置是否启用安全
management.security.enabled=false
## actuator 端口
management.port=19763
#设置服务器信息

info.app.encoding=@project.build.sourceEncoding@
info.app.java.source=@java.version@
info.app.java.target=@java.version@

#启用eurka客户端服务
eureka.client.enabled=true
# 注册到eurka服务
eureka.client.register-with-eureka=true
eureka.client.fetch-registry=true
# 无密码校验的服务端地址
eureka.client.service-url.defaultZone=http://192.168.10.27:8761/eureka
eureka.instance.prefer-ip-address=true
eureka.instance.instance-id=${spring.application.name}
eureka.instance.appname=${spring.application.name}

## 以下两句代码为了解决无法注册到eureka服务 2.0以后修复此问题
## 启用获取实例应该接收流量的非安全端口
eureka.instance.non-secure-port-enabled=true
## 获取实例应该接收流量的非安全端口
eureka.instance.non-secure-port=18761

eureka.client.healthcheck.enabled=true
## 启用集群容错通过流的形式传播
turbine.stream.enabled=true
#
spring.rabbitmq.host=192.168.10.222
spring.rabbitmq.port=5672
spring.rabbitmq.username=admin
spring.rabbitmq.password=admin
```



#### 服务依赖关系

###### 第一步启动：spring-cloud-learn-examples-v1-hystrix

​			访问地址：http://192.168.10.27:8761/

###### 第二步启动：spring-cloud-learn-examples-v1-hystrix-rabbitmq-client

​			访问地址：http://192.168.10.27:18081/user/1 、http://192.168.10.27:18082/test

###### 第三步启动：spring-cloud-learn-examples-v1-hystrix-dashboard

​			访问地址：http://192.168.10.27:18091/hystrix

​			将下面地址输入到仪表盘控制台中可实现查询

​				http://192.168.10.27:18081/hystrix.stream 、http://192.168.10.27:18082/hystrix.stream 

###### 第四步启动：spring-cloud-learn-examples-v1-hystrix-rabbitmq-turbine

​			此服务注册地址端口为：19763

​			访问地址：http://192.168.10.27:18761/turbine.stream

