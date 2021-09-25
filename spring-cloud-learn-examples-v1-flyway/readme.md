#### 依赖项目

##### `spring-cloud-learn-examples-v1-flyway 数据库版本控制服务`

项目访问目录：http://192.168.10.27:18080/

数据库脚本执行层级借口访问地址

http://192.168.10.27:18080/flyway.json 、http://192.168.10.27:18080/flyway

pom.xml

```xml
		<dependency>
			<groupId>org.flywaydb</groupId>
			<artifactId>flyway-core</artifactId>
		</dependency>
```



application.properties

```properties
# 启用数据迁移配置
flyway.enabled=true
## flyway 数据库 数据库迁移 意思就是生成数据库表和数据
flyway.url=jdbc:mysql://192.168.10.222:3306/mysql
# 数据库表模式
flyway.schemas=test
# 登录信息
flyway.user=root
flyway.password=root
# 编码格式
flyway.encoding=utf-8
# 记录表名
flyway.table=flyway_update_record
flyway.baseline-on-migrate=true

# 表数据描述
flyway.baseline-description=数据迁移表
#flyway.locations=classpath:db/migration
```



使用 flyway 数据库版本控制需要 做配置

src\main\resources 目录下 创建  db\migration 目录 

文件格式  必须如下：    V1_1__inital.sql 格式 一次创建

