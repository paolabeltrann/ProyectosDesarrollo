package com.example.demo.dto;

public class Palindromo {

    //Atributo
    private String palabra;
    private String resultado;

    //Constructor vacio
    public Palindromo() {

    }

    public Palindromo(String palabra , String resultado) {
        super();
        this.palabra = palabra;
        this.resultado = resultado;

    }

    public String getPalabra() {
        return this.palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;

    }

   public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

}
