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
        clase += "\nprivate void pintar(String clr,String img,int start1,int end1,int start2,int end2,int fil,int col){\n"
                + "\n"
                + "}";
        clase += "public  int getPosLz(String lz, int fil, int col) {\n"
                + "        try {\n"
                + "            for (int i = 0; i < lienzos.size(); i++) {\n"
                + "                if (lz.equals(lienzos.get(i).getId())) {\n"
                + "                    return i;\n"
                + "                }\n"
                + "            }\n"
                + "        } catch (NullPointerException ex) {\n"
                + "        }\n"
                + "\n"
                + "        return -1;\n"
                + "    }\n"
                + "\n"
                + "    public  int[] getPosClr(String lz, String clr, int fil, int col) {\n"
                + "        try {\n"
                + "            for (int i = 0; i < listado.size(); i++) {\n"
                + "                ContentColor tmp = listado.get(i);\n"
                + "                if (lz.equals(tmp.getName())) {\n"
                + "                    for (int j = 0; j < tmp.getList().size(); j++) {\n"
                + "                        if (clr.equals(tmp.getList().get(j).getId())) {\n"
                + "                            return new int[]{i, j};\n"
                + "                        }\n"
                + "                    }\n"
                + "                }\n"
                + "            }\n"
                + "        } catch (NullPointerException ex) {\n"
                + "        }\n"
                + "        return new int[]{-1, -1};\n"
                + "    }"
                + "  public void saludar(){"
                + "  System.out.println(\"hola\");"
                + "}"
                + "\n"
                + "\n"
                + "    public  int[] getPosImg(String lz, String Img, int fil, int col) {\n"
                + "        try {\n"
                + "            for (int i = 0; i < listTime.size(); i++) {\n"
                + "                Tiempos tmp = listTime.get(i);\n"
                + "                if (lz.equals(tmp.getName())) {\n"
                + "                    for (int j = 0; j < tmp.getList().size(); j++) {\n"
                + "                        if (Img.equals(tmp.getList().get(j).getId())) {\n"
                + "                            return new int[]{i, j};\n"
                + "                        }\n"
                + "                    }\n"
                + "                }\n"
                + "            }\n"
                + "        } catch (NullPointerException ex) {\n"
                + "        }\n"
                + "        return new int[]{-1, -1};\n"
                + "    }\n";
        clase += "private void mainMethod(){\n";
        for (int i = 0; i < methods; i++) {
            clase += "instruct" + i + " ();\n";
        }
        clase += "}\n }";

        return clase;
    }
}
