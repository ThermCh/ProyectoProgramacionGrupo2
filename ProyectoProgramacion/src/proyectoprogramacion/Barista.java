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

    public Barista() {
    }

    public static void Hora(String hour) {
        Random aleatorio = new Random();
        int hora = aleatorio.nextInt(6, 17);
        int min = aleatorio.nextInt(0, 59);
        hour = hora + ":" + min;
        

    }
   

    public String getHour() {
        Barista.Hora(hour);
        
        return hour ;
    }

    public void setHour(String hour) {
         Barista.Hora(hour);
       
        this.hour = hour;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

   
}
