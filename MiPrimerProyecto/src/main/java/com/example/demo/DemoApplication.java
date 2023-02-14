package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@Configuration
//@PropertySource("classpath:Api.properties")
@PropertySource("file:${C:/Users/silao/OneDrive/Documentos/Proyectos/desarrollo/MiPrimerProyecto/target/classes}/Api.properties")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
