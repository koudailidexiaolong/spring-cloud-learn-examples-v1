#### 依赖项目

##### spring-cloud-learn-examples-v1-config-client 配置中心 客户端

##### application.properties

```peoperties
spring.application.name=spring-cloud-learn-examples-v1-config-client

logging.level.*=trace
logging.level.org.springframework.web=trace
#端口
server.port=10089

#设置是否启用安全
management.security.enabled=false

#设置服务器信息

info.app.encoding=@project.build.sourceEncoding@
info.app.java.source=@java.version@
info.app.java.target=@java.version@
# 配置中心服务端的配置文件名称 
spring.cloud.config.name=spring-config
# 服务端 调用的文件版本信息  如 dev prod  test 1.0 等描述信息 文件格式为 aaa-dev.yml/properties 形式
spring.cloud.config.profile=dev
# 服务端文件存储的文件夹
#spring.cloud.config.label=


```

##### bootstrap.properties

```properties
# 服务配置中心地址
spring.cloud.config.uri=http://192.168.10.27:10088
```





##### 服务依赖

###### 第一步启动：spring-cloud-learn-examples-v1-config

###### 第二步启动：spring-cloud-learn-examples-v1-config-client



客户端访问方法 ：

​		http://192.168.10.27:10089/index 

#####  配置刷新的方法

​	修改服务端的配置文件  客户端通过 调用 refresh 方法进行刷新配置文件



```java
   public static void main(String[] args) {
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpPost post = new HttpPost("http://192.168.10.27:10089/refresh");
            CloseableHttpResponse response = httpClient.execute(post);
            System.out.println(response.getStatusLine().getStatusCode());
//            System.out.println(response.getEntity().getContent().);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

