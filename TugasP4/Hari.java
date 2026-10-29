/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP4;

/**
 *
 * @author ThinkPad
 */
public class Hari {
    int kodeHari;

    public String NamaHari() {
        switch (kodeHari) {
            case 1:
                return "Senin";
            case 2:
                return "Selasa";
            case 3:
                return "Rabu";
            case 4:
                return "Kamis";
            case 5:
                return "Jumat";
            case 6:
                return "Sabtu";
            case 7:
                return "Minggu";
            default:
                return "Kode hari tidak valid (Harus angka 1 - 7)";
        }
    }

    public void tampilkanHasil() {
        System.out.println("HASIL PENENTUAN NAMA HARI");
        System.out.println("Kode Hari  : " + kodeHari);
        System.out.println("Nama Hari  : " + NamaHari());
    }
}
