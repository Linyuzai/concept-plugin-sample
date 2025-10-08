# 示例说明

`sample-server`为启动模块，修改启动类扫包路径方便调试对应功能

```java
@EnablePluginConcept
@SpringBootApplication(scanBasePackages = Packages.COMMON)
public class ConceptPluginSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConceptPluginSampleApplication.class, args);
    }
}
```

`plugin-`开头的为插件模块，直接通过`jar`打包对应插件

`application.yml`提供多种插件存储
- memory——内存插件存储
- local——本地插件存储
- remote——远程插件存储
  - aws1——aws s3 v1 sdk
  - aws2——aws s3 v2 sdk
  - minio——minio sdk

## plugin-common

> 基础依赖插件

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
## plugin-nested

> 嵌套依赖插件

plugin-nested-impl依赖的plugin-nested-dependency不在启动服务中

可以将plugin-nested-dependency直接打包进plugin-nested-impl中