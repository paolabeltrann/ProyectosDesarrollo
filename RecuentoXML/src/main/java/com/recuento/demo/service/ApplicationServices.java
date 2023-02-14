package com.recuento.demo.service;

import com.google.gson.Gson;
import com.recuento.demo.dto.Datos;
import java.io.IOException;

import java.util.Arrays;
import org.json.*;

import org.springframework.stereotype.Service;

@Service
public class ApplicationServices {

    public Datos d = new Datos();
    JSONObject json = new JSONObject(d);

    private int miArray[] = {9, 3, 4, 1, 5, 6, 6, 6, 2, 2};

    int cont = 0;
    int cont2 = 0;
    int num = miArray[0];
    int numeroMayor = 0;
    String xml = "";

    public String recuento() {

        Arrays.sort(miArray);
        for (int i = 0; i < miArray.length; i++) {
            if (num == miArray[i]) {
                cont++;

            } else {

                //System.out.println("Contador 1 : " + cont + "Contador 2 :" + cont2);
                if (cont2 < cont) {

                    cont2 = cont; // Muestra el valor que mas se repitio.
                    numeroMayor = miArray[i - 1];
                    d.setLongest(cont2);
                    d.setNumber(numeroMayor);
                    xml = XML.toString(json);

                    // System.out.println("Valor que mas se repite " + cont2);
                    // System.out.println("mi Array " + miArray[i - 1]);
                }

                cont = 1;
                num = miArray[i];
            }
        }
        return xml;

    }

}
