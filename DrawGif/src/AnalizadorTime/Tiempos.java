/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizadorTime;

import java.util.ArrayList;

/**
 *
 * @author jhonny
 */
public class Tiempos {
 private final String name,inicio,fin;
 private final ArrayList<Time> list;

    public Tiempos(String name, ArrayList<Time> list,String ini,String end) {
        this.name = name;
        this.list = list;
        this.inicio=ini;
        this.fin=end;
    }

    public String getName() {
        return name;
    }

    public String getInicio() {
        return inicio;
    }

    public String getFin() {
        return fin;
    }

    public ArrayList<Time> getList() {
        return list;
    }
    
    
}
