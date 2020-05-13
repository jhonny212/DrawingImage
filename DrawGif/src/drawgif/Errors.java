/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawgif;

import AnalizadorLienzos.sym;

/**
 *
 * @author jhonny
 */
public class Errors {
    final String dato,solucion;
    final int fila,columna;
    final int tipo;
    
    public Errors(String dato, String solucion, int  tipo, int fila, int columna) {
        this.dato = dato;
        this.solucion = solucion;
        this.tipo = tipo;
        this.fila = fila;
        this.columna = columna;
    }

    public String getDato() {
        return dato;
    }

    public String getSolucion() {
        return solucion;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public int getTipo() {
        return tipo;
    }
    

   
    
}
