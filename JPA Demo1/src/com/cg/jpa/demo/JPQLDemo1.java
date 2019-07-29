package com.cg.jpa.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class JPQLDemo1 {
	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		 EntityManager em = emf.createEntityManager();
		 
		 String qry =" select acc.accHolderName from Account acc";
		 
		 TypedQuery<String> tq= em.createQuery(qry,String.class);
		 List<String> name = tq.getResultList();
		 
		 for(String a : name){
		 System.out.println(a);
		 }
		 
		 String qry1 =" select acc.balance from Account acc";
		 
		 TypedQuery<Double> bl= em.createQuery(qry1,Double.class);
		 List<Double> balance = bl.getResultList();
		 
		 for(Double b : balance){
		 System.out.println(b);
		 }
		 
		 
		 String qry2 =" select max(acc.balance) from Account acc";
		 TypedQuery<Double> max= em.createQuery(qry2,Double.class);
		 double maxbal = max.getSingleResult();
		 System.out.println(maxbal);
		 
		 
}
}
