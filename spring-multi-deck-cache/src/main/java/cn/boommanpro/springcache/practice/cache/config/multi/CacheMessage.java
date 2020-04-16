package cn.boommanpro.springcache.practice.cache.config.multi;

import java.io.Serializable;

import lombok.Data;

/**
 * Redis Topic中的信息
 *
 * @author wangqimeng
 */
@Data
public class CacheMessage implements Serializable {

    private static final long serialVersionUID = 5987219310442078193L;

    /**
     * 缓存名字
     */
    private String cacheName;

    /**
     * 缓存key
     */
    private Object key;

    /**
     * 寄件人
     */
    private Integer sender;

    public CacheMessage(String cacheName, Object key) {
        super();
        this.cacheName = cacheName;
        this.key = key;
    }

    public CacheMessage(String cacheName, Object key, Integer sender) {
        super();
        this.cacheName = cacheName;
        this.key = key;
        this.sender = sender;
    }

}