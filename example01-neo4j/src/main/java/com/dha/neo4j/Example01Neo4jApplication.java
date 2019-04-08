package com.dha.neo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Example01Neo4jApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Example01Neo4jApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Example01Neo4jApplication.class);
	}

}
