/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author jhonny
 */
public class mouseAdapter extends MouseAdapter {

    final Color clr;
    EditorGrafico aThis;
    boolean isColors;

    mouseAdapter(Color clr, EditorGrafico aThis, boolean is) {
        this.clr = clr;
        this.aThis = aThis;
        this.isColors = is;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (isColors) {
            this.aThis.getColorSelect().setBackground(clr);
        } else {
            int fila=aThis.fila;
            int columna=aThis.columna;
            Color colorsSelected=aThis.getColorSelect().getBackground();
            boolean eraser=aThis.getBorrador().isSelected();
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    if(aThis.getTablero()[i][j].equals(e.getSource())){
                    if(eraser)
                        aThis.getTablero()[i][j].setBackground(aThis.lz.getColor());
                    else
                        aThis.getTablero()[i][j].setBackground(colorsSelected);
                    break;
                    }
                }
                
            }
        }
    }
}
