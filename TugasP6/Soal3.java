/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP6;

import java.util.Arrays;
import java.util.Scanner;

public class Soal3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("OPERASI ARRAY 1D");

        System.out.print("a. Masukkan jumlah elemen array : ");
        int n = input.nextInt();
        int[] data = new int[n];

        System.out.println("\nb. Masukkan nilai setiap elemen:");
        for (int i = 0; i < data.length; i++) {
            System.out.print("   Elemen indeks ke-" + i + " : ");
            data[i] = input.nextInt();
        }
        
        int terbesar = data[0];
        int indeksTerbesar = 0;
        int terkecil = data[0];
        int indeksTerkecil = 0;

        for (int i = 1; i < data.length; i++) {
            if (data[i] > terbesar) {
                terbesar = data[i];
                indeksTerbesar = i;
            }
            if (data[i] < terkecil) {
                terkecil = data[i];
                indeksTerkecil = i;
            }
        }
        System.out.println("\nc. Nilai Terbesar : " + terbesar + " (pada indeks ke-" + indeksTerbesar + ")");
        System.out.println("   Nilai Terkecil : " + terkecil + " (pada indeks ke-" + indeksTerkecil + ")");

        int totalSemua = 0;
        for (int nilai : data) {
            totalSemua += nilai;
        }
        double rataRata = (double) totalSemua / data.length;
        System.out.println("\nd. Total Semua Data : " + totalSemua);
        System.out.println("   Rata-rata Data   : " + rataRata);

        int jumlahIndeksGanjil = 0;
        int jumlahIndeksGenap = 0;

        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 1) {
                jumlahIndeksGanjil += data[i]; 
            } else {
                jumlahIndeksGenap += data[i]; 
            }
        }
        System.out.println("\ne. Total Elemen Berindeks Ganjil (NPM Genap)  : " + jumlahIndeksGanjil);
        System.out.println("f. Total Elemen Berindeks Genap  (NPM Ganjil) : " + jumlahIndeksGenap);

        String ketGanjil = (jumlahIndeksGanjil % 2 == 0) ? "GENAP" : "GANJIL";
        String ketGenap = (jumlahIndeksGenap % 2 == 0) ? "GENAP" : "GANJIL";

        System.out.println("\ng. Status Hasil Penjumlahan:");
        System.out.println("   - Hasil langkah e (" + jumlahIndeksGanjil + ") bernilai : " + ketGanjil);
        System.out.println("   - Hasil langkah f (" + jumlahIndeksGenap + ") bernilai : " + ketGenap);

        Arrays.sort(data);
        System.out.print("\nh. Array Setelah Diurutkan : ");
        for (int nilai : data) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }
}
