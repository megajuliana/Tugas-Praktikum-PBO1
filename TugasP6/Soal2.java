/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP6;

/**
 *
 * @author ThinkPad
 */
public class Soal2 {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        System.out.println("MENGUBAH NILAI INDEKS ARRAY");
        System.out.println("Nilai indeks ke-1 sebelum diubah : " + mobil[1]);

        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                mobil[i] = "Honda"; // Diubah jadi Honda
                System.out.println("Nilai indeks ke-" + i + " setelah diubah : " + mobil[i]);
            }
        }
    }
}
