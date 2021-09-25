#### 依赖项目

##### `spring-cloud-learn-examples-v1-zuul `代理服务

##### `spring-cloud-learn-examples-v1-zuul-client-1`  代理调用服务

```properties
spring.application.name=spring-cloud-learn-examples-v1-zuul

#端口
server.port=10086

#设置是否启用安全
management.security.enabled=false

#设置服务器信息

info.app.encoding=@project.build.sourceEncoding@
info.app.java.source=@java.version@
info.app.java.target=@java.version@

# 网关地址配置 映射的地址
zuul.routes.user.url=http://192.168.10.27:10087/
# 网关配置访问的url 
zuul.routes.user.path=/api/**
```





