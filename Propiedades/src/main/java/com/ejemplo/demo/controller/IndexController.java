/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.demo.controller;

import com.ejemplo.demo.dto.Mensaje;
import com.ejemplo.demo.services.ApplicationServices;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    ApplicationServices ApplicationServices;

    @GetMapping("/mensaje")
    public ResponseEntity mensaje() throws JsonProcessingException {
        Map responses = new HashMap<>();
        Map error = new HashMap<>();

        try {

            return new ResponseEntity(ApplicationServices.mensaje(), HttpStatus.OK);
        } catch (Throwable ex) {
            error.put("mensajeError", ex.getMessage());
            responses.put("status", false);
            responses.put("body", "");
            responses.put("error", error);
            return new ResponseEntity(responses, HttpStatus.NOT_FOUND);
        }

    }

}
