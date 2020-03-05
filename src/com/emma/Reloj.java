package com.emma;

import javafx.application.Platform;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.control.Label;

import java.text.SimpleDateFormat;
import java.util.*;

public class Reloj extends Label {

    private int horas, minutos, segundos;
    private Calendar calendar;
    private BooleanProperty formato24h = new SimpleBooleanProperty(true);
    private ArrayList<Tarea> lista_de_tareas = new ArrayList<>();
    private Evento evento;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reloj (){ super(); }

    public int getHoras(){
        return horas;
    }

    public int getMinutos(){
        return minutos;
    }

    public int getSegundos(){
        return segundos;
    }

    public void setFormato24h(boolean formato24h) {
        this.formato24h.set(formato24h);
    }

    public void start(){

        Timer myTimer = new Timer();

        myTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {


                        setText(calcula());
                        Date d = new Date();
                        String fecha = sdf.format(d);

                        if (lista_de_tareas!=null){
                            for (int i = 0; i<lista_de_tareas.size(); i++){
                                if(lista_de_tareas.get(i).getSdate().equals(fecha)) {
                                    if (lista_de_tareas.get(i).getHoras() == horas && lista_de_tareas.get(i).getMinutos() == minutos
                                            && lista_de_tareas.get(i).getSegundos() == segundos) {
                                        evento.ejecuta(lista_de_tareas.get(i));
                                    }
                                }

                            }

                        }

                    }
                });
            }
        },0,1000);

    }

    private String calcula(){

        calendar = new GregorianCalendar();

        horas = calendar.get(Calendar.HOUR_OF_DAY);
        minutos = calendar.get(Calendar.MINUTE);
        segundos = calendar.get(Calendar.SECOND);
        String horas_12 = String.valueOf(calendar.get(Calendar.HOUR));

        if(formato24h.get()==false)
            return String.format("%02d:%02d:%02d",Integer.parseInt(horas_12),minutos,segundos);

        return String.format("%02d:%02d:%02d",horas,minutos,segundos);

    }

    public void registraTarea(Tarea tarea){
        lista_de_tareas.add(tarea);
    }

    public void addEvento(Evento evento){
        this.evento = evento;
    }

    public void borraTarea(Tarea tarea){
        lista_de_tareas.remove(tarea);
    }

    public void sincronizar_lista(ArrayList<Tarea> tareas){
        lista_de_tareas = tareas;
    }

}
