package com.xoriant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class Poc2Application {

	public static void main(String[] args) {
		SpringApplication.run(Poc2Application.class, args);
	}

}
