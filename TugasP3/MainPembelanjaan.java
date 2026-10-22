/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP3;

import java.io.*;

/**
 *
 * @author ThinkPad
 */
public class MainPembelanjaan {
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(System.in);

        Pembelanjaan p = new Pembelanjaan();

        System.out.print("Nama: ");
        p.nama = input.readLine();

        System.out.print("Total Belanja: ");
        p.totalBelanja = Double.parseDouble(input.readLine());

        System.out.print("Diskon (%): ");
        p.diskonPersen = Double.parseDouble(input.readLine());

        System.out.print("Bayar: ");
        p.bayar = Double.parseDouble(input.readLine());

        System.out.println("Total setelah diskon: Rp " + p.hitungTotalAkhir());
        System.out.println("Kembalian: Rp " + p.hitungKembalian());
    }      
}
