/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizadorColors;

import AnalizadorColors.Colores;
import java.util.ArrayList;

/**
 *
 * @author jhonny
 */
public class ContentColor {
    private ArrayList<Colores> list;
    private final String name;

    public ContentColor(ArrayList<Colores> list, String name) {
        this.list = list;
        this.name = name;
    }

    public ArrayList<Colores> getList() {
        return list;
    }

    public String getName() {
        return name;
    }
}
