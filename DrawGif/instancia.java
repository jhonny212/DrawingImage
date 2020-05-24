package AnalizadorPnt;
 
import AnalizadorColors.ContentColor;
import AnalizadorLienzos.lienzo;
import AnalizadorTime.Tiempos;
import drawgif.Errors;
import java.awt.Color;
import java.util.ArrayList;public class instancia{
 int x=8 ;
 int y=8 ;
String k="" ;
String f="" ;
String l=f+x ;

private void instruct0 (){
String IdLienzo="lienzoId1";
this.LienzoGlobalParamX=IdLienzo;
this.NumFFX=10;
this.NumFFC=15;
if(2 == 2 )
{

 pintar("VerdePalido","_id1",2,0,2,1,12,28);

}

}

public instancia(ArrayList<lienzo> lienzos, ArrayList<ContentColor> listado, ArrayList<Tiempos> listTime) {
        this.lienzos = lienzos;
        this.listado = listado;
        this.listTime = listTime;        this.semanticos=new ArrayList();
        this.LienzoGlobalParamX="";
        this.NumFFX=0;this.NumFFC=0;    }
public  ArrayList<lienzo> lienzos;
public  ArrayList<ContentColor> listado;
public  ArrayList<Tiempos> listTime;
 public ArrayList<Errors> semanticos;
String LienzoGlobalParamX;
int NumFFX,NumFFC;public void mainMethod(){
instruct0 ();
}
 private void pintar(String clr, String img, int start1, int end1, int start2, int end2, int fil, int col) {
        int posLienzOO = getPosLz(this.LienzoGlobalParamX, fil, col);
        if (posLienzOO != -1) {
            int TAMAÑOFILA = this.lienzos.get(posLienzOO).getDim_x();
            int TAMAÑOCOLUMNA = this.lienzos.get(posLienzOO).getDim_y();

            int posCOLORS[] = getPosClr(this.LienzoGlobalParamX, clr, fil, col);
            if (posCOLORS[0] != -1) {
                int posIMAGE[] = getPosImg(this.LienzoGlobalParamX, img, fil, col);
                if (posIMAGE[0] != -1) {
                    Color CCCC = this.listado.get(posCOLORS[0]).getList().get(posCOLORS[1]).color;
                    int mayoRRR = end1, menoRRR = start1;
                    int mayoRRR2 = end2, menoRRR2 = start2;

                    if (end1 != -9999) {
                        if (start1 > end1) {
                            mayoRRR = start1;
                            menoRRR = end1;
                        }
                        if (end2 != -9999) {
                            if (start2 > end2) {
                                mayoRRR2 = start2;
                                menoRRR2 = end2;
                            }
                            if (validarSIZE(menoRRR, mayoRRR, TAMAÑOFILA, TAMAÑOCOLUMNA, fil, col)) {
                                if (validarSIZE(menoRRR2, mayoRRR2, TAMAÑOFILA, TAMAÑOCOLUMNA, fil, col)) {
                                    paint(menoRRR, mayoRRR, menoRRR2, mayoRRR2, CCCC, posIMAGE);
                                }
                            }
                        } else {
                            if (validarSIZE(menoRRR, mayoRRR, TAMAÑOFILA, TAMAÑOCOLUMNA, fil, col)) {
                                if (validarSIZE(start2, 0, TAMAÑOFILA, TAMAÑOCOLUMNA, fil, col)) {
                                    paint(menoRRR, mayoRRR, start2, start2 + 1, CCCC, posIMAGE);
                                }
                            }
                        }

                    } else {
                        if (end2 != -9999) {
                            if (start2 > end2) {
                                mayoRRR2 = start2;
                                menoRRR2=end2;
                            } 

                            if (validarSIZE(start1, 0, TAMAÑOFILA, TAMAÑOCOLUMNA, fil, col)) {
                                if (validarSIZE(menoRRR2, mayoRRR2, TAMAÑOFILA, TAMAÑOCOLUMNA, fil, col)) {
                                    paint(start1, start1, menoRRR2, mayoRRR2, CCCC, posIMAGE);
                                }
                            }
                        } else {
                            if (validarSIZE(start1, 0, TAMAÑOFILA, TAMAÑOCOLUMNA, fil, col)) {
                                if (validarSIZE(start2, 0, TAMAÑOFILA, TAMAÑOCOLUMNA, fil, col)) {
                                    paint(start1, start1, start2, start2, CCCC, posIMAGE);
                                }
                            }
                        }
                    }

                }
            }
        }
    }

    private int getPosLz(String lz, int fil, int col) {
        try {
            for (int i = 0; i < lienzos.size(); i++) {
                if (lz.equals(lienzos.get(i).getId())) {
                    return i;
                }
            }
        } catch (NullPointerException ex) {
        }
        this.semanticos.add(new Errors(lz, "Error al buscar Id del lienzo, no se encontro", fil, NumFFX,NumFFC));
        return -1;
    }

    private int[] getPosClr(String lz, String clr, int fil, int col) {
        try {
            for (int i = 0; i < listado.size(); i++) {
                ContentColor tmp = listado.get(i);
                if (lz.equals(tmp.getName())) {
                    for (int j = 0; j < tmp.getList().size(); j++) {
                        if (clr.equals(tmp.getList().get(j).getNombre())) {
                            return new int[]{i, j};
                        }
                    }
                }
            }
        } catch (NullPointerException ex) {
        }
        this.semanticos.add(new Errors(lz, "Error al buscar Id del color", fil, fil, col));
        return new int[]{-1, -1};
    }
    private int[] getPosImg(String lz, String Img, int fil, int col) {
        try {
            for (int i = 0; i < listTime.size(); i++) {
                Tiempos tmp = listTime.get(i);
                if (lz.equals(tmp.getName())) {
                    for (int j = 0; j < tmp.getList().size(); j++) {
                        if (Img.equals(tmp.getList().get(j).getId())) {
                            return new int[]{i, j};
                        }
                    }
                }
            }
        } catch (NullPointerException ex) {
        }
        this.semanticos.add(new Errors(lz, "Error al buscar Id de la imagen, no se encontro", fil, fil, col));

        return new int[]{-1, -1};
    }
    private void paint(int inic, int end, int i2, int end2, Color clr, int posIMAGE[]) {
        for (int i = inic; i <= end; i++) {
            for (int m = i2; m <= end2; m++) {

                this.listTime.get(posIMAGE[0]).getList().get(posIMAGE[1]).getListadoCodigo().add(new cuadroApintar(clr, m, i));
            }
        }

    }
    private boolean validarSIZE(int xXX, int yYY, int FF, int CC, int fil, int col) {
        if (xXX >= 0 && xXX < CC) {
            if (yYY >= 0 && yYY < FF) {
                return true;
            }
        }
        this.semanticos.add(new Errors("", "Error, no puede pintar fuera de los limiters", fil, fil, col));

        return false;
    }
    public ArrayList<Tiempos> getListTime() {
        return listTime;
    }
  public ArrayList<Errors> getSemanticos() {
        return semanticos;
    }

    }