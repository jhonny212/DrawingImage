package AnalizadorLienzos;
import java_cup.runtime.Symbol;
import java.util.ArrayList;
%%
%class lexicoLienzo
%cup
%cupdebug
%line
%column
%full
%char
%public
/*Identifiers*/
letraHexa=[A-F]
numero=[0-9]
letra=[a-zG-Z]
symbols=[-$#.]
guionBajo=[_]


%{
   ArrayList<Error> erroresLexico;
    private Symbol symbol(int type, Object value) {
       
        return new Symbol(type, yyline+1, yycolumn+1, value);
    }
%}
%%
<YYINITIAL>{
("png")|("gif")                                                              {return symbol(sym.Image,new String(yytext()));}
("\"") |("“")|("”")                                                                          {return symbol(sym.COM,new String(yytext()));}
"{"                                                                          {return symbol(sym.abreLlaves,new String(yytext()));}
"}"                                                                          {return symbol(sym.cierraLlaves,new String(yytext()));}
":"                                                                          {return symbol(sym.dosPuntos,new String(yytext()));}
"LIENZOS"                                                                    {return symbol(sym.Lienzos,new String(yytext()));}
"nombre"                                                                     {return symbol(sym.Nombre,new String(yytext()));}
"tipo"                                                                       {return symbol(sym.type,new String(yytext()));}
"Fondo"                                                                      {return symbol(sym.Fond,new String(yytext()));}
","                                                                          {return symbol(sym.coma,new String(yytext()));}
"tamaño"                                                                     {return symbol(sym.Size,new String(yytext()));}
"Red"                                                                        {return symbol(sym.Rojo,new String(yytext()));}
"Blue"                                                                       {return symbol(sym.Azul,new String(yytext()));}
"Green"                                                                      {return symbol(sym.Verde,new String(yytext()));}
"cuadro"                                                                     {return symbol(sym.Cuadro,new String(yytext()));}
"dimension_x"                                                                 {return symbol(sym.Posx,new String(yytext()));}
"dimension_y"                                                                 {return symbol(sym.Posy,new String(yytext()));}
("HEX")                                                                      {return symbol(sym.Hex,new String(yytext()));}
("#")(({letraHexa})|({numero}))(({letraHexa})|({numero}))(({letraHexa})|({numero}))(({letraHexa})|({numero}))(({letraHexa})|({numero}))(({letraHexa})|({numero}))
{return symbol(sym.Letter,new String(yytext()));}
(({numero})+)(".")(({numero})+)                                              {return symbol(sym.Double,new String(yytext()));}    
(({numero})+)                                                                {return symbol(sym.Numero,new String(yytext()));}    
((({letra})|({guionBajo})|({letraHexa})|({numero}))+)                        {return symbol(sym.Id,new String(yytext()));}    
(((({letra})|({guionBajo})|({letraHexa})|({symbols})|({numero}))*))  
{return symbol(sym.Cadena,new String(yytext()));} 
("\n")|("\t")|(" ")                                               {}
.                                                                 
{
erroresLexico.add(new Errors(yytext(),"",sym.ERROR,yyline,yycolumn));
return symbol(sym.ERROR,new String(yytext()));
}    

}
