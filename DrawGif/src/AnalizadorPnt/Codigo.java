/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizadorPnt;

import drawgif.Fichero;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jhonny
 */
public class Codigo extends Fichero {

    private String paquete, variables, metodos;
    private int methods;

    public Codigo(String contenido) {
        super(contenido);
        methods = 0;
        init();
    }

    private boolean init() {
        lexicoPnt scan = new lexicoPnt(new BufferedReader(new StringReader(contenido)));

        parserPnt parser = new parserPnt(scan);
        parser.Semanticos = new ArrayList<>();
        parser.Sintacticos = new ArrayList<>();
        parser.tablaForInt = new ArrayList<>();
        try {
            parser.parse();
        } catch (Exception ex) {
            return false;
        }
        this.variables = parser.Variables;
        this.metodos = parser.MetodoS;
        this.methods = parser.NumMethod;
        this.erroresSintacticos = parser.Sintacticos;
        this.erroresSemanticos = parser.Semanticos;
        
        crearClase();
        return isValid();
    }

    private void crearClase() {
        crearClase cl = new crearClase();
        String txt = cl.init(variables, metodos, methods);
        try {
            String sFichero = "instancia.java";
            BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero));
            bw.write(txt);
            bw.close();
        } catch (IOException ex) {
        }
        try {
            Process p = Runtime.getRuntime().exec("javac instancia.java -cp build/classes");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            Path o = Paths.get("instancia.class");
            Path d = Paths.get("build/classes/AnalizadorPnt/instancia.class");
            Files.copy(o, d, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            System.out.println("Error????");
        }
    }
}
