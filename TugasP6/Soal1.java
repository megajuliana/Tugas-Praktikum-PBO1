/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP6;

/**
 *
 * @author ThinkPad
 */
public class Soal1 {
    public static void main(String[] args) {
        int[] angka1 = {10, 20, 30, 40, 50};
        int angka2[] = new int[3];
        
        angka2[0] = 5;
        angka2[1] = 15;
        angka2[2] = 25;

        int[] angka3 = new int[]{100, 200, 300};

        System.out.println("3 VARIASI SYNTAKS ARRAY INTEGER");
        
        System.out.print("Variasi 1 : ");
        for (int a : angka1) {
            System.out.print(a + " ");
        }

        System.out.print("\nVariasi 2 : ");
        for (int b : angka2) {
            System.out.print(b + " ");
        }

        System.out.print("\nVariasi 3 : ");
        for (int c : angka3) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
