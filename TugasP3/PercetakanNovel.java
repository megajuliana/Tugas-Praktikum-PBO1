/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP3;

/**
 *
 * @author ThinkPad
 */
public class PercetakanNovel {
    int jumlahNovel;
    int lembarPerNovel;

    // hitung total lembar
    public int hitungTotalLembar() {
        return jumlahNovel * lembarPerNovel;
    }

    // hitung total detik (1 lembar = 1 detik)
    public int hitungTotalDetik() {
        return hitungTotalLembar() * 1;
    }

    public void tampilkanWaktuCetak() {
        int totalDetik = hitungTotalDetik();

        int hari = totalDetik / 86400;
        int sisaDetik1 = totalDetik % 86400;

        int jam = sisaDetik1 / 3600;
        int sisaDetik2 = sisaDetik1 % 3600;

        int menit = sisaDetik2 / 60;
        int detik = sisaDetik2 % 60;

        System.out.println("       HASIL PERHITUNGAN WAKTU CETAK      ");
        System.out.println("Jumlah Novel yang Dicetak : " + jumlahNovel + " buah");
        System.out.println("Tebal Lembar per Novel    : " + lembarPerNovel + " lembar");
        System.out.println("Total Lembar Dicetak      : " + hitungTotalLembar() + " lembar");
        System.out.println("Waktu Diperlukan          : " + hari + " Hari, " 
                + jam + " Jam, " + menit + " Menit, " + detik + " Detik");
    }
}
