/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP3;

/**
 *
 * @author ThinkPad
 */
public class GayaSentripetal {
    double m; // Massa (M)
    double v; // Kecepatan (V)
    double r; // Jari-jari (r)

    // hitung Gaya Sentripetal: Fc = (M * V^2) / r
    public double hitungGayaSentripetal() {
        return (m * (v * v)) / r;
    }

    public void tampilkanHasil() {
        System.out.println("       PERHITUNGAN GAYA SENTRIPETAL       ");
        System.out.println("Massa Benda(M)        : " + m + " kg");
        System.out.println("Kecepatan(V)          : " + v + " m/s");
        System.out.println("Jari-jari Lintasan(r) : " + r + " m");
        System.out.println("Gaya Sentripetal(Fc)  : " + hitungGayaSentripetal() + " N (Newton)");
    }
}
