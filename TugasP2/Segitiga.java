/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP2;

/**
 *
 * @author ThinkPad
 */
public class Segitiga {
    double a; 
    double b; 
    double c;

    public double hitungLuas() {
        return 0.5 * a * b;
    }
    
    // cari nilai c(sisi miring) pake rumus pythagoras((c = sqrt(a^2 + b^2))
    public double hitungPythagorasC() {
        c = Math.sqrt((a * a) + (b * b));
        return c;
    }

    // Method untuk menghitung keliling segitiga (a + b + c)
    public double hitungKeliling() {
        return a + b + c;
    }
}
