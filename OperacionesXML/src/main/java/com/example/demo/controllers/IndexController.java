package com.example.demo.controllers;

import com.example.demo.dto.Operaciones;
import com.example.demo.service.ApplicationService;
import com.fasterxml.jackson.core.JsonProcessingException;
import static com.sun.media.jfxmediaimpl.MediaUtils.error;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    ApplicationService applicationService;
    
    @GetMapping("/saludo")
    public String saludo(){
        return String.format("Hola estoy aqui!");
    }
    

    @PostMapping("/suma")
    public ResponseEntity<Map<String, Object>> suma(@RequestBody Operaciones operaciones) throws JsonProcessingException {
        Map<String, Object> responses = new HashMap<>();
        Map<String, Object> error = new HashMap<>();

        try {

            return new ResponseEntity(applicationService.suma(operaciones), HttpStatus.OK);

        } catch (Throwable ex) {
            error.put("mensajeError", ex.getMessage());
            responses.put("status", false);
            responses.put("body", "");
            responses.put("error", error);
            return new ResponseEntity(responses, HttpStatus.NOT_FOUND);

        }

    }

    @PostMapping("/resta")

    public ResponseEntity<Map<String, Object>> resta(@RequestBody Operaciones operaciones) throws JsonProcessingException {
        Map<String, Object> responses = new HashMap<>();
        Map<String, Object> error = new HashMap<>();

        try {

            return new ResponseEntity(applicationService.resta(operaciones), HttpStatus.OK);

        } catch (Throwable ex) {
            error.put("mensajeError", ex.getMessage());
            responses.put("status", false);
            responses.put("body", "");
            responses.put("error", error);
            return new ResponseEntity(responses, HttpStatus.NOT_FOUND);

        }

    }

    @PostMapping("/multiplicacion")
    public ResponseEntity<Map<String, Object>> multiplicacion(@RequestBody Operaciones operaciones) throws JsonProcessingException {
        Map<String, Object> responses = new HashMap<>();
        Map<String, Object> error = new HashMap<>();

        try {

            return new ResponseEntity(applicationService.multiplicacion(operaciones), HttpStatus.OK);

        } catch (Throwable ex) {
            error.put("mensajeError", ex.getMessage());
            responses.put("status", false);
            responses.put("body", "");
            responses.put("error", error);
            return new ResponseEntity(responses, HttpStatus.NOT_FOUND);

        }

    }
    
     @PostMapping("/division")
    public ResponseEntity<Map<String, Object>> division (@RequestBody Operaciones operaciones) throws JsonProcessingException {
        Map<String, Object> responses = new HashMap<>();
        Map<String, Object> error = new HashMap<>();
        
         try {

            return new ResponseEntity(applicationService.division(operaciones), HttpStatus.OK);

        }catch (Throwable ex) {
            error.put("mensajeError", ex.getMessage());
            responses.put("status", false);
            responses.put("body", "");
            responses.put("error", error);
            return new ResponseEntity(responses, HttpStatus.NOT_FOUND);

        }
        
    }

}
