package com.example.demo.service;

import com.example.demo.dto.Operaciones;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    Gson gson = new Gson();

    @Value("${resultado.operacion}")
    private String resultado;

    public Object suma(Operaciones operaciones) {

        operaciones.setOperacion(Integer.toString((operaciones.getNumeroUno() +operaciones.getNumeroDos())));
        operaciones.setOperacion(resultado +""+ operaciones.getOperacion());

        return gson.toJson(operaciones);
        
    }

    public Object resta(Operaciones operaciones) {
        operaciones.setOperacion(Integer.toString(operaciones.getNumeroUno() - operaciones.getNumeroDos()));
        operaciones.setOperacion(resultado +""+ operaciones.getOperacion());
        return gson.toJson(operaciones);

    } 

    public Object multiplicacion(Operaciones operaciones) {
        operaciones.setOperacion(Integer.toString(operaciones.getNumeroUno() * operaciones.getNumeroDos()));
        operaciones.setOperacion(resultado+""+operaciones.getOperacion());
        return gson.toJson(operaciones);

    }

    public Object division(Operaciones operaciones) {
        operaciones.setOperacion(Integer.toString(operaciones.getNumeroUno() / operaciones.getNumeroDos()));
        operaciones.setOperacion(resultado+""+operaciones.getOperacion());
        return gson.toJson(operaciones);

    }

}
