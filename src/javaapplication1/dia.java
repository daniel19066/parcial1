/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author alejo
 */
public class dia {
    private String fecha;
    private String nombre;
    private ArrayList<segmento> segmentos=new ArrayList<segmento>();

    public dia(String fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<segmento> getSegmentos() {
        return segmentos;
    }

    public void setSegmentos(ArrayList<segmento> segmentos) {
        this.segmentos = segmentos;
    }
    
}
