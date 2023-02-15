package com.example.demo;

import com.example.demo.entidad.Estudiante;
import com.example.demo.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("classpath:Api.properties")
@PropertySource("file:${C:/Users/silao/OneDrive/Documentos/ProyectosGit/Crud-SpringBoot/src/main/resources}/API.properties")
public class CrudSpringBootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CrudSpringBootApplication.class, args);
    }
    @Autowired
    private EstudianteRepositorio repositorio;

    @Override
    public void run(String... args) throws Exception {
        /*Estudiante estudiante1 = new Estudiante("Paola", "Beltran", "ejemplo@gmail.com");
        repositorio.save(estudiante1);
        
        Estudiante estudiante2 = new Estudiante("Emma", "Rodriguez", "ejemplo2@gmail.com");
        repositorio.save(estudiante2);
        */
    }

}
