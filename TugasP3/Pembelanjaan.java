/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP3;

/**
 *
 * @author ThinkPad
 */
import java.io.*;

public class Pembelanjaan {
    String nama;
    double totalBelanja;
    double diskonPersen;
    double bayar;

    public double hitungNominalDiskon() {
        return totalBelanja * (diskonPersen / 100.0);
    }

    // setelah diskon
    public double hitungTotalAkhir() {
        return totalBelanja - hitungNominalDiskon();
    }

    public double hitungKembalian() {
        return bayar - hitungTotalAkhir();
    }

    // simpan data ke file pake DataOutputStream
    public void simpanDataKeFile(String namaFile) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(namaFile));
        dos.writeUTF(nama);
        dos.writeDouble(totalBelanja);
        dos.writeDouble(diskonPersen);
        dos.writeDouble(bayar);
        dos.close();
    }

    // membaca data dari file pake DataInputStream
    public void bacaDataDariFile(String namaFile) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream(namaFile));
        this.nama = dis.readUTF();
        this.totalBelanja = dis.readDouble();
        this.diskonPersen = dis.readDouble();
        this.bayar = dis.readDouble();
        dis.close();
    }

    // tampil nota belanja
    public void tampilkanNota() {
        System.out.println("NOTA PEMBELANJAAN");
        System.out.println("Nama          : " + nama);
        System.out.println("Total Belanja : Rp " + totalBelanja);
        System.out.println("Diskon(%)    : " + diskonPersen + "%");
        System.out.println("Total         : Rp " + hitungTotalAkhir());
        System.out.println("Bayar         : Rp " + bayar);
        System.out.println("Kembalian     : Rp " + hitungKembalian());
    }
}
