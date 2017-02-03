package com.spring.boot.redis.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.spring.boot.redis.model.Student;
import com.spring.boot.redis.repository.StudentRepository;

@SpringBootApplication
@ComponentScan(basePackages = { "com.spring.boot.redis.config" })
public class SpringBootRedisApplication {

	@Component
	static class Runner implements CommandLineRunner {

		@Autowired
		private StudentRepository studentRepository;

		@Override
		public void run(String... args) throws Exception {
			Student student = new Student("1", "Arpit", Student.Gender.MALE, 1);
			studentRepository.saveStudent(student);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRedisApplication.class, args);
	}

}
