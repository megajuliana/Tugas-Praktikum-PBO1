/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP6;

/**
 *
 * @author ThinkPad
 */
class ProsesThread extends Thread {
    private String namaThread;

    public ProsesThread(String namaThread) {
        this.namaThread = namaThread;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(namaThread + " berjalan -> iterasi ke-" + i);
            try {
                // dikasih jeda 500 milidetik biar keliat proses paralelnya
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println(namaThread + " terganggu: " + e.getMessage());
            }
        }
        System.out.println(namaThread + " SELESAI.");
    }
}

public class Soal7 {
    public static void main(String[] args) {
        System.out.println("PEWARISAN CLASS THREAD");

        // Menciptakan objek dari kelas pewaris Thread
        ProsesThread t1 = new ProsesThread("Thread-1");
        ProsesThread t2 = new ProsesThread("Thread-2");

        t1.start();
        t2.start();
    }
}
