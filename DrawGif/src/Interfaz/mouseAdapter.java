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
    mouseAdapter(Color clr, EditorGrafico aThis) {
        this.clr=clr;
        this.aThis=aThis;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
      this.aThis.getColorSelect().setBackground(clr);
    }
}
