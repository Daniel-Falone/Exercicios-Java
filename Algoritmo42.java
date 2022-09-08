/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo42;
import javax.swing.JOptionPane;
/**
 *
 * @author danie
 */
public class Algoritmo42 {

    public static void main(String[] args) {
        
        double angulo, rang;
        String s;
        
        s = JOptionPane.showInputDialog("Digite um angulo em graus: ");
        angulo = Float.parseFloat(s);
        
        rang = (angulo * Math.PI)/180;
        
        System.out.println("Seno: "+ Math.sin(rang));
        System.out.println("Co-seno: "+ Math.cos(rang));
        System.out.println("Tangente: "+ Math.tan(rang));
        System.out.println("Co-secante: "+ 1/Math.sin(rang));
        System.out.println("Secante: "+ 1/Math.cos(rang));
        System.out.println("Cotangente: "+ 1/Math.tan(rang));
        
    }
}
