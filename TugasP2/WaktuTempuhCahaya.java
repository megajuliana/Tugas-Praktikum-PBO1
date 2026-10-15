/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP2;

/**
 *
 * @author ThinkPad
 */
public class WaktuTempuhCahaya {
    double jarakBulan = 384400; // km
    double jarakMatahari = 152100000; // 152.1 juta km
    double kecepatanCahaya = 300000; // km/s

    public double hitungWaktuKeBulan() {
        return jarakBulan / kecepatanCahaya;
    }

    public double hitungWaktuKeMatahari() {
        return jarakMatahari / kecepatanCahaya;
    }
}
