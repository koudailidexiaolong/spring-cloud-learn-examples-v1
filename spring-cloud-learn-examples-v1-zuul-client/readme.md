#### 依赖项目

##### spring-cloud-learn-examples-v1-zuul-client 网关路由客户端服务

项目访问目录：http://192.168.10.27:10088/api/user/1

配置信息

pom.xml

```xml
	<!-- 动态网关 -->
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-zuul</artifactId>
		</dependency>
```



application.properties

```properties
spring.application.name=spring-cloud-learn-examples-v1-zuul-client

#端口
server.port=10088

#设置是否启用安全
management.security.enabled=false

#设置服务器信息

info.app.encoding=@project.build.sourceEncoding@
info.app.java.source=@java.version@
info.app.java.target=@java.version@
info.app.name=@name@
info.app.version=@version@
info.app.artifactId=@artifactId@
info.app.groupId=@groupId@
info.app.modelVersion=@modelVersion@
info.app.parent.groupId=@parent.groupId@
info.app.parent.artifactId=@parent.artifactId@


# 网关地址配置 映射的地址
zuul.routes.user-route.url=http://192.168.10.27:10087/
# 网关配置访问的url
zuul.routes.user-route.path=/api/**


```



服务依赖

###### 第一步启动：spring-cloud-learn-examples-v1-zuul

​	访问方式：http://192.168.10.27:10087/user/1

###### 第二步启动：spring-cloud-learn-examples-v1-zuul-client

​	访问方式：http://192.168.10.27:10088/api/user/1

