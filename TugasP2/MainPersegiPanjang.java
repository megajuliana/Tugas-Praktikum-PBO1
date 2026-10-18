/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP2;

/**
 *
 * @author ThinkPad
 */
public class MainPersegiPanjang {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 50;
        pp.lebar = 45;
        
        System.out.println("Persegi Panjang");
        System.out.println("Panjang : " + pp.panjang);
        System.out.println("Lebar : " + pp.lebar);
        System.out.println("Luas : " + pp.hitungLuas());
           
    }
}
