/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("RATA-RATA ARRAY & EXCEPTION HANDLING");

        try {
            System.out.print("Masukkan jumlah bilangan : ");
            int n = input.nextInt();

            if (n <= 0) {
                System.err.println("Jumlah bilangan harus lebih dari 0!");
                return;
            }

            double[] bilangan = new double[n];
            double total = 0;

            System.out.println("\nMasukkan " + n + " bilangan:");
            for (int i = 0; i < bilangan.length; i++) {
                System.out.print("Bilangan ke-" + (i + 1) + " : ");
                bilangan[i] = input.nextDouble(); // Akan memicu InputMismatchException jika bukan angka
                total += bilangan[i];
            }

            // nilai rata-rata
            double rataRata = total / bilangan.length;

            // isi array, total, dan nilai rata-rata
            System.out.println("\n==========================================");
            System.out.print("Data Array     : ");
            for (double angka : bilangan) {
                System.out.print(angka + "  ");
            }
            System.out.println("\nTotal Jumlah   : " + total);
            System.out.println("Nilai Rata-rata: " + rataRata);
            System.out.println("==========================================");

        } catch (InputMismatchException e) {
            // Penanganan kesalahan apabila user menginput huruf/karakter selain bilangan
            System.err.println("\nERROR Input tidak valid! masukkan angka/bilangan aja.");
        } catch (Exception e) {
            // Penanganan kesalahan umum lainnya
            System.err.println("\nERROR Terjadi kesalahan: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
