#### 依赖项目

##### spring-cloud-learn-examples-v1-config-client 配置中心 客户端

```peoperties
#配置配置中心地址  默认为 8888端口 如果需要自己定义端口  需要 增加配置文件  boostrap.properties 将此配置增加进去
spring.cloud.config.uri=http://192.168.10.27:10088/
#配置中心服务名称 此名称用于调用 服务端的配置文件 名称匹配
spring.cloud.config.name=spring-config
```



客户端访问方法 ：

http://192.168.10.27:10089/index 

验证是否正确返回 
