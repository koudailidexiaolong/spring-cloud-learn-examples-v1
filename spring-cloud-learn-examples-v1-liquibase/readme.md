#### 依赖项目

##### `spring-cloud-learn-examples-v1-liquibase 数据库版本控制服务`

项目访问目录：http://192.168.10.27:18080/

###### pom.xml 增加配置

```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>
<dependency>
    <groupId>org.liquibase</groupId>
    <artifactId>liquibase-core</artifactId>
</dependency>
```

application.properties

```properties
## 开启liquibase
liquibase.enabled=true
## 默认使用的数据库名称
liquibase.default-schema=test
## 数据库登录名称
liquibase.user=root
##数据库登录密码
liquibase.password=root
## 数据库连接地址
liquibase.url=jdbc:mysql://192.168.10.222:3306/mysql
## 变更日志配置记录路径  文件可以是json  yaml xml 三种 默认路径为 classpath:/db/changelog/db.changelog-master.yaml
liquibase.change-log=classpath:db/changelog/db.changelog-master.xml
## 检查变更日志信息文件是否存在 默认为 true 检查
liquibase.check-change-log-location=true
## 是否删除数据库
liquibase.drop-first=false
```



使用 liquibase 数据库版本控制需要 做配置

src\main\resources 目录下 创建  db\changelog 目录 

主配置文件

######  db.changelog-master.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<databaseChangeLog xmlns="http://www.liquibase.org/xml/ns/dbchangelog"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:pro="http://www.liquibase.org/xml/ns/pro"
        xsi:schemaLocation="http://www.liquibase.org/xml/ns/dbchangelog
                            http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-4.4.xsd
                            http://www.liquibase.org/xml/ns/pro
                            http://www.liquibase.org/xml/ns/pro/liquibase-pro-4.2.xsd">
    <include file="/db/changelog/db.changelog-v1.0.xml" ></include>
    <include file="/db/changelog/db.changelog-v1.1.xml" ></include>

</databaseChangeLog>
```



从配置文件为版本文件 格式是固定的 需要根据此配置进行 本人以xml 为例

###### db.changelog-v1.0.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<databaseChangeLog xmlns="http://www.liquibase.org/xml/ns/dbchangelog"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:pro="http://www.liquibase.org/xml/ns/pro"
        xsi:schemaLocation="http://www.liquibase.org/xml/ns/dbchangelog
                            http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-4.4.xsd
                            http://www.liquibase.org/xml/ns/pro
                            http://www.liquibase.org/xml/ns/pro/liquibase-pro-4.2.xsd">
    <changeSet author="julong" id="1185214997195-1" >
        <createTable tableName="BONUS">
            <column name="NAME" type="VARCHAR2(15)"/>
            <column name="JOB" type="VARCHAR2(255)"/>
            <column name="SAL" type="int(5)"/>
        </createTable>
    </changeSet>
</databaseChangeLog>
```

###### db.changelog-v1.1.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<databaseChangeLog xmlns="http://www.liquibase.org/xml/ns/dbchangelog"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:pro="http://www.liquibase.org/xml/ns/pro"
        xsi:schemaLocation="http://www.liquibase.org/xml/ns/dbchangelog
                            http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-4.4.xsd
                            http://www.liquibase.org/xml/ns/pro
                            http://www.liquibase.org/xml/ns/pro/liquibase-pro-4.2.xsd">
    <changeSet id="inser-001" author="julong">
        <insert tableName="BONUS">
            <!-- 值为空的时候 defaultvalue会生效-->
            <column name="NAME" defaultValue="julong01">julong</column>
            <column name="JOB">农民</column>
            <column name="SAL">1</column>
        </insert>
        <insert tableName="BONUS">
            <column name="NAME" >julong1</column>
            <column name="JOB">农民</column>
            <column name="SAL">2</column>
        </insert>
        <insert tableName="BONUS">
            <column name="NAME" >julong2</column>
            <column name="JOB">农民</column>
            <column name="SAL">3</column>
        </insert>
    </changeSet>
</databaseChangeLog>
```

