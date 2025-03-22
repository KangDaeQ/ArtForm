package com.ssafy.artformuser.dao;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
public class RedisDao {

    private final RedisTemplate<String, Object> redisTemplate;
    private final ValueOperations<String, Object> values;

    public RedisDao(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
        this.values = redisTemplate.opsForValue();
    }

    // 기본 데이터 저장
    public void setValues(String key, Object data) {
        values.set(key, data);
    }

    // 만료 시간이 있는 데이터 저장
    public void setValues(String key, Object data, Duration duration) {
        values.set(key, data, duration);
    }

    // 데이터 조회
    public Object getValues(String key) {
        return values.get(key);
    }

    // 데이터 삭제
    public void deleteValues(String key) {
        redisTemplate.delete(key);
    }
}
