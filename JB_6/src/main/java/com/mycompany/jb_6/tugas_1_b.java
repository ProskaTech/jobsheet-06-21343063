/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jb_6;
import javax.swing.JOptionPane;
/**
 *
 * created by 21343063_Nurul Husna
 */
public class tugas_1_b {
    public static void main(String[] args){
        String a,b,c;
        float a1,a2,a3,mean;
        
        a = JOptionPane.showInputDialog("Nilai ujian Pertama anda ");
        a1 = Float.parseFloat(a);
        b = JOptionPane.showInputDialog("Nilai ujian kedua anda ");
        a2 = Float.parseFloat(b);
        c = JOptionPane.showInputDialog("Nilai ujian ketiga anda ");
        a3 = Float.parseFloat(c);
        
        mean = (a1+a2+a3)/3;
        if (mean >= 60){
                String msg = "Nilai rata rata anda adalah "+mean+". "+ ":-)";
                JOptionPane.showMessageDialog(null, msg);
                
        }else{
                String msg = "Nilai rata rata anda adalah "+mean+". "+ ":-(";
                JOptionPane.showMessageDialog(null, msg);
        }
        String mmean = String.valueOf(mean);
        
        
    }
}
