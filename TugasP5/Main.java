/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP5;

import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Angka a = new Angka();

        // soal 1
        System.out.println("1. BILANGAN TERBESAR DAN TERKECIL");
        System.out.println("Masukkan 10 bilangan:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Bilangan ke-" + i + " : ");
            int inputAngka = s.nextInt();

            if (i == 1) {
                a.terbesar = inputAngka;
                a.terkecil = inputAngka;
            } else {
                if (inputAngka > a.terbesar) {
                    a.terbesar = inputAngka;
                }
                if (inputAngka < a.terkecil) {
                    a.terkecil = inputAngka;
                }
            }
        }
        System.out.println("Bilangan Terbesar : " + a.terbesar);
        System.out.println("Bilangan Terkecil : " + a.terkecil);
        System.out.println();

        // soal 2
        System.out.println("2. TOTAL PENJUMLAHAN DAN RATA RATA");
        System.out.print("Masukkan banyak bilangan : ");
        a.jumlahBilangan = s.nextInt();
        a.totalSoal2 = 0;

        for (int i = 1; i <= a.jumlahBilangan; i++) {
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            double inputVal = s.nextDouble();
            a.totalSoal2 += inputVal;
        }

        a.rataRata = a.totalSoal2 / a.jumlahBilangan;
        System.out.println("Total jumlah bilangan : " + a.totalSoal2);
        System.out.println("Rata-rata             : " + a.rataRata);
        System.out.println();

        // soal 3
        System.out.println("3. FLOYD'S TRIANGLE");
        System.out.print("Masukkan banyak baris : ");
        a.banyakBaris = s.nextInt();
        a.nilaiFloyd = 1;

        for (int i = 1; i <= a.banyakBaris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a.nilaiFloyd + " ");
                a.nilaiFloyd++;
            }
            System.out.println();
        }
        System.out.println();

        // soal 4
        System.out.println("4. ANGKA GANJIL & TOTAL PENJUMLAHAN");
        System.out.print("Masukkan banyak angka : ");
        a.banyakAngkaGanjil = s.nextInt();
        a.totalGanjil = 0;
        a.angkaGanjil = 1;

        for (int i = 1; i <= a.banyakAngkaGanjil; i++) {
            System.out.print(a.angkaGanjil + " ");
            a.totalGanjil += a.angkaGanjil;
            a.angkaGanjil += 2;
        }
        System.out.println("\nTotal penjumlahan : " + a.totalGanjil);
        System.out.println();

        // soal 5
        System.out.println("5. HALF & FULL TRIANGLE");
        System.out.print("Masukkan tinggi segitiga : ");
        a.tinggiSegitiga = s.nextInt();

        System.out.println("\nHalf Triangle");
        for (int i = 1; i <= a.tinggiSegitiga; i++) {
            for (int j = 1; j <= a.tinggiSegitiga - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nFull Triangle");
        // Atas
        for (int i = 1; i <= a.tinggiSegitiga; i++) {
            for (int j = 1; j <= a.tinggiSegitiga - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Bawah
        for (int i = a.tinggiSegitiga - 1; i >= 1; i--) {
            for (int j = 1; j <= a.tinggiSegitiga - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // soal 6
        System.out.println("6. MENAMPILKAN ANGKA 11 DUA KALI");
        for (int i = 0; i < 10; i++) {
            if (i == 8) {
                System.out.println(11);
                System.out.println(11);
                break; // Keluar dari loop setelah mencetak dua kali
            }
        }
        System.out.println();

        // soal 7
        System.out.println("7. PERBEDAAN i++ DAN ++i PADA WHILE");
        System.out.println("Post-increment (i++)");
        int idx1 = 1;
        while (idx1++ < 5) {
            System.out.println("Nilai i saat dicetak : " + idx1);
        }

        System.out.println("Pre-increment (++i)");
        int idx2 = 1;
        while (++idx2 < 5) {
            System.out.println("Nilai j saat dicetak : " + idx2);
        }
        System.out.println();

        // soal 8
        System.out.println("8. PERULANGAN FOREACH ARRAY");
        System.out.print("Elemen Array: ");
        for (int nilai : a.arrayNilai) {
            System.out.print(nilai + " ");
        }
        System.out.println();

    }
}