package com.dupuidstshibanda.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
@EnableJpaRepositories("com.dupuidstshibanda.webservice.repository")
public class WebserviceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(WebserviceApplication.class, args);
	}

}
