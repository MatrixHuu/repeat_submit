package org.javaboy.repeat_submit.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author xyma
 * @version 1.0
 * @data 2023/6/16 13:47
 */

@Component
public class RedisCache {
    @Autowired
    RedisTemplate redisTemplate;

    public<T> void setCacheObject(final String key, final T value, Integer timeout, final TimeUnit timeUnit) {
        redisTemplate.opsForValue().set(key, value, timeout, timeUnit);
    }

    public<T> T getCacheObject(final String key) {
        ValueOperations<String, T> valueOperations = redisTemplate.opsForValue();
        return valueOperations.get(key);
    }
}
