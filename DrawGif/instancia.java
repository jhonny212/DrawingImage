package AnalizadorPnt;
 
import AnalizadorColors.ContentColor;
import AnalizadorLienzos.lienzo;
import AnalizadorTime.Tiempos;
import java.util.ArrayList;
public class instancia{
 int x=2 ,j = 4;
 boolean k=true ;
String f="f" ;
String l=f+x ;

private void instruct0 (){
String IdLienzo="otroLienzo";
if(2 == 3 )
{

 pintar("llll","kkk",1,-9999,2,-9999,4,26);

 pintar("llll","kkk",1,-9999,2,-9999,5,17);

}

}
private void instruct1 (){
String IdLienzo="otroLienzo";
while(true)
{
f=2+"f"+2;
}

}

public  ArrayList<lienzo> lienzos;
public  ArrayList<ContentColor> listado;
public  ArrayList<Tiempos> listTime;

private void pintar(String clr,String img,int start1,int end1,int start2,int end2,int fil,int col){

}public  int getPosLz(String lz, int fil, int col) {
        try {
            for (int i = 0; i < lienzos.size(); i++) {
                if (lz.equals(lienzos.get(i).getId())) {
                    return i;
                }
            }
        } catch (NullPointerException ex) {
        }

        return -1;
    }

    public  int[] getPosClr(String lz, String clr, int fil, int col) {
        try {
            for (int i = 0; i < listado.size(); i++) {
                ContentColor tmp = listado.get(i);
                if (lz.equals(tmp.getName())) {
                    for (int j = 0; j < tmp.getList().size(); j++) {
                        if (clr.equals(tmp.getList().get(j).getId())) {
                            return new int[]{i, j};
                        }
                    }
                }
            }
        } catch (NullPointerException ex) {
        }
        return new int[]{-1, -1};
    }  public void saludar(){  System.out.println("hola");}

    public  int[] getPosImg(String lz, String Img, int fil, int col) {
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
        return new int[]{-1, -1};
    }
private void mainMethod(){
instruct0 ();
instruct1 ();
}
 }