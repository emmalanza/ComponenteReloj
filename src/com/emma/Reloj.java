package com.emma;

import javafx.application.Platform;
import javafx.scene.control.Label;
import java.util.*;

public class Reloj extends Label {

    private int horas, minutos, segundos;
    private Calendar calendar;

    public Reloj (){
        super();
    }

    public int getHoras(){
        return horas;
    }

    public int getMinutos(){
        return minutos;
    }

    public int getSegundos(){
        return segundos;
    }

    public void start(){

        Timer myTimer = new Timer();

        myTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        calcula();
                        setText(horas + ":" + minutos + ":" + segundos);
                    }
                });
            }
        },0,1000);

    }

    public void calcula(){

        calendar = new GregorianCalendar();
        horas = calendar.get(Calendar.HOUR_OF_DAY);
        minutos = calendar.get(Calendar.MINUTE);
        segundos = calendar.get(Calendar.SECOND);


    }

}
