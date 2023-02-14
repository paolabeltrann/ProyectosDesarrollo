package com.ejemplo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@Configuration
//@PropertySource("classpath:Api.properties")
@PropertySource("file:${C:/Users/silao/OneDrive/Documentos/Proyectos/desarrollo/Propiedades/src/main/resources}/Api.properties")
public class PropiedadesApplication {

    public static void main(String[] args) {
        SpringApplication.run(PropiedadesApplication.class, args);
    }

}
