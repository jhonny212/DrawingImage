/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizadorTime;

import AnalizadorPnt.cuadroApintar;
import drawgif.Cuadro;
import drawgif.Fichero;
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
    protected ArrayList<Cuadro> paint;
    ArrayList<cuadroApintar> listadoCodigo;
    public Time(String contenido) {
        super(contenido);
        listTime=new ArrayList<>();
        paint=new ArrayList();
        this.listadoCodigo=new ArrayList<>();
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
        this.listadoCodigo=new ArrayList<>();

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

    public void setListTime(ArrayList<Tiempos> listTime) {
        this.listTime = listTime;
    }
    

    public void setDuracion1(float duracion1) {
        this.duracion1 = duracion1;
    }

    public void setDuracion2(float duracion2) {
        this.duracion2 = duracion2;
    }
    public void inicializar(){
    paint=new ArrayList<>();
    }
    public ArrayList<Cuadro> getPaint() {
        return paint;
    }

    public void setPaint(ArrayList<Cuadro> paint) {
        this.paint = paint;
    }

    public ArrayList<cuadroApintar> getListadoCodigo() {
        return listadoCodigo;
    }
    public void inicializarList(){
    this.listadoCodigo=new ArrayList<>();
    }
    

  

}
