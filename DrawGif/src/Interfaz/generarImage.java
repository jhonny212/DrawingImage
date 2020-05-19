/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import AnalizadorTime.Tiempos;
import AnalizadorTime.Time;
import drawgif.Cuadro;
import drawgif.GifSequenceWriter;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;

/**
 *
 * @author jhonny
 */
public class generarImage {

    EditorGrafico href;
    final int width, height, pix;
    int tiempos[];
    BufferedImage Imagenes[];
    boolean Gif;

    public generarImage(EditorGrafico href, boolean is) {
        this.href = href;
        this.Gif = is;
        pix = this.href.lz.getCuadro();
        width = href.columna * pix;
        height = href.fila * pix;

    }

    public void crearPNG() {
        ArrayList<Time> listTime = href.tmp.getList();
        tiempos = new int[listTime.size()];
        Imagenes = new BufferedImage[listTime.size()];
        if (!Gif) {
            File directorio = new File(this.href.lz.getId());
            directorio.mkdir();
        }
        for (int i = 0; i < listTime.size(); i++) {
            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2 = bufferedImage.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            Time tm = listTime.get(i);
            String Id = tm.getId();
            //Pintando
            for (int j = 0; j < tm.getPaint().size(); j++) {
                Cuadro cdr = tm.getPaint().get(j);
                //Mover->  //Mover -> // abajo  //ancho // altura
                int der = cdr.getPosX() * pix;
                int down = cdr.getPosY() * pix;
                g2.setColor(cdr.getColor());
                g2.fillRect(der, down, pix, pix);
            }
            g2.dispose();
            if (!Gif) {
                try {
                    ImageIO.write(bufferedImage, "png", new File(this.href.lz.getId()+"/"+Id + ".png"));
                } catch (IOException ex) {
                }
            } else {
                this.Imagenes[i] = bufferedImage;
                this.tiempos[i] = (int) listTime.get(i).getDuracion1();
            }
        }

        if (Gif) {
            prueba();
        }
    }

    private void prueba() {
        try {
            BufferedImage first = this.Imagenes[0];
            ImageOutputStream output = new FileImageOutputStream(new File("example.gif"));
            GifSequenceWriter writer = null;
            int contador = 250;
            try {
                writer = new GifSequenceWriter(output, first.getType(), tiempos[0], true);
            } catch (IOException ex) {
            }
            writer.writeToSequence(first);
            if (Imagenes.length > 1) {
                for (int i = 1; i < Imagenes.length; i++) {
                    writer.time = tiempos[i];
                    writer.configureRootMetadata(contador, true);
                    writer.writeToSequence(Imagenes[i]);
                }
            }
            writer.close();
            output.close();
        } catch (IOException ex) {
        }
    }

}
