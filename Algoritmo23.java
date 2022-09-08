/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo23;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Algoritmo23 {

    public static void main(String[] args) {
        String s;
        int a, d;
        
        s = JOptionPane.showInputDialog("Digite numero de tres casas: ");
        a = Integer.parseInt(s);
        d = (a % 100) / 10;
        System.out.println("Algarismo da casa das dezenas: "+d);
    }
}
