#### 依赖项目

##### spring-cloud-learn-examples-v1-config-server 配置中心 服务端

```peoperties
spring.cloud.config.enabled=true
# 默认读取配置文件路径 必须要有文件夹不然读取不出来数据
spring.cloud.config.server.native.search-locations=file:D:///config///

# 代表从本地读取文件
spring.profiles.active=native
```



请求方式：

http://192.168.10.27:10088/spring-cloud-learn-examples-v1-config-server/default/

http://192.168.10.27:10088/spring-cloud-learn-examples-v1-config-server.properties

其中 spring-cloud-learn-examples-v1-config-server 为文件名  default 为默认配置的路径

http://192.168.10.27:10088/spring-config/default/data  

http://192.168.10.27:10088/data/spring-config.properties

其中 spring-config 为文件名  default 为默认配置的路径 data 为文件夹

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
      "name": "file:D:///config///spring-cloud-learn-examples-v1-config-server.properties",
      "source": {
        "message": "hello spring-cloud-learn-examples-v1-config-server "
      }
    }
  ]
}
```

