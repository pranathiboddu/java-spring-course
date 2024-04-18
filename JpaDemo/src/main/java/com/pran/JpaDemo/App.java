package com.pran.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
    	
    	Laptop l1 = new Laptop();
    	l1.setLid(100);
    	l1.setBrand("apple");
    	l1.setPrice(10000);
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	em.persist(l1);
    	em.getTransaction().commit();
    	System.out.println(l1);
    	
    	Laptop lap = em.find(Laptop.class,4);
    	System.out.println(lap);
    	
    }
}
