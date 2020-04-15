package com.boommanpro.spring.custom.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Main Start
 * @author wangqimeng
 */
@EnableCaching
@SpringBootApplication
public class SpringCustomCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCustomCacheApplication.class, args);
    }

}
