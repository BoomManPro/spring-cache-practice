package com.boommanpro.spring.singledeck.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author wangqieng
 */
@EnableCaching
@SpringBootApplication
public class SpringSingleDeckCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSingleDeckCacheApplication.class, args);
    }

}
