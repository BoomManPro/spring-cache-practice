# Spring Boot 配置单级别缓存

### 配置缓存类型和默认优先级

Link: org.springframework.boot.autoconfigure.cache.CacheConfigurations

https://docs.spring.io/spring/docs/5.2.5.RELEASE/spring-framework-reference/integration.html#cache-store-configuration

Cache优先级如下:
org.springframework.boot.autoconfigure.cache.CacheType

虽然优先级如上，但是因为如果缺少他们的jar依赖,其Configuration是启动不来的,所以在单引入cache-starter时,使用@EnableCaching是使用的SimpleCache即核心是ConcurrentHashMap的模式

## Type优先级配置方式核心

org.springframework.boot.autoconfigure.cache.CacheCondition

Link：https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/html/spring-boot-features.html#boot-features-caching-provider-simple

特殊的情况是在不想使用Cache模式可以用`spring.cache.type=none`进行关闭.如在测试模式下


## 备注

如果使用Spring Boot 提供的缓存,需注意引入相关的依赖,如使用Redis缓存,需引入Redis依赖

```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-redis</artifactId>
        </dependency>
```
