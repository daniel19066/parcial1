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
public class sala {
    private ArrayList<semana> semanas= new ArrayList<semana>();

    public sala() {
    }

    public ArrayList<semana> getSemanas() {
        return semanas;
    }

    public void setSemanas(ArrayList<semana> semanas) {
        this.semanas = semanas;
    }
    
}
