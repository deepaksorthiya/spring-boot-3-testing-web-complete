package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class GreetingRepo {

	@Value("${greet.message}")
	private String message;

	public String greet() {
		return message;
	}

}
