##基于Springboot天网架构
1.整体架构
   
   项目采用SpringBoot为核心架构,Mybatis为持久层,Ehcache为缓存等开发的练习系统
```tex
    skynet[天网]
    |
    |---[web-core-module]---控制器层
    |
    |---[service-module]---服务层
    |
    |---[common-module]---公共资源模块
    |
    |---[quratz-module]---定时任务框架
    |
    |---[system-module]---系统资源模块
    |