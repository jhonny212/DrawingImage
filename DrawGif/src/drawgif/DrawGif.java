/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawgif;

import AnalizadorColors.Colores;
import AnalizadorPnt.lexicoPnt;
import AnalizadorPnt.parserPnt;
//import static AnalizadorPnt.parserPnt.Semanticos;
import Interfaz.EditorDeTexto;
import TablaDeSimbolos.clasePnt;
import java.awt.AWTException;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author jhonny
 */
public class DrawGif {

    /**
     * @param args the command line arguments
     */
    public static BufferedImage crearPNG() {
        BufferedImage bufferedImage = new BufferedImage(500, 600, BufferedImage.TYPE_INT_RGB);
        Graphics g2 = bufferedImage.createGraphics();
        //g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
          //      RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.CYAN);
        g2.fillRect(0, 0, 500, 600);
        // Aquí deberíamos introducir el código que queramos pintar.
        g2.setColor(Color.ORANGE);
        g2.fillRect(0, 0, 150, 150);
        g2.setColor(Color.black);
        g2.fillRect(0, 150, 150, 150);

        g2.setColor(Color.BLACK);
        g2.dispose();
        try {
            ImageIO.write(bufferedImage, "png", new File("Text.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return bufferedImage;
    }

    public static BufferedImage crearPNG2() {
        BufferedImage bufferedImage = new BufferedImage(500, 600, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = bufferedImage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.CYAN);
        g2.fillRect(0, 0, 500, 600);
        // Aquí deberíamos introducir el código que queramos pintar.
        g2.setColor(Color.green);
        g2.fillRect(0, 0, 150, 150);
        g2.setColor(Color.red);
        g2.fillRect(0, 150, 150, 150);

        g2.setColor(Color.BLACK);
        g2.dispose();
        return bufferedImage;
    }

    public static void main(String[] args) throws IOException {
        EditorDeTexto r=new EditorDeTexto();
        r.show();
       // crearPNG();
        /*try {
            
            
            ImageIO.write(crearPNG(), "png", new File("hola"));
            } catch (IOException ex) {
            }*/
        //EditorDeTexto t = new EditorDeTexto();
        //t.show();
        /*BufferedImage first = ImageIO.read(new File("/home/jhonny/Descargas/d.png"));
        ImageOutputStream output = new FileImageOutputStream(new File("example.gif"));

        GifSequenceWriter writer = null;
        int contador=250;
        try {
            writer = new GifSequenceWriter(output, first.getType(), contador, true);
        } catch (IOException ex) {
            Logger.getLogger(DrawGif.class.getName()).log(Level.SEVERE, null, ex);
        }
        writer.writeToSequence(first);

        File[] images = new File[]{
            new File("/home/jhonny/Descargas/f.png"),
            new File("/home/jhonny/Descargas/d.png"),
            new File("/home/jhonny/Descargas/f.png"),};

        for (File image : images) {
            System.out.println("entroo");
            contador+=4000;
            writer.time=contador;
            writer.configureRootMetadata(contador,true);
            BufferedImage next = ImageIO.read(image);
            writer.writeToSequence(next);
        }

        writer.close();
        output.close();*/
        
        
    }

    private static void generarCompilador() {

        try {
            String ruta = "src/AnalizadorPnt/"; //ruta donde tenemos los archivos con extension .jflex y .cup
            String opcFlex[] = {ruta + "lexicoPnt.jflex", "-d", ruta};
            //jflex.Main.generate(opcFlex);
            String opcCUP[] = {"-destdir", ruta, "-parser", "parserPnt", ruta + "parserPnt.cup"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void probar() {
        //generarCompilador();
        String contenido = "";
        contenido = "VARS ["
                + "boolean ff= 2+(2) AND true AND true;"
                + "]";

        lexicoPnt scan = new lexicoPnt(new BufferedReader(new StringReader(contenido)));

        parserPnt parser = new parserPnt(scan);
        parser.tablaForInt = new ArrayList<>();
        parser.Semanticos = new ArrayList<>();

        try {
            parser.parse();
        } catch (Exception ex) {
            System.out.println(ex.getMessage()+"s");
        }

        for (int i = 0; i < parser.Semanticos.size(); i++) {
            System.out.println(parser.Semanticos.get(i).getSolucion());

        }

    }

}
