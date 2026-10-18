/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP3;

/**
 *
 * @author ThinkPad
 */

import java.util.Scanner;

public class MainGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GajiPegawai peg = new GajiPegawai();

        System.out.println("INPUT DATA GAJI PEGAWAI");
        
        
        peg.nik = "552012502";
        peg.nama = "Mega Juliana";
        peg.alamat = "Cianjur";
        
        System.out.print("Masukkan Jabatan           : ");
        peg.jabatan = input.nextLine();

        System.out.print("Masukkan Gaji Pokok (P1)   : ");
        peg.p1 = input.nextDouble();

        System.out.print("Masukkan Tunjangan Jabatan(P2) : ");
        peg.p2 = input.nextDouble();

        System.out.print("Masukkan Tunjangan Istri(P3) : ");
        peg.p3 = input.nextDouble();

        System.out.print("Masukkan Tunjangan Anak(P4) : ");
        peg.p4 = input.nextDouble();

        peg.tampilkanSlipGaji();
    }
}
