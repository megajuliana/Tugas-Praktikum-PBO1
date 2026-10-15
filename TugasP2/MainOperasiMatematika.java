/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP2;

/**
 *
 * @author ThinkPad
 */
public class MainOperasiMatematika {
    public static void main(String[] args) {
        OperasiMatematika om = new OperasiMatematika();
        om.x = 22;
        om.y = 33;

        System.out.println("Operasi Matematika");
        System.out.println("Nilai x : " + om.x);
        System.out.println("Nilai y : " + om.y);
        System.out.println("(x + y) : " + om.hitungPenjumlahan());
        System.out.println("(x - y) : " + om.hitungPengurangan());
        System.out.println("(x * y) : " + om.hitungPerkalian());
        System.out.println("(x / y) : " + om.hitungPembagian());
    }
}
