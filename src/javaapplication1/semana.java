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
public class semana {
    private int _number;
    private dia[] dias= new dia [5];
    private ArrayList<sala> salas = new ArrayList<sala>(); 

    public semana(int _number) {
        this._number = _number;
    }
    
    public ArrayList<segmento> calculercreneaxlibres(){
        return null;
    };

    public int getNumber() {
        return _number;
    }

    public void setNumber(int _number) {
        this._number = _number;
    }

    public dia[] getDias() {
        return dias;
    }

    public void setDias(dia[] dias) {
        this.dias = dias;
    }

    public ArrayList<sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<sala> salas) {
        this.salas = salas;
    }
    
}
