package com.spring.boot.redis.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({ "integrationtests", "unittest" })
public class IntegrationTestConfig extends ApplicationConfig {

}
