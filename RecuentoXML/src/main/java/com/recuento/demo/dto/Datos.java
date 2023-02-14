package com.recuento.demo.dto;

public class Datos {

    //Objeto
    int longest;
    int number;

    public Datos() {

    }

    public Datos(int longest, int number) {

        this.longest = longest;
        this.number = number;
    }

    public int getLongest() {
        return this.longest;
    }

    public void setLongest(int longest) {
        this.longest = longest;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

   @Override
    public String toString() {
        return "Datos{" + "longest=" + longest + ", number=" + number + '}';
    }

}
