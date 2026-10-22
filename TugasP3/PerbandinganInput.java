/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP3;


import java.io.*; 
import java.util.Scanner; // lebih ringkas

/**
 *
 * @author ThinkPad
 */

public class PerbandinganInput {
    String nama;
    int umur;

    // input kalo pake Scanner
    public void inputDenganScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Menggunakan Scanner");
        System.out.print("Masukkan Nama : ");
        this.nama = sc.nextLine(); // baca String tanpa harus konversi manual
        
        System.out.print("Masukkan Umur : ");
        this.umur = sc.nextInt(); // Parsing tipe data otomatis
    }

    // input pake BufferedReader
    public void inputDenganBufferedReader() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // harus ngebungkus InputStreamReader yanng ada di package java.io.*
        System.out.println("Input Menggunakan BufferedReader");
        System.out.print("Masukkan Nama : ");
        this.nama = br.readLine();
        
        System.out.print("Masukkan Umur : ");
        // Parsing manual dari String ke int pake Integer.parseInt()
        this.umur = Integer.parseInt(br.readLine()); // harus onversi String ke int
    }

    public void tampilkanData() {
        System.out.println("Data Hasil Input \nNama: " + nama + " | Umur: " + umur + " tahun\n");
    }
}
