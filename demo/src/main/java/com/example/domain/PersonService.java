package com.example.domain;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public Iterable<Person> findAll() {
		Iterable<Person> result = this.personRepository.findAll();
		return result;
	}
	
	public void save(Person person) {
		this.personRepository.save(person);
	}
}