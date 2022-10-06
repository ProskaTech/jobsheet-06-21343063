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
public class tugas_2_a {
    public static void main(String[]args){
        String a;
        BufferedReader dIn = new BufferedReader (new InputStreamReader(System.in));
        try {
            System.out.print("Masukkan angka dari 1-10 ");
            a = dIn.readLine();
            int a1 = Integer.valueOf(a);
            if (a1==1){
                System.out.println("Ini angka 1");
            }
            else if (a1==2){
                System.out.println("Ini angka 2");
            }
            else if (a1==3){
                System.out.println("Ini angka 3");
            }
            else if (a1==4){
                System.out.println("Ini angka 4");
            }
            else if (a1==5){
                System.out.println("Ini angka 5");
            }
            else if (a1==6){
                System.out.println("Ini angka 6");
            }
            else if (a1==7){
                System.out.println("Ini angka 7");
            }
            else if (a1==8){
                System.out.println("Ini angka 8");
            }
            else if (a1==9){
                System.out.println("Ini angka 9");
            }
            else if (a1==10){
                System.out.println("Ini angka 10");
            }else{
                System.out.println("Invalid Number !!");
            }
        }
        catch (IOException e){
            System.out.println("Invalid number");
        }
    }
}
