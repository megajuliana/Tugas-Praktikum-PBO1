/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP3;

import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class MainPercetakanNovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PercetakanNovel cetak = new PercetakanNovel();

        System.out.println("PROGRAM HITTUNG WAKTU PERCETAKAN NOVEL");

        System.out.print("Masukkan Banyaknya Novel yang Akan Dicetak : ");
        cetak.jumlahNovel = input.nextInt();

        System.out.print("Masukkan Tebal Lembar per Novel            : ");
        cetak.lembarPerNovel = input.nextInt();

        cetak.tampilkanWaktuCetak();

    }
}
