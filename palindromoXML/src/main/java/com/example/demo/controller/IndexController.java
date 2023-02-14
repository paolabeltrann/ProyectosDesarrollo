/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.dto.Palindromo;
import com.example.demo.service.ApplicationServices;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author grislypaolabeltranbarrios
 */
@RestController
public class IndexController {

    @Autowired
    ApplicationServices applicationServices;

    @GetMapping("/Hola")
    public ResponseEntity<Map<String, Object>> palabra(@RequestBody Palindromo palindromo) throws JsonProcessingException {
        Map<String, Object> responses = new HashMap<>();
        Map<String, Object>  error = new HashMap<>();

        try {

            return new ResponseEntity(applicationServices.palabra(palindromo), HttpStatus.OK);

        } catch (Throwable ex) {
            error.put("mensajeError", ex.getMessage());
            responses.put("status", false);
            responses.put("body", "");
            responses.put("error", error);
            return new ResponseEntity(responses, HttpStatus.NOT_FOUND);

        }

    }

}
