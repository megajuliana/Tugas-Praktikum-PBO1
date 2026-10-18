/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP3;

import java.io.*;

/**
 *
 * @author ThinkPad
 */
public class MainBeliBuah {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        PembelianBuah buah = new PembelianBuah();

        System.out.println("INPUT DATA PEMBELIAN BUAH");

        System.out.print("Masukkan Jumlah Mangga yang dibeli  : ");
        buah.manggaDibeli = Integer.parseInt(br.readLine());

        System.out.print("Masukkan Jumlah Tetangga            : ");
        buah.jumlahTetangga = Integer.parseInt(br.readLine());

        System.out.print("Masukkan Jambu per Tetangga         : ");
        buah.jambuPerTetangga = Integer.parseInt(br.readLine());

        System.out.print("Masukkan Jumlah Mangga Busuk        : ");
        buah.manggaBusuk = Integer.parseInt(br.readLine());

        buah.tampilkanRincian();
    }
}