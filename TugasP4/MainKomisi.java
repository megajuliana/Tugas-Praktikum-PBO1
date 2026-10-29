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
public class MainKomisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KomisiSalesman ks = new KomisiSalesman();

        System.out.println("PROGRAM HITTUNG PENDAPATAN SALESMAN");
        System.out.print("Masukkan Total Penjualan Hari Ini (Rp) : ");
        ks.penjualan = input.nextDouble();

        ks.tampilkanRincian();

        input.close();
    }
}
