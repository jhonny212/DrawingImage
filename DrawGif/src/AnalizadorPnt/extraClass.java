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
public class extraClass {

    private final String Operador;
    private final Condicion cond;
    private final extraClass ext;
    private int valor = 0;
    private final String value;
    public int Num = 0;
    public String letter;

    public extraClass(String Operador, Condicion cond) {
        this.Operador = Operador;
        this.cond = cond;
        ext = null;
        this.value = "";
        this.letter = "";
        this.valor = -1010;
        this.Num = 1;
        if (this.cond != null) {
            if (this.cond.getE22() == null && this.cond.getCnd() == null) {
                if (this.cond.getTipo() != 3) {
                    System.out.println("Error");
                }
            }
        }
        this.letter = Operador + " " + cond.letter;
    }
    public int Type;

    public extraClass(String Operador, int type, String valor, extraClass ext) {
        this.Operador = Operador;
        this.ext = ext;
        this.cond = null;
        this.value = valor;
        this.letter = "";
        this.Type = type;
        try {
            this.valor = Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            this.valor = -1010;

        }

        this.Num = 2;
       
        if (type == 2 || type == -2) {
            if (Operador.equals("==") || Operador.equals("<>") ) {
               
                try {
                    this.letter = ".equals( " + valor + ") " + ext.letter;
                } catch (NullPointerException e) {
                    this.letter = ".equals( " + valor + ") ";
                }
            } else {
                if (Operador.equals("<>")) {
                    Operador = "!=";
                }
                try {
                    this.letter = Operador + " (" + valor + ").length() " + ext.letter;
                } catch (NullPointerException e) {
                    this.letter = Operador + " (" + valor + ").length() ";
                }
            }

        } else {
            try {
                this.letter = Operador + " " + valor + " " + ext.letter;
            } catch (NullPointerException e) {
                this.letter = Operador + " " + valor + " ";
            }

        }

        //System.out.println("2do. EXT" + this.Operador + " " + this.valor);
    }

    public String getOperador() {
        return Operador;
    }

    public Condicion getCond() {
        return cond;
    }

    public extraClass getExt() {
        return ext;
    }

    public int getValor() {
        return valor;
    }

    public String getValue() {
        return value;
    }

}
