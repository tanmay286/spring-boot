package com.capgemini.spring.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.spring.jpa.entity.Person;
import com.capgemini.spring.jpa.entity.PersonDao;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	PersonDao personDao;

	@Override
	public void addNew(Person person) {
		personDao.save(person);
		
	}

	@Override
	public Person findById(int personId) {
		
		Person person = personDao.findById(100).get();
		return person;
	}

}
