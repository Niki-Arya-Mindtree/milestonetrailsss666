package com.student.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.main.entity.Entity;
import com.student.main.repos.Repository;

@RestController
public class Control {
	
	@Autowired
	private Repository reposs;
	
	@GetMapping("/user")
	public List<Entity> getAll()
	{
		return reposs.findAll();
	}
	
	@GetMapping("/user/{Id}")
	public Entity getoneAll(@PathVariable int Id)
	{
		return reposs.findById(Id).get();
	}
	
	@PostMapping("/user")
	public void saveAll(@RequestBody Entity en)
	{
		 reposs.saveAndFlush(en);
	}
}
