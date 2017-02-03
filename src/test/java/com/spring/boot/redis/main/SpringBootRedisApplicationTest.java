package com.spring.boot.redis.main;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.boot.redis.config.ApplicationConfig;
import com.spring.boot.redis.repository.StudentRepository;

@SpringBootTest(classes = { ApplicationConfig.class })
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("integrationtests")
public class SpringBootRedisApplicationTest {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void test() {
	}

}
