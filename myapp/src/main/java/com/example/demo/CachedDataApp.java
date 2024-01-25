package com.example.demo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CachedDataApp {

    @Cacheable(value = "myCache", key = "{ #param1, #param2 }")
    public String get(String param1, String param2) {
        return param1 + "/" + param2;
    }
}
