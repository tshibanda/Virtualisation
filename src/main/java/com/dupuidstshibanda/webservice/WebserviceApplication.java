package com.dupuidstshibanda.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@RestController
@SpringBootApplication
@EnableJpaRepositories("com.dupuidstshibanda.webservice.repository")
public class WebserviceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(WebserviceApplication.class, args);
	}

}
