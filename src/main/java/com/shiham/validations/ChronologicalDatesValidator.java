package com.shiham.validations;

import com.shiham.models.Book;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ChronologicalDatesValidator implements ConstraintValidator<ChronologicalDates, Book> {

	@Override
	public void initialize(ChronologicalDates annotation) {
	}

	@Override
	public boolean isValid(Book book, ConstraintValidatorContext context) {

		return book.getCretionDate().getTime() < book.getPublicationDate().getTime();
	}

}
