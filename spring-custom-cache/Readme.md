# Spring Custom Cache

在使用Spring Boot Cache使用中我们看到了cache-type的优先级,其扫描bean的优先级是最高的.

如果们想自定义Cache类型的话,只需要在上下文使用创建自定义的`Cache`Bean即可.

其对应的CacheManager ->  org.springframework.boot.autoconfigure.cache.CacheConfigurations
                    -> org.springframework.boot.autoconfigure.cache.GenericCacheConfiguration.cacheManager
