package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class StsdemoApplication {
	private static final Logger LOGGER = LogManager.getLogger(StsdemoApplication.class);

	@RequestMapping(value = "/first")
	public String function() {
		LOGGER.info("message");
		return "welcome to STS!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(StsdemoApplication.class, args);

	}

}
