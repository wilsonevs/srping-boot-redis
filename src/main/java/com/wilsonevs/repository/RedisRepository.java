package com.wilsonevs.repository;

import java.util.Map;
import java.util.UUID;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;

import com.wilsonevs.domain.Student;

public class RedisRepository implements IRedisRepository {
	
	private static final String KEY = "Stundet";
	
	// Conexión bd
	@Autowired
	private RedisTemplate<String, Student> redisTemplate;
	
	// Constructor para inyectar el redis ah esta clase
	//public RedisRepository(RedisTemplate<String, Student> redisTemplate) {
	//	this.redisTemplate = redisTemplate;
	//}
	
	private HashOperations hashOperations;
	
	// Vamos a settear hashOperations
	@PostConstruct
	private void init() {
		hashOperations = redisTemplate.opsForHash();
	}

	@Override
	public Map<String, Student> findAll() {
		return hashOperations.entries(KEY);
	}

	@Override
	public Student findById(String id) {
		return (Student) hashOperations.get(KEY, id);
	}

	@Override
	public void save(Student student) {
		hashOperations.put(KEY, UUID.randomUUID().toString(), student);
	}

	@Override
	public void delete(String id) {
		hashOperations.delete(KEY, id);
	}

}
