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

    public String hour = "";
    public static String bebida = ";
    public static int condi = 0;

   public static void drinkAssignment(int menu, String bebida, int condi) {
        if (condi != 1) {
            switch (menu) {
                case 1:
                    bebida = "Café normal";
                    condi = condi + 1;
                    break;
                case 2:
                    bebida = "Capuchino";
                    condi = condi + 1;
                    break;
                case 3:
                    bebida = "Capuchino Vainilla";
                    condi = condi + 1;
                    break;
                case 4:
                    bebida = "Chocolate";
                    condi = condi + 1;
                    break;
                case 5:
                    bebida = "Moka";
                    condi = condi + 1;
                    break;
                case 6:
                    bebida = "Te chai";
                    condi = condi + 1;
                    break;
                case 7:
                    bebida = "Café frió";
                    condi = condi + 1;
                default:
                    JOptionPane.showMessageDialog(null, "la opción que ingreso no es válida");

            }
            JOptionPane.showMessageDialog(null, "su bebida es: " + bebida);
        } else {
            JOptionPane.showMessageDialog(null, "Ya ingreso su bebida anteriormente. Es: " + bebida);
        }
    }


}
