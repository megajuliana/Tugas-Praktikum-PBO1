/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP3;

/**
 *
 * @author ThinkPad
 */
public class SelisihWaktu {
    int jam1, menit1, detik1;
    int jam2, menit2, detik2;

    // konversi waktu ke total detik
    public int keTotalDetik(int jam, int menit, int detik) {
        return (jam * 3600) + (menit * 60) + detik;
    }

    // hitung selisih total detik
    public int hitungSelisihDetik() {
        int totalDetik1 = keTotalDetik(jam1, menit1, detik1);
        int totalDetik2 = keTotalDetik(jam2, menit2, detik2);

        int selisih = totalDetik2 - totalDetik1;

        // Jika selisih - (misal waktu kedua lewat tengah malam)
        if (selisih < 0) {
            selisih += 24 * 3600; // +1 hari (86400 detik)
        }

        return selisih;
    }


    public void tampilkanSelisih() {
        int totalDetik = hitungSelisihDetik();

        int jam = totalDetik / 3600;
        int sisaDetik = totalDetik % 3600;
        int menit = sisaDetik / 60;
        int detik = sisaDetik % 60;

        System.out.println("\nHASIL PERHITUNGAN SELISIH");
        System.out.printf("Waktu Pertama : %02d:%02d:%02d\n", jam1, menit1, detik1);
        System.out.printf("Waktu Kedua   : %02d:%02d:%02d\n", jam2, menit2, detik2);
        System.out.println("Selisih Waktu : " + jam + " Jam " + menit + " Menit " + detik + " Detik");
    }
}
