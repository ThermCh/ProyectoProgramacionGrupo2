/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramacion;

import javax.swing.JOptionPane;

/**
 *
 * @author AMD
 */
public class Barista {

    public static String menu = "";
    public static int count = 0;
    public String hour = "";
    public static int bebida = 0;
    public static int condi = 0;

    public Barista() {
    }

    public String getMenu(int bebida) {
        switch (bebida) {
            case 1:
                menu = "Café normal";
                break;
            case 2:
                menu = "Capuchino";
                break;
            case 3:
                menu = "Capuchino Vainilla";
                break;
            case 4:
                menu = "Chocolate";
                break;
            case 5:
                menu = "Mokachino";
                break;
            case 6:
                menu = "Té chai";
                break;
            case 7:
                menu = "Cafe frío";
                break;

            default:
                JOptionPane.showMessageDialog(null, "No es un número válido");
                break;

        }
        return Barista.menu;
    }

    public void setMenu(String menu) {

        Barista.menu = menu;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Barista.count = count;
    }

    public int getBebida() {
        return bebida;
    }

    public void setBebida(int bebida) {
        this.bebida = bebida;
    }

}
