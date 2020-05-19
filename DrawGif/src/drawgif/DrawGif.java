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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;


/**
 *
 * @author jhonny
 */
public class DrawGif {

    /**
     * @param args the command line arguments
     */
  

    public static void main(String[] args)  {
        EditorDeTexto r=new EditorDeTexto();
        r.show();
     

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
            System.out.println(ex.getMessage() + "s");
        }

        for (int i = 0; i < parser.Semanticos.size(); i++) {
            System.out.println(parser.Semanticos.get(i).getSolucion());

        }

    }

}
