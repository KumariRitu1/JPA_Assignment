package com.cg.jpastart.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="BOOK")
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int ISBN;
	
	private String title;
	private double price;
	
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="books")
	private Set<Author> authors = new HashSet<>();
	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}

	
	
	
	
}
