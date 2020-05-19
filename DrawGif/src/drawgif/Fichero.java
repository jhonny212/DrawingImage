/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawgif;

import java.util.ArrayList;

/**
 *
 * @author jhonny
 */
public class Fichero {

    public Fichero() {
    }
    protected String contenido;
    protected ArrayList<Errors> erroresLexico, erroresSintacticos, erroresSemanticos;
   
    public panelError sintact, lexi, seman;

    public Fichero(String contenido) {
        this.contenido = contenido;
        this.seman = new panelError();
        lexi = new panelError();
        sintact = new panelError();
        erroresLexico = new ArrayList<>();
        erroresSemanticos = new ArrayList<>();
        erroresSintacticos = new ArrayList<>();
    }

    public ArrayList<Errors> getErroresLexico() {
        return erroresLexico;
    }

    public ArrayList<Errors> getErroresSintacticos() {
        return erroresSintacticos;
    }

    public boolean isValid() {
        if (erroresLexico.isEmpty() || erroresSemanticos.isEmpty() || erroresSintacticos.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public ArrayList<Errors> getErroresSemanticos() {
        
        return erroresSemanticos;
    }

}
