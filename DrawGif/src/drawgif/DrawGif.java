/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawgif;

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
        //generarCompilador();
    }

    private static void generarCompilador() {

        try {
            String ruta = "src/AnalizadorColors/"; //ruta donde tenemos los archivos con extension .jflex y .cup
            String opcFlex[] = {ruta + "lexicoColor.jflex", "-d", ruta};
            //jflex.Main.generate(opcFlex);
            String opcCUP[] = {"-destdir", ruta, "-parser", "parseColor", ruta + "parseColor.cup"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void probar() {
        
    }

}
