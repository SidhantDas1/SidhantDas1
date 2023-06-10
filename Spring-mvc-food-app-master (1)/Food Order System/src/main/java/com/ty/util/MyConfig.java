package com.ty.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ty.food")
public class MyConfig {

	@Bean
	EntityManagerFactory getEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("abhi") ;
	}
}

