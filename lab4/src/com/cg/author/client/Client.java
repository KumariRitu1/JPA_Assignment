package com.cg.author.client;

import com.cg.author.entities.Author;
import com.cg.author.service.AuthorService;
import com.cg.author.service.AuthorServiceImpl;


public class Client {

	public static void main(String[] args) {

		//Debug this program as Debug -> Debug as Java Application
		
				AuthorService service = new AuthorServiceImpl();
				
				Author author = new Author();
				author.setAuthorId(50);
				author.setFirstName("Ritu");
				author.setMiddleName("keshav");
				author.setLastName("abhilasha");
				author.setPhoneNo(9975058440);
				service.addAuthor(author);
				
				//at this breakpoint, we have added one record to table
				author = service.findAuthorById(50);
				System.out.print("ID:"+author.getAuthorId());
				System.out.println(" FirstName:"+author.getFirstName());
				
				author.setFirstName("Ritu");
				service.updateAuthor(author);
				
				//at this breakpoint, we have updated record added in first section
				author = service.findAuthorById(50);
				System.out.print("ID:"+author.getAuthorId());
				System.out.println(" FirstName:"+author.getFirstName());
				
				//at this breakpoint, record is removed from table
				service.removeAuthor(author);
				System.out.println("End of program...");

				
				
				
	}

}
