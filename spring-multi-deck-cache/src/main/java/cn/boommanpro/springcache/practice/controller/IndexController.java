package cn.boommanpro.springcache.practice.controller;

import java.util.Map;

import cn.boommanpro.springcache.practice.service.IndexService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangqimeng
 * @date 2020/4/14 17:43
 */
@RestController
@RequestMapping
public class IndexController {

    private final IndexService indexService;

    public IndexController(IndexService indexService) {
        this.indexService = indexService;
    }

    @GetMapping
    public Map<String, String> index() {
        return indexService.index();
    }
}
