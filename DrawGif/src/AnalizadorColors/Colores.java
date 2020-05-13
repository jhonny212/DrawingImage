/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizadorColors;

import AnalizadorLienzos.lienzo;
import drawgif.Fichero;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;

/**
 *
 * @author jhonny
 */
public class Colores extends Fichero {

    String nombre, id;
    public Color color;

    public Colores(String contenido) {
        super(contenido);
        
    }

    public boolean init() {
        lexicoColor scan = new lexicoColor(new BufferedReader(new StringReader(contenido)));

        parseColor parser = new parseColor(scan);
       
       
        try {
            parser.parse();
        } catch (Exception ex) {
            return false;
        }
        this.erroresLexico = scan.erroresLexico;
        this.erroresSintacticos = parser.erroresSintacticos;
        this.erroresSemanticos = parser.erroresSemanticos;
       
        return isValid();

    }

    public Colores(int red, int green, int blue, String nombre, String id) {
        this.nombre = nombre;
        this.color = new Color(red, green, blue);
        this.id = id;
    }

    public Colores(String nombre, Color clr) {
        this.nombre = nombre;
        this.color = clr;
    }

}
