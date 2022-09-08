/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo40;
import javax.swing.JOptionPane;
/**
 *
 * @author danie
 */
public class Algoritmo40 {

    public static void main(String[] args) {
        
        int quoc, rest, val1, val2;
        String s;
        
        s = JOptionPane.showInputDialog("Entre com o dividendo: ");
        val1 = Integer.parseInt(s);
        s = JOptionPane.showInputDialog("Entre com o divisor: ");
        val2 = Integer.parseInt(s);
        
        quoc = val1 / val2;
        rest = val1 % val2;
        
        System.out.println("Dividendo : "+ val1);
        System.out.println("Divisor : "+ val2);
        System.out.println("Quociente : "+ quoc);
        System.out.println("Resto : "+ rest);
    }
}
