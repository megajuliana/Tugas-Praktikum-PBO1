/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP3;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */

public class MainPembelanjaan {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        Pembelanjaan belanjaInput = new Pembelanjaan();
        String namaFile = "data_pembelanjaan.dat";

        System.out.println("INPUT DATA PEMBELANJAAN");
        System.out.print("Nama          : ");
        belanjaInput.nama = input.nextLine();

        System.out.print("Total Belanja : ");
        belanjaInput.totalBelanja = input.nextDouble();

        System.out.print("Diskon(%)    : ");
        belanjaInput.diskonPersen = input.nextDouble();

        System.out.print("Bayar         : ");
        belanjaInput.bayar = input.nextDouble();

        // mnulis data ke file pake DataOutputStream
        belanjaInput.simpanDataKeFile(namaFile);
        System.out.println("\n[Sistem] Data berhasil disimpan ke file '" + namaFile + "' via DataOutputStream!");

        // baca data dari file pake DataInputStream
        Pembelanjaan belanjaOutput = new Pembelanjaan();
        belanjaOutput.bacaDataDariFile(namaFile);
        System.out.println("[Sistem] Data berhasil dibaca dari file '" + namaFile + "' via DataInputStream!");

        // nota hasil hitung
        belanjaOutput.tampilkanNota();

    }
}