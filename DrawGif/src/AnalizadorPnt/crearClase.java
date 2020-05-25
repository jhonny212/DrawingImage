/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizadorPnt;

import Interfaz.EditorDeTexto;

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

        clase += "public class instancia"+EditorDeTexto.contadoR+"{\n "
                + variables + "\n"
                + metodos
                + "\n";
        clase += "public instancia" + EditorDeTexto.contadoR + "(ArrayList<lienzo> lienzos, ArrayList<ContentColor> listado, ArrayList<Tiempos> listTime) {\n"
                + "        this.lienzos = lienzos;\n"
                + "        this.listado = listado;\n"
                + "        this.listTime = listTime;\n"
                + "        this.semanticos=new ArrayList();\n"
                + "        this.LienzoGlobalParamX=\"\";\n"
                + "        this.NumFFX=0;this.NumFFC=0;\n"
                + "    }\n";

        clase += "public  ArrayList<lienzo> lienzos;\n"
                + "public  ArrayList<ContentColor> listado;\n"
                + "public  ArrayList<Tiempos> listTime;\n"
                + " public ArrayList<Errors> semanticos;\n"
                + "String LienzoGlobalParamX;\n"
                + "int NumFFX,NumFFC;";

        clase += "public void mainMethod(){\n";
        for (int i = 0; i < methods; i++) {
            clase += "instruct" + i + " ();\n";
        }
        clase += "}\n";
        clase += " private void pintar(String clr, String img, int start1, int end1, int start2, int end2, int fil, int col) {\n"
                + "        int posLienzOO = getPosLz(this.LienzoGlobalParamX, fil, col);\n"
                + "        if (posLienzOO != -1) {\n"
                + "            int TAMAÑOFILA = this.lienzos.get(posLienzOO).getDim_x();\n"
                + "            int TAMAÑOCOLUMNA = this.lienzos.get(posLienzOO).getDim_y();\n"
                + "\n"
                + "            int posCOLORS[] = getPosClr(this.LienzoGlobalParamX, clr, fil, col);\n"
                + "            if (posCOLORS[0] != -1) {\n"
                + "                int posIMAGE[] = getPosImg(this.LienzoGlobalParamX, img, fil, col);\n"
                + "                if (posIMAGE[0] != -1) {\n"
                + "                    Color CCCC = this.listado.get(posCOLORS[0]).getList().get(posCOLORS[1]).color;\n"
                + "                    int mayoRRR = end1, menoRRR = start1;\n"
                + "                    int mayoRRR2 = end2, menoRRR2 = start2;\n"
                + "\n"
                + "                    if (end1 != -9999) {\n"
                + "                        if (start1 > end1) {\n"
                + "                            mayoRRR = start1;\n"
                + "                            menoRRR = end1;\n"
                + "                        }\n"
                + "                        if (end2 != -9999) {\n"
                + "                            if (start2 > end2) {\n"
                + "                                mayoRRR2 = start2;\n"
                + "                                menoRRR2 = end2;\n"
                + "                            }\n"
                + "                            if (validarSIZE(menoRRR, mayoRRR, TAMAÑOFILA, TAMAÑOCOLUMNA, fil, col)) {\n"
                + "                                if (validarSIZE(menoRRR2, mayoRRR2, TAMAÑOFILA, TAMAÑOCOLUMNA, fil, col)) {\n"
                + "                                    paint(menoRRR, mayoRRR, menoRRR2, mayoRRR2, CCCC, posIMAGE);\n"
                + "                                }\n"
                + "                            }\n"
                + "                        } else {\n"
                + "                            if (validarSIZE(menoRRR, mayoRRR, TAMAÑOFILA, TAMAÑOCOLUMNA, fil, col)) {\n"
                + "                                if (validarSIZE(start2, 0, TAMAÑOFILA, TAMAÑOCOLUMNA, fil, col)) {\n"
                + "                                    paint(menoRRR, mayoRRR, start2, start2 + 1, CCCC, posIMAGE);\n"
                + "                                }\n"
                + "                            }\n"
                + "                        }\n"
                + "\n"
                + "                    } else {\n"
                + "                        if (end2 != -9999) {\n"
                + "                            if (start2 > end2) {\n"
                + "                                mayoRRR2 = start2;\n"
                + "                                menoRRR2=end2;\n"
                + "                            } \n"
                + "\n"
                + "                            if (validarSIZE(start1, 0, TAMAÑOFILA, TAMAÑOCOLUMNA, fil, col)) {\n"
                + "                                if (validarSIZE(menoRRR2, mayoRRR2, TAMAÑOFILA, TAMAÑOCOLUMNA, fil, col)) {\n"
                + "                                    paint(start1, start1, menoRRR2, mayoRRR2, CCCC, posIMAGE);\n"
                + "                                }\n"
                + "                            }\n"
                + "                        } else {\n"
                + "                            if (validarSIZE(start1, 0, TAMAÑOFILA, TAMAÑOCOLUMNA, fil, col)) {\n"
                + "                                if (validarSIZE(start2, 0, TAMAÑOFILA, TAMAÑOCOLUMNA, fil, col)) {\n"
                + "                                    paint(start1, start1, start2, start2, CCCC, posIMAGE);\n"
                + "                                }\n"
                + "                            }\n"
                + "                        }\n"
                + "                    }\n"
                + "\n"
                + "                }\n"
                + "            }\n"
                + "        }\n"
                + "    }\n"
                + "\n"
                + "    private int getPosLz(String lz, int fil, int col) {\n"
                + "        try {\n"
                + "            for (int i = 0; i < lienzos.size(); i++) {\n"
                + "                if (lz.equals(lienzos.get(i).getId())) {\n"
                + "                    return i;\n"
                + "                }\n"
                + "            }\n"
                + "        } catch (NullPointerException ex) {\n"
                + "        }\n"
                + "        this.semanticos.add(new Errors(lz, \"Error al buscar Id del lienzo, no se encontro\", fil, NumFFX,NumFFC));\n"
                + "        return -1;\n"
                + "    }\n"
                + "\n"
                + "    private int[] getPosClr(String lz, String clr, int fil, int col) {\n"
                + "        try {\n"
                + "            for (int i = 0; i < listado.size(); i++) {\n"
                + "                ContentColor tmp = listado.get(i);\n"
                + "                if (lz.equals(tmp.getName())) {\n"
                + "                    for (int j = 0; j < tmp.getList().size(); j++) {\n"
                + "                        if (clr.equals(tmp.getList().get(j).getNombre())) {\n"
                + "                            return new int[]{i, j};\n"
                + "                        }\n"
                + "                    }\n"
                + "                }\n"
                + "            }\n"
                + "        } catch (NullPointerException ex) {\n"
                + "        }\n"
                + "        this.semanticos.add(new Errors(lz, \"Error al buscar Id del color\", fil, fil, col));\n"
                + "        return new int[]{-1, -1};\n"
                + "    }\n"
                + "    private int[] getPosImg(String lz, String Img, int fil, int col) {\n"
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
                + "        this.semanticos.add(new Errors(lz, \"Error al buscar Id de la imagen, no se encontro\", fil, fil, col));\n"
                + "\n"
                + "        return new int[]{-1, -1};\n"
                + "    }\n"
                + "    private void paint(int inic, int end, int i2, int end2, Color clr, int posIMAGE[]) {\n"
                + "        for (int i = inic; i <= end; i++) {\n"
                + "            for (int m = i2; m <= end2; m++) {\n"
                + "\n"
                + "                this.listTime.get(posIMAGE[0]).getList().get(posIMAGE[1]).getListadoCodigo().add(new cuadroApintar(clr, m, i));\n"
                + "            }\n"
                + "        }\n"
                + "\n"
                + "    }\n"
                + "    private boolean validarSIZE(int xXX, int yYY, int FF, int CC, int fil, int col) {\n"
                + "System.out.println(\"Datos\"+xXX+\" \"+CC+\" \"+yYY+\" \"+FF);"
                + "        if (xXX >= 0 && xXX < CC) {\n"
                + "            if (yYY >= 0 && yYY < FF) {\n"
                + "                return true;\n"
                + "            }\n"
                + "        }\n"
                + "        this.semanticos.add(new Errors(\"\", \"Error, no puede pintar fuera de los limiters\", fil, fil, col));\n"
                + "\n"
                + "        return false;\n"
                + "    }\n"
                + "    public ArrayList<Tiempos> getListTime() {\n"
                + "        return listTime;\n"
                + "    }\n"
                + "  public ArrayList<Errors> getSemanticos() {\n"
                + "        return semanticos;\n"
                + "    }\n\n"
                + "    ";

        clase += "}";

        return clase;
    }
}
