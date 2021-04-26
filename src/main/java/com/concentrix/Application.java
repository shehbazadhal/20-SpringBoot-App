package com.concentrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

private apiurl="https://www.saurabh.com/301";
private String url = 'https://Dileep-301';
 
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Test");
		//Changes for HIS-134
		System.out.println("134 Fixed");
	}
}
