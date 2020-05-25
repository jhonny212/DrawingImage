package AnalizadorColors;
import java_cup.runtime.Symbol;
%%
%class lexicoColor
%cup
%cupdebug
%line
%column
%full
%char
%public
/*Identifiers*/
letraHexa=[A-Fa-f]
numero=[0-9]
letra=[g-zG-Z]
guionBajo=[_]


%{
ArrayList<Error> erroresLexico;
    
    private Symbol symbol(int type, Object value) {
       
        return new Symbol(type, yyline+1, yycolumn+1, value);
    }
%}
%%
<YYINITIAL>{
"{"                                                                          {return symbol(sym.abreLlaves,new String(yytext()));}
"}"                                                                          {return symbol(sym.cierraLlaves,new String(yytext()));}
":"                                                                          {return symbol(sym.dosPuntos,new String(yytext()));}
"COLORES"                                                                    {return symbol(sym.Colores,new String(yytext()));}
","                                                                          {return symbol(sym.coma,new String(yytext()));}
"Red"                                                                        {return symbol(sym.Rojo,new String(yytext()));}
"Blue"                                                                       {return symbol(sym.Azul,new String(yytext()));}
"Green"                                                                      {return symbol(sym.Verde,new String(yytext()));}
("HEX")                                                                      {return symbol(sym.Hex,new String(yytext()));}
("#")(({letraHexa})|({numero}))(({letraHexa})|({numero}))(({letraHexa})|({numero}))(({letraHexa})|({numero}))(({letraHexa})|({numero}))(({letraHexa})|({numero}))
{return symbol(sym.Letter,new String(yytext()));}
(({numero})+)(".")(({numero})+)                                              {return symbol(sym.Double,new String(yytext()));}    
(({numero})+)                                                                {return symbol(sym.Numero,new String(yytext()));}    
((({letra})|({guionBajo})|({letraHexa})|({numero}))+)                        {return symbol(sym.Id,new String(yytext()));}    
("\n")|("\t")|(" ")                                                          {}
.                                                                            {
erroresLexico.add(new Errors(yytext(),"",sym.Error,yyline,yycolumn));
return symbol(sym.Error,new String(yytext()));}    

}

