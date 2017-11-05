181mall项目说明

src|
	|controller 
	|service 
	|pojo 
	|bean
1.不要操作controller和service包bean包之外的文件
2.imple包表示存放类，inter包表示存放接口
3.tool包存放基础模块:支付，权限，排队，短信等
4.config文件夹中包含配置信息:mybatis配置，spring配置，db数据库连接配置，log4g日志配置
5.logs文件夹存放日志文件：一般日志和错误日志
6.pom文件为maven清单文件
7.mapper和pojo是ORM自动生成的
8.bean包中可以根据需要自定义bean

10.25

