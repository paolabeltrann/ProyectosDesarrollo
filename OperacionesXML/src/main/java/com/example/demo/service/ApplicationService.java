package com.example.demo.service;

import com.example.demo.dto.Operaciones;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {
 
    

    public Object suma(Operaciones operaciones) {
          
          
          operaciones.setSuma(operaciones.getNumeroUno() + operaciones.getNumeroDos());
          JSONObject json = new JSONObject(operaciones);
          String xml = XML.toString(json);

        return xml;
    }

    public Object resta(Operaciones operaciones) {
        operaciones.setResta(operaciones.getNumeroUno() - operaciones.getNumeroDos());
         JSONObject json = new JSONObject(operaciones);
          String xml = XML.toString(json);
        return xml;

    }

    public Object multiplicacion(Operaciones operaciones) {
        operaciones.setMultiplicacion(operaciones.getNumeroUno() * operaciones.getNumeroDos());
         JSONObject json = new JSONObject(operaciones);
          String xml = XML.toString(json);

        return xml;

    }

    public Object division(Operaciones operaciones) {
        operaciones.setDivision(operaciones.getNumeroUno() / operaciones.getNumeroDos());
         JSONObject json = new JSONObject(operaciones);
          String xml = XML.toString(json);

        return xml;

    }

}
