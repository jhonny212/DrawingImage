/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawgif;

import AnalizadorPnt.Codigo;
import Interfaz.EditorDeTexto;

//import static AnalizadorPnt.parserPnt.Semanticos;
/**
 *
 * @author jhonny
 */
public class DrawGif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EditorDeTexto f = new EditorDeTexto();
        f.show();
        

    }

    private static void generarCompilador() {

        try {
            String ruta = "src/AnalizadorPnt/"; //ruta donde tenemos los archivos con extension .jflex y .cup
            String opcFlex[] = {ruta + "lexicoPnt.jflex", "-d", ruta};
            jflex.Main.generate(opcFlex);
            String opcCUP[] = {"-destdir", ruta, "-parser", "parserPnt", ruta + "parserPnt.cup"};
            //java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void probar() {
        //generarCompilador();

        String contenido = "VARS [ //2ff+ 2\n"
                + "int x=2+2+(2+2);\n"
                + "int y=x;\n"
                + " String k=\"\";"
                + " String f=\"\";"
                + "String l=f+x; //ssasd \n"
                + "]"
                + ""
                + "INSTRUCCIONES(otroLienzo) ["
                + "\n"
                + "if(2==2){"
                + "PINTAR(verdePalido,id2_,1,2);\n"
                + "}"
                + "]"
                + "INSTRUCCIONES(otroLienzo) ["
                + "x=2;"
                + "]"
                + "";

        //Codigo cd = new Codigo(contenido);
    }

}
