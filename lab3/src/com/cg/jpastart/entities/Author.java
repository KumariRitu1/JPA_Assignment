package com.cg.jpastart.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "AUTHOR1")
public class Author implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "BOOK_AUTHOR", joinColumns = { @JoinColumn(name = "ID") }, inverseJoinColumns = { @JoinColumn(name = "ISBN") })
	private Set<Book> books = new HashSet<>();	//required to avoid NullPointerException

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
	public void addBook(Book book) {
		this.getBooks().add(book);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
