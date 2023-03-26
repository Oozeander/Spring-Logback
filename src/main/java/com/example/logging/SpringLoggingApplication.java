package com.example.logging;

import com.example.logging.service.CustomService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringLoggingApplication implements CommandLineRunner {

	private final CustomService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringLoggingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.log();
	}
}
