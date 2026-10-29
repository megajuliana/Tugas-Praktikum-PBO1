/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP4;

/**
 *
 * @author ThinkPad
 */
public class KasirSederhana {
    boolean Member;
    double totalBelanja;
    double uangBayar;

    // diskon berdasarkan kondisi
    public double hitungDiskon() {
        double diskon = 0;

        if (Member) {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }

        return diskon;
    }

    public double hitungTotalHarusDibayar() {
        return totalBelanja - hitungDiskon();
    }

    public double hitungKembalian() {
        return uangBayar - hitungTotalHarusDibayar();
    }

    public void tampilkanStruk() {
        System.out.println("STRUK PEMBAYARAN");
        System.out.println("Status Member   : " + (Member ? "Ya (Member)" : "Tidak (Non-Member)"));
        System.out.println("Total Belanja   : Rp " + totalBelanja);
        System.out.println("Potongan Diskon : Rp " + hitungDiskon());
        System.out.println("Total Harus Bayar: Rp " + hitungTotalHarusDibayar());
        System.out.println("Uang Diterima   : Rp " + uangBayar);
        System.out.println("Uang Kembalian  : Rp " + hitungKembalian());
    }
}
