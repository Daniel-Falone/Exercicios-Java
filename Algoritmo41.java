/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo41;
import javax.swing.JOptionPane;
/**
 *
 * @author danie
 */
public class Algoritmo41 {

    public static void main(String[] args) {
        float a, b, c, d, mp;
        String s;
        
        s = JOptionPane.showInputDialog("Entre com 1 numero: ");
        a = Float.parseFloat(s);
        s = JOptionPane.showInputDialog("Entre com 2 numero: ");
        b = Float.parseFloat(s);
        s = JOptionPane.showInputDialog("Entre com 3 numero: ");
        c = Float.parseFloat(s);
        s = JOptionPane.showInputDialog("Entre com 4 numero: ");
        d = Float.parseFloat(s);
        
        mp = (a*1 + b*2 + c*3 + d*4)/10;
                
        System.out.println("Media ponderada: "+ mp);
    }
}
