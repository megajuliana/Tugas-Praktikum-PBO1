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
public class MainLuas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LuasBangunDatar bd = new LuasBangunDatar();

        System.out.println("   PROGRAM PERHITUNGAN LUAS BANGUN DATAR  ");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Pilih Menu (1-5) : ");
        int pilihan = input.nextInt();

        System.out.println();

        switch (pilihan) {
            case 1:
                System.out.println("1. LUAS PERSEGI");
                System.out.print("Masukkan Panjang Sisi : ");
                double sisi = input.nextDouble();
                System.out.println("Luas Persegi : " + bd.hitungLuasPersegi(sisi));
                break;

            case 2:
                System.out.println("2. LUAS SEGITIGA");
                System.out.print("Masukkan Alas   : ");
                double alas = input.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                double tinggiSegitiga = input.nextDouble();
                System.out.println("Luas Segitiga : " + bd.hitungLuasSegitiga(alas, tinggiSegitiga));
                break;

            case 3:
                System.out.println("3. LUAS LINGKARAN");
                System.out.print("Masukkan Jari-jari (r) : ");
                double r = input.nextDouble();
                System.out.println("Luas Lingkaran : " + bd.hitungLuasLingkaran(r));
                break;

            case 4:
                System.out.println("4. LUAS TRAPESIUM");
                System.out.print("Masukkan Sisi Sejajar A : ");
                double sisiA = input.nextDouble();
                System.out.print("Masukkan Sisi Sejajar B : ");
                double sisiB = input.nextDouble();
                System.out.print("Masukkan Tinggi         : ");
                double tinggiTrapesium = input.nextDouble();
                System.out.println("Luas Trapesium : " + bd.hitungLuasTrapesium(sisiA, sisiB, tinggiTrapesium));
                break;

            case 5:
                System.out.println("5. LUAS LAYANG-LAYANG");
                System.out.print("Masukkan Diagonal 1 (d1) : ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan Diagonal 2 (d2) : ");
                double d2 = input.nextDouble();
                System.out.println("Luas Layang-layang : " + bd.hitungLuasLayangLayang(d1, d2));
                break;

            default:
                System.out.println("Pilihan menu tidak valid!");
                break;
        }

        input.close();
    }
}
