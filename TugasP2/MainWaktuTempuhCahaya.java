/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP2;

/**
 *
 * @author ThinkPad
 */
public class MainWaktuTempuhCahaya {
    public static void main(String[] args) {
        WaktuTempuhCahaya wtc = new WaktuTempuhCahaya();

        System.out.println("Waktu Tempuh Cahaya");
        System.out.println("Waktu tempuh ke Bulan    : " + wtc.hitungWaktuKeBulan() + " detik");
        System.out.println("Waktu tempuh ke Matahari : " + wtc.hitungWaktuKeMatahari() + " detik");
    }
}
