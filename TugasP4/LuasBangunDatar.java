/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP4;

/**
 *
 * @author ThinkPad
 */
public class LuasBangunDatar {
    public double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    public double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public double hitungLuasLingkaran(double r) {
        return Math.PI * r * r;
    }

    public double hitungLuasTrapesium(double sisiA, double sisiB, double tinggi) {
        return 0.5 * (sisiA + sisiB) * tinggi;
    }

    public double hitungLuasLayangLayang(double d1, double d2) {
        return 0.5 * d1 * d2;
    }
}
