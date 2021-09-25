#### spring-cloud-learn-examples-v1-turbine

容错服务治理服务

pom.xml

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-turbine</artifactId>
</dependency>
```



application.properties

```properties

spring.application.name=spring-cloud-learn-examples-v1-turbine

#端口
server.port=18761

#设置是否启用安全
management.security.enabled=false

#设置服务器信息

info.app.encoding=@project.build.sourceEncoding@
info.app.java.source=@java.version@
info.app.java.target=@java.version@

## 无密码校验的服务端地址
eureka.client.service-url.defaultZone=http://192.168.10.27:8761/eureka
eureka.instance.prefer-ip-address=true
eureka.instance.instance-id=${spring.application.name}
## 启用eurka客户端服务
eureka.client.enabled=true
## 注册到eurka服务
eureka.client.register-with-eureka=true
eureka.client.fetch-registry=true
turbine.aggregator.cluster-config=default
## 监控服务信息的服务名称
turbine.app-config=spring-cloud-learn-examples-v1-hystrix-client,spring-cloud-learn-examples-v1-hystrix-client-1
## 指定集群名称
turbine.cluster-name-expression="default"
## 可以让同一主机上的服务通过主机名和端口号来区分 默认情况会以host 来区分不同的服务
turbine.combine-host-port=true

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

###### 第四步启动：spring-cloud-learn-examples-v1-hystrix-turbine

​	访问方式：http://192.168.10.27:18761/turbine.stream
