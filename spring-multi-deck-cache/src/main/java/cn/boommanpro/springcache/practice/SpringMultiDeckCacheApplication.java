package cn.boommanpro.springcache.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Main Start
 *
 * @author wangqimeng
 */
@EnableCaching
@SpringBootApplication
public class SpringMultiDeckCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMultiDeckCacheApplication.class, args);
    }

}
