package com.cg.entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Client {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
//		Greet greet = new Greet();
//		greet.setMessage("Welcome to Spring!");
//		em.persist(greet);
//		
//		System.out.println("Added greeting to database.");

		Query query=em.createQuery("select m.messageId from Greet m");
		List<Integer> list = query.getResultList();
		
		for(Integer m:list) {  
            System.out.println(m);    
         }  
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
