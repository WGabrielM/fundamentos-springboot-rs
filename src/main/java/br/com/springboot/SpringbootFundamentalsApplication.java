package br.com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.springboot")
public class SpringbootFundamentalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFundamentalsApplication.class, args);
	}

}
