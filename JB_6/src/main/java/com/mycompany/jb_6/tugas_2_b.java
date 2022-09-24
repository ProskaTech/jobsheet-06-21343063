/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jb_6;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * created by 21343063_Nurul Husna
 */
public class tugas_2_b {
    public static void main(String[]agrs){
        BufferedReader dIn = new BufferedReader (new InputStreamReader(System.in));
        
        String a;
        try{
            System.out.print("Masukkan angka 1-10 ");
            a = dIn.readLine();
            int a1 = Integer.valueOf(a);
            switch(a1){
                case 1 :
                    System.out.println("Ini angka 1");
                    break; 
                case 2 :
                    System.out.println("Ini angka 2");
                    break;
                case 3 :
                    System.out.println("Ini angka 3");
                    break;
                case 4 :
                    System.out.println("Ini angka 4");
                    break;
                case 5 :
                    System.out.println("Ini angka 5");
                    break;
                case 6 :
                    System.out.println("Ini angka 6");
                    break;
                case 7 :
                    System.out.println("Ini angka 7");
                    break;
                case 8 :
                    System.out.println("Ini angka 8");
                    break;
                case 9 :
                    System.out.println("Ini angka 9");
                    break;
                case 10 :
                    System.out.println("Ini angka 10");
                    break;
                default:
                    System.out.println("Invalid Number !!");
                
            }
        }
        catch(IOException e){
            System.out.println("gagal membaca input");
        }
    }
}
