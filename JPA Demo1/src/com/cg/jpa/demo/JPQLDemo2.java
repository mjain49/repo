package com.cg.jpa.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class JPQLDemo2 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
//		TypedQuery<String> qry = em.createNamedQuery("getNames", String.class);
//		qry.setParameter("b1", 30000.00);
//		qry.setParameter("b2", 60000.00);
//		List<String> list = qry.getResultList();
//		for(String s : list)
//		{
//		System.out.println(s);
//		}
//		
		em.getTransaction().begin();
		Query qry1 = em.createNamedQuery("update");
		int rows=qry1.executeUpdate();
		System.out.println(rows+" rows updated");
		em.getTransaction().commit();
		
	}
	
}
