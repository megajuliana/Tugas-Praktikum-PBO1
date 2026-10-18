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

public class MainPerbandingan {
    public static void main(String[] args) throws IOException{
        PerbandinganInput data = new PerbandinganInput();

        System.out.println("PERBEDAAN SCANNER dan BUFFEREDREADER");

        // kalo diuji pake Scanner
        data.inputDenganScanner();
        data.tampilkanData();

        // kalo diuji pake BufferedReader
        data.inputDenganBufferedReader();
        data.tampilkanData();
    }
}
