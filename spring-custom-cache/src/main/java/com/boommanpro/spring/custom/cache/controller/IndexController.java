package com.boommanpro.spring.custom.cache.controller;

import java.util.Map;
import javax.annotation.Resource;

import com.boommanpro.spring.custom.cache.service.IndexService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangqimeng
 * @date 2020/4/15 11:22
 */
@RestController
@RequestMapping
public class IndexController {

    @Resource
    private IndexService indexService;

    @GetMapping
    public Map<String, String> index() {
        return indexService.index();
    }


    @GetMapping("clearCache")
    public String clearCache() {
        return indexService.clearCache();
    }


    @GetMapping("put")
    public Map<String, String> put() {
        return indexService.put();
    }
}
