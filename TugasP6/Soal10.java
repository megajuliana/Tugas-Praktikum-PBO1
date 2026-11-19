/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP6;

import java.util.ArrayList;

/**
 *
 * @author ThinkPad
 */
public class Soal10 {
    public static void main(String[] args) {
        System.out.println("MENAMPUNG DATA BERBEDA TIPE");

        // Cara 1: Array bertipe Object[]
        Object[] dataArray = {19, 0.2, 'C', "Java", true};

        System.out.println("\n1. Array Object[]:");
        for (Object item : dataArray) {
            System.out.println("Nilai : " + item + " (" + item.getClass().getSimpleName() + ")");
        }

        // Cara 2: ArrayList<Object>
        ArrayList<Object> dataList = new ArrayList<>();
        dataList.add(19);      // Integer
        dataList.add(0.2);     // Double
        dataList.add('C');     // Char
        dataList.add("Java");  // String
        dataList.add(true);    // Boolean

        System.out.println("\n2. ArrayList<Object>:");
        System.out.println("Isi ArrayList : " + dataList);
    }
}
