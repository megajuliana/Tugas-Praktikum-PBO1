/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP2;

/**
 *
 * @author ThinkPad
 */
public class MainKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu ks = new KonversiSuhu();
        ks.c = 10;
        ks.f = 15;
        ks.r = 5;

        System.out.println("Konversi Suhu");
        System.out.println("a.Celcius (" + ks.c + "C) -> Fahrenheit : " + ks.celciusToFahrenheit() + "F");
        System.out.println("  Fahrenheit (" + ks.f + "F) -> Celcius  : " + ks.fahrenheitToCelcius() + "C");

        System.out.println("b.Celcius (" + ks.c + "C) -> Reamur     : " + ks.celciusToReamur() + "R");
        System.out.println("  Reamur (" + ks.r + "R) -> Celcius     : " + ks.reamurToCelcius() + "C");

        System.out.println("c.Fahrenheit (" + ks.f + "F) -> Reamur  : " + ks.fahrenheitToReamur() + "R");
        System.out.println("  Reamur (" + ks.r + "R) -> Fahrenheit : " + ks.reamurToFahrenheit() + "F");
    }
}
