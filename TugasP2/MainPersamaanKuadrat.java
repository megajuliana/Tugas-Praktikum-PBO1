/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP2;

/**
 *
 * @author ThinkPad
 */
public class MainPersamaanKuadrat {
    public static void main(String[] args) {
        PersamaanKuadrat pk = new PersamaanKuadrat();
        pk.a = 2;
        pk.b = 10;
        pk.c = 5;
        
        System.out.println("Persamaan Kuadrat");
        System.out.println("Nilai a : " + pk.a);
        System.out.println("Nilai b : " + pk.b);
        System.out.println("Nilai c : " + pk.c);
        System.out.println("Hasil (b^2 - 4ac) : " + pk.hitungDeterminan());
    }
}
