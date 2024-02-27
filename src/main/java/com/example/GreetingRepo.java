package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingRepo {

	@Value("${greet.message}")
	private String message;

	public String greet() {
		return message;
	}

}
