package com.java.springmvcdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.java.springmvcdemo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>
{

	 List<Alien> findByNameOrderByIdDesc(String name); //Query DSL
	
	 @Query("from Alien where name= :anmae")
	 List<Alien> find(@Param("anmae") String name);
}
