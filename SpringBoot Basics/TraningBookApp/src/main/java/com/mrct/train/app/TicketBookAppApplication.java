package com.mrct.train.app;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan({"com.mrct.train.service","com.mrct.train.dao","com.mrct.train.controller"})
public class TicketBookAppApplication {
	

	public static void main(String[] args) {
		
		SpringApplication.run(TicketBookAppApplication.class, args);
		
		
	}

}
