package com.example.demo.service;

import com.example.demo.dto.Palindromo;
import com.google.gson.Gson;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServices {

  
   

    public Object palabra(Palindromo palindromo) {
        
        String xml = "";
        palindromo.setPalabra(palindromo.getPalabra());
        JSONObject json = new JSONObject(palindromo);
        

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
            palindromo.setResultado("Symetric");
            xml = XML.toString(json);
            return xml ;

        } else {
            palindromo.setResultado("Asymetric");
           
            xml = XML.toString(json);

            return xml;
        }

    }

}
