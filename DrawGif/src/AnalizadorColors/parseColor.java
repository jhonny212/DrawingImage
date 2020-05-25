
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun May 24 20:35:24 CST 2020
//----------------------------------------------------

package AnalizadorColors;

import static AnalizadorColors.parseColor.clr;
import static AnalizadorColors.parseColor.coloreslist;
import static AnalizadorColors.parseColor.erroresSemanticos;
import static AnalizadorColors.parseColor.erroresSintacticos;
import static AnalizadorColors.parseColor.id;
import static AnalizadorColors.parseColor.listado;
import static AnalizadorLienzos.parserLienzo.lienzos;
import drawgif.Errors;
import java.awt.Color;
import java.util.ArrayList;
import java_cup.runtime.Symbol;
/** CUP v0.11a beta 20060608 generated parser.
  * @version Sun May 24 20:35:24 CST 2020
  */
public class parseColor extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parseColor() {super();}

  /** Constructor which sets the default scanner. */
  public parseColor(java_cup.runtime.Scanner s) {super(s);
  erroresSintacticos = new ArrayList<>();
        erroresSemanticos = new ArrayList<>();
        coloreslist = new ArrayList<>();
        listado = new ArrayList<>();
  }

  /** Constructor which sets the default scanner. */
  public parseColor(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\043\000\002\002\004\000\002\002\012\000\002\002" +
    "\013\000\002\002\012\000\002\002\011\000\002\002\010" +
    "\000\002\002\006\000\002\002\005\000\002\003\010\000" +
    "\002\003\011\000\002\003\010\000\002\003\007\000\002" +
    "\003\004\000\002\004\004\000\002\004\002\000\002\004" +
    "\005\000\002\005\007\000\002\005\010\000\002\005\007" +
    "\000\002\005\006\000\002\005\005\000\002\006\005\000" +
    "\002\006\002\000\002\006\005\000\002\007\015\000\002" +
    "\007\005\000\002\007\016\000\002\007\015\000\002\007" +
    "\010\000\002\007\007\000\002\007\006\000\002\007\005" +
    "\000\002\010\003\000\002\010\003\000\002\010\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\220\000\006\003\005\004\006\001\002\000\004\002" +
    "\222\001\002\000\016\003\013\004\167\005\170\006\166" +
    "\007\164\020\012\001\002\000\004\007\007\001\002\000" +
    "\004\006\010\001\002\000\004\004\011\001\002\000\006" +
    "\003\013\020\012\001\002\000\004\006\157\001\002\000" +
    "\012\004\026\005\030\006\027\020\025\001\002\000\010" +
    "\003\015\005\ufff3\010\016\001\002\000\004\010\023\001" +
    "\002\000\006\003\013\020\012\001\002\000\004\005\020" +
    "\001\002\000\004\005\021\001\002\000\004\002\000\001" +
    "\002\000\004\005\ufff4\001\002\000\006\003\013\020\012" +
    "\001\002\000\004\005\ufff2\001\002\000\004\006\152\001" +
    "\002\000\006\003\033\020\032\001\002\000\004\004\031" +
    "\001\002\000\010\003\ufff5\005\ufff5\010\ufff5\001\002\000" +
    "\006\003\033\020\032\001\002\000\004\006\143\001\002" +
    "\000\022\003\052\004\051\006\056\011\045\012\046\013" +
    "\055\014\050\020\047\001\002\000\010\003\036\005\uffeb" +
    "\010\037\001\002\000\004\005\044\001\002\000\004\010" +
    "\042\001\002\000\006\003\033\020\032\001\002\000\010" +
    "\003\036\005\uffeb\010\037\001\002\000\004\005\uffec\001" +
    "\002\000\006\003\033\020\032\001\002\000\004\005\uffea" +
    "\001\002\000\010\003\ufff7\005\ufff7\010\ufff7\001\002\000" +
    "\004\006\uffe1\001\002\000\004\006\uffdf\001\002\000\004" +
    "\006\137\001\002\000\004\006\135\001\002\000\014\003" +
    "\052\011\045\012\046\013\055\014\050\001\002\000\016" +
    "\006\100\010\077\011\045\012\046\013\055\017\075\001" +
    "\002\000\004\005\074\001\002\000\004\006\062\001\002" +
    "\000\004\006\uffe0\001\002\000\004\004\057\001\002\000" +
    "\014\003\052\011\045\012\046\013\055\014\050\001\002" +
    "\000\004\005\061\001\002\000\010\003\uffef\005\uffef\010" +
    "\uffef\001\002\000\004\017\063\001\002\000\004\010\064" +
    "\001\002\000\010\011\045\012\046\013\055\001\002\000" +
    "\004\006\066\001\002\000\004\017\067\001\002\000\004" +
    "\010\070\001\002\000\010\011\045\012\046\013\055\001" +
    "\002\000\004\006\072\001\002\000\004\017\073\001\002" +
    "\000\004\005\uffe9\001\002\000\010\003\uffed\005\uffed\010" +
    "\uffed\001\002\000\004\010\127\001\002\000\004\006\115" +
    "\001\002\000\010\011\045\012\046\013\055\001\002\000" +
    "\004\017\101\001\002\000\006\005\uffe2\010\102\001\002" +
    "\000\010\011\045\012\046\013\055\001\002\000\004\006" +
    "\104\001\002\000\004\017\105\001\002\000\004\010\106" +
    "\001\002\000\010\011\045\012\046\013\055\001\002\000" +
    "\004\006\110\001\002\000\004\017\111\001\002\000\004" +
    "\005\uffe6\001\002\000\004\006\113\001\002\000\004\017" +
    "\114\001\002\000\004\005\uffe4\001\002\000\004\017\116" +
    "\001\002\000\006\005\uffe3\010\117\001\002\000\010\011" +
    "\045\012\046\013\055\001\002\000\004\006\121\001\002" +
    "\000\004\017\122\001\002\000\004\010\123\001\002\000" +
    "\010\011\045\012\046\013\055\001\002\000\004\006\125" +
    "\001\002\000\004\017\126\001\002\000\004\005\uffe7\001" +
    "\002\000\010\011\045\012\046\013\055\001\002\000\004" +
    "\006\131\001\002\000\004\017\132\001\002\000\004\005" +
    "\uffe5\001\002\000\004\005\134\001\002\000\010\003\uffee" +
    "\005\uffee\010\uffee\001\002\000\004\015\136\001\002\000" +
    "\004\005\uffe8\001\002\000\004\004\140\001\002\000\014" +
    "\003\052\011\045\012\046\013\055\014\050\001\002\000" +
    "\004\005\142\001\002\000\010\003\ufff0\005\ufff0\010\ufff0" +
    "\001\002\000\004\004\144\001\002\000\014\003\052\011" +
    "\045\012\046\013\055\014\050\001\002\000\004\005\146" +
    "\001\002\000\010\003\ufff1\005\ufff1\010\ufff1\001\002\000" +
    "\010\003\036\005\uffeb\010\037\001\002\000\004\005\151" +
    "\001\002\000\010\003\ufff6\005\ufff6\010\ufff6\001\002\000" +
    "\004\004\153\001\002\000\006\003\033\020\032\001\002" +
    "\000\010\003\036\005\uffeb\010\037\001\002\000\004\005" +
    "\156\001\002\000\010\003\ufff8\005\ufff8\010\ufff8\001\002" +
    "\000\004\004\160\001\002\000\006\003\033\020\032\001" +
    "\002\000\010\003\036\005\uffeb\010\037\001\002\000\004" +
    "\005\163\001\002\000\010\003\ufff9\005\ufff9\010\ufff9\001" +
    "\002\000\004\006\214\001\002\000\004\005\212\001\002" +
    "\000\004\004\205\001\002\000\010\003\013\007\172\020" +
    "\012\001\002\000\004\005\171\001\002\000\004\002\ufffa" +
    "\001\002\000\004\006\177\001\002\000\010\003\015\005" +
    "\ufff3\010\016\001\002\000\004\005\175\001\002\000\004" +
    "\005\176\001\002\000\004\002\ufffc\001\002\000\004\004" +
    "\200\001\002\000\006\003\013\020\012\001\002\000\010" +
    "\003\015\005\ufff3\010\016\001\002\000\004\005\203\001" +
    "\002\000\004\005\204\001\002\000\004\002\uffff\001\002" +
    "\000\006\003\013\020\012\001\002\000\010\003\015\005" +
    "\ufff3\010\016\001\002\000\004\005\210\001\002\000\004" +
    "\005\211\001\002\000\004\002\ufffd\001\002\000\004\005" +
    "\213\001\002\000\004\002\ufffb\001\002\000\004\004\215" +
    "\001\002\000\006\003\013\020\012\001\002\000\010\003" +
    "\015\005\ufff3\010\016\001\002\000\004\005\220\001\002" +
    "\000\004\005\221\001\002\000\004\002\ufffe\001\002\000" +
    "\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\220\000\004\002\003\001\001\000\002\001\001\000" +
    "\004\003\164\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\003\013\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\016\001\001\000\002" +
    "\001\001\000\004\003\021\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\003\023\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\005\146\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\005\033\001\001\000\002\001\001\000\006\007" +
    "\052\010\053\001\001\000\004\006\034\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\005\037\001\001\000" +
    "\004\006\040\001\001\000\002\001\001\000\004\005\042" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\007\132\010\053\001\001\000\004\010\075\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\007\057\010\053\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\010\064\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\010\070\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\010\111\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\010\102\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\010\106\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\010\117\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\010\123\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\010\127\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\007\140\010\053\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\007\144\010\053\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\006\147" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\005\153\001\001\000\004\006\154\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\005\160\001\001\000\004\006\161\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\003\172\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\004" +
    "\173\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\003\200\001\001\000" +
    "\004\004\201\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\003\205\001\001\000\004\004" +
    "\206\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\003\215\001\001\000\004\004\216\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parseColor$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parseColor$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parseColor$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



   public static String id,colorHex,lz;
   public static Color clr;
   public static int red,green,blue;

public static ArrayList<Errors> erroresSemanticos;
public static ArrayList<Errors> erroresSintacticos;
public static ArrayList<Colores> coloreslist;

   public static ArrayList<ContentColor> listado;

   public void syntax_error(Symbol s){
       System.out.println("Error R de sintaxis: "+ s.value +" Linea "+(s.left+1)+" columna "+(s.right+1) );
    erroresSintacticos.add(new Errors((String)s.value,"",-1,s.left,s.right));
   
    }
  @Override
    public void unrecovered_syntax_error(Symbol s){
    System.out.println("La Cadena:" +s.value+" en la Linea:"+(s.right+1) +" ,Columna: "+s.left+"esta fuera de contexto." );
    erroresSintacticos.add(new Errors((String)s.value,"",-1,s.left,s.right));
   
 }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parseColor$actions {
  private final parseColor parser;

  /** Constructor */
  CUP$parseColor$actions(parseColor parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parseColor$do_action(
    int                        CUP$parseColor$act_num,
    java_cup.runtime.lr_parser CUP$parseColor$parser,
    java.util.Stack            CUP$parseColor$stack,
    int                        CUP$parseColor$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parseColor$result;

      /* select the action based on the action number */
      switch (CUP$parseColor$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // K ::= Azul 
            {
              Object RESULT =null;
		RESULT=3;
              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("K",6, ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // K ::= Verde 
            {
              Object RESULT =null;
		RESULT=2;
              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("K",6, ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // K ::= Rojo 
            {
              Object RESULT =null;
		RESULT=1;
              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("K",6, ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // COLORS ::= error dosPuntos Numero 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("COLORS",5, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-2)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // COLORS ::= error K dosPuntos Numero 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("COLORS",5, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-3)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // COLORS ::= error coma K dosPuntos Numero 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("COLORS",5, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-4)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // COLORS ::= error Numero coma K dosPuntos Numero 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("COLORS",5, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-5)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // COLORS ::= error dosPuntos Numero coma K dosPuntos Numero coma K dosPuntos Numero 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("COLORS",5, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-10)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // COLORS ::= error K dosPuntos Numero coma K dosPuntos Numero coma K dosPuntos Numero 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("COLORS",5, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-11)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // COLORS ::= Hex dosPuntos Letter 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parseColor$stack.peek()).value;
		
Color clrtmp=new Color(0,0,0);
clr.decode((String)e);
RESULT=clrtmp;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("COLORS",5, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-2)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // COLORS ::= K dosPuntos Numero coma K dosPuntos Numero coma K dosPuntos Numero 
            {
              Object RESULT =null;
		int c1left = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-10)).left;
		int c1right = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-10)).right;
		Object c1 = (Object)((java_cup.runtime.Symbol) CUP$parseColor$stack.elementAt(CUP$parseColor$top-10)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-8)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-8)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parseColor$stack.elementAt(CUP$parseColor$top-8)).value;
		int c2left = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-6)).left;
		int c2right = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-6)).right;
		Object c2 = (Object)((java_cup.runtime.Symbol) CUP$parseColor$stack.elementAt(CUP$parseColor$top-6)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-4)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-4)).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parseColor$stack.elementAt(CUP$parseColor$top-4)).value;
		int c3left = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-2)).left;
		int c3right = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-2)).right;
		Object c3 = (Object)((java_cup.runtime.Symbol) CUP$parseColor$stack.elementAt(CUP$parseColor$top-2)).value;
		int e3left = ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()).left;
		int e3right = ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()).right;
		Object e3 = (Object)((java_cup.runtime.Symbol) CUP$parseColor$stack.peek()).value;
		
int x1=(int)c1;
int x2=(int)c2;
int x3=(int)c3;
int red=0,blue=0,green=0;
int d1=Integer.parseInt((String)e1);
int d2=Integer.parseInt((String)e2);
int d3=Integer.parseInt((String)e3);
if((x1+x2+x3)==6){
switch(x1){
case 1:
red=d1;
break;
case 2:
green=d1;
break;
case 3:
blue=d1;
break;
}
switch(x2){
case 1:
red=d2;
break;
case 2:
green=d2;
break;
case 3:
blue=d2;
break;
}
switch(x3){
case 1:
red=d3;
break;
case 2:
green=d3;
break;
case 3:
blue=d3;
break;
}
RESULT=new Color(red,green,blue);
}
if(x1==x2){
erroresSintacticos.add(new Errors("Color verde, se repite","Se repite la propiedad",-1,c2left,c2right));
} if(x1==x3){
erroresSintacticos.add(new Errors("Color azul, se repite","Se repite la propiedad",-1,c3left,c3right));
} if(x2==x3){
erroresSintacticos.add(new Errors("Color azul, se repite","Se repite la propiedad",-1,c3left,c3right));
} 

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("COLORS",5, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-10)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // J ::= error coma H 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("J",4, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-2)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // J ::= 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("J",4, ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // J ::= coma H J 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("J",4, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-2)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // H ::= error COLORS cierraLlaves 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("H",3, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-2)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // H ::= error abreLlaves COLORS cierraLlaves 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("H",3, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-3)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // H ::= error dosPuntos abreLlaves COLORS cierraLlaves 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("H",3, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-4)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // H ::= error Id dosPuntos abreLlaves COLORS cierraLlaves 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("H",3, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-5)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // H ::= Id dosPuntos abreLlaves COLORS cierraLlaves 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-4)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-4)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parseColor$stack.elementAt(CUP$parseColor$top-4)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-1)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parseColor$stack.elementAt(CUP$parseColor$top-1)).value;
		

String id_=(String)e;
                
for (int i = 0; i < coloreslist.size(); i++) {
    System.out.println("Analizando"+id_+" con "+coloreslist.get(i).nombre);
                    if(id_.equals(coloreslist.get(i).nombre)){
                      erroresSemanticos.add(new Errors(id_, "Identificador existente",0, eleft, eright));  
                    }
                }

 coloreslist.add(new Colores(id_, (Color) e1));

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("H",3, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-4)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // F ::= error coma DATOS 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("F",2, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-2)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // F ::= 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("F",2, ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // F ::= coma DATOS 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("F",2, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-1)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // DATOS ::= error cierraLlaves 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("DATOS",1, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-1)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // DATOS ::= error abreLlaves H J cierraLlaves 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("DATOS",1, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-4)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // DATOS ::= error dosPuntos abreLlaves H J cierraLlaves 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("DATOS",1, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-5)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // DATOS ::= error Id dosPuntos abreLlaves H J cierraLlaves 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("DATOS",1, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-6)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // DATOS ::= Id dosPuntos abreLlaves H J cierraLlaves 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-5)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-5)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parseColor$stack.elementAt(CUP$parseColor$top-5)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-2)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-2)).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parseColor$stack.elementAt(CUP$parseColor$top-2)).value;
		
id=(String)e;
boolean v=false;
                for (int i = 0; i < lienzos.size(); i++) {
                    if(lienzos.get(i).equals(id)){
                        v=true;
                        break;
                    }
                    
                }
if(v){
  erroresSemanticos.add(new Errors(id, "Identificador no existente en lienzos",0, eleft, eright));  
}else{
  listado.add(new ContentColor(coloreslist, id));

                
}
coloreslist = new ArrayList();


              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("DATOS",1, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-5)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // A ::= error cierraLlaves cierraLlaves 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("A",0, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-2)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // A ::= error DATOS cierraLlaves cierraLlaves 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("A",0, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-3)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // A ::= error abreLlaves DATOS F cierraLlaves cierraLlaves 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("A",0, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-5)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // A ::= error dosPuntos abreLlaves DATOS F cierraLlaves cierraLlaves 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("A",0, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-6)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // A ::= error Colores dosPuntos abreLlaves DATOS F cierraLlaves cierraLlaves 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("A",0, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-7)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // A ::= error abreLlaves Colores dosPuntos abreLlaves DATOS F cierraLlaves cierraLlaves 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("A",0, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-8)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // A ::= abreLlaves Colores dosPuntos abreLlaves DATOS F cierraLlaves cierraLlaves 
            {
              Object RESULT =null;

              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("A",0, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-7)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          return CUP$parseColor$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= A EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parseColor$stack.elementAt(CUP$parseColor$top-1)).value;
		RESULT = start_val;
              CUP$parseColor$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parseColor$stack.elementAt(CUP$parseColor$top-1)), ((java_cup.runtime.Symbol)CUP$parseColor$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parseColor$parser.done_parsing();
          return CUP$parseColor$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

