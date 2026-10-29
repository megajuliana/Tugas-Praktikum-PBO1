/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP4;

import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class MainKasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KasirSederhana ks = new KasirSederhana();

        System.out.println("PROGRAM KASIR SEDERHANA");

        System.out.print("Apakah Memiliki Kartu Member? (true/false) : ");
        ks.Member = input.nextBoolean();

        System.out.print("Masukkan Total Belanja (Rp)                : ");
        ks.totalBelanja = input.nextDouble();

        System.out.print("Masukkan Uang yang Diberikan Pembeli (Rp)  : ");
        ks.uangBayar = input.nextDouble();

        ks.tampilkanStruk();

        input.close();
    }
}
