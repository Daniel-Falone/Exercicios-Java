/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo46;
import javax.swing.JOptionPane;
/**
 *
 * @author danie
 */
public class Algoritmo46 {

    public static void main(String[] args) {
        
        float saldo, nsaldo;
        String s;
        
        s = JOptionPane.showInputDialog("Digite saldo: ");
        saldo = Float.parseFloat(s);
        
        nsaldo = (float)(saldo * 1.01);
        
        System.out.println("Novo saldo: "+nsaldo);
    }
}
