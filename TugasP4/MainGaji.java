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
public class MainGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GajiKaryawan gk = new GajiKaryawan();

        System.out.println("PROGRAM HITTUNG GAJI BERSIH KARYAWAN");

        System.out.print("Masukkan NIK                   : ");
        gk.nik = input.nextLine();

        System.out.print("Masukkan Nama                  : ");
        gk.nama = input.nextLine();

        System.out.print("Masukkan Kode Golongan (1-4)   : ");
        gk.kodeGolongan = input.nextInt();

        System.out.print("Apakah Sudah Menikah? (true/false) : ");
        gk.Menikah = input.nextBoolean();

        System.out.print("Masukkan Jumlah Anak           : ");
        gk.jumlahAnak = input.nextInt();

        gk.tampilkanSlipGaji();

        input.close();
    }
}
