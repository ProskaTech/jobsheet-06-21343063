/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jb_6;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * created by 21343063_Nurul Husna
 */
public class tugas_1_a {
    public static void main (String[]args){
        BufferedReader dIn = new BufferedReader (new InputStreamReader(System.in));
        String a,b,c;
        float a1,a2,a3,mean;
        
        System.out.println("Program nilai rata rata ujian siswa");
        try {
            System.out.print("Masukkan nilai ujian pertama  ");
            a = dIn.readLine();
            a1 = Float.parseFloat(a);
            
            System.out.print("Masukkan nilai ujian kedua ");
            b = dIn.readLine();
            a2 = Float.parseFloat(b);
            
            System.out.print("Masukkan nilai ujian ketiga  ");
            c = dIn.readLine();
            a3 = Float.parseFloat(c);
            
            mean = (a1+a2+a3)/3;
            
            if (mean >= 60){
                System.out.println("nilai rata rata anda adalah "+mean);
                System.out.println(":-)");
            }else{
                System.out.println("nilai rata rata anda adalah "+mean);
                System.out.println(":-(");
            }
                
        }
        catch(IOException e){
            System.out.println("gagal membaca nilai");
        }
        
    }
}
