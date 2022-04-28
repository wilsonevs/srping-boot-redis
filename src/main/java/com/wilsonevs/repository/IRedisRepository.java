package com.wilsonevs.repository;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.wilsonevs.domain.Student;

@Repository
public interface IRedisRepository {
	
	Map<String, Student> findAll();
	Student findById(String id);
	void save(Student student);
	void delete(String id);

}
