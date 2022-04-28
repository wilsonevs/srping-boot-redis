package com.wilsonevs.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wilsonevs.domain.Student;
import com.wilsonevs.repository.IRedisRepository;

@RestController
@RequestMapping("redis")
public class RedisController {
  
  @Autowired
  private IRedisRepository redisRepository;
  
  @GetMapping("/")
  public Map<String, Student> findAll(){
    return redisRepository.findAll();
  }
  
  @GetMapping("/{id}")
  public Student findById(@PathVariable String id) {
    return redisRepository.findById(id);
  }
  
  @PostMapping("/")
  public void save(@RequestBody Student student) {
    redisRepository.save(student);
  }
  
  @DeleteMapping("/{id}")
  public void delete(@PathVariable String id) {
    redisRepository.delete(id);
  }
  

}
