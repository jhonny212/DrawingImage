package AnalizadorPnt;
import java_cup.runtime.Symbol;
%%
%class lexicoPnt
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
symbols=[$#]
guionBajo=[_]
barra= "/"
Comentario=[*+-/{}?¿'\"[]()<>=!¡]
%{
    private Symbol symbol(int type, Object value) {
       
        return new Symbol(type, yyline+1, yycolumn+1, value);
    }
%}
%%
<YYINITIAL>{
".."                                                                        {
return symbol(sym.Punto,new String(yytext()));}
(({barra})({barra}))(({numero})
|({barra})
|({letra})
|({symbols})
|({guionBajo})
|({Comentario})
|(" ")
|("\"")
|("“")
|("”")
)*  
{  System.out.println("ENTRO EN UN COMENTARIO?"); }

(("/*"))(({numero})
|({barra})
|({letra})
|({symbols})
|({guionBajo})
|({Comentario})
|(" ")
|("\"")
|("“")
|("”")
|("\n")
|("\t")
|("*")
)*
("*/")  
{  System.out.println("ENTRO EN UN COMENTARIO?"); }


"INSTRUCCIONES"                                                              {return symbol(sym.Inst,new String(yytext()));}
"if"                                                                         {return symbol(sym.If,new String(yytext()));}
"else"                                                                       {return symbol(sym.Else,new String(yytext()));}
"while"                                                                      {return symbol(sym.While,new String(yytext()));}
"PINTAR"                                                                     {return symbol(sym.pintar,new String(yytext()));}
"("                                                                          {return symbol(sym.abreParen,new String(yytext()));}
")"                                                                          {return symbol(sym.cierraParen,new String(yytext()));}
"["                                                                          {return symbol(sym.abreCor,new String(yytext()));}
"]"                                                                          {return symbol(sym.cierraCor,new String(yytext()));}
("\"")|("“")|("”")                                                                        {return symbol(sym.COM,new String(yytext()));}
"{"                                                                          {return symbol(sym.abreLlaves,new String(yytext()));}
"}"                                                                          {return symbol(sym.cierraLlaves,new String(yytext()));}
","                                                                          {return symbol(sym.coma,new String(yytext()));}
";"                                                                          {return symbol(sym.puntoComa,new String(yytext()));}
"VARS"                                                                       {return symbol(sym.Vars,new String(yytext()));}
"int"                                                                        {return symbol(sym.Int,new String(yytext()));}
"String"                                                                     {return symbol(sym.String,new String(yytext()));}
"boolean"                                                                    {return symbol(sym.Boolean,new String(yytext()));}
("true")|("false")                                                           {return symbol(sym.Bool,new String(yytext()));}
"+"                                                                          {return symbol(sym.Sum,new String(yytext()));}
"-"                                                                          {return symbol(sym.Res,new String(yytext()));}
"*"                                                                          {return symbol(sym.Mul,new String(yytext()));}
"/"                                                                          {return symbol(sym.Div,new String(yytext()));}
"="                                                                          {return symbol(sym.equals,new String(yytext()));}
("==")|("<")|("<=")|(">")|(">=")|("<>")                                              {return symbol(sym.Operador,new String(yytext()));}
("AND")                                                                {return symbol(sym.And,new String(yytext()));}
("OR")                                                                {return symbol(sym.Or,new String(yytext()));}
(({numero})+)(".")(({numero})+)                                              {return symbol(sym.Double,new String(yytext()));}    
(({numero})+)                                                                {return symbol(sym.Num,new String(yytext()));}    
((({letra})|({guionBajo})|({numero}))+)                                       {return symbol(sym.Id,new String(yytext()));}    
(((({letra})|({guionBajo})|({symbols})|({numero}))*))  
{return symbol(sym.Cadena,new String(yytext()));} 
("\n")|("\t")|(" ")                                                          {}
.                                                                            {return symbol(sym.Error,new String(yytext()));}    

}
/*
(((({letra})|({guionBajo})|({symbols})|({numero}))*))  
*/