package com.ejemplo.demo.services;

import com.ejemplo.demo.dto.Mensaje;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;

@Service
public class ApplicationServices {

    @Value("${mail.hostname}")
    private String email;
    Mensaje msj = new Mensaje();

    public String mensaje() {
         msj.setMensaje(email);
         return msj.getMensaje();
    }

}
