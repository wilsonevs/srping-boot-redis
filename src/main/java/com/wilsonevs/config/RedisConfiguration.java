package com.wilsonevs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.wilsonevs.domain.Student;

@Configuration
public class RedisConfiguration {
	
	//Regresa nueva conneccion bd
	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		return new JedisConnectionFactory();
	}
	
	@Bean
	RedisTemplate<String, Student> redisTemplats(){
		final RedisTemplate<String, Student> redisTemplate =  new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		return redisTemplate;
	}
	

}
