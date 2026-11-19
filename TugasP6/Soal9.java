/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP6;

/**
 *
 * @author ThinkPad
 */
public class Soal9 {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};
        
        System.out.println("2 MACAM PERULANGAN ARRAY ");
        System.out.println("\n1. Menggunakan Perulangan For Biasa:");
        
        for (int i = 0; i < age.length; i++) {
            System.out.println("Elemen indeks ke-" + i + " : " + age[i]);
        }
        
        System.out.println("\n2. Menggunakan Perulangan For-Each:");
        for (int umur : age) {
            System.out.println("Nilai elemen : " + umur);
        }
    }
}
