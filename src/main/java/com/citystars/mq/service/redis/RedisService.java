package com.citystars.mq.service.redis;

public interface RedisService {

    public void addEntity(String key, String request);

    public String getEntity(String key);
}
