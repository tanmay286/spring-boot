package com.capgemini.spring.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.spring.jpa.entity.Person;
import com.capgemini.spring.jpa.service.PersonServiceImpl;

@RestController
public class PersonController {
	
	@Autowired
	private PersonServiceImpl personService; 
	
	@RequestMapping("/")
	public void setPerson() {
		Person person = new Person(100,"Special ");
		personService.addNew(person);
	}

	@RequestMapping("/new")
	public Person getPerson() {
		
		Person person = personService.findById(100);
		return person;
	}
}
