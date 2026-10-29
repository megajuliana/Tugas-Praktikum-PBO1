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
public class MainHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hari h = new Hari();

        System.out.println("PROGRAM MENENTUKAN NAMA HARI");
        System.out.print("Masukkan Kode Hari(1 - 7): ");
        h.kodeHari = input.nextInt();

        h.tampilkanHasil();

        input.close();
    }
}
