package com.boommanpro.spring.singledeck.cache.service;

import java.util.Map;

/**
 * @author wangqimeng
 * @date 2020/4/15 11:23
 */
public interface IndexService {

    Map<String, String> index();

    String clearCache();

    Map<String, String> put();
}
