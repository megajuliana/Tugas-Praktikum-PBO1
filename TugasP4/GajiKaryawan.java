/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP4;

/**
 *
 * @author ThinkPad
 */
public class GajiKaryawan {
    String nik;
    String nama;
    int kodeGolongan;
    boolean Menikah;
    int jumlahAnak;

    // Gaji Pokok berdasarkan Kode Golongan
    public double GajiPokok() {
        switch (kodeGolongan) {
            case 1:
                return 1200000;
            case 2:
                return 1500000;
            case 3:
                return 1750000;
            case 4:
                return 2000000;
            default:
                return 0;
        }
    }

    // c) Tunjangan Pasangan (10% dari gaji pokok jika menikah)
    public double hitungTunjanganPasangan() {
        if (Menikah) {
            return 0.10 * GajiPokok();
        }
        return 0;
    }

    // d) Tunjangan Anak (5% dari gaji pokok x jumlah anak)
    public double hitungTunjanganAnak() {
        if (jumlahAnak > 0) {
            return (0.05 * GajiPokok()) * jumlahAnak;
        }
        return 0;
    }

    // b) Tunjangan Total (Jumlah tunjangan pasangan dengan tunjangan anak)
    public double hitungTotalTunjangan() {
        return hitungTunjanganPasangan() + hitungTunjanganAnak();
    }

    // a) Gaji Bersih (Jumlah gaji pokok dengan tunjangan)
    public double hitungGajiBersih() {
        return GajiPokok() + hitungTotalTunjangan();
    }

    public void tampilkanSlipGaji() {
        System.out.println("SLIP GAJI KARYAWAN");
        System.out.println("NIK                 : " + nik);
        System.out.println("Nama                : " + nama);
        System.out.println("Kode Golongan       : " + kodeGolongan);
        System.out.println("Status Pernikahan   : " + (Menikah ? "Menikah" : "Belum Menikah / Cerai"));
        System.out.println("Jumlah Anak         : " + jumlahAnak);
        System.out.println("Gaji Pokok          : Rp " + GajiPokok());
        System.out.println("Tunjangan Pasangan  : Rp " + hitungTunjanganPasangan());
        System.out.println("Tunjangan Anak      : Rp " + hitungTunjanganAnak());
        System.out.println("Total Tunjangan     : Rp " + hitungTotalTunjangan());
        System.out.println("GAJI BERSIH         : Rp " + hitungGajiBersih());
    }
}
