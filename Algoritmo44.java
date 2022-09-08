/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo44;
import javax.swing.JOptionPane;
/**
 *
 * @author danie
 */
public class Algoritmo44 {

    public static void main(String[] args) {
        
        String s;
        float num, base, logaritmo;
        
        s = JOptionPane.showInputDialog("Entre com o logaritmando: ");
        num = Float.parseFloat(s);
        s = JOptionPane.showInputDialog("Entre com a base: ");
        base = Float.parseFloat(s);
        
        logaritmo = (float) (Math.log(num) / Math.log(base));
        
        System.out.println("Logaritmo dos numeros: "+ logaritmo);
    }
}
