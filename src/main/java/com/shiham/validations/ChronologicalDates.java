package com.shiham.validations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ChronologicalDatesValidator.class)
public @interface ChronologicalDates {

	String message() default "Dates have to be in chronological order";
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
	
}
