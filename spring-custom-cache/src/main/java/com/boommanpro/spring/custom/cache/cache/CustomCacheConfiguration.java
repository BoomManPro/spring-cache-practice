package com.boommanpro.spring.custom.cache.cache;

import org.springframework.cache.Cache;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangqimeng
 * @date 2020/4/15 18:12
 */
@Configuration
public class CustomCacheConfiguration {

    /**
     * 类型A
     */
    @Bean
    public Cache customCache1() {
        return new ConcurrentMapCache("boommanpro", true);
    }

    /**
     * 类型B
     */
    @Bean
    public Cache customCache2() {
        return new ConcurrentMapCache("boommanpro1", true);
    }

}
