package com.spring.boot.redis.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Profile({ "dev" })
@Configuration
@EnableRedisHttpSession
public class DevConfig extends ApplicationConfig {

}
