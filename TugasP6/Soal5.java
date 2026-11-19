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
public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PENJUMLAHAN MATRIKS (ARRAY 2D)");

        System.out.print("Masukkan jumlah baris matriks : ");
        int baris = input.nextInt();

        System.out.print("Masukkan jumlah kolom matriks : ");
        int kolom = input.nextInt();

        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        System.out.println("\nMasukkan Elemen Matriks A");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Matriks A [" + i + "][" + j + "] : ");
                matriksA[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMasukkan Elemen Matriks B ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Matriks B [" + i + "][" + j + "] : ");
                matriksB[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        System.out.println("\nMatriks A");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriksA[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriks B");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriksB[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nHasil Penjumlahan (Matriks A + Matriks B)");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
