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
public class MainTahun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TahunKabisat tk = new TahunKabisat();

        System.out.println("PROGRAM MENENTUKAN TAHUN KABISAT");
        System.out.print("Masukkan Tahun : ");
        tk.tahun = input.nextInt();

        tk.tampilkanHasil();

        input.close();
    }
}
