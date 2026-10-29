/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP4;

/**
 *
 * @author ThinkPad
 */
public class GanjilGenap {
    int bilangan;

    public boolean Genap() {
        return bilangan % 2 == 0;
    }

    public String JenisBilangan() {
        if (Genap()) {
            return "Genap";
        } else {
            return "Ganjil";
        }
    }

    public void tampilkanHasil() {
        System.out.println("HASIL");
        System.out.println("Bilangan yang diinput : " + bilangan);
        System.out.println("Keterangan            : Bilangan " + JenisBilangan());
    }
}
