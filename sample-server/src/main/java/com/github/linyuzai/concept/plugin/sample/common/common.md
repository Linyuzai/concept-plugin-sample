# 基础依赖插件

plugin-common-impl依赖的plugin-common-dependency不在启动服务中

可以将plugin-common-dependency作为一个被依赖的基础插件进行加载，
并指定plugin-common-impl依赖plugin-common-dependency

在plugin-common-dependency的plugin.properties中设置
```properties
#定义插件名称
concept.plugin.name=common-dependency
#只加载内容不进行解析匹配提取
concept.plugin.handler.enabled=false
```

在plugin-common-impl的plugin.properties中设置
```properties
#依赖指定插件 多个用逗号隔开
concept.plugin.dependency.names=common-dependency
```
