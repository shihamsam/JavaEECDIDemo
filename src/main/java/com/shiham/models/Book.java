package com.shiham.models;

import java.util.Date;

import com.shiham.validations.ChronologicalDates;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@ChronologicalDates
public class Book {

	@NotNull
	@Size(min = 4, max = 50)
	private String name;

	@NotNull
	@Size(min = 4, max = 50)
	private String isbn;

	private Date cretionDate;

	public Date getCretionDate() {
		return cretionDate;
	}

	public void setCretionDate(Date cretionDate) {
		this.cretionDate = cretionDate;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	private Date publicationDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Book(@NotNull @Size(min = 4, max = 50) String name, @NotNull @Size(min = 4, max = 50) String isbn) {
		super();
		this.name = name;
		this.isbn = isbn;
	}

}
