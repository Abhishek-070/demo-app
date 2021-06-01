package com.example.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
	}
	@PostConstruct
    public void init()
    {
        Logger log = LoggerFactory.getLogger(DemoAppApplication.class);
        log.info("Java app started");
    }

    public String getStatus() {
        return "OK";
    }

}
