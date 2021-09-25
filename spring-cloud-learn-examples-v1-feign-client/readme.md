#### restTemplate 调用demo 程序

##### 

##### 声明式服务调用客户端

##### 	spring-cloud-learn-examples-v1-feign-client 

配置信息

pom.xml

```xml
	<!-- 引入eureka -->
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-eureka</artifactId>
		</dependency>
		<!-- 增加feign 配置 -->
		<dependency>
		    <groupId>org.springframework.cloud</groupId>
		    <artifactId>spring-cloud-starter-feign</artifactId>
		</dependency>
```



application.properties

```properties
spring.application.name=spring-cloud-learn-examples-v1-feign-client
server.port=18081

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


```



服务调用方式

###### 第一步启动：spring-cloud-learn-examples-v1-feign

​		访问方式：http://192.168.10.27:8761/

###### 第二步启动：spring-cloud-learn-examples-v1-feign-server 

​		访问方式：http://192.168.10.27:18881/user/1

###### 第三步启动：spring-cloud-learn-examples-v1-feign-client

​	    访问方式：http://192.168.10.27:18081/template/user/1



