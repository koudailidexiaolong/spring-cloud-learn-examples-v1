#### 依赖项目

##### spring-cloud-learn-examples-v1-eureka-client 服务治理客户端



pom.xml

```xml
<!-- 引入eureka -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-eureka</artifactId>
</dependency>
```





application.properties

```properties
## 是否将本机服务注册
eureka.instance.hostname=${spring.application.name}
## eureka 服务器名称
eureka.instance.appname=${spring.application.name}
## 唯一标识
eureka.instance.instance-id=${spring.application.name}
## 是否注册到 eureka 服务
eureka.instance.prefer-ip-address=true
## 带有密码的 服务端
#eureka.client.service-url.defaultZone=http://julong:julong@192.168.10.27:8761/eureka
## 无密码校验的服务端地址
eureka.client.service-url.defaultZone=http://192.168.10.27:8761/eureka
##启用eurka客户端服务
eureka.client.enabled=true
## 注册到eurka服务
eureka.client.register-with-eureka=true
## 启用心跳检测
eureka.client.healthcheck.enabled=true
```



关联服务

###### 第一步启动：spring-cloud-learn-examples-v1-eureka

###### 第二步启动：spring-cloud-learn-examples-v1-eureka-client

###### 第三步浏览器访问路径：http://192.168.10.27:8761/



