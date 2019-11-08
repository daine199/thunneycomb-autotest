package com.thunneycomb.thunneycombarchtype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations={"classpath:application-context.xml"})
public class ThunneycombArchtypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThunneycombArchtypeApplication.class, args);
	}

}
