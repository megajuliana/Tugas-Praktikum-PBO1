/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP3;

import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class MainSelisihWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SelisihWaktu sw = new SelisihWaktu();

        System.out.println("PROGRAM HITTUNG SELISIH WAKTU");

        // Waktu Pertama
        System.out.println("\nMasukkan Waktu Pertama");
        System.out.print("Jam   : ");
        sw.jam1 = input.nextInt();
        System.out.print("Menit : ");
        sw.menit1 = input.nextInt();
        System.out.print("Detik : ");
        sw.detik1 = input.nextInt();

        // Waktu Kedua
        System.out.println("\nMasukkan Waktu Kedua");
        System.out.print("Jam   : ");
        sw.jam2 = input.nextInt();
        System.out.print("Menit : ");
        sw.menit2 = input.nextInt();
        System.out.print("Detik : ");
        sw.detik2 = input.nextInt();

    
        sw.tampilkanSelisih();
    }
}
