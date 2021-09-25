#### 依赖项目

##### spring-cloud-learn-examples-v1-config-server 配置中心 服务端

```peoperties
spring.application.name=spring-cloud-learn-examples-v1-config-server

logging.level.*=trace
logging.level.org.springframework.web=trace
#端口
server.port=10088

#设置是否启用安全
management.security.enabled=false

#设置服务器信息
info.app.encoding=@project.build.sourceEncoding@
info.app.java.source=@java.version@
info.app.java.target=@java.version@

spring.cloud.config.enabled=true
# 默认读取配置文件路径 必须要有文件夹不然读取不出来数据
spring.cloud.config.server.native.search-locations=file:D:/config/
# 代表从本地读取文件
spring.profiles.active=native
```



访问方式：

http://192.168.10.27:10088/spring-config/default

```json
{
  "name": "spring-config",
  "profiles": [
    "default"
  ],
  "label": null,
  "version": null,
  "state": null,
  "propertySources": [
    {
      "name": "file:D:/config/spring-config.properties",
      "source": {
        "welcome.message": "hello spring-config"
      }
    }
  ]
}
```



http://192.168.10.27:10088/spring-config.properties

```txt
welcome.message: hello spring-config
```



http://192.168.10.27:10088/spring-cloud-learn-examples-v1-config-server/default



```json
{
  "name": "spring-cloud-learn-examples-v1-config-server",
  "profiles": [
    "default"
  ],
  "label": null,
  "version": null,
  "state": null,
  "propertySources": [
    {
      "name": "file:D:/config/spring-cloud-learn-examples-v1-config-server.properties",
      "source": {
        "welcome.message": "hello spring-cloud-learn-examples-v1-config-server "
      }
    }
  ]
}
```

