package com.sc.sample.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sc.sample.app.services.AppService;

@SpringBootApplication
@EntityScan(basePackages = "com.sc.sample.app.domain.entity") 
@EnableJpaRepositories(basePackages = "com.sc.sample.app.domain.repository")
public class Application implements CommandLineRunner {

	@Autowired
	AppService appService;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
	@Override
	public void run(String... args) throws Exception {

		appService.initDb();
		
	}
}