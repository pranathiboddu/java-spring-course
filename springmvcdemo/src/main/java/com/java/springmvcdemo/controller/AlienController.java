package com.java.springmvcdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.springmvcdemo.model.Alien;
import com.java.springmvcdemo.repository.AlienRepo;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	//@GetMapping(path="aliens",produces= {"application/xml"})
	@GetMapping("aliens")
	public List<Alien>  getAliens()
	{
//		List<Alien> aliens = Arrays.asList(new Alien(101, "pran"),new Alien(102,"pranathi"));
		List<Alien> aliens = repo.findAll();
		return aliens;				
	}
	
	@GetMapping("alien/{id}")
	public Alien getAlienById(@PathVariable("id") int id)
	{
		Alien alien = repo.findById(id).orElse(new Alien(0,""));
		return alien;
	}
	
//	@PostMapping(path="alien",consumes= {"application/json"})
	@PostMapping("alien")
	public Alien addAlien(Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
}

