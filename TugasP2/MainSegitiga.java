/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP2;

/**
 *
 * @author ThinkPad
 */
public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga st = new Segitiga();
        st.a = 6;
        st.b = 8;

        System.out.println("Tugas No 5: Luas Segitiga");
        System.out.println("Nilai a   : " + st.a);
        System.out.println("Nilai b : " + st.b);
        System.out.println("Luas Segitiga    : " + st.hitungLuas());
        System.out.println("\nTugas No 6: Keliling Segitiga");
        System.out.println("Nilai c(Pythagoras)   : " + st.hitungPythagorasC());
        System.out.println("Keliling Segitiga     : " + st.hitungKeliling());
    }
}
