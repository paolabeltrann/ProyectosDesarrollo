package com.example.demo.dto;

public class Operaciones {

    //Atributos
    private int numeroUno;
    private int numeroDos;
   /* private int suma;
    private int resta;
    private int multiplicacion;
    private int division;*/
    private String operacion;

    //Constructor
    public Operaciones(int numeroUno, int numeroDos, String resultado) {
        super();
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
       /* this.suma = suma;
        this.resta = resta;
        this.multiplicacion = multiplicacion;
        this.division = division;*/
        this.operacion = resultado;
   
    }

    public int getNumeroUno() {
        return this.numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return this.numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

   /* public int getSuma() {
        return this.suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getResta() {
        return this.resta;
    }

    public void setResta(int resta) {
        this.resta = resta;
    }

    public int getMultiplicacion() {
        return this.multiplicacion;
    }

    public void setMultiplicacion(int multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public int getDivision() {
        return this.division;
    }

    public void setDivision(int division) {
        this.division = division;
    }*/

    public String getOperacion() {
        return this.operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    
    


}
