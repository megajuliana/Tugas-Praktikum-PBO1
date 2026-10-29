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
public class MainGanjilGenap { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GanjilGenap cek = new GanjilGenap();

        System.out.println("PROGRAM MENENTUKAN BILANGAN GENAP / GANJIL");
        System.out.print("Masukkan sebuah bilangan : ");
        cek.bilangan = input.nextInt();

        cek.tampilkanHasil();

        input.close();
    }
}
