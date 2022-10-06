/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jb_6;
import java.util.Scanner;
/**
 *
 * created by 21343063_Nurul Husna
 */
public class latihan_1 {
    public static void main (String[] args){
        double total_pembelian, diskon=0;
        
        Scanner dMasuk = new Scanner(System.in);
        System.out.print("Masukkan total pembelian Rp. ");
        total_pembelian = dMasuk.nextDouble();
        
        if (total_pembelian >= 50000)
            diskon = 0.1 * total_pembelian;
        
        System.out.println("Besarnya diskon Rp. "+diskon);
    }
}
