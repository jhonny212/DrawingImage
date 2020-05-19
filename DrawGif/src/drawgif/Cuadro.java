/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawgif;


import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author jhonny
 */
public class Cuadro {
    private final int posY,posX;
    private Color color;

    public Cuadro(int posY, int posX, Color color) {
        this.posY = posY;
        this.posX = posX;
        this.color = color;
    }

    public int getPosY() {
        return posY;
    }

    public int getPosX() {
        return posX;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
}
