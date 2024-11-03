/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramacion;

/**
 *
 * @author AMD
 */
public class Barista {
    public Usuario menu;
    int count=0;
    public String hour="";
    String condition="";

    public Usuario getMenu() {
        do {
            JOptionPane.showMessageDialog(null, "¿Quiere encargar una bebida?"); 
            JOptionPane.showConfirmDialog(null, "Choose one", "Choose one", JOptionPane.YES_NO_OPTION);
            switch(condition){
                case "sí":
                count = count + 1;
                JOptionPane.showMessageDialog(null, "Estás son sus opciones" + menu);
                
                 
                    
               
                case "No":
                JOptionPane.showMessageDialog(null, "Puede agregar una bebida en otro momento");
                break;
                default:
                JOptionPane.showMessageDialog(null, "Ingreso un dato invalido");
                break;
            }
        } while (count == 0);

        return menu;
    }

    public void setMenu(Usuario menu) {
        this.menu = menu;
        
    }

    public int getCount() {
        
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
}
