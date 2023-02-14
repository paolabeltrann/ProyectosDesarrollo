package com.example.demo.dto;


public class Numeros {
    
    //Atributos
    private int numero;
    
    
    

    
    
    //Constructor vacio
    
    public Numeros(){
        
        
    }

   
    
    //Constructor Sobrecargado 
    public Numeros(int numero){
        super();
        this.numero = numero;
      
        
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
     @Override
    public String toString() {
        return "Numeros{" + "numero=" + numero + '}';
    }


    
    
    
    
    
    
}
