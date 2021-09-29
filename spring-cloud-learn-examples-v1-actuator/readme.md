#### 依赖项目

##### `spring-cloud-learn-examples-v1-actuator`

启动后项目访问目录：http://192.168.10.27:18080/

| ID          | Description                                                  | Sensitive Default(默认值) |
| ----------- | ------------------------------------------------------------ | ------------------------- |
| auditevents | 当前引用程序启用、使用的事件                                 | true                      |
| autoconfig  | 显示自动配置信息                                             | true                      |
| beans       | 显示所有的 Spring beans 在当前程序中                         | true                      |
| configprops | 显示所有的 @ConfigurationProperties                          | true                      |
| dump        | 显示所有的线程快照                                           | true                      |
| env         | 显示应用环境变量信息                                         | true                      |
| health      | 显示应用程序的健康信息指标 如果为安全时显示详细 不安全只显示一个状态 | false                     |
| info        | 显示应用信息                                                 | false                     |
| loggers     | 显示在程序中配置日志的信息                                   | true                      |
| mappings    | 显示所有的mapping 映射的 url路径                             | true                      |
| metrics     | 显示应用程序的指标                                           | true                      |
| trace       | 显示日志跟踪信息 显示 100 HTTP 个请求                        | true                      |
| heapdump    | 显示下载所有线程快照文件                                     | true                      |
|             |                                                              |                           |



#### 配置文件加载顺序
1.在命令行中传入参数

2.SPRING_APPLICATION_JSON 中的属性

3.java:comp/env 中的JNDI属性

4.java 系统属性

5.操作系统环境变量

6.通过random.*配置的随机属性

7.jar包外的配置文件

8.jar包内的配置文件

9.位于jar包外的文件

10.位于jar包内的文件

11.使用@Configuration 注解修改的类

12.默认配置

