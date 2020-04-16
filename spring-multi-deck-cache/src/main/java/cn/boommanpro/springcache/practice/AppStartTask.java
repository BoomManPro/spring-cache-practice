package cn.boommanpro.springcache.practice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

/**
 * @author wangqimeng
 * @date 2020/4/16 9:32
 */
@Slf4j
@Component
public class AppStartTask implements ApplicationRunner {

    @Autowired
    private CacheManager cacheManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("cacheManager:{}",cacheManager.getClass());
    }
}
