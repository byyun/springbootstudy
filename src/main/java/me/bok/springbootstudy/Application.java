package me.bok.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import me.bok.Holoman;

@SpringBootApplication
//@SpringBootConfiguration
//@ComponentScan
//@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		SpringApplication application = new SpringApplication(Application.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

	/*
	@Bean
	public Holoman holoman() {
		Holoman holoman = new Holoman();
		holoman.setName("whiteShip");
		holoman.setHowLong(60);
		return holoman;
	}

	 */

}
