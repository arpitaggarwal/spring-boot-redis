package com.spring.boot.redis.repository;

import com.spring.boot.redis.model.Student;

public interface StudentRepository {

	void saveStudent(Student person);

}
