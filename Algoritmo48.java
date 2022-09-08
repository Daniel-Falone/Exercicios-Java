/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo48;
import javax.swing.JOptionPane;
/**
 *
 * @author danie
 */
public class Algoritmo48 {

    public static void main(String[] args) {
        
        String s;
        float sm, qtdade, preco, vp, vd;
        
        s = JOptionPane.showInputDialog("Digite o salario minimo: ");
        sm = Float.parseFloat(s);
        
        s = JOptionPane.showInputDialog("Digite o salario minimo: ");
        qtdade = Float.parseFloat(s);
        
        preco = sm / 700;
        vp = preco * qtdade;
        vd = (float) (vp * 0.9);
        
        System.out.println("Preco do quilowatt:"+preco);
        System.out.println("Valor a ser pago: "+Math.round(vp));
        System.out.println("Valor com desconto: "+Math.round(vd));
    }
}
