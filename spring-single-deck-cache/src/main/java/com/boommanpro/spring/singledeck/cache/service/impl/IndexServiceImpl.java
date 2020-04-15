package com.boommanpro.spring.singledeck.cache.service.impl;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import com.boommanpro.spring.singledeck.cache.service.IndexService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author wangqimeng
 * @date 2020/4/15 11:24
 */
@Slf4j
@Service
public class IndexServiceImpl implements IndexService {

    public static final Map<String, String> MAP = new ConcurrentHashMap<>();

    @Override
    @Cacheable("boommanpro")
    public Map<String, String> index() {
        log.info("index查询业务执行");
        String s = UUID.randomUUID().toString();
        MAP.put(s, "value");
        return MAP;
    }

    @Override
    @CacheEvict("boommanpro")
    public String clearCache() {
        return "success";
    }

    @Override
    @CachePut("boommanpro")
    public Map<String, String> put() {
        log.info("放入业务开始执行");
        String s = UUID.randomUUID().toString();
        MAP.put(s, "value");
        return MAP;
    }
}
