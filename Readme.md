# Spring Cache Abstraction

https://docs.spring.io/spring/docs/5.2.5.RELEASE/spring-framework-reference/integration.html#cache

```java
       <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-cache</artifactId>
        </dependency>
```

其核心在 `spring-context-support`中.


缓存使用注意事项:

This approach works only for methods that are guaranteed to return the same output (result) for a given input (or arguments) no matter how many times it is executed.

在使用缓存的时候,需注意仅适用于多次调用都返回相同结果的时候。


## Spring Cache & JSR 107 注解规范

https://docs.spring.io/spring/docs/5.2.5.RELEASE/spring-framework-reference/integration.html#cache-jsr-107



## 多进程缓存

If you have a multi-process environment (that is, an application deployed on several nodes), you need to configure your cache provider accordingly. Depending on your use cases, a copy of the same data on several nodes can be enough. However, if you change the data during the course of the application, you may need to enable other propagation mechanisms.

如果在多进程环境下使用缓存,在修改数据时,需要将缓存传播修改。
