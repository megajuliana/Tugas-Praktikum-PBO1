/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP6;

import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = input.nextInt();
        input.nextLine(); 

        String[] nama = new String[jumlah];
        int[] nilai = new int[jumlah];
        String[] status = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            nama[i] = input.nextLine();

            System.out.print("Nilai : ");
            nilai[i] = input.nextInt();
            input.nextLine(); 

            if (nilai[i] <= 50) {
                status[i] = "Tidak Lulus";
            } else {
                status[i] = "Lulus";
            }
        }

        System.out.println("\n=======================================================");
        System.out.println("                 Daftar Nilai Mahasiswa                ");
        System.out.println("=======================================================");
        System.out.println("No\tNama\t\t\tNilai\t\tStatus");
        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + "\t" + nama[i] + "\t\t\t" + nilai[i] + "\t\t" + status[i]);
        }
        System.out.println("=======================================================");
    }
}
