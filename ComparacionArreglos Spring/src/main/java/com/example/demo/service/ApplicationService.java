package com.example.demo.service;


import com.example.demo.dto.Numeros;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {
    
    

    public Object numero(Numeros numeros) {
        numeros.setNumero(numeros.getNumero());

        int miArray[] = {2, 3, 4, 5, 3, 6, 7, 9, 0, 8};
        int arrayMenor[] = new int[10];
        int arrayMayor[] = new int[10];
        

        int numeroMayor = 0;
        int numeroMenor = 0;

        for (int i = 0; i < miArray.length; i++) {

            if (miArray[i] > numeros.getNumero()) {
                numeroMayor = miArray[i];
                arrayMayor[i] = numeroMayor;
                
                

            } else if (miArray[i] < numeros.getNumero()) {
                numeroMenor = miArray[i];
                arrayMenor[i] = numeroMenor;
                

            }

        }
 
        String arregloMayor = "";
        for (int i = 0; i < arrayMayor.length; i++) {
            
            arregloMayor = arregloMayor + " " + arrayMayor[i];
            
        }
        
        String arregloMenor = "";
         for (int i = 0; i < arrayMenor.length; i++) {
            
            arregloMenor = arregloMenor + " " + arrayMenor[i];
            
        }
        
        
        return arregloMayor + " " + arregloMenor;

    }

}
