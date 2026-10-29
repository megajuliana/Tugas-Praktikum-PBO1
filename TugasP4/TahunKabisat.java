/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP4;

/**
 *
 * @author ThinkPad
 */
public class TahunKabisat {
    int tahun;
    
    public boolean Kabisat() {
        if (tahun % 400 == 0) {
            return true;
        } else if (tahun % 100 == 0) {
            return false;
        } else if (tahun % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void tampilkanHasil() {
        System.out.println("HASIL CEK TAHUN KABISAT");
        System.out.println("Tahun yang dimasukkan : " + tahun);

        if (Kabisat()) {
            System.out.println("Keterangan  : TAHUN KABISAT");
        } else {
            System.out.println("Keterangan  : BUKAN TAHUN KABISAT");
        }
    }
}
