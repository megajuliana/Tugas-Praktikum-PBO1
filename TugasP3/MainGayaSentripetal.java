/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP3;

/**
 *
 * @author ThinkPad
 */
import java.util.Scanner;

public class MainGayaSentripetal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GayaSentripetal gs = new GayaSentripetal();

        System.out.println("PROGRAM HITTUNG GAYA SENTRIPETAL");
        
        System.out.print("Masukkan Massa benda(kg)   : ");
        gs.m = input.nextDouble();

        System.out.print("Masukkan Kecepatan(m/s)    : ");
        gs.v = input.nextDouble();

        System.out.print("Masukkan Jari-jari lintasan(m)  : ");
        gs.r = input.nextDouble();

        gs.tampilkanHasil();
    }
}