/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP3;

/**
 *
 * @author ThinkPad
 */
public class GajiPegawai {
    String nik;
    String nama;
    String alamat;
    String jabatan;

    // Komponen Gaji
    double p1; // Gaji Pokok
    double p2; // Tunjangan Jabatan
    double p3; // Tunjangan Istri
    double p4; // Tunjangan Anak

    // Method hitung Total Gaji 
    public double hitungTotalGaji() {
        return p1 + p2 + p3 + p4;
    }

    // hitung Pajak Penghasilan 
    public double hitungPajak() {
        return 0.10 * (p1 + p2 + p4);
    }

    // hitung Gaji Bersih (Total Gaji - Pajak Penghasilan)
    public double hitungGajiBersih() {
        return hitungTotalGaji() - hitungPajak();
    }

    // menampilkan gaji
    public void tampilkanSlipGaji() {
        System.out.println("SLIP GAJI PEGAWAI");
        System.out.println("Nomor Induk Karyawan : " + nik);
        System.out.println("Nama Karyawan        : " + nama);
        System.out.println("Alamat               : " + alamat);
        System.out.println("Jabatan              : " + jabatan);
        System.out.println("Gaji Pokok (P1)      : Rp " + p1);
        System.out.println("Tunjangan Jabatan(P2): Rp " + p2);
        System.out.println("Tunjangan Istri  (P3): Rp " + p3);
        System.out.println("Tunjangan Anak   (P4): Rp " + p4);
        System.out.println("Total Gaji           : Rp " + hitungTotalGaji());
        System.out.println("Pajak Penghasilan    : Rp " + hitungPajak());
        System.out.println("Gaji Bersih          : Rp " + hitungGajiBersih());
    }
}
