package com.example;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	private final GreetingRepo greetingRepo;

	public GreetingService(GreetingRepo greetingRepo) {
		this.greetingRepo = greetingRepo;
	}

	public String greet() {
		return greetingRepo.greet();
	}
}
