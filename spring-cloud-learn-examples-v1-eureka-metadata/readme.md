#### 元数据测试项目

##### spring-cloud-learn-examples-v1-eureka-metadata

相关配置 http://192.168.10.27:18766/user-instance

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



关于配置：

```prop
# 是否将本机服务注册

eureka.instance.hostname=192.168.10.27
eureka.instance.prefer-ip-address=true
# 服务发现地址
eureka.client.service-url.defaultZone=http://192.168.10.27:8761/eureka
# 元数据定义 map集合
eureka.instance.metadata-map.my-metadata=julong-data
eureka.instance.metadata-map.my-metadata1=julong-data
# 表示当前app 的instanceId 在 服务端展示的名称
eureka.instance.instance-id=spring-cloud-learn-examples-v1-eureka-metadata
# 分组名称
eureka.instance.app-group-name=julong
# 启用客户端心跳检测 默认为 true
eureka.client.healthcheck.enabled=true
```







