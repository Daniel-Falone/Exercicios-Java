/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo26;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Algoritmo26 {

    public static void main(String[] args) {
        
        int data, dia, mes, ano, ndata;
        String s;
        
        s = JOptionPane.showInputDialog("Digite data no formato DDMMAA: ");
        data = Integer.parseInt(s);
        
        dia = data / 10000;
        mes = data % 10000 / 100;
        ano = data % 100;
        ndata = (mes * 10000) + (dia * 100) + ano;
                
        System.out.println("DIA: "+ dia);
        System.out.println("MES: "+ mes);
        System.out.println("ANO: "+ ano);
        System.out.println("DATA NO FORMATO MMDDAA: "+ ndata);
         
    }
}
