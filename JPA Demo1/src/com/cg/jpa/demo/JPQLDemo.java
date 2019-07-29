package com.cg.jpa.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



import com.cg.jpa.entity.Account;
import com.cg.jpa.entity.Student;

public class JPQLDemo {
 public static void main(String[] args) {
 EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
 EntityManager em = emf.createEntityManager();
 
 String qry =" select acc from Account acc";
 
 Query query = em.createQuery(qry);
 List<Account> acclist = query.getResultList();
 for(Account ac:acclist){
	 System.out.println(ac.toString());
 }
 
 /*
 Account ac = new Account();
 ac.setAccHolderName("Nikhil");
 ac.setBalance(45000);
 ac.setMobileNo("654564");
 
 Account ac1 = new Account();
 ac1.setAccHolderName("Abhishek");
 ac1.setBalance(55000);
 ac1.setMobileNo("1245789");

 Account ac2 = new Account();
 ac2.setAccHolderName("Mayur");
 ac2.setBalance(65000);
 ac2.setMobileNo("123456");

 Account ac3 = new Account();
 ac3.setAccHolderName("Akshay");
 ac3.setBalance(55000);
 ac3.setMobileNo("0124578");

 em.getTransaction().begin();
 em.persist(ac);
 em.persist(ac1);
 em.persist(ac2);
 em.persist(ac3);
 em.getTransaction().commit();
 
 System.out.println("Accounts Added...");
 */

 }

}

