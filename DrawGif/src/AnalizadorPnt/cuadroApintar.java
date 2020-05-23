/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizadorPnt;

import java.awt.Color;

/**
 *
 * @author jhonny
 */
public class cuadroApintar {
    private final Color clr;

    public cuadroApintar(Color clr, int x, int y) {
        this.clr = clr;
        this.x = x;
        this.y = y;
    }
    private final int x,y;

    public Color getClr() {
        return clr;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

   
}
