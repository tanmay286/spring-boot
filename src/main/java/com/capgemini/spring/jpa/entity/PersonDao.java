package com.capgemini.spring.jpa.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer>{

}
