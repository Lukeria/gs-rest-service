package com.example.restservice;

import com.example.restservice.dao.GreetingRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final GreetingRepository greetingRepository;

	public GreetingController(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return greetingRepository.save(new Greeting(String.format(template, name)));
	}
}
