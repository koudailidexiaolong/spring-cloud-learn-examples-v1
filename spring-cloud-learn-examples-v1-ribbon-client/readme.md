#### 	负载均衡客户端服务

##### spring-cloud-learn-examples-v1-ribbon-client 

##### 

配置信息

```XML
	<!-- 负载均衡 -->
		<dependency>
		    <groupId>org.springframework.cloud</groupId>
		    <artifactId>spring-cloud-starter-ribbon</artifactId>
		</dependency>
```



application.properties

```properties
spring.application.name=spring-cloud-learn-examples-v1-ribbon-client
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
eureka.client.healthcheck.enabled=true

```



依赖服务：

###### 	第一步启动：spring-cloud-learn-examples-v1-ribbon

​			访问地址：http://192.168.10.27:8761/

###### 	第二步启动：spring-cloud-learn-examples-v1-ribbon-server 启动多个服务 通过修改端口实现

​			访问地址：

###### 	第三步启动：spring-cloud-learn-examples-v1-ribbon-client

​			访问地址：http://192.168.10.27:18081/template/user/1

后台查看访问日志： 发现访问方式为轮巡访问方式

```logger
2021-09-25 19:29:05.701  INFO 7980 --- [io-18081-exec-2] com.julong.action.IndexAction            : serviceInstance:spring-cloud-learn-examples-v1-ribbon-server,host:192.168.10.27,port:18882，URI：http://192.168.10.27:18882
2021-09-25 19:29:55.410  INFO 7980 --- [io-18081-exec-5] com.julong.action.IndexAction            : serviceInstance:spring-cloud-learn-examples-v1-ribbon-server,host:192.168.10.27,port:18882，URI：http://192.168.10.27:18882
2021-09-25 19:29:55.955  INFO 7980 --- [io-18081-exec-6] com.julong.action.IndexAction            : serviceInstance:spring-cloud-learn-examples-v1-ribbon-server,host:192.168.10.27,port:18883，URI：http://192.168.10.27:18883
2021-09-25 19:29:56.252  INFO 7980 --- [io-18081-exec-7] com.julong.action.IndexAction            : serviceInstance:spring-cloud-learn-examples-v1-ribbon-server,host:192.168.10.27,port:18881，URI：http://192.168.10.27:18881
2021-09-25 19:29:57.124  INFO 7980 --- [io-18081-exec-4] com.julong.action.IndexAction            : serviceInstance:spring-cloud-learn-examples-v1-ribbon-server,host:192.168.10.27,port:18882，URI：http://192.168.10.27:18882
2021-09-25 19:29:57.322  INFO 7980 --- [io-18081-exec-9] com.julong.action.IndexAction            : serviceInstance:spring-cloud-learn-examples-v1-ribbon-server,host:192.168.10.27,port:18883，URI：http://192.168.10.27:18883
```



