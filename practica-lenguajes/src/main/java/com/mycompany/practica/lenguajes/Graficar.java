/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica.lenguajes;

import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.attribute.Rank;
import guru.nidi.graphviz.attribute.Rank.RankDir;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.model.Node;
import guru.nidi.graphviz.model.Factory;
import guru.nidi.graphviz.parse.Parser;
import java.io.File;

/**
 *
 * @author DELL
 */
public class Graficar {
    
    public void GenerarGrafico(String Lex, int t){
     
         String input = Lex; 

        String dotFileName = "automata.dot";

        try {
            StringBuilder dotContent = new StringBuilder("digraph G {  \n 	rankdir=LR;\n");
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if(i==input.length()-1){
                dotContent.append("  ").append(i).append(" [label=\"").append(c).append("\", shape=doublecircle,width=0.15];\n");
                    
                }else{
                dotContent.append("  ").append(i).append(" [label=\"").append(c).append("\", shape=circle, width=0.15];\n");
                }
            }
            // dotContent.append("  ").append(lastIndex).append(" [label=\"\", shape=doublecircle, width=0.15];\n");
            for (int i = 0; i < input.length()-1; i++) {
                dotContent.append("  ").append(i).append(" -> ").append(i + 1).append(";\n");
            }
            dotContent.append("}\n");

            File dotFile = new File(dotFileName);
            java.nio.file.Files.write(dotFile.toPath(), dotContent.toString().getBytes());

            System.out.println("Archivo DOT generado con éxito: " + dotFileName);

            MutableGraph g = new Parser().read(dotFile);
            Graphviz.fromGraph(g).height(150).width(500).render(Format.PNG).toFile(new File("src/main/java/Imagenes/automata"+t+".png"));
            System.out.println("Imagen generada con éxito: automata.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
