/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP6;

import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
class ThreadAnak extends Thread {
    private int nomorThread;

    public ThreadAnak(int nomorThread) {
        this.nomorThread = nomorThread;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread Anak ke-" + nomorThread + " sedang berjalan (Langkah " + i + ")");
            try {
                Thread.sleep(400); // Jeda 400 ms biar bisa eksekusi paralel antar thread terliat
            } catch (InterruptedException e) {
                System.err.println("Thread Anak ke-" + nomorThread + " terganggu.");
            }
        }
        System.out.println(">>> Thread Anak ke-" + nomorThread + " SELESAI.");
    }
}

public class Soal8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("MEMBUAT BANYAK THREAD ANAK DINAMIS");
        System.out.print("Masukkan jumlah thread anak yang ingin dibuat : ");
        int jumlahThread = input.nextInt();

        System.out.println("\n[Thread Utama] Mulai pembuatan " + jumlahThread + " thread anak...\n");

        ThreadAnak[] daftarThread = new ThreadAnak[jumlahThread];
        
        for (int i = 0; i < jumlahThread; i++) {
            daftarThread[i] = new ThreadAnak(i + 1);
            daftarThread[i].start();
        }

        System.out.println("Thread Utama Semua thread anak telah dijalankan!\n");
    }
}
