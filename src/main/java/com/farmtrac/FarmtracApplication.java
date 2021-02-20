package com.farmtrac;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FarmtracApplication {
    private static final Logger logger = LogManager.getLogger("FarmtracApplication");

	public static void main(String[] args) {
		SpringApplication.run(FarmtracApplication.class, args);
		logger.info("First springboot app on git");
	}

}
