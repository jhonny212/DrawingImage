/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizadorPnt;

/**
 *
 * @author jhonny
 */
public class crearClase {

    public crearClase() {
    }

    public String init(String variables, String metodos, int methods) {
        String clase = "package AnalizadorPnt;\n \n"
                + "import AnalizadorColors.ContentColor;\n"
                + "import AnalizadorLienzos.lienzo;\n"
                + "import AnalizadorTime.Tiempos;\n"
                + "import drawgif.Errors;\n"
                + "import java.awt.Color;\n"
                + "import java.util.ArrayList;";

        clase += "public class instancia{\n "
                + variables + "\n"
                + metodos
                + "\n";
        clase += "public instancia(ArrayList<lienzo> lienzos, ArrayList<ContentColor> listado, ArrayList<Tiempos> listTime) {\n"
                + "        this.lienzos = lienzos;\n"
                + "        this.listado = listado;\n"
                + "        this.listTime = listTime;"
                + "        this.semanticos=new ArrayList();"
                + "        this.LienzoGlobalParamX=\"\";\n"
                + "    }\n";

        clase += "public  ArrayList<lienzo> lienzos;\n"
                + "public  ArrayList<ContentColor> listado;\n"
                + "public  ArrayList<Tiempos> listTime;"
                + " public ArrayList<Errors> semanticos;"
                + "String LienzoGlobalParamX;\n";
        
        clase += "public void mainMethod(){\n";
        for (int i = 0; i < methods; i++) {
            clase += "instruct" + i + " ();\n";
        }
        clase += "}\n }";

        clase += "";
        
        
        return clase;
    }
}
