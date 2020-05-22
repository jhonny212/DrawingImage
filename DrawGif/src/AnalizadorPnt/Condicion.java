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
public class Condicion {
    
    private int Intvalor, tipo;
    private String StringValue;
    private boolean boolValue;
    private final extraClass E22;
    private Condicion cnd;
    public int NumC = 0;
    public String letter;
    
    public Condicion(Object e, extraClass e22) {
        Object ob[] = (Object[]) e;
        this.Intvalor = (int) ob[1];
        this.StringValue = (String) ob[2];
        this.boolValue = (boolean) ob[3];
        this.tipo = (int) ob[0];
        this.E22 = e22;
        this.letter = "";
        if (e22 != null) {
            if (this.E22.Num != 2) {
                System.out.println("Error");
            }
            if (this.tipo != e22.Type) {
                if (e22.getOperador().equals("==") || e22.getOperador().equals("<>")) {
                    System.out.println("Error de comparacion");
                }
            }
        }
        if (e22 != null) {
            if (this.tipo == 1) {
                this.letter = ob[2] + " " + e22.letter;
            } else {
                if (!e22.getOperador().equals("==")) {
                    if (e22.getOperador().equals("<>")) {
                        this.letter = "!(" + ob[2] + ")" + e22.letter;
                    } else {
                        this.letter = "(" + ob[2] + ").length()  " + e22.letter;
                    }
                } else {
                    {
                        this.letter = "(" + ob[2] + ")" + e22.letter;
                    }
                }
            }
        } else {
            if (this.tipo == 1) {
                this.letter = (String) ob[2];
            } else {
                if (!e22.getOperador().equals("==")) {
                    if (e22.getOperador().equals("<>")) {
                        this.letter = "!(" + ob[2] + ")";
                    } else {
                        this.letter = "(" + ob[2] + ").length()";
                    }
                } else {
                    {
                        this.letter = "(" + ob[2] + ")";
                    }
                }
            }
        }
        this.NumC = 1;
    }
    
    public Condicion(boolean ob, extraClass e22) {
        boolValue = ob;
        this.StringValue = String.valueOf(ob);
        this.E22 = e22;
        this.tipo = 3;
        this.NumC = 2;
        this.letter = "";
        if (e22 != null) {
            this.letter = StringValue + " " + e22.letter;
        } else {
            this.letter = StringValue;
        }
    }
    
    public Condicion(Condicion c, extraClass e22) {
        this.cnd = c;
        this.E22 = e22;
        this.NumC = c.NumC;
        this.letter = "";
        if (c != null) {
            this.letter = c.letter;
            if (e22 != null) {
                this.letter += " " + e22.letter;
            }
        }
        
    }
    
    public void print() {
        //System.out.println("****************");
        //System.out.println(this.letter);
        //paint(this);
    }
    
    private void paint(Condicion href) {
        if (href.cnd != null) {
            paint(href.cnd);
            if (href.E22 != null) {
                System.out.print(" " + href.E22.getOperador());
                if (href.E22.getCond() != null) {
                    paint(href.E22.getCond());
                }
            }
        } else {
            System.out.print(" " + href.StringValue);
            if (href.E22 != null) {
                
                if (href.E22.getExt() == null) {
                    System.out.print(" " + href.E22.getOperador() + "");
                    if (href.getE22().getCond() != null) {
                        paint(href.E22.getCond());
                    } else {
                        System.out.print(href.getE22().getValue());
                    }
                    
                } else {
                    
                    System.out.print(" " + href.E22.getOperador());
                    System.out.print(" " + href.E22.getValue());
                    
                    if (href.E22.getExt().getCond() != null) {
                        System.out.print(" " + href.E22.getExt().getOperador());
                        paint(href.E22.getExt().getCond());
                    }
                    if (href.E22.getCond() != null) {
                        paint(href.E22.getCond());
                    }
                }
            }
        }
    }
    
    public int getIntvalor() {
        return Intvalor;
    }
    
    public int getTipo() {
        return tipo;
    }
    
    public String getStringValue() {
        return StringValue;
    }
    
    public boolean isBoolValue() {
        return boolValue;
    }
    
    public Condicion getCnd() {
        return cnd;
    }
    
    public String getValue() {
        
        switch (tipo) {
            case 1:
                return String.valueOf(this.Intvalor);
            case 2:
                return this.StringValue;
            case 3:
                return String.valueOf(this.boolValue);
        }
        return "";
    }
    
    public extraClass getE22() {
        return E22;
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public void setLetter(String letter) {
        this.letter = letter;
    }
    
}
