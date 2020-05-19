/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author jhonny
 */
public class action implements ActionListener{
    Ordenar ordn;
    int pos;

    public action(Ordenar ordn, int pos) {
        this.ordn = ordn;
        this.pos = pos;
    }

  

    @Override
    public void actionPerformed(ActionEvent e) {
    if(ordn.seleccion!=-1){
    ordn.getBtns()[0][ordn.seleccion].setBackground(Color.gray);
    }    
    ordn.seleccion=pos;
    ordn.getBtns()[0][ordn.seleccion].setBackground(Color.yellow);
    
    }
}
