package com.cg.jpastart.entities;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		// first define few products before we place order

		Book book = new Book();
		book.setISBN(14752);
		book.setTitle("Ritu");
		book.setPrice(4563.34);

		Book book1 = new Book();
		book1.setISBN(14202);
		book1.setTitle("R");
		book1.setPrice(5663.34);

		
		
		Author auth = new Author();
		auth.setId(1010);
		auth.setName("Shivam");

		auth.addBook(book);
		auth.addBook(book1);
		
		Author auth1 = new Author();
		auth1.setId(1020);
		auth1.setName("keshav");
		
		Author auth2 = new Author();
		auth2.setId(1030);
		auth2.setName("ritu");
		
		Book book2 = new Book();
		book2.setISBN(13202);
		book2.setTitle("ki");
		book2.setPrice(5763.34);
		
		book2.addAuthor(auth1);
		

		// now define second order and add few products in it
		/*Order secondOrder = new Order();
		secondOrder.setId(1001);
		secondOrder.setPurchaseDate(new Date());

		secondOrder.addProduct(babyProduct);		
		secondOrder.addProduct(elecProduct);
		secondOrder.addProduct(eleProduct);*/

		// save orders using entity manager

		em.persist(auth);
		//em.persist(secondOrder);
		
		System.out.println("Added author and boook details.");

		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
