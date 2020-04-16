package cn.boommanpro.springcache.practice.service.impl;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import cn.boommanpro.springcache.practice.cache.CacheManagerNames;
import cn.boommanpro.springcache.practice.service.IndexService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author wangqimeng
 * @date 2020/4/14 17:45
 */
@Slf4j
@Service
public class IndexServiceImpl implements IndexService {

    private Map<String, String> map = new ConcurrentHashMap<>();

    @Override
    @Cacheable(cacheNames = "cache1",key = "#root.methodName")
    public Map<String, String> index() {
        UUID uuid = UUID.randomUUID();
        log.info("index内容获取:key:[{}],value:[{}]", uuid.toString(), uuid.toString());
        map.put(uuid.toString(), uuid.toString());
        return map;
    }
}
