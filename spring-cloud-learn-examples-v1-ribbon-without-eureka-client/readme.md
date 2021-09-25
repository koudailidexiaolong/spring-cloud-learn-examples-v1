spring-cloud-learn-examples-v1-ribbon-without-eureka-client

不依赖eureka 实现 客户端负载均衡



配置

pom.xml

```xml
	<!-- 负载均衡 -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-ribbon</artifactId>
</dependency>
```

application.properties

```properties
server.port=18082
spring.application.name=spring-cloud-learn-examples-v1-ribbon-without-eureka-client

#设置是否启用安全
management.security.enabled=false

#设置服务器信息

info.app.encoding=@project.build.sourceEncoding@
info.app.java.source=@java.version@
info.app.java.target=@java.version@

#禁用eureka
ribbon.eureka.enabled=false
## 脱离eureka 使用 ribbon 负载 其中 spring-cloud-learn-examples-v1-ribbon-server 代表 服务名称
spring-cloud-learn-examples-v1-ribbon-server.ribbon.listOfServers=192.168.10.27:18881,192.168.10.27:18882,192.168.10.27:18883
```





服务依赖

###### 第一步启动：spring-cloud-learn-examples-v1-ribbon-server

​		以修改端口号的方式启动三个服务192.168.10.27:18881,192.168.10.27:18882,192.168.10.27:18883

###### 第二步启动：spring-cloud-learn-examples-v1-ribbon-without-eureka-client

访问方式：http://192.168.10.27:18082/template/user/1

