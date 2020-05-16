/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizadorLienzos;

import drawgif.Fichero;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jhonny
 */
public class lienzo extends Fichero {
    String Id,Nombre,Tipo;
    Color color;
    int cuadro,dim_x,dim_y;
    public lienzo(String contenido) {
        super(contenido);
        init();
    }
    ArrayList<lienzo> lienzos;

    public ArrayList<lienzo> getLienzos() {
        return lienzos;
    }
    

    public boolean init() {
        lexicoLienzo scan=new lexicoLienzo(new BufferedReader(new StringReader(contenido)));
        
     parserLienzo   parser=new parserLienzo(scan);
        try {
            parser.parse();
        } catch (Exception ex) {
            return false;
        }
        
        this.erroresLexico=scan.erroresLexico;
        this.erroresSintacticos=parser.erroresSintacticos;
        this.erroresSemanticos=parser.erroresSemanticos;
        this.lienzos=parser.lienzos;
        return isValid();
       }

    public lienzo(String Id, String Nombre, String Tipo, Color color, int cuadro, int dim_x, int dim_y) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.color = color;
        this.cuadro = cuadro;
        this.dim_x = dim_x;
        this.dim_y = dim_y;
    }

    public String getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public Color getColor() {
        return color;
    }

    public int getCuadro() {
        return cuadro;
    }

    public int getDim_x() {
        return dim_x;
    }

    public int getDim_y() {
        return dim_y;
    }
    
    public int getPosTime(String id){
        for (int i = 0; i < this.lienzos.size(); i++) {
            if(id.equals(this.lienzos.get(i).getId())){
            return i;
            }
        }
    return -1;}  

}
