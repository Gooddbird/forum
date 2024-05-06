# Forum

## 1. 架构

主要包含以下几个模块：

- user: 用户模块，管理用户的注册、修改、鉴权等
- post：帖子模块：实现论坛帖子保存、发布、修改、删除等
- web: web 接口，网关层，主要是提供 Restful 接口供前端调用，然后将请求转发给后端各服务。



## 2. 用户模块 User

### 2.1 接口设计
#### 2.1.1 用户注册-register
##### 2.1.1.1 接口说明

##### 2.1.1.2 接口入参
id
name
sex
gender
passwd

##### 2.1.1.3 接口出参

#### 2.1.2 用户鉴权-authenticate
##### 2.1.2.1 接口说明

##### 2.1.2.2 接口入参
id passwd 

##### 2.1.2.3 接口出参


### 2.2 数据库设计
#### 2.2.1 用戶资料表 UserInfo
| 字段          | 类型           | 含义                          |
|-------------|--------------|-----------------------------|
| id          | varchar(20)  | 用户ID，唯一标识                   |
| name        | varchar(128) | 用户名称                        |
| sex         | smallint(8)  | 性别，1-Man,2-Woman            |
| gender      | smallint(8)  | 年龄                          |
| passwd      | varchar(128) | 密码（使用 bcrypt 签名）            |
| createdTime | datetime     | 创建时间，yyyy-mm-dd HH:MM:ss 格式 |
| updatedTime | datetime     | 最后更新时间                      |



## 2.2 接口清单：


## Help
### 1. Nacos 安装
https://nacos.io/zh-cn/docs/v2/quickstart/quick-start.html




