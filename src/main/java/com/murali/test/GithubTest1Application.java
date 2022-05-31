package com.murali.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubTest1Application {

	@GetMapping("/ping")
	public String ping() {
		return "Micro Service Up and Running. sdgsdgs";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubTest1Application.class, args);
	}

}
