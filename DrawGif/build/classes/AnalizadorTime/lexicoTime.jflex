package AnalizadorTime;
import java_cup.runtime.Symbol;
%%
%class lexicoTime
%cup
%cupdebug
%line
%column
%full
%char
%public
/*Identifiers*/

numero=[0-9]
letra=[a-zA-Z]
guionBajo=[_]


%{
ArrayList<Error> erroresLexico;
    private Symbol symbol(int type, Object value) {
       
        return new Symbol(type, yyline+1, yycolumn+1, value);
    }
%}
%%
<YYINITIAL>{
("\"")|("“")|("”")                                                                         {return symbol(sym.COM,new String(yytext()));}
"{"                                                                          {return symbol(sym.abreLlaves,new String(yytext()));}
"}"                                                                          {return symbol(sym.cierraLlaves,new String(yytext()));}
"["                                                                          {return symbol(sym.abreCor,new String(yytext()));}
"]"                                                                          {return symbol(sym.cierraCor,new String(yytext()));}
":"                                                                          {return symbol(sym.dosPuntos,new String(yytext()));}
"TIEMPOS"                                                                    {return symbol(sym.Time,new String(yytext()));}
"id"                                                                         {return symbol(sym.Iden,new String(yytext()));}

","                                                                          {return symbol(sym.coma,new String(yytext()));}
"inicio"                                                                     {return symbol(sym.Start,new String(yytext()));}
"fin"                                                                        {return symbol(sym.End,new String(yytext()));}
"duracion"                                                                   {return symbol(sym.Duracion,new String(yytext()));}
"imagenes"                                                                   {return symbol(sym.Image,new String(yytext()));}
(({numero})+)                                                                {return symbol(sym.Numero,new String(yytext()));}    
((({letra})|({guionBajo})|({numero}))+)                                      {return symbol(sym.Id,new String(yytext()));}    
("\n")|("\t")|(" ")                                                          {}
.                                                                            {
erroresLexico.add(new Errors(yytext(),"",sym.Error,yyline,yycolumn));
return symbol(sym.Error,new String(yytext()));}    

}

