package com.example.todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.todoapp.functions.functions;
@SpringBootApplication()

public class CodesappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodesappApplication.class, args);
		//functions.action("sell","EUR_USD_Close",10,"2012-07-26","2012-08-06");
		//functions.indicators("minimum","USD_CAD_Close");
         //functions.test("average","EUR_USD_Close");	
		//functions.getSpecificRowFromCsv("C:\\Users\\21620\\tt\\spring-boot-backend\\src\\main\\java\\com\\example\\todoapp\\functions\\results.csv", 4);
	}
}
