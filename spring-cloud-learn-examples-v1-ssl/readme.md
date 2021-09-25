#### 依赖项目

##### `spring-cloud-learn-examples-v1-ssl`

##### julong.jks 密码为julong 别名为 tomcat


## 生成命令：
```shell script
C:\Users\julong>keytool -keystore julong.jks -genkey -alias tomcat -keyalg RSA
输入密钥库口令:
再次输入新口令:
您的名字与姓氏是什么?
  [Unknown]:  JL
您的组织单位名称是什么?
  [Unknown]:  JL
您的组织名称是什么?
  [Unknown]:  JL
您所在的城市或区域名称是什么?
  [Unknown]:  SX
您所在的省/市/自治区名称是什么?
  [Unknown]:  XA
该单位的双字母国家/地区代码是什么?
  [Unknown]:  ZH
CN=JL, OU=JL, O=JL, L=SX, ST=XA, C=ZH是否正确?
  [否]:
您的名字与姓氏是什么?
  [JL]:  JL
您的组织单位名称是什么?
  [JL]:  JL
您的组织名称是什么?
  [JL]:  JL
您所在的城市或区域名称是什么?
  [SX]:  SX
您所在的省/市/自治区名称是什么?
  [XA]:  XA
该单位的双字母国家/地区代码是什么?
  [ZH]:  ZH
CN=JL, OU=JL, O=JL, L=SX, ST=XA, C=ZH是否正确?
  [否]:  Y

输入 <tomcat> 的密钥口令
        (如果和密钥库口令相同, 按回车):
再次输入新口令:

C:\Users\julong>

```

