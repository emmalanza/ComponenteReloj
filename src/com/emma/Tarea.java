package com.emma;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tarea {

    private int horas, minutos, segundos;
    private Date fecha;
    private String descripcion;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");



    public Tarea(Date fecha, int horas, int minutos, int segundos, String descripcion) {

        this.fecha = fecha;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSdate(){
        return sdf.format(fecha);
    }

    public String getSfecha(){

        return sdf.format(fecha) + " " + horas + ":" + minutos;

    }

}
