package com.shiham.utils;

import java.util.Random;

import jakarta.enterprise.context.ApplicationScoped;

@ThirteenDigits
@ApplicationScoped
public class IsbnNumberGenerator implements NumberGenerator {

 
	public String generateNumber() {
		return "888-" + Math.abs(new Random().nextInt());
	}

}
