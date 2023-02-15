
package com.example.demo.repositorio;

import com.example.demo.entidad.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Indica que es un repositorio
@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante,Long >

{
    
    
    
    
}
