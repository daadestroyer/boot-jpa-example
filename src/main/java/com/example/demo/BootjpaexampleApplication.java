package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.UserRepo;
import com.example.demo.entity.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepo userRepo = context.getBean(UserRepo.class);
		User user1 = new User();
		user1.setId(102);
		user1.setCity("kanpur");
		user1.setName("shubham");
		user1.setStatus("Java Developer");
		User save1 = userRepo.save(user1);
		System.out.println("User Stored : "+save1);
		
		User user2 = new User();
		user2.setId(102);
		user2.setCity("kanpur");
		user2.setName("shubhanshu");
		user2.setStatus("Python Developer");
		User save2 = userRepo.save(user2);
		System.out.println("User Stored : "+save2);
	}

}
