package com.example.demo.service;

import com.example.demo.dto.Palindromo;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServices {

    Gson gson = new Gson();
    
    @Value("${palabra.symetric}")
    private String Symetric;
    
     @Value("${palabra.asymetric}")
    private String Asymetric;
    

    public Object palabra(Palindromo palindromo) {
        palindromo.setPalabra(palindromo.getPalabra());

        int pos = 0;
        palindromo.setPalabra(palindromo.getPalabra().replaceAll(" ", ""));

        char[] ordenado = palindromo.getPalabra().toCharArray();
        char[] inverso = new char[ordenado.length];

        for (int i = ordenado.length; i > 0; i--) {
            inverso[pos] = ordenado[i - 1];
            pos++;
        }

        String inversoDos = new String(inverso);
        if (palindromo.getPalabra().equals(inversoDos)) {
            palindromo.setResultado(Symetric);
            return gson.toJson(palindromo);

        } else {
            palindromo.setResultado(Asymetric);

            return gson.toJson(palindromo);
        }

    }

}
