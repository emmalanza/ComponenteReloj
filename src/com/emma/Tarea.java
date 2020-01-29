package com.emma;

public class Tarea {

    private int horas, minutos, segundos;
    private String descripcion;

    public Tarea(int horas, int minutos, int segundos, String descripcion) {

        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.descripcion = descripcion;

    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
