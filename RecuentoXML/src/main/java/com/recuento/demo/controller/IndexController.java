package com.recuento.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.recuento.demo.service.ApplicationServices;
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
    
      @GetMapping("/recuento")
       public ResponseEntity<Map> recuento() throws JsonProcessingException {
        Map responses = new HashMap<>();
        Map error = new HashMap<>();
        
        try {

            return new ResponseEntity( ApplicationServices.recuento(), HttpStatus.OK);

        }catch (Throwable ex) {
            error.put("mensajeError", ex.getMessage());
            responses.put("status", false);
            responses.put("body", "");
            responses.put("error", error);
            return new ResponseEntity(responses, HttpStatus.NOT_FOUND);

        }


}
}
