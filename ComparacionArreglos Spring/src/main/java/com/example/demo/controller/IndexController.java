package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.service.ApplicationService;
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
    ApplicationService applicationService;

    @GetMapping("/numero")
    public ResponseEntity<Map<String, Object>> numero(@RequestBody Numeros numeros) throws JsonProcessingException {
        Map<String, Object> responses = new HashMap<>();
        Map<String, Object> error = new HashMap<>();

        try {

            return new ResponseEntity(applicationService.numero(numeros), HttpStatus.OK);

        } catch (Throwable ex) {
            error.put("mensajeError", ex.getMessage());
            responses.put("status", false);
            responses.put("body", "");
            responses.put("error", error);
            return new ResponseEntity(responses, HttpStatus.NOT_FOUND);

        }
    }
}
