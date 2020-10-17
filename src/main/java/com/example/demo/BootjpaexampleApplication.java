package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.demo.dao.UserRepo;
import com.example.demo.entity.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepo userRepo = context.getBean(UserRepo.class);

		User user1 = new User();
		user1.setCity("kanpur");
		user1.setName("shubham");
		user1.setStatus("Java Developer");
		// userRepo.save(user1); // saving single user at a time

		User user2 = new User();
		user2.setCity("kanpur");
		user2.setName("shubhanshu");
		user2.setStatus("Python Developer");
		// userRepo.save(user2); // saving single user at a time

//		List<User> list = new ArrayList<>();
//		list.add(user1);
//		list.add(user2);
//		
//		Iterable<User> result = userRepo.saveAll(list); // saving all multiple methods
//		result.forEach(user->{
//			System.out.println(user);
//		});

		// updating user of id 2
//		Optional<User> findById = userRepo.findById(2);
//		User user = findById.get();
//		user.setName("Shubhanshu Arya");
//		user.setCity("Punjab");
//		User result = userRepo.save(user);
//		System.out.println(result);

		// getting data
		// findById(id) -> return optional containing your data
//		Iterable<User> findAll = userRepo.findAll();
//		findAll.forEach(user->System.out.println(user));

		// deleting data
//		userRepo.deleteById(2);
//		Iterable<User> findAll = userRepo.findAll();
//		findAll.forEach(user->System.out.println(user));

		// custom finder method findByName
//		List<User> findByName = userRepo.findByName("sakshi");
//		findByName.forEach(user->System.out.println(user));

//		List<User> findByNameAndCity = userRepo.findByNameAndCity("shubham","kanpur");
//		findByNameAndCity.forEach(user->System.out.println(user));

//		List<User> findByNameStartingWith = userRepo.findByNameStartingWith("s");
//		findByNameStartingWith.forEach(user -> System.out.println(user));
		
		List<User> findByNameEndingWith = userRepo.findByNameEndingWith("m");
		findByNameEndingWith.forEach(user->System.out.println(user));
		

	}

}
