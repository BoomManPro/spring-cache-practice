package cn.boommanpro.springcache.practice.redislistener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

/**
 * @author wangqimeng
 * @date 2020/4/16 9:51
 */
@Slf4j
@Component
public class CustomRedisListener extends KeyExpirationEventMessageListener {

    @Override
    public void onMessage(Message message, byte[] pattern) {
        super.onMessage(message, pattern);
        log.info("Key is expiration message:[{}]",message.toString());
    }

    /**
     * Creates new {@link MessageListener} for {@code __keyevent@*__:expired} messages.
     *
     * @param listenerContainer must not be {@literal null}.
     */
    public CustomRedisListener(RedisMessageListenerContainer listenerContainer) {
        super(listenerContainer);
    }
}
