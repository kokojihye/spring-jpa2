package com.spring.springjpa2;

import com.fasterxml.jackson.datatype.hibernate5.jakarta.Hibernate5JakartaModule;
import com.spring.springjpa2.domain.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpa2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpa2Application.class, args);
	}

	@Bean
	Hibernate5JakartaModule hibernate6Module() {
		Hibernate5JakartaModule hibernate5JakartaModule = new Hibernate5JakartaModule();
//		hibernate5JakartaModule.configure(Hibernate5JakartaModule.Feature.FORCE_LAZY_LOADING, true);
		return hibernate5JakartaModule;
	}
}
