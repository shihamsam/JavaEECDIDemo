package com.shiham.utils;

import java.util.Random;

import jakarta.enterprise.context.ApplicationScoped;

@EightDigits
@ApplicationScoped
public class IssnNumberGenerator implements NumberGenerator{

 
	public String generateNumber() {
		return "900-100-" + Math.abs(new Random().nextInt());
	}

}
