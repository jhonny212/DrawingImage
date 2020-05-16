/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizadorTime;

import drawgif.Cuadro;
import drawgif.Fichero;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;

/**
 *
 * @author jhonny
 */
public class Time extends Fichero {

    String inicio, fin, Id;
    float duracion1, duracion2;
    public ArrayList<Tiempos> listTime;
    private Cuadro Tablero[][];
    public Time(String contenido) {
        super(contenido);
        listTime=new ArrayList<>();
        init();
    }

    public boolean init() {
        lexicoTime scan = new lexicoTime(new BufferedReader(new StringReader(contenido)));

        parserTime parser = new parserTime(scan);
        try {
            
            parser.parse();
        } catch (Exception ex) {
            return false;
        }
        this.erroresLexico = scan.erroresLexico;
        this.erroresSintacticos = parser.erroresSintacticos;
        this.erroresSemanticos = parser.erroresSemanticos;
        this.listTime=parser.listTime;
        
        return isValid();
        
    }

    public Time(String Id, float duracion1) {
        this.Id = Id;
        this.duracion1 = duracion1;

    }

    public String getId() {
        return Id;
    }

    public float getDuracion1() {
        return duracion1;
    }
    
    public int getPos(String id){
        for (int i = 0; i < this.listTime.size(); i++) {
            if(id.equals(this.listTime.get(i).getName())){
            return i;
            }
        }
    return -1;} 

    public ArrayList<Tiempos> getListTime() {
        return listTime;
    }

    public void setDuracion1(float duracion1) {
        this.duracion1 = duracion1;
    }

    public void setDuracion2(float duracion2) {
        this.duracion2 = duracion2;
    }

    public Cuadro[][] getTablero() {
        return Tablero;
    }
    public void inicializarTablero(int filas,int columnas){
        Tablero=new Cuadro[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Tablero[i][j]=new Cuadro();
            }
        }
    }

}
