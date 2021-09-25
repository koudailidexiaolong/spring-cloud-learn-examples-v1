#### 元数据测试项目

##### spring-cloud-learn-examples-v1-eureka-metadata



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
spring.application.name=spring-cloud-learn-examples-v1-eureka-metadata
#端口
server.port=18766

#设置是否启用安全
management.security.enabled=false

#设置服务器信息

info.app.encoding=@project.build.sourceEncoding@
info.app.java.source=@java.version@
info.app.java.target=@java.version@

# 是否将本机服务注册

eureka.instance.hostname=192.168.10.27
eureka.instance.appname=${spring.application.name}
eureka.instance.prefer-ip-address=true
# 服务发现地址
eureka.client.service-url.defaultZone=http://192.168.10.27:8761/eureka
eureka.client.enabled=true
eureka.client.fetch-registry=true
eureka.client.register-with-eureka=true

# 元数据定义 map集合
eureka.instance.metadata-map.my-metadata=julong-data
eureka.instance.metadata-map.my-metadata1=julong-data

eureka.instance.instance-id=${spring.application.name}
# 分组名称
eureka.instance.app-group-name=julong
# 启用心跳检测
eureka.client.healthcheck.enabled=true

```





###### 元数据访问路径： http://192.168.10.27:18766/user-instance

返回当前服务的详细信息

```json
[
  {
    "host": "192.168.10.27",
    "port": 18766,
    "secure": false,
    "metadata": {
      "my-metadata1": "julong-data",
      "management.port": "18766",
      "my-metadata": "julong-data",
      "jmx.port": "50052"
    },
    "uri": "http://192.168.10.27:18766",
    "instanceInfo": {
      "instanceId": "localhost:spring-cloud-learn-examples-v1-eureka-metadata:18766",
      "app": "SPRING-CLOUD-LEARN-EXAMPLES-V1-EUREKA-METADATA",
      "appGroupName": "JULONG",
      "ipAddr": "192.168.10.27",
      "sid": "na",
      "homePageUrl": "http://192.168.10.27:18766/",
      "statusPageUrl": "http://192.168.10.27:18766/info",
      "healthCheckUrl": "http://192.168.10.27:18766/health",
      "secureHealthCheckUrl": null,
      "vipAddress": "spring-cloud-learn-examples-v1-eureka-metadata",
      "secureVipAddress": "spring-cloud-learn-examples-v1-eureka-metadata",
      "countryId": 1,
      "dataCenterInfo": {
        "@class": "com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo",
        "name": "MyOwn"
      },
      "hostName": "192.168.10.27",
      "status": "UP",
      "leaseInfo": {
        "renewalIntervalInSecs": 30,
        "durationInSecs": 90,
        "registrationTimestamp": 1630943319310,
        "lastRenewalTimestamp": 1630943319310,
        "evictionTimestamp": 0,
        "serviceUpTimestamp": 1630943318612
      },
      "isCoordinatingDiscoveryServer": false,
      "metadata": {
        "my-metadata1": "julong-data",
        "management.port": "18766",
        "my-metadata": "julong-data",
        "jmx.port": "50052"
      },
      "lastUpdatedTimestamp": 1630943319310,
      "lastDirtyTimestamp": 1630943318272,
      "actionType": "ADDED",
      "asgName": null,
      "overriddenStatus": "UNKNOWN"
    },
    "serviceId": "SPRING-CLOUD-LEARN-EXAMPLES-V1-EUREKA-METADATA"
  }
]
```



服务依赖：

###### 第一步启动：spring-cloud-learn-examples-v1-eureka

###### 第二步启动：spring-cloud-learn-examples-v1-eureka-metadata







