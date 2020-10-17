package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	public List<User> findByName(String name);
	public List<User> findByNameAndCity(String name,String city);
	public List<User> findByNameStartingWith(String prefix);
	public List<User> findByNameEndingWith(String suffix);
}	 
