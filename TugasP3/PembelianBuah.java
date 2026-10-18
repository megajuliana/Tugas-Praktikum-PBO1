/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP3;

/**
 *
 * @author ThinkPad
 */
//mangga dibeli 70pcs, mangga busuk(dikembalikan) 15 pcs, mangga bagus(jadi dibeli) 70-15=55pcs
//jumlah tetangga 4 orang, jambu /tetangga 30pcs,  total jambu 4x30=120pcs
//total buah keseluruhan = mangga bagus+total jambu= 55+120=175pcs
public class PembelianBuah {
    int manggaDibeli;
    int manggaBusuk;
    int jumlahTetangga;
    int jambuPerTetangga;

    // hitung mangga sehabis dikurangi yang busuk
    public int hitungManggaBagus() {
        return manggaDibeli - manggaBusuk;
    }

    // hitung total jambu
    public int hitungTotalJambu() {
        return jumlahTetangga * jambuPerTetangga;
    }

    // hitung yang jadi dibeli
    public int hitungTotalBuah() {
        return hitungManggaBagus() + hitungTotalJambu();
    }

 
    public void tampilkanRincian() {
        System.out.println("RINCIAN PEMBELIAN BUAH IBU SISCA");
        System.out.println("Buah Mangga Dibeli       : " + manggaDibeli + " pcs");
        System.out.println("Buah Mangga Busuk        : " + manggaBusuk + " pcs");
        System.out.println("Buah Mangga Bagus        : " + hitungManggaBagus() + " pcs");
        System.out.println("Jumlah Tetangga          : " + jumlahTetangga + " orang");
        System.out.println("Jambu per Tetangga       : " + jambuPerTetangga + " pcs");
        System.out.println("Total Buah Jambu         : " + hitungTotalJambu() + " pcs");
        System.out.println("TOTAL BUAH YANG DIBELI   : " + hitungTotalBuah() + " pcs");
    }
} 
