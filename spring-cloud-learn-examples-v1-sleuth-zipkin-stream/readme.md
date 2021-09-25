#### 依赖项目

##### spring-cloud-learn-examples-v1-sleuth-zipkin-stream

访问路径 http://192.168.10.27:18080/zipkin

配置信息兼容性

```xml
<!-- 日志跟踪 -->
		dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-sleuth</artifactId>
			<version>1.3.6.RELEASE</version>
		</dependency>
		<dependency>
		    <groupId>org.springframework.cloud</groupId>
		    <artifactId>spring-cloud-sleuth-zipkin-stream</artifactId>
		    <version>1.3.6.RELEASE</version>
		</dependency>
		<dependency>
		    <groupId>io.zipkin.java</groupId>
		    <artifactId>zipkin-autoconfigure-ui</artifactId>
		    <version>2.7.1</version>
		</dependency>
		<dependency>
		    <groupId>org.springframework.cloud</groupId>
		    <artifactId>spring-cloud-starter-stream-rabbit</artifactId>
		     <version>1.3.5.RELEASE</version>
		</dependency>
		
		
```

消息队列配置

```prop
## rabbitmq \u914D\u7F6E
spring.rabbitmq.host=192.168.10.222
spring.rabbitmq.port=5672
spring.rabbitmq.username=admin
spring.rabbitmq.password=admin
```



启动类需要加上 注解：@EnableZipkinStreamServer
