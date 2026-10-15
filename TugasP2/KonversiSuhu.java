/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP2;

/**
 *
 * @author ThinkPad
 */
public class KonversiSuhu {
    double c;
    double f;
    double r;

    // a. Celcius ke Fahrenheit dan Sebaliknya
    public double celciusToFahrenheit() {
        return (c * 9/5) + 32;
    }

    public double fahrenheitToCelcius() {
        return (f - 32) * 5/9;
    }

    // b. Celcius ke Reamur dan Sebaliknya
    public double celciusToReamur() {
        return c * 4/5;
    }

    public double reamurToCelcius() {
        return r * 5/4;
    }

    // c. Fahrenheit ke Reamur dan Sebaliknya
    public double fahrenheitToReamur() {
        return (f - 32) * 4/9;
    }

    public double reamurToFahrenheit() {
        return (r * 9/4) + 32;
    }
}
