//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri May 08 17:47:36 CST 2020
//----------------------------------------------------
package AnalizadorTime;

import static AnalizadorLienzos.parserLienzo.lienzos;
import static AnalizadorTime.parserTime.end;
import static AnalizadorTime.parserTime.erroresSemanticos;
import static AnalizadorTime.parserTime.erroresSintacticos;
import static AnalizadorTime.parserTime.id;
import static AnalizadorTime.parserTime.inic;
import static AnalizadorTime.parserTime.list;
import static AnalizadorTime.parserTime.listTime;
import drawgif.Errors;
import java.util.ArrayList;
import java_cup.runtime.Symbol;

/**
 * CUP v0.11a beta 20060608 generated parser.
 *
 * @version Fri May 08 17:47:36 CST 2020
 */
public class parserTime extends java_cup.runtime.lr_parser {

    /**
     * Default constructor.
     */
    public parserTime() {
        super();
    }

    /**
     * Constructor which sets the default scanner.
     */
    public parserTime(java_cup.runtime.Scanner s) {
        super(s);
        erroresSemanticos = new ArrayList<>();
        erroresSintacticos = new ArrayList<>();
        list = new ArrayList<>();
        listTime = new ArrayList<>();
    }

    /**
     * Constructor which sets the default scanner.
     */
    public parserTime(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {
        super(s, sf);
    }

    /**
     * Production table.
     */
    protected static final short _production_table[][]
            = unpackFromStrings(new String[]{
        "\000\045\000\002\002\004\000\002\002\012\000\002\002"
        + "\013\000\002\002\012\000\002\002\011\000\002\002\010"
        + "\000\002\002\007\000\002\003\007\000\002\003\010\000"
        + "\002\003\007\000\002\003\006\000\002\003\005\000\002"
        + "\004\004\000\002\004\002\000\002\004\005\000\002\005"
        + "\007\000\002\005\010\000\002\005\007\000\002\005\006"
        + "\000\002\005\005\000\002\006\007\000\002\006\007\000"
        + "\002\006\007\000\002\006\007\000\002\006\006\000\002"
        + "\007\005\000\002\007\005\000\002\010\007\000\002\010"
        + "\010\000\002\010\007\000\002\011\005\000\002\011\006"
        + "\000\002\011\005\000\002\012\005\000\002\012\006\000"
        + "\002\013\005\000\002\013\003"});

    /**
     * Access to production table.
     */
    public short[][] production_table() {
        return _production_table;
    }

    /**
     * Parse-action table.
     */
    protected static final short[][] _action_table
            = unpackFromStrings(new String[]{
        "\000\223\000\006\003\005\004\006\001\002\000\004\002"
        + "\225\001\002\000\014\003\013\004\173\006\172\007\170"
        + "\013\012\001\002\000\004\007\007\001\002\000\004\006"
        + "\010\001\002\000\004\004\011\001\002\000\006\003\013"
        + "\013\012\001\002\000\004\006\164\001\002\000\020\003"
        + "\033\004\032\006\035\010\034\011\031\013\027\022\026"
        + "\001\002\000\010\003\015\005\ufff4\020\016\001\002\000"
        + "\004\020\023\001\002\000\006\003\013\013\012\001\002"
        + "\000\004\005\020\001\002\000\004\005\021\001\002\000"
        + "\004\002\000\001\002\000\004\005\ufff5\001\002\000\006"
        + "\003\013\013\012\001\002\000\004\005\ufff3\001\002\000"
        + "\004\005\163\001\002\000\004\006\157\001\002\000\004"
        + "\006\153\001\002\000\004\020\147\001\002\000\004\006"
        + "\143\001\002\000\012\003\033\010\034\011\031\022\026"
        + "\001\002\000\020\003\047\006\051\010\034\011\031\016"
        + "\046\020\050\022\026\001\002\000\004\006\041\001\002"
        + "\000\004\004\036\001\002\000\012\003\033\010\034\011"
        + "\031\022\026\001\002\000\004\005\040\001\002\000\010"
        + "\003\ufff8\005\ufff8\020\ufff8\001\002\000\004\024\042\001"
        + "\002\000\004\013\043\001\002\000\004\024\044\001\002"
        + "\000\006\005\uffed\020\uffed\001\002\000\004\020\135\001"
        + "\002\000\006\003\060\004\061\001\002\000\006\006\051"
        + "\016\046\001\002\000\012\003\047\010\034\011\031\022"
        + "\026\001\002\000\004\024\052\001\002\000\004\013\053"
        + "\001\002\000\004\024\054\001\002\000\006\005\uffea\020"
        + "\uffea\001\002\000\006\005\uffee\020\056\001\002\000\012"
        + "\003\047\010\034\011\031\022\026\001\002\000\004\005"
        + "\ufff0\001\002\000\004\004\132\001\002\000\010\003\073"
        + "\021\074\023\070\001\002\000\006\017\064\020\065\001"
        + "\002\000\006\005\uffe9\020\uffe9\001\002\000\006\005\uffdd"
        + "\020\uffdd\001\002\000\006\003\060\004\061\001\002\000"
        + "\006\017\064\020\065\001\002\000\006\005\uffde\020\uffde"
        + "\001\002\000\004\006\126\001\002\000\004\020\122\001"
        + "\002\000\004\005\121\001\002\000\010\006\115\021\114"
        + "\023\101\001\002\000\004\006\112\001\002\000\004\020"
        + "\076\001\002\000\006\003\100\023\070\001\002\000\004"
        + "\005\uffe7\001\002\000\006\006\102\023\101\001\002\000"
        + "\004\006\106\001\002\000\004\024\103\001\002\000\004"
        + "\013\104\001\002\000\004\024\105\001\002\000\006\005"
        + "\uffe4\020\uffe4\001\002\000\004\024\107\001\002\000\004"
        + "\013\110\001\002\000\004\024\111\001\002\000\006\005"
        + "\uffe5\020\uffe5\001\002\000\004\012\113\001\002\000\006"
        + "\005\uffe3\020\uffe3\001\002\000\004\006\117\001\002\000"
        + "\006\012\116\024\103\001\002\000\006\005\uffe1\020\uffe1"
        + "\001\002\000\004\012\120\001\002\000\006\005\uffe2\020"
        + "\uffe2\001\002\000\006\017\uffe0\020\uffe0\001\002\000\006"
        + "\003\123\021\074\001\002\000\006\006\125\021\114\001"
        + "\002\000\004\005\uffe8\001\002\000\004\012\116\001\002"
        + "\000\004\024\127\001\002\000\004\013\130\001\002\000"
        + "\004\024\131\001\002\000\006\005\uffe6\020\uffe6\001\002"
        + "\000\010\003\073\021\074\023\070\001\002\000\004\005"
        + "\134\001\002\000\006\017\uffdf\020\uffdf\001\002\000\012"
        + "\003\047\010\034\011\031\022\026\001\002\000\006\005"
        + "\uffef\020\137\001\002\000\012\003\047\010\034\011\031"
        + "\022\026\001\002\000\004\005\ufff1\001\002\000\004\005"
        + "\142\001\002\000\010\003\ufff7\005\ufff7\020\ufff7\001\002"
        + "\000\004\024\144\001\002\000\004\013\145\001\002\000"
        + "\004\024\146\001\002\000\006\005\uffec\020\uffec\001\002"
        + "\000\012\003\047\010\034\011\031\022\026\001\002\000"
        + "\004\020\151\001\002\000\012\003\047\010\034\011\031"
        + "\022\026\001\002\000\004\005\ufff2\001\002\000\004\004"
        + "\154\001\002\000\012\003\033\010\034\011\031\022\026"
        + "\001\002\000\004\005\156\001\002\000\010\003\ufff9\005"
        + "\ufff9\020\ufff9\001\002\000\004\016\160\001\002\000\006"
        + "\003\060\004\061\001\002\000\006\017\064\020\065\001"
        + "\002\000\006\005\uffeb\020\uffeb\001\002\000\010\003\ufff6"
        + "\005\ufff6\020\ufff6\001\002\000\004\004\165\001\002\000"
        + "\012\003\033\010\034\011\031\022\026\001\002\000\004"
        + "\005\167\001\002\000\010\003\ufffa\005\ufffa\020\ufffa\001"
        + "\002\000\004\006\217\001\002\000\010\003\015\005\ufff4"
        + "\020\016\001\002\000\004\004\207\001\002\000\010\003"
        + "\013\007\174\013\012\001\002\000\004\006\201\001\002"
        + "\000\010\003\015\005\ufff4\020\016\001\002\000\004\005"
        + "\177\001\002\000\004\005\200\001\002\000\004\002\ufffc"
        + "\001\002\000\004\004\202\001\002\000\006\003\013\013"
        + "\012\001\002\000\010\003\015\005\ufff4\020\016\001\002"
        + "\000\004\005\205\001\002\000\004\005\206\001\002\000"
        + "\004\002\uffff\001\002\000\006\003\013\013\012\001\002"
        + "\000\010\003\015\005\ufff4\020\016\001\002\000\004\005"
        + "\212\001\002\000\004\005\213\001\002\000\004\002\ufffd"
        + "\001\002\000\004\005\215\001\002\000\004\005\216\001"
        + "\002\000\004\002\ufffb\001\002\000\004\004\220\001\002"
        + "\000\006\003\013\013\012\001\002\000\010\003\015\005"
        + "\ufff4\020\016\001\002\000\004\005\223\001\002\000\004"
        + "\005\224\001\002\000\004\002\ufffe\001\002\000\004\002"
        + "\001\001\002"});

    /**
     * Access to parse-action table.
     */
    public short[][] action_table() {
        return _action_table;
    }

    /** <code>reduce_goto</code> table.
     */
    protected static final short[][] _reduce_table
            = unpackFromStrings(new String[]{
        "\000\223\000\004\002\003\001\001\000\002\001\001\000"
        + "\004\003\170\001\001\000\002\001\001\000\002\001\001"
        + "\000\002\001\001\000\004\003\013\001\001\000\002\001"
        + "\001\000\006\005\024\006\027\001\001\000\004\004\016"
        + "\001\001\000\002\001\001\000\004\003\021\001\001\000"
        + "\002\001\001\000\002\001\001\000\002\001\001\000\002"
        + "\001\001\000\004\003\023\001\001\000\002\001\001\000"
        + "\002\001\001\000\002\001\001\000\002\001\001\000\002"
        + "\001\001\000\002\001\001\000\006\005\140\006\027\001"
        + "\001\000\004\006\044\001\001\000\002\001\001\000\002"
        + "\001\001\000\006\005\036\006\027\001\001\000\002\001"
        + "\001\000\002\001\001\000\002\001\001\000\002\001\001"
        + "\000\002\001\001\000\002\001\001\000\002\001\001\000"
        + "\004\012\061\001\001\000\002\001\001\000\004\006\054"
        + "\001\001\000\002\001\001\000\002\001\001\000\002\001"
        + "\001\000\002\001\001\000\002\001\001\000\004\006\056"
        + "\001\001\000\002\001\001\000\002\001\001\000\010\007"
        + "\071\010\070\011\074\001\001\000\004\013\062\001\001"
        + "\000\002\001\001\000\002\001\001\000\004\012\065\001"
        + "\001\000\004\013\066\001\001\000\002\001\001\000\002"
        + "\001\001\000\002\001\001\000\002\001\001\000\002\001"
        + "\001\000\002\001\001\000\002\001\001\000\004\010\076"
        + "\001\001\000\002\001\001\000\002\001\001\000\002\001"
        + "\001\000\002\001\001\000\002\001\001\000\002\001\001"
        + "\000\002\001\001\000\002\001\001\000\002\001\001\000"
        + "\002\001\001\000\002\001\001\000\002\001\001\000\002"
        + "\001\001\000\002\001\001\000\002\001\001\000\002\001"
        + "\001\000\002\001\001\000\002\001\001\000\002\001\001"
        + "\000\004\011\123\001\001\000\002\001\001\000\002\001"
        + "\001\000\002\001\001\000\002\001\001\000\002\001\001"
        + "\000\002\001\001\000\002\001\001\000\010\007\132\010"
        + "\070\011\074\001\001\000\002\001\001\000\002\001\001"
        + "\000\004\006\135\001\001\000\002\001\001\000\004\006"
        + "\137\001\001\000\002\001\001\000\002\001\001\000\002"
        + "\001\001\000\002\001\001\000\002\001\001\000\002\001"
        + "\001\000\002\001\001\000\004\006\147\001\001\000\002"
        + "\001\001\000\004\006\151\001\001\000\002\001\001\000"
        + "\002\001\001\000\006\005\154\006\027\001\001\000\002"
        + "\001\001\000\002\001\001\000\002\001\001\000\004\012"
        + "\160\001\001\000\004\013\161\001\001\000\002\001\001"
        + "\000\002\001\001\000\002\001\001\000\006\005\165\006"
        + "\027\001\001\000\002\001\001\000\002\001\001\000\002"
        + "\001\001\000\004\004\213\001\001\000\002\001\001\000"
        + "\004\003\174\001\001\000\002\001\001\000\004\004\175"
        + "\001\001\000\002\001\001\000\002\001\001\000\002\001"
        + "\001\000\002\001\001\000\004\003\202\001\001\000\004"
        + "\004\203\001\001\000\002\001\001\000\002\001\001\000"
        + "\002\001\001\000\004\003\207\001\001\000\004\004\210"
        + "\001\001\000\002\001\001\000\002\001\001\000\002\001"
        + "\001\000\002\001\001\000\002\001\001\000\002\001\001"
        + "\000\002\001\001\000\004\003\220\001\001\000\004\004"
        + "\221\001\001\000\002\001\001\000\002\001\001\000\002"
        + "\001\001\000\002\001\001"});

    /**
     * Access to <code>reduce_goto</code> table.
     */
    public short[][] reduce_table() {
        return _reduce_table;
    }

    /**
     * Instance of action encapsulation class.
     */
    protected CUP$parserTime$actions action_obj;

    /**
     * Action encapsulation object initializer.
     */
    protected void init_actions() {
        action_obj = new CUP$parserTime$actions(this);
    }

    /**
     * Invoke a user supplied parse action.
     */
    public java_cup.runtime.Symbol do_action(
            int act_num,
            java_cup.runtime.lr_parser parser,
            java.util.Stack stack,
            int top)
            throws java.lang.Exception {
        /* call code in generated class */
        return action_obj.CUP$parserTime$do_action(act_num, parser, stack, top);
    }

    /**
     * Indicates start state.
     */
    public int start_state() {
        return 0;
    }

    /**
     * Indicates start production.
     */
    public int start_production() {
        return 0;
    }

    /** <code>EOF</code> Symbol index.
     */
    public int EOF_sym() {
        return 0;
    }

    /** <code>error</code> Symbol index.
     */
    public int error_sym() {
        return 1;
    }

    public static ArrayList<Time> list;
    public static ArrayList<Tiempos> listTime;
    public static String id, lz, inic, end;
    public static int tim;

    public static ArrayList<Errors> erroresSemanticos;
    public static ArrayList<Errors> erroresSintacticos;

    public void syntax_error(Symbol s) {
        System.out.println("Error R de sintaxis: " + s.value + " Linea " + (s.left + 1) + " columna " + (s.right + 1));
    }

    @Override
    public void unrecovered_syntax_error(Symbol s) {
        System.out.println("La Cadena:" + s.value + " en la Linea:" + (s.right + 1) + " ,Columna: " + s.left + "esta fuera de contexto.");
    }

}

/**
 * Cup generated class to encapsulate user supplied action code.
 */
class CUP$parserTime$actions {

    private final parserTime parser;

    /**
     * Constructor
     */
    CUP$parserTime$actions(parserTime parser) {
        this.parser = parser;
    }

    /**
     * Method with the actual generated action code.
     */
    public final java_cup.runtime.Symbol CUP$parserTime$do_action(
            int CUP$parserTime$act_num,
            java_cup.runtime.lr_parser CUP$parserTime$parser,
            java.util.Stack CUP$parserTime$stack,
            int CUP$parserTime$top)
            throws java.lang.Exception {
        /* Symbol object for return from actions */
        java_cup.runtime.Symbol CUP$parserTime$result;

        /* select the action based on the action number */
        switch (CUP$parserTime$act_num) {
            /*. . . . . . . . . . . . . . . . . . . .*/
            case 36: // J ::= cierraCor 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("J", 9, ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 35: // J ::= coma X J 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("J", 9, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 2)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 34: // X ::= error abreLlaves K cierraLlaves 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("X", 8, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 3)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 33: // X ::= abreLlaves K cierraLlaves 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("X", 8, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 2)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 32: // Z ::= error dosPuntos Numero 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("Z", 7, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 2)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 31: // Z ::= error Duracion dosPuntos Numero 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("Z", 7, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 3)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 30: // Z ::= Duracion dosPuntos Numero 
            {
                Object RESULT = null;
                int eleft = ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()).left;
                int eright = ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()).right;
                Object e = (Object) ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()).value;
                RESULT = e;
                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("Z", 7, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 2)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 29: // W ::= error dosPuntos COM Id COM 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("W", 6, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 4)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 28: // W ::= error Iden dosPuntos COM Id COM 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("W", 6, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 5)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 27: // W ::= Iden dosPuntos COM Id COM 
            {
                Object RESULT = null;
                int eleft = ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 1)).left;
                int eright = ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 1)).right;
                Object e = (Object) ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 1)).value;
                RESULT = e;
                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("W", 6, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 4)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 26: // K ::= Z coma W 
            {
                Object RESULT = null;
                int e2left = ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 2)).left;
                int e2right = ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 2)).right;
                Object e2 = (Object) ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 2)).value;
                int e1left = ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()).left;
                int e1right = ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()).right;
                Object e1 = (Object) ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()).value;

                 String id_ = (String) e1;

                for (int i = 0; i < list.size(); i++) {
                    if (id_.equals(list.get(i).getId())) {
                        erroresSemanticos.add(new Errors(id_, "Identificador existente dentro de la declaracion", 0, e1left, e1right));
                    }
                }
                String v = String.valueOf(e2);
                float fl = Float.parseFloat(v);
                list.add(new Time(id_, fl));

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("K", 5, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 2)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 25: // K ::= W coma Z 
            {
                Object RESULT = null;
                int e1left = ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 2)).left;
                int e1right = ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 2)).right;
                Object e1 = (Object) ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 2)).value;
                int e2left = ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()).left;
                int e2right = ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()).right;
                Object e2 = (Object) ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()).value;

                String id_ = (String) e1;

                for (int i = 0; i < list.size(); i++) {
                    if (id_.equals(list.get(i).getId())) {
                        erroresSemanticos.add(new Errors(id_, "Identificador existente dentro de la declaracion", 0, e1left, e1right));
                    }
                }
                String v = String.valueOf(e2);
                float fl = Float.parseFloat(v);
                list.add(new Time(id_, fl));

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("K", 5, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 2)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 24: // V ::= error abreCor X J 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("V", 4, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 3)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 23: // V ::= error dosPuntos COM Id COM 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("V", 4, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 4)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 22: // V ::= Image dosPuntos abreCor X J 
            {
                Object RESULT = null;
                RESULT = 3;
                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("V", 4, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 4)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 21: // V ::= End dosPuntos COM Id COM 
            {
                Object RESULT = null;
                int eleft = ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 1)).left;
                int eright = ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 1)).right;
                Object e = (Object) ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 1)).value;
                end = (String) e;
                RESULT = 2;
                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("V", 4, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 4)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 20: // V ::= Start dosPuntos COM Id COM 
            {
                Object RESULT = null;
                int eleft = ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 1)).left;
                int eright = ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 1)).right;
                Object e = (Object) ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 1)).value;
                inic = (String) e;
                RESULT = 1;
                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("V", 4, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 4)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 19: // C ::= error coma V 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("C", 3, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 2)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 18: // C ::= error V coma V 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("C", 3, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 3)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 17: // C ::= error coma V coma V 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("C", 3, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 4)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 16: // C ::= error V coma V coma V 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("C", 3, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 5)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 15: // C ::= V coma V coma V 
            {
                Object RESULT = null;
                int e1left = ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 4)).left;
                int e1right = ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 4)).right;
                Object e1 = (Object) ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 4)).value;
                int e2left = ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 2)).left;
                int e2right = ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 2)).right;
                Object e2 = (Object) ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 2)).value;
                int e3left = ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()).left;
                int e3right = ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()).right;
                Object e3 = (Object) ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()).value;

                int x1 = (int) e1;
                int x2 = (int) e2;
                int x3 = (int) e3;
                if (x1 == x2) {
                    erroresSintacticos.add(new Errors("Fin de id, se repite", "Se repite la propiedad", -1, e2left, e2right));
                }
                if (x1 == x3) {
                    erroresSintacticos.add(new Errors("Imagenes, se repite", "Se repite la propiedad", -1, e3left, e3right));
                }
                if (x2 == x3) {
                    erroresSintacticos.add(new Errors("Imagenes, se repite", "Se repite la propiedad", -1, e3left, e3right));
                }

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("C", 3, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 4)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 14: // F ::= error coma DATOS 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("F", 2, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 2)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 13: // F ::= 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("F", 2, ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 12: // F ::= coma DATOS 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("F", 2, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 1)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 11: // DATOS ::= error C cierraLlaves 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("DATOS", 1, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 2)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 10: // DATOS ::= error abreLlaves C cierraLlaves 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("DATOS", 1, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 3)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 9: // DATOS ::= error dosPuntos abreLlaves C cierraLlaves 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("DATOS", 1, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 4)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 8: // DATOS ::= error Id dosPuntos abreLlaves C cierraLlaves 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("DATOS", 1, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 5)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 7: // DATOS ::= Id dosPuntos abreLlaves C cierraLlaves 
            {
                Object RESULT = null;
                int eleft = ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 4)).left;
                int eright = ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 4)).right;
                Object e = (Object) ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 4)).value;

                id = (String) e;
                boolean v = true;
                System.out.println("entro aca");
                try {
                    for (int i = 0; i < lienzos.size(); i++) {
                        if (lienzos.get(i).getId().equals(id)) {
                            v = false;
                            break;
                        }

                    }
                } catch (Exception ex) {
                }

                if (v) {
                    erroresSemanticos.add(new Errors(id, "Identificador no existente en lienzos", 0, eleft, eright));
                }
                /*if(inic.equals(end)){
                    erroresSemanticos.add(new Errors(id, "Los identificadores inicio", 0, eleft, eright));
                
                }*/
         listTime.add(new Tiempos(id,list,inic,end));
list=new ArrayList();
        
                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("DATOS", 1, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 4)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 6: // A ::= error DATOS F cierraLlaves cierraLlaves 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("A", 0, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 4)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 5: // A ::= error abreLlaves DATOS F cierraLlaves cierraLlaves 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("A", 0, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 5)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 4: // A ::= error dosPuntos abreLlaves DATOS F cierraLlaves cierraLlaves 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("A", 0, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 6)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 3: // A ::= error Time dosPuntos abreLlaves DATOS F cierraLlaves cierraLlaves 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("A", 0, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 7)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 2: // A ::= error abreLlaves Time dosPuntos abreLlaves DATOS F cierraLlaves cierraLlaves 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("A", 0, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 8)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 1: // A ::= abreLlaves Time dosPuntos abreLlaves DATOS F cierraLlaves cierraLlaves 
            {
                Object RESULT = null;

                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("A", 0, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 7)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            return CUP$parserTime$result;

            /*. . . . . . . . . . . . . . . . . . . .*/
            case 0: // $START ::= A EOF 
            {
                Object RESULT = null;
                int start_valleft = ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 1)).left;
                int start_valright = ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 1)).right;
                Object start_val = (Object) ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 1)).value;
                RESULT = start_val;
                CUP$parserTime$result = parser.getSymbolFactory().newSymbol("$START", 0, ((java_cup.runtime.Symbol) CUP$parserTime$stack.elementAt(CUP$parserTime$top - 1)), ((java_cup.runtime.Symbol) CUP$parserTime$stack.peek()), RESULT);
            }
            /* ACCEPT */
            CUP$parserTime$parser.done_parsing();
            return CUP$parserTime$result;

            /* . . . . . .*/
            default:
                throw new Exception(
                        "Invalid action number found in internal parse table");

        }
    }
}
