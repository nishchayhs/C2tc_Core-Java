package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) 
	{
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	em.getTransaction().begin();
	Student student = new Student();
    student.setName("Amit");
    Address homeAddress = new Address ();
    homeAddress.setStreet("mg road");
    homeAddress.setCity("blr");
    homeAddress.setState("ka");
    homeAddress.setZipcode("411 011");
    student.setAddress(homeAddress);//injecting address to student table
    em.persist(student);//persist
    em.getTransaction().commit();
    em.close();
    factory.close();

	}

}

