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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        programacion p1=new programacion();
        sala sala1=new sala();
        sala sala2=new sala();
        ArrayList <semana> semanas1=new ArrayList<semana>();
        for (int i=0; i<2;i++){
        semana semanai=new semana(i);
        semanas1.add(semanai);
        }
        ArrayList <semana> semanas2=new ArrayList<semana>();
        for (int i=2; i<4;i++){
        semana semanai=new semana(i);
        semanas2.add(semanai);
        }
        dia[] dias1=new dia[2];
        for (int i=0; i<2;i++){
        dia diai=new dia("hoy"+i,"dia" +i);
        dias1[i]=diai;
        }
        dia[] dias2=new dia[2];
        for (int i=0; i<2;i++){
        dia diai=new dia("hoy"+i,"dia" +i);
        dias2[i]=diai;
        }
        dia[] dias3=new dia[2];
        for (int i=0; i<2;i++){
        dia diai=new dia("hoy"+i,"dia" +i);
        dias3[i]=diai;
        }
        dia[] dias4=new dia[2];
        for (int i=0; i<2;i++){
        dia diai=new dia("hoy"+i,"dia" +i);
        dias4[i]=diai;
        }
        for(int i=0;i<2;i++){
            ArrayList <segmento> segmentoi=new ArrayList<segmento>();
            segmento segi=new segmento("2","4");
            segmentoi.add(segi);
            dias1[i].setSegmentos(segmentoi);
        }
        for(int i=0;i<2;i++){
            ArrayList <segmento> segmentoi=new ArrayList<segmento>();
            segmento segi=new segmento("2","4");
            segmentoi.add(segi);
            dias2[i].setSegmentos(segmentoi);
        }
        for(int i=0;i<2;i++){
            ArrayList <segmento> segmentoi=new ArrayList<segmento>();
            segmento segi=new segmento("2","4");
            segmentoi.add(segi);
            dias3[i].setSegmentos(segmentoi);
        }
        for(int i=0;i<2;i++){
            ArrayList <segmento> segmentoi=new ArrayList<segmento>();
            segmento segi=new segmento("2","4");
            segmentoi.add(segi);
            dias4[i].setSegmentos(segmentoi);
        }
            semanas1.get(0).setDias(dias1);
            semanas1.get(1).setDias(dias2);
            semanas2.get(0).setDias(dias3);
            semanas2.get(1).setDias(dias4);
            sala1.setSemanas(semanas1);
            sala2.setSemanas(semanas2);
            ArrayList <sala> salas =new ArrayList<sala>();
            programacion p=new programacion();
            p.setSalas(salas);
            p.mostrar_programacion();
    }
    
}
