package com.example.springjdbcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springjdbcdemo.model.Alien;
import com.example.springjdbcdemo.repository.AlienRepo;

@SpringBootApplication
public class SpringjdbcdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringjdbcdemoApplication.class, args);
		
		Alien alien = context.getBean(Alien.class);
		alien.setId(113);
		alien.setName("pran");
		alien.setTech("java");
		
		AlienRepo repo = context.getBean(AlienRepo.class);
//		repo.save(alien);
		
		System.out.println(repo.getAll());
		
	}

}
