#/bin/bash

docker pull mysql:5.7

docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 --name my-mysql mysql:5.7

# 进入mysql容器
docker exec -it my-mysql bash

# 命令行登录数据,输入密码123456
mysql -uroot -p

# 创建数据库
create database es;

# 切换到es数据库
use es;

# 帮助命令
show tables;

select * from es;