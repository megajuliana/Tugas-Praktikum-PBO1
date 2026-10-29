/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP4;

/**
 *
 * @author ThinkPad
 */
public class KomisiSalesman {
    double penjualan;

    public double hitungUangJasa() {
        if (penjualan <= 2000000) {
            return 100000;
        } else if (penjualan <= 5000000) {
            return 200000;
        } else {
            return 300000;
        }
    }

    public double hitungUangKomisi() {
        if (penjualan <= 2000000) {
            return 0.10 * penjualan;
        } else if (penjualan <= 5000000) {
            return 0.15 * penjualan;
        } else {
            return 0.20 * penjualan;
        }
    }

    public double hitungTotalPendapatan() {
        return hitungUangJasa() + hitungUangKomisi();
    }

    public void tampilkanRincian() {
        System.out.println("RINCIAN PENDAPATAN SALESMAN");
        System.out.println("Total Penjualan  : Rp " + penjualan);
        System.out.println("Uang Jasa        : Rp " + hitungUangJasa());
        System.out.println("Uang Komisi      : Rp " + hitungUangKomisi());
        System.out.println("TOTAL PENDAPATAN : Rp " + hitungTotalPendapatan());
    }
}
