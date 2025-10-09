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

`plugin-common-impl`依赖的`plugin-common-dependency`不在启动服务中

可以将`plugin-common-dependency`作为一个被依赖的基础插件进行加载，
并指定`plugin-common-impl`依赖`plugin-common-dependency`

在`plugin-common-dependency`的`plugin.properties`中设置

```properties
#定义插件名称
concept.plugin.name=common-dependency
#只加载内容不进行解析匹配提取
concept.plugin.handler.enabled=false
```

在`plugin-common-impl`的`plugin.properties`中设置

```properties
#依赖指定插件 多个用逗号隔开
concept.plugin.dependency.names=common-dependency
```
## plugin-nested

> 嵌套依赖插件

`plugin-nested-impl`依赖的`plugin-nested-dependency`不在启动服务中

可以将`plugin-nested-dependency`直接打包进`plugin-nested-impl`中

## plugin-cycle

> 循环依赖校验

`plugin-cycle1`的`plugin.properties`配置

```properties
# cycle1 依赖 cycle2
concept.plugin.name=cycle1
concept.plugin.dependency.names=cycle2
```

`plugin-cycle2`的`plugin.properties`配置

```properties
# cycle2 依赖 cycle1
concept.plugin.name=cycle1
concept.plugin.dependency.names=cycle2
```

## plugin-extract-bean

> 提取Bean

支持Spring注入功能

无法注入其他插件包中的类

插件对象不会注入到Spring容器

