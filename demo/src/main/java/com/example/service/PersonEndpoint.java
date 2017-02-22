package com.example.service;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.domain.Person;
import com.example.domain.PersonService;

@Path("person")
@Component
public class PersonEndpoint {
	@Autowired
	private PersonService personService;

	// response for Get request for the complete Klant class
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response list() {

		Person person = new Person();
		person.setNaam("Piet");
		return Response.ok(person).build();
		
	}

}