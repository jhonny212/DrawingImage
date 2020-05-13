/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizadorTime;

import drawgif.Fichero;
import java.io.BufferedReader;
import java.io.StringReader;

/**
 *
 * @author jhonny
 */
public class Time extends Fichero {

    String inicio, fin, Id;
    float duracion1, duracion2;

    public Time(String contenido) {
        super(contenido);
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
        System.out.println("salgo");
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

}
