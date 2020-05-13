/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablaDeSimbolos;

/**
 *
 * @author jhonny
 */
public class tablaInt extends TablaSimbolos {

    private Object valor;
    private String tipo;

    public Object getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public tablaInt(Object valor, String id, boolean isNull, String tipo) {
        this.valor = valor;
        this.Id = id;
        this.isNull = isNull;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public int getValorInt() {
        return (int) valor;
    }

    public String getValorString() {
        return String.valueOf(valor);
    }

    public Boolean getValorBoolean() {
        return (Boolean) valor;
    }

    public tablaInt(String valor, String id, boolean isNull, String tipo) {
        this.valor = valor;
        this.Id = id;
        this.isNull = isNull;
    }

    public tablaInt(Boolean valor, String id, boolean isNull, String tipo) {
        this.valor = valor;
        this.Id = id;
        this.isNull = isNull;
    }

    public tablaInt(int valor, String id, boolean isNull, String tipo) {
        this.valor = valor;
        this.Id = id;
        this.isNull = isNull;
    }

    public int type() {
        switch (tipo) {
            case "int":
                return 1;
            case "str":
                return 2;
            case "bool":
                return 3;
            default:
               
                break;
        }
    return -1;}

}
