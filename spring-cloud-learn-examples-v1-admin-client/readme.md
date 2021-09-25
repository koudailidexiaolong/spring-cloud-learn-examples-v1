#### 依赖项目

##### spring-cloud-learn-examples-v1-admin-client 微服务管理客户端服务

需要加入配置如下：

pom.xml

```xml
<!-- admin 客户端 -->
		<dependency>
			<groupId>de.codecentric</groupId>
			<artifactId>spring-boot-admin-starter-client</artifactId>
			<version>1.5.7</version>
		</dependency>
```

application.properties

```properties
# 管理控制台 此处需要增加 管理端配置IP地址
spring.boot.admin.url=http://192.168.10.27:18090
# 客户端名称 此处可以换多个连接客户端名称
spring.boot.admin.client.name=${spring.application.name}
# 启用自动注册
spring.boot.admin.auto-registration=true
## 启用客户端
spring.boot.admin.client.enabled=true
## 是否显示真实IP
spring.boot.admin.client.prefer-ip=true

```



##### 依赖服务  

##### 	第一步启动  spring-cloud-learn-examples-v1-admin 

##### 	第二步启动 spring-cloud-learn-examples-v1-admin-client

​	

