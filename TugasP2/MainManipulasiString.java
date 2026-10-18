/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP2;

/**
 *
 * @author ThinkPad
 */
public class MainManipulasiString {
    public static void main(String[] args) {
        ManipulasiString ms = new ManipulasiString();
        ms.a = "Saya Belajar Java";
        ms.b = "Saya Belajar Java";

        System.out.println("MANIPULASI STRING");
        System.out.println("String a(lowercase) : " + ms.ubahKeLowercase());
        System.out.println("String b(uppercase) : " + ms.ubahKeUppercase());
    }
}
