package com.cg.jpacrud.author;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
			      	.createEntityManagerFactory("JPA-PU");// Interface
		EntityManager em = factory.createEntityManager();// class

		Author author = new Author();
		 author.setAuthorId(22);
		author.setFirstName("Khushi");
		author.setMiddleName("Khurana");
		author.setLastName("Kumar");
		author.setPhoneNo(997505844);
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(author);
		transaction.commit();
		System.out.println("Addedauthor to database.");

		
		  /*int id = 22; Author_property author1 =
		  *em.find(Author_property.class, id); author.setFirstName("Arshia");
		  *em.getTransaction().begin(); em.merge(author);
		 *em.getTransaction().commit();
		  *System.out.println("Updateauthor to database.");
		  
		  *int id1 = 22;Author_property author2 =
		  *em.find(Author_property.class, id); em.getTransaction().begin();
		  *em.remove(author); em.getTransaction().commit();
		  */System.out.println("Removedent from database.");
		 

		em.close();
		factory.close();
	}
}
