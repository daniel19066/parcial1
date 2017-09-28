/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alejo
 */
public class programacion {
    private ArrayList<sala> salas= new ArrayList<sala>();

    public programacion() {
    }

    public ArrayList<sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<sala> salas) {
        this.salas = salas;
    }
    
    public void mostrar_programacion(){
        for(int i=0;i<salas.size();i++){
            System.out.println("sala: "+ i);
            for(int u=0; u<salas.get(i).getSemanas().size();u++){
                int s =salas.get(i).getSemanas().get(u).getNumber();
                System.out.println("semana numero:"+s);
                for(int y =0; y<5;y++){
                    dia[] d=salas.get(i).getSemanas().get(u).getDias();
                    System.out.println("dia: "+y);
                    System.out.println("fecha: "+d[y].getFecha());
                    System.out.println("fecha: "+d[y].getNombre());
                    for(int k=0;k<d[y].getSegmentos().size();k++){
                        segmento seg=d[y].getSegmentos().get(k);
                        System.out.println("segmento 1: "+k);
                        System.out.println("inicio:"+seg.getInicio());
                        System.out.println("fin:"+seg.getFin());
                    }
                }
            }
        }
                
    }
}
