package com.shiham.services;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import com.shiham.interceptors.Loggable;
import com.shiham.models.Book;
import com.shiham.utils.EightDigits;
import com.shiham.utils.NumberGenerator;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;

@RequestScoped
public class BookService {

	@Inject
	@EightDigits
	private NumberGenerator _generator;

	@Inject
	private Validator validator;

	private Set<ConstraintViolation<Book>> violations;

	public Date addHoursToJavaUtilDate(Date date, int hours) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR_OF_DAY, hours);
		return calendar.getTime();
	}

	@Loggable
	public void CreateBook() {

		var book = new Book("Harry Potter", _generator.generateNumber());

		book.setCretionDate(new Date());
		book.setPublicationDate(addHoursToJavaUtilDate(new Date(), 2));

		violations = validator.validate(book);

		if (violations.size() > 0)
			throw new ConstraintViolationException(violations);

		System.out.println("Generated ISBN " + book.getIsbn());
	}

}
