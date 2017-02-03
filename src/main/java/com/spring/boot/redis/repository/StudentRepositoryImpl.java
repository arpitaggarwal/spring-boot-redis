package com.spring.boot.redis.repository;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.spring.boot.redis.model.Student;

@Repository
@SuppressWarnings({ "rawtypes", "unchecked" })
public class StudentRepositoryImpl implements StudentRepository {

	private static final String KEY = "Student";

	@Autowired
	private RedisTemplate<String, Student> redisTemplate;

	private HashOperations hashOps;

	public StudentRepositoryImpl(RedisTemplate<String, Student> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	@PostConstruct
	private void init() {
		hashOps = redisTemplate.opsForHash();
	}

	public void saveStudent(Student student) {
		hashOps.put(KEY, student.getId(), student);
	}

	public void updateStudent(Student student) {
		hashOps.put(KEY, student.getId(), student);
	}

	public Student findStudent(String id) {
		return (Student) hashOps.get(KEY, id);
	}

	public Map<Object, Object> findAllStudents() {
		return hashOps.entries(KEY);
	}

	public void deleteStudent(String id) {
		hashOps.delete(KEY, id);
	}
}
