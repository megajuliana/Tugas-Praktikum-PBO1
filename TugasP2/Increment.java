/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP2;

/**
 *
 * @author ThinkPad
 */
public class Increment {
    int nilai;

    public void tampilkanIncrement() {
        System.out.println("Nilai awal           : " + nilai);
        System.out.println("Post-increment (x++) : " + (nilai++));
        System.out.println("Nilai setelah x++    : " + nilai);
        System.out.println("Pre-increment (++x)  : " + (++nilai));
    }
}
