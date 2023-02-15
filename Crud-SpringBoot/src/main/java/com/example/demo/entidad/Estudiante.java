package com.example.demo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // indica que es una entidad JPA.
@Table(name = "Estudiante") //Crea la tabla estudiantes
public class Estudiante {
    //Indica el id del objeto

    @Id
    //Indica que el id debe generarse automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Creamos la columna nombre
    @Column(name = "nombre",  nullable = false, length = 50)
    private String nombre;
    //Creamos la columna apellido
    @Column(name = "apellido",nullable = false, length = 50)
    private String apellido;
    //Creamos la columna email
    //unique : el email no se debe repetir
    @Column(name = "email", nullable = false, length = 50,unique = true)
    private String email;
    
    public Estudiante(){
    
    }

    public Estudiante(Long id, String nombre, String apellido, String email) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    
        public Estudiante( String nombre, String apellido, String email) {
        super(); 
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + '}';
    }
    
    
    
    
    
    

}
